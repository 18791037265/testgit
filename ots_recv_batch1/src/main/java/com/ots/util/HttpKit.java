package com.ots.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * https 请求 
 */
@SuppressWarnings("deprecation")
public class HttpKit {
    
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final Logger LOGGER = Logger.getLogger(HttpKit.class);

    /**
	 * 应答
	 * @param response
	 * @param msg
	 */
    public static void response(HttpServletResponse response, String msg) {
		try {
			response.setCharacterEncoding(DEFAULT_CHARSET);
			response.setHeader("Content-type", "text/html;charset="+DEFAULT_CHARSET);
			response.getWriter().write(msg);
		} catch (IOException e) {
			LOGGER.error("写消息失败",e);
		}
	}
	
    /**
     * 发送Get请求
     * @param url
     * @return
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws IOException  
     * @throws KeyManagementException 
     */
    public static String get(String url) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
        StringBuffer bufferRes = null;
        TrustManager[] tm = { new MyX509TrustManager() };  
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");  
        sslContext.init(null, tm, new java.security.SecureRandom());  
        // 从上述SSLContext对象中得到SSLSocketFactory对象  
        SSLSocketFactory ssf = sslContext.getSocketFactory();
        
        URL urlGet = new URL(url);
        HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
        // 连接超时
        http.setConnectTimeout(50000);
        // 读取超时 --服务器响应比较慢，增大时间
        http.setReadTimeout(50000);
        http.setRequestMethod("GET");
        http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        http.setSSLSocketFactory(ssf);
        http.setDoOutput(true);
        http.setDoInput(true);
        http.connect();
        
