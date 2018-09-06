package com.ots.sendbatch;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.cmx.hzmq.HzMq;
import com.cmx.vtools.VTools;
import com.cmx.xatools.XaTools;

@Scope("prototype")
@Component
@Order(value=1)
public class MainPutMq implements ApplicationRunner{
	
	private static final Logger logger = Logger.getLogger(MainPutMq.class);
	
	@Autowired
	private HzMq mq;
	
	@Override
	public void run(ApplicationArguments arg0)  {

		logger.info("主线程 start \n");
		
		mq.getProducer();
		VTools vt = new VTools();
		
		while (true) {
			
//			找出 进件表中的10个记录
			List<Map<String, Object>> lm = vt.query("select * from abs_biz_info where proj_no='ALIPAY' and status = '0' and risk_status = '0'   order by create_date limit 0, 100");
			logger.info("[MainFlow]查询授信取表数据成功！");
//			 查询出来的内容为空 
			if(lm == null || lm.size()==0){
				logger.warn("[MainFlow]  abs_biz_info表  不存在  需要审批数据  存在 ！"  );
				XaTools.msleep(200);
				continue;
			}
			
			try {
				vt.run("DICT({ChanPinMingCheng:prdt_no,ShouXinDanHao:pre_pact_no,ZhengJianHaoMa:id_no,XianChengMing:'数据抓取',RenWuMingCheng:'数据抓取',JieShouBaoWen:'无'})");
			} catch (Exception e) {
				logger.warn("设置字典出错",e);
			} 
			for(Map<String, Object> map : lm){
//				将Map放入Mq队列
				int ret = mq.send(map);
				logger.info("sent: \t "+ map );
				try {
//					更新记录对应的状态
					if(ret==0)
					vt.run("SQL(update abs_biz_info set risk_status = '1' where id = '" + map.get("id")+"'");
				} catch (Exception e) {
					logger.error("修改数据状态失败",e);
				}
			}
			vt.free();
		}
	}

}
