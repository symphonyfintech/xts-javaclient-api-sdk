package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for Touchline
 * 
 * @author SymphonyFintech
 */
public class Touchline {

	@SerializedName("BidInfo")
	@Expose
	private BidInfo bidInfo;
	@SerializedName("AskInfo")
	@Expose
	private AskInfo askInfo;
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
	@SerializedName("BuyBackTotalBuy")
	@Expose
	private Number buyBackTotalBuy;
	@SerializedName("BuyBackTotalSell")
	@Expose
	private Number buyBackTotalSell;

	/**
	 * It get bidInfo
	 * @return BidInfo
	 */
	public BidInfo getBidInfo() {
		return bidInfo;
	}

	/**
	 * It set bidInfo
	 * @param bidInfo BidInfo
	 */
	public void setBidInfo(BidInfo bidInfo) {
		this.bidInfo = bidInfo;
	}

	/**
	 * It get askInfo
	 * @return AskInfo
	 */
	public AskInfo getAskInfo() {
		return askInfo;
	}

	/**
	 * It set askInfo
	 * @param askInfo AskInfo
	 */
	public void setAskInfo(AskInfo askInfo) {
		this.askInfo = askInfo;
	}

	/**
	 * It get lastTradedPrice
	 * @return Double
	 */
	public Double getLastTradedPrice() {
		return lastTradedPrice;
	}

	/**
	 * It set lastTradedPrice
	 * @param lastTradedPrice Double
	 */
	public void setLastTradedPrice(Double lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	/**
	 * It get lastTradedQunatity
	 * @return Number
	 */
	public Number getLastTradedQunatity() {
		return lastTradedQunatity;
	}

	/**
	 * It set lastTradedQunatity
	 * @param lastTradedQunatity Number
	 */
	public void setLastTradedQunatity(Number lastTradedQunatity) {
		this.lastTradedQunatity = lastTradedQunatity;
	}

	/**
	 * It get totalBuyQuantity
	 * @return Number
	 */
	public Number getTotalBuyQuantity() {
		return totalBuyQuantity;
	}

	/**
	 * It set totalBuyQuantity
	 * @param totalBuyQuantity Number
	 */
	public void setTotalBuyQuantity(Number totalBuyQuantity) {
		this.totalBuyQuantity = totalBuyQuantity;
	}

	/**
	 * It get totalSellQuantity
	 * @return Number
	 */
	public Number getTotalSellQuantity() {
		return totalSellQuantity;
	}

	/**
	 * It set totalSellQuantity
	 * @param totalSellQuantity Number
	 */
	public void setTotalSellQuantity(Number totalSellQuantity) {
		this.totalSellQuantity = totalSellQuantity;
	}

	/**
	 * It get totalTradedQuantity
	 * @return Number
	 */
	public Number getTotalTradedQuantity() {
		return totalTradedQuantity;
	}

	/**
	 * It set totalTradedQuantity
	 * @param totalTradedQuantity Number
	 */
	public void setTotalTradedQuantity(Number totalTradedQuantity) {
		this.totalTradedQuantity = totalTradedQuantity;
	}

	/**
	 * It get averageTradedPrice
	 * @return Double
	 */
	public Double getAverageTradedPrice() {
		return averageTradedPrice;
	}

	/**
	 * It set averageTradedPrice
	 * @param averageTradedPrice Double
	 */
	public void setAverageTradedPrice(Double averageTradedPrice) {
		this.averageTradedPrice = averageTradedPrice;
	}

	/**
	 * It get lastTradedTime
	 * @return Number
	 */
	public Number getLastTradedTime() {
		return lastTradedTime;
	}

	/**
	 * It set lastTradedTime
	 * @param lastTradedTime Number
	 */
	public void setLastTradedTime(Number lastTradedTime) {
		this.lastTradedTime = lastTradedTime;
	}

	/**
	 * It get lastUpdateTime
	 * @return Number
	 */
	public Number getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * It set lastUpdateTime
	 * @param lastUpdateTime Number
	 */
	public void setLastUpdateTime(Number lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * It get percentChange
	 * @return Double
	 */
	public Double getPercentChange() {
		return percentChange;
	}

	/**
	 * It set percentChange
	 * @param percentChange Double
	 */
	public void setPercentChange(Double percentChange) {
		this.percentChange = percentChange;
	}

	/**
	 * It get open
	 * @return Number
	 */
	public Number getOpen() {
		return open;
	}

	/**
	 * It set open
	 * @param open Number
	 */
	public void setOpen(Number open) {
		this.open = open;
	}

	/**
	 * It get high
	 * @return Number
	 */
	public Number getHigh() {
		return high;
	}

	/**
	 * It set high
	 * @param high Number
	 */
	public void setHigh(Number high) {
		this.high = high;
	}

	/**
	 * It get low
	 * @return Double
	 */
	public Double getLow() {
		return low;
	}

	/**
	 * It set low
	 * @param low Double
	 */
	public void setLow(Double low) {
		this.low = low;
	}

	/**
	 * It get close
	 * @return Double
	 */
	public Double getClose() {
		return close;
	}

	/**
	 * It set close
	 * @param close Double
	 */
	public void setClose(Double close) {
		this.close = close;
	}

	/**
	 * It get totalValueTraded
	 * @return Number
	 */
	public Number getTotalValueTraded() {
		return totalValueTraded;
	}

	/**
	 * It set totalValueTraded
	 * @param totalValueTraded Number
	 */
	public void setTotalValueTraded(Number totalValueTraded) {
		this.totalValueTraded = totalValueTraded;
	}

	/**
	 * It get buyBackTotalBuy
	 * @return Number
	 */
	public Number getBuyBackTotalBuy() {
		return buyBackTotalBuy;
	}

	/**
	 * It set buyBackTotalBuy
	 * @param buyBackTotalBuy Number
	 */
	public void setBuyBackTotalBuy(Number buyBackTotalBuy) {
		this.buyBackTotalBuy = buyBackTotalBuy;
	}

	/**
	 * It get buyBackTotalSell
	 * @return Number
	 */
	public Number getBuyBackTotalSell() {
		return buyBackTotalSell;
	}

	/**
	 * It set buyBackTotalSell
	 * @param buyBackTotalSell Number
	 */
	public void setBuyBackTotalSell(Number  buyBackTotalSell) {
		this.buyBackTotalSell = buyBackTotalSell;
	}

}
