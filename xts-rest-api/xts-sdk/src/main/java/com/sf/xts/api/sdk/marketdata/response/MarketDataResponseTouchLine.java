package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.response.AskInfo;
import com.sf.xts.api.sdk.marketdata.response.BidInfo;

public class MarketDataResponseTouchLine {
	
	@SerializedName("MessageCode")
	@Expose
	private Number messageCode;
	@SerializedName("ExchangeSegment")
	@Expose
	private Number exchangeSegment;
	@SerializedName("ExchangeInstrumentID")
	@Expose
	private Number exchangeInstrumentID;
	@SerializedName("LastTradedPrice")
	@Expose
	private Double lastTradedPrice;
	@SerializedName("LastTradedQunatity")
	@Expose
	private Number lastTradedQunatity;
	@SerializedName("TotalBuyQuantity")
	@Expose
	private Number totalBuyQuantity;
	@SerializedName("TotalSellQuantity")
	@Expose
	private Number totalSellQuantity;
	@SerializedName("TotalTradedQuantity")
	@Expose
	private Number totalTradedQuantity;
	@SerializedName("AverageTradedPrice")
	@Expose
	private Double averageTradedPrice;
	@SerializedName("LastTradedTime")
	@Expose
	private Number lastTradedTime;
	@SerializedName("LastUpdateTime")
	@Expose
	private Number lastUpdateTime;
	@SerializedName("PercentChange")
	@Expose
	private Double percentChange;
	@SerializedName("Open")
	@Expose
	private Number open;
	@SerializedName("High")
	@Expose
	private Number high;
	@SerializedName("Low")
	@Expose
	private Double low;
	@SerializedName("Close")
	@Expose
	private Double close;
	@SerializedName("TotalValueTraded")
	@Expose
	private Number totalValueTraded;
	@SerializedName("BidInfo")
	@Expose
	private BidInfo bidInfo;
	@SerializedName("AskInfo")
	@Expose
	private AskInfo askInfo;
	public Number getMessageCode() {
		return messageCode;
	}
	public Number getExchangeSegment() {
		return exchangeSegment;
	}
	public Number getExchangeInstrumentID() {
		return exchangeInstrumentID;
	}
	public Double getLastTradedPrice() {
		return lastTradedPrice;
	}
	public Number getLastTradedQunatity() {
		return lastTradedQunatity;
	}
	public Number getTotalBuyQuantity() {
		return totalBuyQuantity;
	}
	public Number getTotalSellQuantity() {
		return totalSellQuantity;
	}
	public Number getTotalTradedQuantity() {
		return totalTradedQuantity;
	}
	public Double getAverageTradedPrice() {
		return averageTradedPrice;
	}
	public Number getLastTradedTime() {
		return lastTradedTime;
	}
	public Number getLastUpdateTime() {
		return lastUpdateTime;
	}
	public Double getPercentChange() {
		return percentChange;
	}
	public Number getOpen() {
		return open;
	}
	public Number getHigh() {
		return high;
	}
	public Double getLow() {
		return low;
	}
	public Double getClose() {
		return close;
	}
	public Number getTotalValueTraded() {
		return totalValueTraded;
	}
	public BidInfo getBidInfo() {
		return bidInfo;
	}
	public AskInfo getAskInfo() {
		return askInfo;
	}
	
}


