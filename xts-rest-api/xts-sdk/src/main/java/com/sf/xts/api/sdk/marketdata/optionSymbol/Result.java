package com.sf.xts.api.sdk.marketdata.optionSymbol;

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
    
    @SerializedName("UnderlyingInstrumentId")
    @Expose
    private Number UnderlyingInstrumentId = null;
    
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
    private Number RemainingExpiryDays = null;
    
    @SerializedName("StrikePrice")
    @Expose
    private Double StrikePrice = null;
    
    @SerializedName("OptionType")
    @Expose
    private Number OptionType = null;

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
	 * It get instrumentType
	 * @return Number
	 */
	public Number getInstrumentType() {
		return InstrumentType;
	}

	/**
	 * It set instrumentType
	 * @param instrumentType Number
	 */
	public void setInstrumentType(Number instrumentType) {
		InstrumentType = instrumentType;
	}

	/**
	 * It get name
	 * @return String
	 */ 
	public String getName() {
		return Name;
	}

	/**
	 * It set name
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
	 * It get series
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
	 * It get priceBand
	 * @return PriceBand
	 */
	public PriceBand getPriceBand() {
		return PriceBand;
	}

	/**
	 * It set priceBand
	 * @param priceBand PriceBand
	 */
	public void setPriceBand(PriceBand priceBand) {
		PriceBand = priceBand;
	}

	/**
	 * It get freezeQty
	 * @return Number
	 */
	public Number getFreezeQty() {
		return FreezeQty;
	}

	/**
	 * It set freezeQty
	 * @param freezeQty Number
	 */
	public void setFreezeQty(Number freezeQty) {
		FreezeQty = freezeQty;
	}

	/**
	 * It get tickSize
	 * @return Number
	 */
	public Number getTickSize() {
		return TickSize;
	}

	/**
	 * It set tickSize
	 * @param tickSize Number
	 */
	public void setTickSize(Number tickSize) {
		TickSize = tickSize;
	}

	/**
	 * It get lotSize
	 * @return Number
	 */
	public Number getLotSize() {
		return LotSize;
	}

	/**
	 * It set lotSize
	 * @param lotSize Number
	 */
	public void setLotSize(Number lotSize) {
		LotSize = lotSize;
	}

	/**
	 * It get underlyingInstrumentId
	 * @return Number
	 */
	public Number getUnderlyingInstrumentId() {
		return UnderlyingInstrumentId;
	}

	/**
	 * It set underlyingInstrumentId
	 * @param underlyingInstrumentId Number
	 */
	public void setUnderlyingInstrumentId(Number underlyingInstrumentId) {
		UnderlyingInstrumentId = underlyingInstrumentId;
	}

	/**
	 * It get underlyingIndexName
	 * @return String
	 */
	public String getUnderlyingIndexName() {
		return UnderlyingIndexName;
	}

	/**
	 * It set underlyingIndexName
	 * @param underlyingIndexName String
	 */
	public void setUnderlyingIndexName(String underlyingIndexName) {
		UnderlyingIndexName = underlyingIndexName;
	}

	/**
	 * It get contractExpiration
	 * @return String
	 */
	public String getContractExpiration() {
		return ContractExpiration;
	}

	/**
	 * It set contractExpiration
	 * @param contractExpiration String
	 */
	public void setContractExpiration(String contractExpiration) {
		ContractExpiration = contractExpiration;
	}

	/**
	 * It get contractExpirationString
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
	 * It get remainingExpiryDays
	 * @return Number
	 */
	public Number getRemainingExpiryDays() {
		return RemainingExpiryDays;
	}

	/**
	 * It set remainingExpiryDays
	 * @param remainingExpiryDays Number
	 */
	public void setRemainingExpiryDays(Number remainingExpiryDays) {
		RemainingExpiryDays = remainingExpiryDays;
	}

	/**
	 * It get strikePrice
	 * @return Double
	 */
	public Double getStrikePrice() {
		return StrikePrice;
	}

	/**
	 * It set strikePrice
	 * @param strikePrice Double
	 */
	public void setStrikePrice(Double strikePrice) {
		StrikePrice = strikePrice;
	}

	/**
	 * It get optionType
	 * @return Number
	 */
	public Number getOptionType() {
		return OptionType;
	}

	/**
	 * It set optionType
	 * @param optionType Number
	 */
	public void setOptionType(Number optionType) {
		OptionType = optionType;
	}

	@Override
	public String toString() {
		return "Result [exchangeSegment=" + exchangeSegment
				+ ", exchangeInstrumentID=" + exchangeInstrumentID
				+ ", InstrumentType=" + InstrumentType + ", Name=" + Name
				+ ", DisplayName=" + DisplayName + ", Description="
				+ Description + ", Series=" + Series + ", InstrumentID="
				+ InstrumentID + ", PriceBand=" + PriceBand + ", FreezeQty="
				+ FreezeQty + ", TickSize=" + TickSize + ", LotSize=" + LotSize
				+ ", UnderlyingInstrumentId=" + UnderlyingInstrumentId
				+ ", UnderlyingIndexName=" + UnderlyingIndexName
				+ ", ContractExpiration=" + ContractExpiration
				+ ", ContractExpirationString=" + ContractExpirationString
				+ ", RemainingExpiryDays=" + RemainingExpiryDays
				+ ", StrikePrice=" + StrikePrice + ", OptionType=" + OptionType
				+ "]";
	}

}
