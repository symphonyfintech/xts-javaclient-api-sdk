package com.sf.xts.api.sdk.interactive;
import com.sf.xts.api.sdk.interactive.OrderBookResponse;
import com.sf.xts.api.sdk.interactive.OrderExecutionResponse;
import com.sf.xts.api.sdk.interactive.PositionResponse;;

/**
 * It provides interface for XTSAPIInteractiveEvents
 * 
 * @author SymphonyFintech
 */
public interface XTSAPIInteractiveEvents {
	
	/**
	 * object of OrderExecutionResponse
	 * @param orderExecutionResponse OrderExecutionResponse
	 */
	void onTrade(OrderExecutionResponse orderExecutionResponse);
	

	/**
	 * object of OrderBookResponse
	 * @param orderBookResponse OrderBookResponse
	 */
	void onExecutionReport(OrderBookResponse orderBookResponse);
	
	/**
	 * object of PositionResponse
	 * @param positionResponse PositionResponse
	 */
	void onPosition(PositionResponse positionResponse);

}
