package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for MarketDataResponseCandle
 * 
 * @author SymphonyFintech
 */
public class MarketDataResponseCandle {

	@SerializedName("ApplicationType")
	@Expose
	private Number applicationType;
	@SerializedName("BarTime")
	@Expose
	private Number barTime;
	@SerializedName("BarVolume")
	@Expose
	private Number barVolume;
	@SerializedName("Close")
	@Expose
	private Number close;
	@SerializedName("ExchangeInstrumentID")
	@Expose
	private String exchangeInstrumentID;
	@SerializedName("ExchangeSegment")
	@Expose
	private Number exchangeSegment;
	@SerializedName("High")
	@Expose
	private Number high;
	@SerializedName("Low")
	@Expose
	private Number low;
	@SerializedName("MessageCode")
	@Expose
	private Number messageCode;
	@SerializedName("MessageVersion")
	@Expose
	private Number messageVersion;
	@SerializedName("Open")
	@Expose
	private Number open;
	@SerializedName("OpenInterest")
	@Expose
	private Number openInterest;
	@SerializedName("SumOfQtyInToPrice")
	@Expose
	private Number sumOfQtyInToPrice;
	@SerializedName("TokenID")
	@Expose
	private Number tokenID;

	/**
	 * It get applicationType
	 * @return Number
	 */
	public Number getApplicationType() {
		return applicationType;
	}

	/**
	 * It set applicationType
	 * @param applicationType Number
	 */
	public void setApplicationType(Number applicationType) {
		this.applicationType = applicationType;
	}

	/**
	 * It get barTime
	 * @return Number
	 */
	public Number getBarTime() {
		return barTime;
	}

	/**
	 * It set barTime
	 * @param barTime Number
	 */
	public void setBarTime(Number barTime) {
		this.barTime = barTime;
	}

	/**
	 * It get barVolume
	 * @return Number
	 */
	public Number getBarVolume() {
		return barVolume;
	}

	/**
	 * It set barVolume
	 * @param barVolume Number
	 */
	public void setBarVolume(Number barVolume) {
		this.barVolume = barVolume;
	}

	/**
	 * It get close
	 * @return Number
	 */
	public Number getClose() {
		return close;
	}

	/**
	 * It set close
	 * @param close Number
	 */
	public void setClose(Number close) {
		this.close = close;
	}

	/**
	 * It get exchangeInstrumentID
	 * @return Number
	 */
	public String getExchangeInstrumentID() {
		return exchangeInstrumentID;
	}

	/**
	 * It set exchangeInstrumentID
	 * @param exchangeInstrumentID Number
	 */
	public void setExchangeInstrumentID(String exchangeInstrumentID) {
		this.exchangeInstrumentID = exchangeInstrumentID;
	}

	/**
	 * It get exchangeSegment
	 * @return Number
	 */
	public Number getExchangeSegment() {
		return exchangeSegment;
	}

	/**
	 * It set exchangeSegment
	 * @param exchangeSegment Number
	 */
	public void setExchangeSegment(Number exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
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
	 * @return Number
	 */
	public Number getLow() {
		return low;
	}

	/**
	 * It set low
	 * @param low Number
	 */
	public void setLow(Number low) {
		this.low = low;
	}

	/**
	 * It get messageCode
	 * @return Number
	 */
	public Number getMessageCode() {
		return messageCode;
	}

	/**
	 * It set messageCode
	 * @param messageCode Number
	 */
	public void setMessageCode(Number messageCode) {
		this.messageCode = messageCode;
	}

	/**
	 * It get messageVersion
	 * @return Number
	 */
	public Number getMessageVersion() {
		return messageVersion;
	}

	/**
	 * It set messageVersion
	 * @param messageVersion Number
	 */
	public void setMessageVersion(Number messageVersion) {
		this.messageVersion = messageVersion;
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
	 * It get openInterest
	 * @return Number
	 */
	public Number getOpenInterest() {
		return openInterest;
	}

	/**
	 * It set openInterest
	 * @param openInterest Number
	 */
	public void setOpenInterest(Number openInterest) {
		this.openInterest = openInterest;
	}

	/**
	 * It get sumOfQtyInToPrice
	 * @return Number
	 */
	public Number getSumOfQtyInToPrice() {
		return sumOfQtyInToPrice;
	}

	/**
	 * It set sumOfQtyInToPrice
	 * @param sumOfQtyInToPrice Number
	 */
	public void setSumOfQtyInToPrice(Number sumOfQtyInToPrice) {
		this.sumOfQtyInToPrice = sumOfQtyInToPrice;
	}

	/**
	 * It get tokenID
	 * @return Number
	 */
	public Number getTokenID() {
		return tokenID;
	}

	/**
	 * It set tokenID
	 * @param tokenID Number
	 */
	public void setTokenID(Number tokenID) {
		this.tokenID = tokenID;
	}

}
