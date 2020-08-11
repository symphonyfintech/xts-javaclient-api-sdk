package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for MarketDataResponseIndex
 * 
 * @author SymphonyFintech
 */
public class MarketDataResponseIndex {

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
	@SerializedName("IndexName")
	@Expose
	private String indexName;
	@SerializedName("IndexValue")
	@Expose
	private Double indexValue;
	@SerializedName("OpeningIndex")
	@Expose
	private Double openingIndex;
	@SerializedName("ClosingIndex")
	@Expose
	private Double closingIndex;
	@SerializedName("HighIndexValue")
	@Expose
	private Double highIndexValue;
	@SerializedName("LowIndexValue")
	@Expose
	private Double lowIndexValue;
	@SerializedName("PercentChange")
	@Expose
	private Double percentChange;
	@SerializedName("YearlyHigh")
	@Expose
	private Double yearlyHigh;
	@SerializedName("YearlyLow")
	@Expose
	private Double yearlyLow;
	@SerializedName("NoOfUpmoves")
	@Expose
	private Number noOfUpmoves;
	@SerializedName("NoOfDownmoves")
	@Expose
	private Number noOfDownmoves;
	@SerializedName("MarketCapitalisation")
	@Expose
	private Double marketCapitalisation;

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
	 * It get indexName
	 * @return String
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * It set indexName
	 * @param indexName String
	 */
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	/**
	 * It get indexValue
	 * @return Double
	 */
	public Double getIndexValue() {
		return indexValue;
	}

	/**
	 * It set indexValue
	 * @param indexValue Double
	 */
	public void setIndexValue(Double indexValue) {
		this.indexValue = indexValue;
	}

	/**
	 * It get messageCode
	 * @return Double
	 */
	public Double getOpeningIndex() {
		return openingIndex;
	}

	/**
	 * It set messageCode
	 * @param openingIndex Double
	 */
	public void setOpeningIndex(Double openingIndex) {
		this.openingIndex = openingIndex;
	}

	/**
	 * It get closingIndex
	 * @return Double
	 */
	public Double getClosingIndex() {
		return closingIndex;
	}

	/**
	 * It set closingIndex
	 * @param closingIndex Double
	 */
	public void setClosingIndex(Double closingIndex) {
		this.closingIndex = closingIndex;
	}

	/**
	 * It get highIndexValue
	 * @return Double
	 */
	public Double getHighIndexValue() {
		return highIndexValue;
	}

	/**
	 * It set highIndexValue
	 * @param highIndexValue Double
	 */
	public void setHighIndexValue(Double highIndexValue) {
		this.highIndexValue = highIndexValue;
	}

	/**
	 * It get lowIndexValue
	 * @return Double
	 */
	public Double getLowIndexValue() {
		return lowIndexValue;
	}

	/**
	 * It set lowIndexValue
	 * @param lowIndexValue Double
	 */
	public void setLowIndexValue(Double lowIndexValue) {
		this.lowIndexValue = lowIndexValue;
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
	 * It get yearlyHigh
	 * @return Double
	 */
	public Double getYearlyHigh() {
		return yearlyHigh;
	}

	/**
	 * It set yearlyHigh
	 * @param yearlyHigh Double
	 */
	public void setYearlyHigh(Double yearlyHigh) {
		this.yearlyHigh = yearlyHigh;
	}

	/**
	 * It get yearlyLow
	 * @return Double
	 */
	public Double getYearlyLow() {
		return yearlyLow;
	}

	/**
	 * It set yearlyLow
	 * @param yearlyLow Double
	 */
	public void setYearlyLow(Double yearlyLow) {
		this.yearlyLow = yearlyLow;
	}

	/**
	 * It get noOfUpmoves
	 * @return Number
	 */
	public Number getNoOfUpmoves() {
		return noOfUpmoves;
	}

	/**
	 * It set noOfUpmoves
	 * @param noOfUpmoves Number
	 */
	public void setNoOfUpmoves(Number noOfUpmoves) {
		this.noOfUpmoves = noOfUpmoves;
	}

	/**
	 * It get noOfDownmoves
	 * @return Number
	 */
	public Number getNoOfDownmoves() {
		return noOfDownmoves;
	}

	/**
	 * It set noOfDownmoves
	 * @param noOfDownmoves Number
	 */
	public void setNoOfDownmoves(Number noOfDownmoves) {
		this.noOfDownmoves = noOfDownmoves;
	}

	/**
	 * It get marketCapitalisation
	 * @return Double
	 */
	public Double getMarketCapitalisation() {
		return marketCapitalisation;
	}

	/**
	 * It set marketCapitalisation
	 * @param marketCapitalisation Double
	 */
	public void setMarketCapitalisation(Double marketCapitalisation) {
		this.marketCapitalisation = marketCapitalisation;
	}

}
