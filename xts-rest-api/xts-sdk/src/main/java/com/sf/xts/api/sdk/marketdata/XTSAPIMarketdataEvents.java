package com.sf.xts.api.sdk.marketdata;

import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseCandle;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseDepth;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseIndex;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseOI;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseTouchLine;

/**
 * It provides an interface for XTSAPIMarketdataEvents
 * 
 * @author SymphonyFintech
 */
public interface XTSAPIMarketdataEvents {

	/**
	 * it provides marketDataResponseCandle
	 * @param marketDataResponseCandle marketDataResponseCandle object
	 */
	void onMarketDataResponseTouchLine(MarketDataResponseTouchLine marketDataResponseTouchLine);
	/**
	 * it provides marketDataResponseCandle
	 * @param marketDataResponseCandle marketDataResponseCandle object
	 */
	void onMarketDataResponseCandle(MarketDataResponseCandle marketDataResponseCandle);
	
	/**
	 * it provides marketDataResponseDepth
	 * @param marketDataResponseDepth  object of marketDataResponseDepth
	 */
	void onMarketDataResponseDepth(MarketDataResponseDepth marketDataResponseDepth);
	
	/**
	 * it provides marketDataResponseIndex
	 * @param marketDataResponseIndex  object of marketDataResponseIndex
	 */
	void onMarketDataResponseIndex(MarketDataResponseIndex marketDataResponseIndex);
	
	/**
	 * it provides marketDataResponseOI
	 * @param marketDataResponseOI  object of marketDataResponseOI
	 */
	void onMarketDataResponseOI(MarketDataResponseOI marketDataResponseOI);
}
