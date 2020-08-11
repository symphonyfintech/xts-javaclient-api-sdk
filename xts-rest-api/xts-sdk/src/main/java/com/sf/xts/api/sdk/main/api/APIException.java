package com.sf.xts.api.sdk.main.api;

/**
 * It Catch API exception
 * 
 * @author SymphonyFintech
 */
public class APIException extends Exception{

	/**
	 * Catch API exception
	 * @param response code and reasonPhase like 400 : Bad Request
	 */
	public APIException(String response) {
		super(response);
    }
}
	
