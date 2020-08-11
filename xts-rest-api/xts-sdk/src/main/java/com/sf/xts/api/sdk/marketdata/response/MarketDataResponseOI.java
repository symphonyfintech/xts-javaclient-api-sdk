package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for MarketDataResponseOI
 * 
 * @author SymphonyFintech
 */
public class MarketDataResponseOI {

	@SerializedName("MessageCode")
	@Expose
	private Number messageCode;
	@SerializedName("MessageVersion")
	@Expose
	private Number messageVersion;
	@SerializedName("ApplicationType")
	@Expose
	private Number applicationType;
	@SerializedName("TokenID")
	@Expose
	private Number tokenID;
	@SerializedName("ExchangeSegment")
	@Expose
	private Number exchangeSegment;
	@SerializedName("ExchangeInstrumentID")
	@Expose
	private Number exchangeInstrumentID;
	@SerializedName("ExchangeTimeStamp")
	@Expose
	private Number exchangeTimeStamp;
	@SerializedName("XTSMarketType")
	@Expose
	private Number xTSMarketType;
	@SerializedName("OpenInterest")
	@Expose
	private Number openInterest;

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
	 * It get exchangeInstrumentID
	 * @return Number
	 */
	public Number getExchangeInstrumentID() {
		return exchangeInstrumentID;
	}

	/**
	 * It set exchangeInstrumentID
	 * @param exchangeInstrumentID Number
	 */
	public void setExchangeInstrumentID(Number exchangeInstrumentID) {
		this.exchangeInstrumentID = exchangeInstrumentID;
	}

	/**
	 * It get exchangeTimeStamp
	 * @return Number
	 */
	public Number getExchangeTimeStamp() {
		return exchangeTimeStamp;
	}

	/**
	 * It set exchangeTimeStamp
	 * @param exchangeTimeStamp Number
	 */
	public void setExchangeTimeStamp(Number exchangeTimeStamp) {
		this.exchangeTimeStamp = exchangeTimeStamp;
	}

	/**
	 * It get xTSMarketType
	 * @return Number
	 */
	public Number getXTSMarketType() {
		return xTSMarketType;
	}

	/**
	 * It set xTSMarketType
	 * @param xTSMarketType Number
	 */
	public void setXTSMarketType(Number xTSMarketType) {
		this.xTSMarketType = xTSMarketType;
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
}