        InputStream in = http.getInputStream();
        BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
        String valueString = null;
        bufferRes = new StringBuffer();
        while ((valueString = read.readLine()) != null){
            bufferRes.append(valueString);
        }
        in.close();
        if (http != null) {
            // 关闭连接
            http.disconnect();
        }
        return bufferRes.toString();
    }
    
    /**
     * 发送Get请求
     * @param url
     * @return
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws IOException 
     * @throws KeyManagementException 
     */
    public static String get(String url,Boolean https) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
    	if(https != null && https){
    		return get(url);
    	}else{
    		StringBuffer bufferRes = null;
            URL urlGet = new URL(url);
            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
            // 连接超时
            http.setConnectTimeout(50000);
            // 读取超时 --服务器响应比较慢，增大时间
            http.setReadTimeout(50000);
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            http.setDoOutput(true);
            http.setDoInput(true);
            http.connect();
            
            InputStream in = http.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
            String valueString = null;
            bufferRes = new StringBuffer();
            while ((valueString = read.readLine()) != null){
                bufferRes.append(valueString);
            }
            in.close();
            if (http != null) {
                // 关闭连接
                http.disconnect();
            }
            return bufferRes.toString();
    	}
    }
    
    /**
     * 发送Get请求
     * @param url
     * @return
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws IOException 
     * @throws KeyManagementException 
     */
    public static String get(String url, Map<String, String> params,Boolean https) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
    	return get(initParams(url, params),https);
    }

    /**
     *  发送Get请求
     * @param url
     * @param params
     * @return
     * @throws IOException 
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws KeyManagementException 
     */
    public static String get(String url, Map<String, String> params) throws KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException, IOException {
        return get(initParams(url, params));
    }

    /**
     *  发送Post请求
     * @param url
     * @param params
     * @return
     * @throws IOException 
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws KeyManagementException 
     */
    public static String post(String url, String params,Boolean https) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
    	
    	if(https != null && https){
    		return post(url,params);
    	}else{
    		StringBuffer bufferRes = null;
            URL urlGet = new URL(url);
            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
            // 连接超时
            http.setConnectTimeout(50000);
            // 读取超时 --服务器响应比较慢，增大时间
            http.setReadTimeout(50000);
            http.setRequestMethod("POST");
            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
           //http.setRequestProperty("Content-Type","text/xml");
            http.setDoOutput(true);
            http.setDoInput(true);
            http.connect();

            OutputStream out = http.getOutputStream();
            out.write(params.getBytes("UTF-8"));
            out.flush();
            out.close();

            InputStream in = http.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
            String valueString = null;
            bufferRes = new StringBuffer();
            while ((valueString = read.readLine()) != null){
                bufferRes.append(valueString);
            }
            in.close();
            if (http != null) {
                // 关闭连接
                http.disconnect();
            }
            return bufferRes.toString();
    	}        	
    }
    
    /**
     *  发送Post请求
     * @param url
     * @param params
     * @return
     * @throws IOException 
     * @throws NoSuchProviderException 
     * @throws NoSuchAlgorithmException 
     * @throws KeyManagementException 
     */
    public static String post(String url, String params) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
        	StringBuffer bufferRes = null;
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象  
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL urlGet = new URL(url);
            HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
            // 连接超时
            http.setConnectTimeout(50000);
            // 读取超时 --服务器响应比较慢，增大时间
            http.setReadTimeout(50000);
            http.setRequestMethod("POST");
            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            http.setSSLSocketFactory(ssf);
            http.setDoOutput(true);
            http.setDoInput(true);
            http.connect();

            OutputStream out = http.getOutputStream();
            out.write(params.getBytes("UTF-8"));
            out.flush();
            out.close();

            InputStream in = http.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
            String valueString = null;
            bufferRes = new StringBuffer();
            while ((valueString = read.readLine()) != null){
                bufferRes.append(valueString);
            }
            in.close();
            if (http != null) {
                // 关闭连接
                http.disconnect();
            }
            return bufferRes.toString();
    }
    public static String post(String url,Map<String,String> params,boolean https) throws KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException, IOException{
    	String paramsStr = initParams(url, params);
    	return post(paramsStr, "",https);
    	
    }
    
    /**
     * 下载对账单post请求
     * @author 王少亭
     * @param url
     * @param params
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     * @throws KeyManagementException
     */
    public static String postForDownBill(String url, String params) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException{
	StringBuffer bufferRes = null;
    TrustManager[] tm = { new MyX509TrustManager() };
    SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
    sslContext.init(null, tm, new java.security.SecureRandom());
    // 从上述SSLContext对象中得到SSLSocketFactory对象  
    SSLSocketFactory ssf = sslContext.getSocketFactory();

    URL urlGet = new URL(url);
    HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
    // 连接超时
    http.setConnectTimeout(50000);
    // 读取超时 --服务器响应比较慢，增大时间
    http.setReadTimeout(50000);
    http.setRequestMethod("POST");
    http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
    http.setSSLSocketFactory(ssf);
    http.setDoOutput(true);
    http.setDoInput(true);
    http.connect();

    OutputStream out = http.getOutputStream();
    out.write(params.getBytes("UTF-8"));
    out.flush();
    out.close();

    InputStream in = http.getInputStream();
    BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
    String valueString = null;
    bufferRes = new StringBuffer();
   // boolean firstLine = false;
    while ((valueString = read.readLine()) != null){
    	bufferRes.append(valueString).append("\n");
    }
   // bufferRes.append("]");
    in.close();
    if (http != null) {
        // 关闭连接
        http.disconnect();
    }
    return bufferRes.toString();
	}
    
  
  
    /**
     * 上传媒体文件
     * @param url
     * @param params
     * @param file
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     * @throws KeyManagementException
     */
    public static String upload(String url,File file) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
            String BOUNDARY = "----WebKitFormBoundaryiDGnV9zdZA1eM1yL"; // 定义数据分隔线  
            StringBuffer bufferRes = null;
            URL urlGet = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlGet.openConnection();
            conn.setDoOutput(true);  
            conn.setDoInput(true);  
            conn.setUseCaches(false);  
            conn.setRequestMethod("POST");  
            conn.setRequestProperty("connection", "Keep-Alive");  
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36");  
            conn.setRequestProperty("Charsert", "UTF-8");   
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);  
              
            OutputStream out = new DataOutputStream(conn.getOutputStream());  
            byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();// 定义最后数据分隔线  
            StringBuilder sb = new StringBuilder();    
            sb.append("--");    
            sb.append(BOUNDARY);    
            sb.append("\r\n");    
            sb.append("Content-Disposition: form-data;name=\"media\";filename=\""+ file.getName() + "\"\r\n");    
            sb.append("Content-Type:application/octet-stream\r\n\r\n");    
            byte[] data = sb.toString().getBytes();  
            out.write(data);  
            DataInputStream fs = new DataInputStream(new FileInputStream(file));  
            int bytes = 0;  
            byte[] bufferOut = new byte[1024];  
            while ((bytes = fs.read(bufferOut)) != -1) {  
                out.write(bufferOut, 0, bytes);  
            }  
            out.write("\r\n".getBytes()); //多个文件时，二个文件之间加入这个  
            fs.close();  
            out.write(end_data);  
            out.flush();    
            out.close();   
              
            // 定义BufferedReader输入流来读取URL的响应  
            InputStream in = conn.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
            String valueString = null;
            bufferRes = new StringBuffer();
            while ((valueString = read.readLine()) != null){
                bufferRes.append(valueString);
            }
            in.close();
            if (conn != null) {
                // 关闭连接
            	conn.disconnect();
            }
            return bufferRes.toString();
    }    

    /**
     *
     * @param url
     * @param params
     * @return
     */
    private static String initParams(String url, Map<String, String> params){
        if (null == params || params.isEmpty()) {
            return url;
        }
        StringBuilder sb = new StringBuilder(url);
        if (url.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        boolean first = true;
        for (Entry<String, String> entry : params.entrySet()) {
            if (first) {
                first = false;
            } else {
                sb.append("&");
            }
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key).append("=");
            if (StringUtils.isNotEmpty(value)) {
                try {
                    sb.append(URLEncoder.encode(value, DEFAULT_CHARSET));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    LOGGER.error(url,e);
                }
            }
        }
        return sb.toString();
    }
    

    
    public static void main(String[] args) {
    	String fname = "dsasdas.mp4";
    	String s = fname.substring(0, fname.lastIndexOf("."));
    	String f = fname.substring(s.length()+1);
		System.out.println(f);
	}
	
	/**
	 * 微信支付退款发送POST请求
	 * @author 王少亭
	 * @param url 请求url
	 * @param keyStore 证书key
	 * @param mch_id 商户id
	 * @param unifiedOrder 请求信息对象
	 * @return
	 * @throws Exception
	 */
	public static String postRefund(String url,KeyStore keyStore,String mch_id,String xmlString) throws Exception{
		String result = "";
		SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore,mch_id.toCharArray()).build();
		//指定TLS版本
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
					sslcontext,new String[] { "TLSv1" },null,
					SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
		//设置httpclient的SSLSocketFactory
		CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
		try {
			
			 HttpPost httppost = new HttpPost(url);
	
	         System.out.println("executing request" + httppost.getRequestLine());
	         
	         
	         StringEntity myEntity = new StringEntity(xmlString,"UTF-8"); 
             httppost.addHeader("Content-Type", "text/xml"); 
             httppost.setEntity(myEntity); 
	         
	         CloseableHttpResponse response = httpclient.execute(httppost);
	         try {
	             HttpEntity httpEntity = response.getEntity();
	             result = EntityUtils.toString(httpEntity, "UTF-8");
	             System.out.println(response.getStatusLine());
	             EntityUtils.consume(httpEntity);
	        } finally {
	            response.close();
	        }
	    } finally {
	        httpclient.close();
	    }
		return result;
	}
	/**
	 * httpClient POST传送文本流方式传送字符串
	 * @param url
	 * @param data
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static String httpClientPost(String url,String data,boolean isHttps) throws ParseException, IOException{
		CloseableHttpClient httpClient = null;
		if(isHttps){
			httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).build();
		}else{
			httpClient = HttpClients.createDefault();
		}
		String result = "";
		HttpPost httppost=new HttpPost(url);
		//建立HttpPost对象
		 StringEntity myEntity = new StringEntity(data,"UTF-8"); 
         httppost.addHeader("Content-Type", "text/xml"); 
         httppost.setEntity(myEntity); 
         HttpResponse response=httpClient.execute(httppost);	
		//发送Post,并返回一个HttpResponse对象
		if(response.getStatusLine().getStatusCode()==200){//如果状态码为200,就是正常返回
			 HttpEntity httpEntity = response.getEntity();
             result = EntityUtils.toString(httpEntity, "UTF-8");
			//result=EntityUtils.toString(response.getEntity());
		
		}
		return result;
	}
	/**
	 * httpClient POST域传值方式传送
	 * @param url
	 * @param data
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static String httpClientPost(String url,Map<String,String> map,boolean isHttps) throws Exception{
		CloseableHttpClient httpClient = null;
		if(isHttps){
			httpClient = HttpClients.custom().setSSLSocketFactory(createSSLConnSocketFactory()).build();
		}else{
			httpClient = HttpClients.createDefault();
		}
		String result = "";
		HttpPost httppost=new HttpPost(url);
		
		
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
		for (String key : map.keySet()) {
			 nvps.add(new BasicNameValuePair(key, map.get(key)));  
		}
	    httppost.setEntity(new UrlEncodedFormEntity(nvps,"UTF-8"));  
	    
	    HttpResponse response=httpClient.execute(httppost);	
		//发送Post,并返回一个HttpResponse对象
		if(response.getStatusLine().getStatusCode()==200){//如果状态码为200,就是正常返回
			 HttpEntity httpEntity = response.getEntity();
             result = EntityUtils.toString(httpEntity, "UTF-8");
		}
		return result;
	}
	
	 /** 
     * 创建SSL安全连接 
     * 
     * @return 
     */  
    private static SSLConnectionSocketFactory createSSLConnSocketFactory() {  
        SSLConnectionSocketFactory sslsf = null;  
        try {  
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {  
  
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {  
                    return true;  
                }  
            }).build();  
            sslsf = new SSLConnectionSocketFactory(sslContext, new X509HostnameVerifier() {  
  
                @Override  
                public boolean verify(String arg0, SSLSession arg1) {  
                    return true;  
                }  
  
                @Override  
                public void verify(String host, SSLSocket ssl) throws IOException {  
                }  
  
                @Override  
                public void verify(String host, X509Certificate cert) throws SSLException {  
                }  
  
                @Override  
                public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {  
                }  
            });  
        } catch (GeneralSecurityException e) {  
            e.printStackTrace();  
        }  
        return sslsf;  
    }   
      
	
}
/**
 * 证书管理
 */
class MyX509TrustManager implements X509TrustManager {

    public X509Certificate[] getAcceptedIssuers() {
        return null;  
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
    }
}