package com.sf.xts.api.sdk.marketdata.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for MarketDataResponseDepth
 * 
 * @author SymphonyFintech
 */
public class MarketDataResponseDepth {

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
	@SerializedName("Bids")
	@Expose
	private List<Bid> bids = null;
	@SerializedName("Asks")
	@Expose
	private List<Ask> asks = null;
	@SerializedName("Touchline")
	@Expose
	private Touchline touchline;
	@SerializedName("BookType")
	@Expose
	private Number bookType;
	@SerializedName("XMarketType")
	@Expose
	private Number xMarketType;

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
	 * It get bids
	 * @return List of bids
	 */
	public List<Bid> getBids() {
		return bids;
	}

	/**
	 * It set bids
	 * @param bids List of bids
	 */
	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}

	/**
	 * It get asks
	 * @return List of asks
	 */
	public List<Ask> getAsks() {
		return asks;
	}

	/**
	 * It set asks
	 * @param asks List of asks
	 */
	public void setAsks(List<Ask> asks) {
		this.asks = asks;
	}

	/**
	 * It get Touchline
	 * @return Touchline
	 */
	public Touchline getTouchline() {
		return touchline;
	}

	/**
	 * It set Touchline
	 * @param touchline Touchline
	 */
	public void setTouchline(Touchline touchline) {
		this.touchline = touchline;
	}

	/**
	 * It get bookType
	 * @return Number 
	 */
	public Number getBookType() {
		return bookType;
	}

	/**
	 * It set bookType
	 * @param bookType Number
	 */
	public void setBookType(Number bookType) {
		this.bookType = bookType;
	}

	/**
	 * It get xMarketType
	 * @return Number
	 */
	public Number getXMarketType() {
		return xMarketType;
	}

	/**
	 * It set xMarketType
	 * @param xMarketType Number
	 */
	public void setXMarketType(Number xMarketType) {
		this.xMarketType = xMarketType;
	}

}
