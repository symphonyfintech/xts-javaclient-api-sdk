package com.sf.xts.api.sdk.marketdata.equitySymbol;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("exchangeSegment")
    @Expose
    private Number exchangeSegment;
    
    @SerializedName("exchangeInstrumentID")
    @Expose
    private Number exchangeInstrumentID;
    
    @SerializedName("InstrumentType")
    @Expose
    private Number InstrumentType = null;
    
    @SerializedName("Name")
    @Expose
    private String Name = null;
    
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName = null;
    
    @SerializedName("Description")
    @Expose
    private String Description = null;
    
    @SerializedName("Series")
    @Expose
    private String Series = null;
    
    @SerializedName("NameWithSeries")
    @Expose
    private String NameWithSeries = null;
    
    @SerializedName("InstrumentID")
    @Expose
    private Number InstrumentID = null;
    
    @SerializedName("PriceBand")
    @Expose
    private PriceBand PriceBand = null;
    
    @SerializedName("FreezeQty")
    @Expose
    private Number FreezeQty = null;
    
    @SerializedName("TickSize")
    @Expose
    private Number TickSize = null;
    
    @SerializedName("LotSize")
    @Expose
    private Number LotSize = null;

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
	 * It get DisplayName
	 * @return String
	 */
	public String getDisplayName() {
		return DisplayName;
	}

	/**
	 * It set DisplayName
	 * @param displayName String
	 */
	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	/**
	 * It get Description
	 * @return String
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * It set Description
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
	 * It set Series
	 * @param series String
	 */
	public void setSeries(String series) {
		Series = series;
	}

	/**
	 * It get NameWithSeries
	 * @return String
	 */
	public String getNameWithSeries() {
		return NameWithSeries;
	}

	/**
	 * It set NameWithSeries
	 * @param nameWithSeries String
	 */
	public void setNameWithSeries(String nameWithSeries) {
		NameWithSeries = nameWithSeries;
	}

	/**
	 * It get InstrumentID
	 * @return Number
	 */
	public Number getInstrumentID() {
		return InstrumentID;
	}

	/**
	 * It set InstrumentID
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
	 * @return Number
	 */
	public Number getTickSize() {
		return TickSize;
	}

	/**
	 * It set TickSize
	 * @param tickSize Number
	 */
	public void setTickSize(Number tickSize) {
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

	@Override
	public String toString() {
		return "Result [exchangeSegment=" + exchangeSegment
				+ ", exchangeInstrumentID=" + exchangeInstrumentID
				+ ", InstrumentType=" + InstrumentType + ", Name=" + Name
				+ ", DisplayName=" + DisplayName + ", Description="
				+ Description + ", Series=" + Series + ", NameWithSeries="
				+ NameWithSeries + ", InstrumentID=" + InstrumentID
				+ ", PriceBand=" + PriceBand + ", FreezeQty=" + FreezeQty
				+ ", TickSize=" + TickSize + ", LotSize=" + LotSize + "]";
	}

}
