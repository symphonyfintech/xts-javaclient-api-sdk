 package com.sf.xts.api.sdk.main.api;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * It checks HTTP request or response
 * 
 * @author SymphonyFintech
 */
public class CheckResponse{

	/**
	 * @param response getting http response
	 * @return HttpEntity An HTTP entity is the majority of an HTTP request or response
	 * @throws APIException catch the exception in your implementation
	 */
	String strResponse;
	JSONObject jsonObject;
	JSONObject subJsonObject;
	public HttpEntity check(HttpResponse response)  throws APIException{
		//System.out.println("Response=="+response);
		StatusLine statusLine = response.getStatusLine();
		int code = statusLine.getStatusCode();

		switch (code) {
		case 200: 
			return response.getEntity();
		case 400: 
			try {
				jsonObject=new JSONObject(EntityUtils.toString(response.getEntity()));
				strResponse=jsonObject.toString();
				System.err.println(jsonObject);
				
				throw new APIException(strResponse);
				} catch (UnsupportedOperationException |JSONException | ParseException |IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		case 404:
			strResponse = code + ":" + statusLine.getReasonPhrase();
			throw new APIException(strResponse);
		default:
		    strResponse = code + ":" + statusLine.getReasonPhrase();
			throw new APIException(strResponse);
		}
	}
}

