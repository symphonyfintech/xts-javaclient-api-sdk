package com.sf.xts.api.sdk.marketdata.searchInstrument;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("ExchangeSegment")
    @Expose
    private Number ExchangeSegment;
    
    @SerializedName("ExchangeInstrumentID")
    @Expose
    private Number ExchangeInstrumentID;
    
    @SerializedName("InstrumentType")
    @Expose
    private Number InstrumentType;
    
    @SerializedName("Name")
    @Expose
    private String Name;
    
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;
    
    @SerializedName("Description")
    @Expose
    private String Description;
    
    @SerializedName("Series")
    @Expose
    private String Series;
    
    @SerializedName("NameWithSeries")
    @Expose
    private String NameWithSeries;

    @SerializedName("InstrumentID")
    @Expose
    private Number InstrumentID;

    @SerializedName("PriceBand")
    @Expose
    private PriceBand PriceBand = null;
    
    @SerializedName("FreezeQty")
    @Expose
    private Number FreezeQty;
    
    @SerializedName("TickSize")
    @Expose
    private Double TickSize;
    
    @SerializedName("LotSize")
    @Expose
    private Number LotSize; 
    
    @SerializedName("DecimalDisplace")
    @Expose
    private Number DecimalDisplace;
    
    @SerializedName("Industry")
    @Expose
    private Number Industry;

	/**
	 * It get ExchangeSegment
	 * @return Number
	 */
	public Number getExchangeSegment() {
		return ExchangeSegment;
	}

	/**
	 * It set ExchangeSegment
	 * @param exchangeSegment Number
	 */
	public void setExchangeSegment(Number exchangeSegment) {
		ExchangeSegment = exchangeSegment;
	}

	/**
	 * It get ExchangeInstrumentID
	 * @return Number
	 */
	public Number getExchangeInstrumentID() {
		return ExchangeInstrumentID;
	}

	/**
	 * It set ExchangeInstrumentID
	 * @param exchangeInstrumentID Number
	 */
	public void setExchangeInstrumentID(Number exchangeInstrumentID) {
		ExchangeInstrumentID = exchangeInstrumentID;
	}

	/**
	 * It get InstrumentType
	 * @return Number
	 */
	public Number getInstrumentType() {
		return InstrumentType;
	}

	/**
	 * It set InstrumentType
	 * @param instrumentType Number
	 */
	public void setInstrumentType(Number instrumentType) {
		InstrumentType = instrumentType;
	}

	/**
	 * It get Name
	 * @return String
	 */ 
	public String getName() {
		return Name;
	}

	/**
	 * It set Name
	 * @param name String
	 */ 
	public void setName(String name) {
		Name = name;
	}

	/**
	 * It get displayName
	 * @return String
	 */
	public String getDisplayName() {
		return DisplayName;
	}

	/**
	 * It set displayName
	 * @param displayName String
	 */
	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	/**
	 * It get description
	 * @return String
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * It set description
	 * @param description String
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * It get Series
	 * @return String
	 */
	public String getSeries() {
		return Series;
	}

	/**
	 * It set series
	 * @param series String
	 */
	public void setSeries(String series) {
		Series = series;
	}

	/**
	 * It get nameWithSeries
	 * @return String
	 */
	public String getNameWithSeries() {
		return NameWithSeries;
	}

	/**
	 * It set nameWithSeries
	 * @param nameWithSeries String
	 */
	public void setNameWithSeries(String nameWithSeries) {
		NameWithSeries = nameWithSeries;
	}

	/**
	 * It get instrumentID
	 * @return Number
	 */
	public Number getInstrumentID() {
		return InstrumentID;
	}

	/**
	 * It set instrumentID
	 * @param instrumentID Number
	 */
	public void setInstrumentID(Number instrumentID) {
		InstrumentID = instrumentID;
	}

	/**
	 * It get PriceBand
	 * @return PriceBand
	 */
	public PriceBand getPriceBand() {
		return PriceBand;
	}

	/**
	 * It set PriceBand
	 * @param priceBand PriceBand
	 */
	public void setPriceBand(PriceBand priceBand) {
		PriceBand = priceBand;
	}

	/**
	 * It get FreezeQty
	 * @return Number
	 */
	public Number getFreezeQty() {
		return FreezeQty;
	}

	/**
	 * It set FreezeQty
	 * @param freezeQty Number
	 */
	public void setFreezeQty(Number freezeQty) {
		FreezeQty = freezeQty;
	}

	/**
	 * It get TickSize
	 * @return Double
	 */
	public Double getTickSize() {
		return TickSize;
	}

	/**
	 * It set TickSize
	 * @param tickSize Double
	 */
	public void setTickSize(Double tickSize) {
		TickSize = tickSize;
	}

	/**
	 * It get LotSize
	 * @return Number
	 */
	public Number getLotSize() {
		return LotSize;
	}

	/**
	 * It set LotSize
	 * @param lotSize Number
	 */
	public void setLotSize(Number lotSize) {
		LotSize = lotSize;
	}

	/**
	 * It get DecimalDisplace
	 * @return Number
	 */
	public Number getDecimalDisplace() {
		return DecimalDisplace;
	}

	/**
	 * It set DecimalDisplace
	 * @param decimalDisplace Number
	 */
	public void setDecimalDisplace(Number decimalDisplace) {
		DecimalDisplace = decimalDisplace;
	}

	/**
	 * It get Industry
	 * @return Number
	 */
	public Number getIndustry() {
		return Industry;
	}

	/**
	 * It set Industry
	 * @param industry Number
	 */
	public void setIndustry(Number industry) {
		Industry = industry;
	}

	@Override
	public String toString() {
		return "Result [ExchangeSegment=" + ExchangeSegment
				+ ", ExchangeInstrumentID=" + ExchangeInstrumentID
				+ ", InstrumentType=" + InstrumentType + ", Name=" + Name
				+ ", DisplayName=" + DisplayName + ", Description="
				+ Description + ", Series=" + Series + ", NameWithSeries="
				+ NameWithSeries + ", InstrumentID=" + InstrumentID
				+ ", PriceBand=" + PriceBand + ", FreezeQty=" + FreezeQty
				+ ", TickSize=" + TickSize + ", LotSize=" + LotSize
				+ ", DecimalDisplace=" + DecimalDisplace + ", Industry="
				+ Industry + "]";
	}
}

