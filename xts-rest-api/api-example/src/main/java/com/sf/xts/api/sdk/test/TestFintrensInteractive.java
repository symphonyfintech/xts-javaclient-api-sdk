package com.sf.xts.api.sdk.test;

import com.sf.xts.api.sdk.interactive.*;
import com.sf.xts.api.sdk.main.api.APIException;
import com.sf.xts.api.sdk.main.api.FintrensInteractiveClient;
import com.sf.xts.api.sdk.main.api.InteractiveClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class TestFintrensInteractive implements XTSAPIInteractiveEvents {

	public static Logger logger = LoggerFactory.getLogger(TestMarketdata.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			createSession("INTERACTIVE-SECRET-KEY","INTERACTIVE-SECRET-KEY","INTERACTIVE-COMMON-URL","INTERACTIVE-PORT");
		}catch (Exception e){
		}
	}

	private static void createSession(String secretKey,String appKey,String commonUrl,String port) throws IOException, APIException {
		FintrensInteractiveClient interactiveClient = null;
		interactiveClient = new FintrensInteractiveClient(null,new TestFintrensInteractive());
		interactiveClient.Login(secretKey, appKey,commonUrl,port); //FINDOC
		if (InteractiveClient.authToken == null) {
			logger.debug(".....Login error......");
		}
	}

	@Override
	public void onTrade(OrderExecutionResponse orderExecutionResponse) {

	}

	@Override
	public void onExecutionReport(OrderBookResponse orderBookResponse) {

	}

	@Override
	public void onPosition(PositionResponse positionResponse) {

	}

	@Override
	public void onTradeConversion(TradeConversionResponse orderExecutionResponse) {

	}
}