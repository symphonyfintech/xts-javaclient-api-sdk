package com.sf.xts.api.sdk.interactive.marketStatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketStatus {

    @SerializedName("exchangeSegment")
    @Expose
    private String exchangeSegment;

    @SerializedName("exchangeMarketType")
    @Expose
    private String exchangeMarketType;
    
    @SerializedName("exchangeTradingSession")
    @Expose
    private String exchangeTradingSession;

	/**
	 * it return exchangeSegment 
	 * @return String
	 */
	public String getExchangeSegment() {
		return exchangeSegment;
	}

	/**
	 * it set the exchangeSegment
	 * @param exchangeSegment String
	 */
	public void setExchangeSegment(String exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
	}

	/**
	 * it return exchangeMarketType
	 * @return String
	 */
	public String getExchangeMarketType() {
		return exchangeMarketType;
	}

	/**
	 * it set the exchangeMarketType
	 * @param exchangeMarketType String
	 */
	public void setExchangeMarketType(String exchangeMarketType) {
		this.exchangeMarketType = exchangeMarketType;
	}

	/**
	 * it return exchangeTradingSession
	 * @return String
	 */
	public String getExchangeTradingSession() {
		return exchangeTradingSession;
	}

	/**
	 * it set the exchangeTradingSession
	 * @param exchangeTradingSession String
	 */
	public void setExchangeTradingSession(String exchangeTradingSession) {
		this.exchangeTradingSession = exchangeTradingSession;
	}

	@Override
	public String toString() {
		return "MarketStatus [exchangeSegment=" + exchangeSegment
				+ ", exchangeMarketType=" + exchangeMarketType
				+ ", exchangeTradingSession=" + exchangeTradingSession + "]";
	}
}
