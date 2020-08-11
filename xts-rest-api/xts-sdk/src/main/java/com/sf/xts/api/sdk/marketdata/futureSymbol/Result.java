package com.sf.xts.api.sdk.marketdata.futureSymbol;

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
    
    @SerializedName("InstrumentID")
    @Expose
    private Number InstrumentID;
    
    @SerializedName("PriceBand")
    @Expose
    private PriceBand PriceBand;
    
    @SerializedName("FreezeQty")
    @Expose
    private Number FreezeQty;
    
    @SerializedName("TickSize")
    @Expose
    private Number TickSize;
    
    @SerializedName("LotSize")
    @Expose
    private Number LotSize;
    
    @SerializedName("UnderlyingInstrumentId")
    @Expose
    private Number UnderlyingInstrumentId;
    
    @SerializedName("UnderlyingIndexName")
    @Expose
    private String UnderlyingIndexName = null;
    
    @SerializedName("ContractExpiration")
    @Expose
    private String ContractExpiration = null;
    
    @SerializedName("ContractExpirationString")
    @Expose
    private String ContractExpirationString = null;
    
    @SerializedName("RemainingExpiryDays")
    @Expose
    private Number RemainingExpiryDays;

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
		this.ExchangeSegment = exchangeSegment;
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
		this.ExchangeInstrumentID = exchangeInstrumentID;
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
	public String DisplayNamegetDisplayName() {
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

	/**
	 * It get UnderlyingInstrumentId
	 * @return Number
	 */
	public Number getUnderlyingInstrumentId() {
		return UnderlyingInstrumentId;
	}

	/**
	 * It set UnderlyingInstrumentId
	 * @param underlyingInstrumentId Number
	 */
	public void setUnderlyingInstrumentId(Number underlyingInstrumentId) {
		UnderlyingInstrumentId = underlyingInstrumentId;
	}

	/**
	 * It get UnderlyingIndexName
	 * @return String
	 */
	public String getUnderlyingIndexName() {
		return UnderlyingIndexName;
	}

	/**
	 * It set UnderlyingIndexName
	 * @param underlyingIndexName String
	 */
	public void setUnderlyingIndexName(String underlyingIndexName) {
		UnderlyingIndexName = underlyingIndexName;
	}

	/**
	 * It get ContractExpiration
	 * @return String
	 */
	public String getContractExpiration() {
		return ContractExpiration;
	}

	/**
	 * It set ContractExpiration
	 * @param contractExpiration String
	 */
	public void setContractExpiration(String contractExpiration) {
		ContractExpiration = contractExpiration;
	}

	/**
	 * It get ContractExpirationString
	 * @return String
	 */
	public String getContractExpirationString() {
		return ContractExpirationString;
	}

	/**
	 * It set contractExpirationString
	 * @param contractExpirationString String
	 */
	public void setContractExpirationString(String contractExpirationString) {
		ContractExpirationString = contractExpirationString;
	}

	/**
	 * It get RemainingExpiryDays
	 * @return Number
	 */
	public Number getRemainingExpiryDays() {
		return RemainingExpiryDays;
	}

	/**
	 * It set RemainingExpiryDays
	 * @param remainingExpiryDays Number
	 */
	public void setRemainingExpiryDays(Number remainingExpiryDays) {
		RemainingExpiryDays = remainingExpiryDays;
	}

	@Override
	public String toString() {
		return "Result [exchangeSegment=" + ExchangeSegment
				+ ", exchangeInstrumentID=" + ExchangeInstrumentID
				+ ", InstrumentType=" + InstrumentType + ", Name=" + Name
				+ ", DisplayName=" + DisplayName + ", Description="
				+ Description + ", Series=" + Series + ", InstrumentID="
				+ InstrumentID + ", PriceBand=" + PriceBand + ", FreezeQty="
				+ FreezeQty + ", TickSize=" + TickSize + ", LotSize=" + LotSize
				+ ", UnderlyingInstrumentId=" + UnderlyingInstrumentId
				+ ", UnderlyingIndexName=" + UnderlyingIndexName
				+ ", ContractExpiration=" + ContractExpiration
				+ ", ContractExpirationString=" + ContractExpirationString
				+ ", RemainingExpiryDays=" + RemainingExpiryDays + "]";
	}
    
    
    
}