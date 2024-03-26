package com.sf.xts.api.sdk.main.api;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sf.xts.api.sdk.ConfigurationProvider;

public class RequestHandler {

	public static Logger logger = LoggerFactory.getLogger(RequestHandler.class);
	private HttpClient httpClient = HttpClientBuilder.create().setSSLSocketFactory(ConfigurationProvider.sslSocketFactory).build();
	ObjectMapper objectMappers = new ObjectMapper();

	String processPostHttpRequest(HttpPost request,JSONObject data, String  requestname){
		logger.info("-----POST "+requestname+" REQUEST-----"+request);
		HttpResponse response = null;
		String content = null;
		try {
			request.addHeader("content-type", "application/json");
			request.setEntity( new StringEntity(data.toString())); 
			if(request.getURI().toString().contains("marketdata") &&  MarketdataClient.authToken!=null)
				request.addHeader("authorization", MarketdataClient.authToken);
			else if(InteractiveClient.authToken!=null)
				request.addHeader("authorization", InteractiveClient.authToken);
			request.addHeader("content-type", "application/json");
			response = httpClient.execute(request);
			HttpEntity entity = new CheckResponse().check(response);
			content = EntityUtils.toString(entity);
			logger.info("-----POST "+requestname+" RESPONSE-----"+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;

	}
	
	
	String processPostHttpRequest(HttpPost request, String  requestname,StringEntity entity){
		logger.info("-----POST "+requestname+" REQUEST-----"+request);
		HttpResponse response = null;
		String content = null;
		
		try {
			request.addHeader("content-type", "application/json");
			request.setEntity(entity); 
			if(request.getURI().toString().contains("marketdata") &&  MarketdataClient.authToken!=null)
				request.addHeader("authorization", MarketdataClient.authToken);
			else if(InteractiveClient.authToken!=null)
				request.addHeader("authorization", InteractiveClient.authToken);
			response = httpClient.execute(request);
			HttpEntity httpEntity = new CheckResponse().check(response);
			content = EntityUtils.toString(httpEntity);
			logger.info("-----POST "+requestname+" RESPONSE-----"+content);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		
	}
	
	String processGettHttpRequest(HttpGet request, String  requestname){
		logger.info("-----GET  "+requestname+" REQUEST-----"+request);
		request.addHeader("content-type", "application/json");
		if(request.getURI().toString().contains("marketdata"))
			request.addHeader("authorization", MarketdataClient.authToken);
		else
			request.addHeader("authorization", InteractiveClient.authToken);
		HttpResponse response = null;
		String content = null;
		try {
			response = httpClient.execute(request);
			HttpEntity entity = new CheckResponse().check(response);
			content = EntityUtils.toString(entity);

			logger.info("-----GET  "+requestname+" RESPONSE-----"+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		
	}
	
	String processPutHttpRequest(HttpPut request,JSONObject data, String  requestname){
		logger.info("-----PUT  "+requestname+" REQUEST-----"+request);
		request.addHeader("content-type", "application/json");
		String content = null;
		if(request.getURI().toString().contains("marketdata"))
			request.addHeader("authorization", MarketdataClient.authToken);
		else
			request.addHeader("authorization", InteractiveClient.authToken);	
		HttpResponse response = null;
		
		try {
			request.setEntity(new StringEntity(data.toString()));
			response = httpClient.execute(request);
			HttpEntity entity = new CheckResponse().check(response);
			content = EntityUtils.toString(entity);
			logger.info("-----PUT "+requestname+" RESPONSE-----"+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		
	}
	
	
	String processDeleteHttpRequest(HttpDelete request, String  requestname){
		logger.info("-----DELETE  "+requestname+" REQUEST-----"+request);
		request.addHeader("content-type", "application/json");
		if(request.getURI().toString().contains("marketdata"))
			request.addHeader("authorization", MarketdataClient.authToken);
		else
			request.addHeader("authorization", InteractiveClient.authToken);
		HttpResponse response = null;
		Map<String, Object> map = null;
		String content = null;
		try {
			response = httpClient.execute(request);
			HttpEntity entity = new CheckResponse().check(response);
			content = EntityUtils.toString(entity);
			logger.info("-----DELETE  "+requestname+" RESPONSE-----"+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		
	}
}
