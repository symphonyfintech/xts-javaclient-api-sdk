package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

	@SerializedName("CallAuctionIndicator")
    @Expose
    private Number callAuctionIndicator;
	
    @SerializedName("InstrumentType")
    @Expose
    private Number instrumentType;
    
    @SerializedName("AdditionalMarginPercShort")
    @Expose
    private Number additionalMarginPercShort;
    
    @SerializedName("VaRMargin")
    @Expose
    private Double vaRMargin;
    
    @SerializedName("InitialMarginPerc")
    @Expose
    private Number initialMarginPerc;
    
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Interest")
    @Expose
    private Boolean interest;
    
    @SerializedName("DisplayNameWithExchange")
    @Expose
    private String displayNameWithExchange;
    
    @SerializedName("Industry")
    @Expose
    private Number industry;
    
    @SerializedName("CallAuction1Flag")
    @Expose
    private Boolean callAuction1Flag;
    
    @SerializedName("Rights")
    @Expose
    private Boolean rights;
    
    @SerializedName("IssuedCapital")
    @Expose
    private Number issuedCapital;
    
    @SerializedName("Spread")
    @Expose
    private Number spread;
    
    @SerializedName("MaxTradeVolume")
    @Expose
    private Number maxTradeVolume;
    
    @SerializedName("DisplayNameWithSeries")
    @Expose
    private String displayNameWithSeries;
    
    @SerializedName("MinimumQty")
    @Expose
    private Number minimumQty;
    
    @SerializedName("ExchangeSegment")
    @Expose
    private Number exchangeSegment;
    
    @SerializedName("AuctionDetailInfo")
    @Expose
    private AuctionDetailInfo auctionDetailInfo;
    
    @SerializedName("TickSize")
    @Expose
    private Double tickSize;
    
    @SerializedName("LastUpdateTime")
    @Expose
    private Number lastUpdateTime;
    
    @SerializedName("IsTradeable")
    @Expose
    private Boolean isTradeable;
    
    @SerializedName("Dividend")
    @Expose
    private Boolean dividend;
    
    @SerializedName("LotSize")
    @Expose
    private Number lotSize;
    
    @SerializedName("FaceValue")
    @Expose
    private Number faceValue;
    
    @SerializedName("Status")
    @Expose
    private String status;
    
    @SerializedName("AllOrNone")
    @Expose
    private Boolean allOrNone;
    
    @SerializedName("AdditionalMarginPercLong")
    @Expose
    private Number additionalMarginPercLong;
    
    @SerializedName("Bonus")
    @Expose
    private Boolean bonus;
    
    @SerializedName("QuantityMultiplier")
    @Expose
    private Number quantityMultiplier;
    
    @SerializedName("ELMShortMargin")
    @Expose
    private Number eLMShortMargin;
    
    @SerializedName("GSMIndicator")
    @Expose
    private Number gSMIndicator;
    
    @SerializedName("ExchangeInstrumentID")
    @Expose
    private Number exchangeInstrumentID;
    
    @SerializedName("DecimalDisplace")
    @Expose
    private Number decimalDisplace;
    
    @SerializedName("ExposureMarginPerc")
    @Expose
    private Number exposureMarginPerc;
    
    @SerializedName("FiftyTwoWeekLow")
    @Expose
    private Double fiftyTwoWeekLow;
    
    @SerializedName("SymbolType")
    @Expose
    private Number symbolType;
    
    @SerializedName("DisplayNameWithSeriesAndExchange")
    @Expose
    private String displayNameWithSeriesAndExchange;
    
    @SerializedName("AuctionNumber")
    @Expose
    private Number auctionNumber;
    
    @SerializedName("Description")
    @Expose
    private String description;
    
    @SerializedName("ELMargin")
    @Expose
    private Number eLMargin;
    
    @SerializedName("PriceDenominator")
    @Expose
    private Number priceDenominator;
    
    @SerializedName("PriceBand")
    @Expose
    private PriceBand priceBand;
    
    @SerializedName("InstrumentID")
    @Expose
    private Number instrumentID;
    
    @SerializedName("BoardLotQuantity")
    @Expose
    private Number boardLotQuantity;
    
    @SerializedName("DeliveryMarginPerc")
    @Expose
    private Number deliveryMarginPerc;
    
    @SerializedName("ELMLongMargin")
    @Expose
    private Number eLMLongMargin;
    
    @SerializedName("DisplayName")
    @Expose
    private String displayName;
    
    @SerializedName("Multiplier")
    @Expose
    private Number multiplier;
    
    @SerializedName("Bhavcopy")
    @Expose
    private Bhavcopy bhavcopy;
    @SerializedName("IsImpliedMarket")
    @Expose
    private Boolean isImpliedMarket;
    
    @SerializedName("TenderMargin")
    @Expose
    private Number tenderMargin;
    
    @SerializedName("MarketType")
    @Expose
    private Number marketType;
    
    @SerializedName("AdditionalPreExpiryMarginPerc")
    @Expose
    private Number additionalPreExpiryMarginPerc;
    
    @SerializedName("SpecialMarginPercBuy")
    @Expose
    private Number specialMarginPercBuy;
    
    @SerializedName("CfiCode")
    @Expose
    private String cfiCode;
    
    @SerializedName("CurrentEligibleMarketType")
    @Expose
    private Number currentEligibleMarketType;
    
    @SerializedName("MarketTypeStatusEligibility")
    @Expose
    private MarketTypeStatusEligibility marketTypeStatusEligibility;
    
    @SerializedName("AGM")
    @Expose
    private Boolean aGM;
    
    @SerializedName("PriceNumerator")
    @Expose
    private Number priceNumerator;
    
    @SerializedName("EGM")
    @Expose
    private Boolean eGM;
    
    @SerializedName("MinimumFill")
    @Expose
    private Boolean minimumFill;
    
    @SerializedName("ISIN")
    @Expose
    private String iSIN;
    
    @SerializedName("FreezeQty")
    @Expose
    private Number freezeQty;
    
    @SerializedName("Series")
    @Expose
    private String series;
    
    @SerializedName("FiftyTwoWeekHigh")
    @Expose
    private Double fiftyTwoWeekHigh;
    
    @SerializedName("ExtendedMarketProperties")
    @Expose
    private ExtendedMarketProperties extendedMarketProperties;
    
    @SerializedName("TicksPerPoint")
    @Expose
    private Number ticksPerPoint;
    @SerializedName("NameWithSeries")
    @Expose
    private String nameWithSeries;
    @SerializedName("SpecialMarginPercSell")
    @Expose
    private Number specialMarginPercSell;

    /**
     * It get callAuctionIndicator
     * @return Number
     */
    public Number getCallAuctionIndicator() {
        return callAuctionIndicator;
    }

    /**
     * It set callAuctionIndicator
     * @param callAuctionIndicator Number
     */
    public void setCallAuctionIndicator(Number callAuctionIndicator) {
        this.callAuctionIndicator = callAuctionIndicator;
    }

    /**
     * It get instrumentType
     * @return Number
     */ 
    public Number getInstrumentType() {
        return instrumentType;
    }

    /**
     * It set instrumentType
     * @param instrumentType Number
     */
    public void setInstrumentType(Number instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * It get additionalMarginPercShort
     * @return Number
     */
    public Number getAdditionalMarginPercShort() {
        return additionalMarginPercShort;
    }

    /**
     * It set additionalMarginPercShort
     * @param additionalMarginPercShort Number
     */
    public void setAdditionalMarginPercShort(Number additionalMarginPercShort) {
        this.additionalMarginPercShort = additionalMarginPercShort;
    }

    /**
     * It get vaRMargin
     * @return Double
     */
    public Double getVaRMargin() {
        return vaRMargin;
    }

    /**
     * It set vaRMargin
     * @param vaRMargin Double
     */
    public void setVaRMargin(Double vaRMargin) {
        this.vaRMargin = vaRMargin;
    }

    /**
     * It get initialMarginPerc
     * @return Number
     */
    public Number getInitialMarginPerc() {
        return initialMarginPerc;
    }

    /**
     * It set initialMarginPerc
     * @param initialMarginPerc Number
     */
    public void setInitialMarginPerc(Number initialMarginPerc) {
        this.initialMarginPerc = initialMarginPerc;
    }

    /**
     * It get name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * It set name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * It get interest
     * @return Boolean
     */
    public Boolean getInterest() {
        return interest;
    }

    /**
     * It set interest
     * @param interest Boolean
     */
    public void setInterest(Boolean interest) {
        this.interest = interest;
    }

    /**
     * It get displayNameWithExchange
     * @return String
     */
    public String getDisplayNameWithExchange() {
        return displayNameWithExchange;
    }

    /**
     * It set displayNameWithExchange
     * @param displayNameWithExchange String
     */
    public void setDisplayNameWithExchange(String displayNameWithExchange) {
        this.displayNameWithExchange = displayNameWithExchange;
    }

    /**
     * It get industry
     * @return Number
     */
    public Number getIndustry() {
        return industry;
    }

    /**
     * It set industry
     * @param industry Number
     */
    public void setIndustry(Number industry) {
        this.industry = industry;
    }

    /**
     * It get callAuction1Flag
     * @return Boolean
     */
    public Boolean getCallAuction1Flag() {
        return callAuction1Flag;
    }

    /**
     * It set callAuction1Flag
     * @param callAuction1Flag Boolean
     */
    public void setCallAuction1Flag(Boolean callAuction1Flag) {
        this.callAuction1Flag = callAuction1Flag;
    }

    /**
     * It get rights
     * @return Boolean
     */
    public Boolean getRights() {
        return rights;
    }

    /**
     * It set rights
     * @param rights Boolean
     */
    public void setRights(Boolean rights) {
        this.rights = rights;
    }

    /**
     * It get issuedCapital
     * @return Number
     */
    public Number getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * It set issuedCapital
     * @param issuedCapital Number
     */
    public void setIssuedCapital(Number issuedCapital) {
        this.issuedCapital = issuedCapital;
    }

    /**
     * It get spread
     * @return Number
     */
    public Number getSpread() {
        return spread;
    }

    /**
     * It set spread
     * @param spread Number
     */
    public void setSpread(Number spread) {
        this.spread = spread;
    }

    /**
     * It get maxTradeVolume
     * @return Number
     */
    public Number getMaxTradeVolume() {
        return maxTradeVolume;
    }

    /**
     * It set maxTradeVolume
     * @param maxTradeVolume Number
     */
    public void setMaxTradeVolume(Number maxTradeVolume) {
        this.maxTradeVolume = maxTradeVolume;
    }

    /**
     * It get displayNameWithSeries
     * @return String
     */
    public String getDisplayNameWithSeries() {
        return displayNameWithSeries;
    }

    /**
     * It set displayNameWithSeries
     * @param displayNameWithSeries String
     */
    public void setDisplayNameWithSeries(String displayNameWithSeries) {
        this.displayNameWithSeries = displayNameWithSeries;
    }

    /**
     * It get minimumQty
     * @return Number
     */
    public Number getMinimumQty() {
        return minimumQty;
    }

    /**
     * It set minimumQty
     * @param minimumQty Number
     */
    public void setMinimumQty(Number minimumQty) {
        this.minimumQty = minimumQty;
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
     * It get auctionDetailInfo
     * @return AuctionDetailInfo
     */
    public AuctionDetailInfo getAuctionDetailInfo() {
        return auctionDetailInfo;
    }

    /**
     * It set auctionDetailInfo
     * @param auctionDetailInfo AuctionDetailInfo
     */
    public void setAuctionDetailInfo(AuctionDetailInfo auctionDetailInfo) {
        this.auctionDetailInfo = auctionDetailInfo;
    }

    /**
     * It get tickSize
     * @return Double
     */
    public Double getTickSize() {
        return tickSize;
    }

    /**
     * It set tickSize
     * @param tickSize Double
     */
    public void setTickSize(Double tickSize) {
        this.tickSize = tickSize;
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
     * It get isTradeable
     * @return Boolean
     */
    public Boolean getIsTradeable() {
        return isTradeable;
    }

    /**
     * It set isTradeable
     * @param isTradeable Boolean
     */
    public void setIsTradeable(Boolean isTradeable) {
        this.isTradeable = isTradeable;
    }

    /**
     * It get dividend
     * @return Boolean
     */
    public Boolean getDividend() {
        return dividend;
    }

    /**
     * It set dividend
     * @param dividend Boolean
     */
    public void setDividend(Boolean dividend) {
        this.dividend = dividend;
    }

    /**
     * It get lotSize
     * @return Number
     */ 
    public Number getLotSize() {
        return lotSize;
    }

    /**
     * It set lotSize
     * @param lotSize Number
     */
    public void setLotSize(Number lotSize) {
        this.lotSize = lotSize;
    }

    /**
     * It get faceValue
     * @return Number
     */
    public Number getFaceValue() {
        return faceValue;
    }

    /**
     * It set faceValue
     * @param faceValue Number
     */
    public void setFaceValue(Number faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * It get status
     * @return String
     */
    public String getStatus() {
        return status;
    }

    /**
     * It set status
     * @param status String
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * It get allOrNone
     * @return Boolean
     */
    public Boolean getAllOrNone() {
        return allOrNone;
    }

    /**
     * It set allOrNone
     * @param allOrNone Boolean
     */
    public void setAllOrNone(Boolean allOrNone) {
        this.allOrNone = allOrNone;
    }

    /**
     * It get additionalMarginPercLong
     * @return Number
     */
    public Number getAdditionalMarginPercLong() {
        return additionalMarginPercLong;
    }

    /**
     * It set additionalMarginPercLong
     * @param additionalMarginPercLong Number
     */
    public void setAdditionalMarginPercLong(Number additionalMarginPercLong) {
        this.additionalMarginPercLong = additionalMarginPercLong;
    }

    /**
     * It get bonus
     * @return Boolean
     */
    public Boolean getBonus() {
        return bonus;
    }

    /**
     * It set bonus
     * @param bonus Boolean
     */
    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    /**
     * It get quantityMultiplier
     * @return Number
     */
    public Number getQuantityMultiplier() {
        return quantityMultiplier;
    }

    /**
     * It set quantityMultiplier
     * @param quantityMultiplier Number
     */
    public void setQuantityMultiplier(Number quantityMultiplier) {
        this.quantityMultiplier = quantityMultiplier;
    }

    /**
     * It get eLMShortMargin
     * @return Number
     */
    public Number getELMShortMargin() {
        return eLMShortMargin;
    }

    /**
     * It set eLMShortMargin
     * @param eLMShortMargin Number
     */
    public void setELMShortMargin(Number eLMShortMargin) {
        this.eLMShortMargin = eLMShortMargin;
    }

    /**
     * It get gSMIndicator
     * @return Number
     */
    public Number getGSMIndicator() {
        return gSMIndicator;
    }

    /**
     * It set gSMIndicator
     * @param gSMIndicator Number
     */
    public void setGSMIndicator(Number gSMIndicator) {
        this.gSMIndicator = gSMIndicator;
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
     * It get decimalDisplace
     * @return Number
     */
    public Number getDecimalDisplace() {
        return decimalDisplace;
    }

    /**
     * It set decimalDisplace
     * @param decimalDisplace Number
     */
    public void setDecimalDisplace(Number decimalDisplace) {
        this.decimalDisplace = decimalDisplace;
    }

    /**
     * It get exposureMarginPerc
     * @return Number
     */
    public Number getExposureMarginPerc() {
        return exposureMarginPerc;
    }

    /**
     * It set exposureMarginPerc
     * @param exposureMarginPerc Number
     */
    public void setExposureMarginPerc(Number exposureMarginPerc) {
        this.exposureMarginPerc = exposureMarginPerc;
    }

    /**
     * It get fiftyTwoWeekLow
     * @return Double
     */
    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    /**
     * It set fiftyTwoWeekLow
     * @param fiftyTwoWeekLow Double
     */
    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    /**
     * It get symbolType
     * @return Number
     */
    public Number getSymbolType() {
        return symbolType;
    }

    /**
     * It set symbolType
     * @param symbolType Number
     */
    public void setSymbolType(Number symbolType) {
        this.symbolType = symbolType;
    }

    /**
     * It get displayNameWithSeriesAndExchange
     * @return String
     */
    public String getDisplayNameWithSeriesAndExchange() {
        return displayNameWithSeriesAndExchange;
    }

    /**
     * It set displayNameWithSeriesAndExchange
     * @param displayNameWithSeriesAndExchange String
     */
    public void setDisplayNameWithSeriesAndExchange(String displayNameWithSeriesAndExchange) {
        this.displayNameWithSeriesAndExchange = displayNameWithSeriesAndExchange;
    }

    /**
     * It get auctionNumber
     * @return Number
     */
    public Number getAuctionNumber() {
        return auctionNumber;
    }

    /**
     * It set auctionNumber
     * @param auctionNumber Number
     */
    public void setAuctionNumber(Number auctionNumber) {
        this.auctionNumber = auctionNumber;
    }

    /**
     * It get description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * It set description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * It get eLMargin
     * @return Number
     */
    public Number getELMargin() {
        return eLMargin;
    }

    /**
     * It set eLMargin
     * @param eLMargin Number
     */
    public void setELMargin(Number eLMargin) {
        this.eLMargin = eLMargin;
    }

    /**
     * It get priceDenominator
     * @return Number
     */
    public Number getPriceDenominator() {
        return priceDenominator;
    }

    /**
     * It set priceDenominator
     * @param priceDenominator Number
     */
    public void setPriceDenominator(Number priceDenominator) {
        this.priceDenominator = priceDenominator;
    }

    /**
     * It get priceBand
     * @return PriceBand
     */
    public PriceBand getPriceBand() {
        return priceBand;
    }

    /**
     * It set priceBand
     * @param priceBand PriceBand
     */
    public void setPriceBand(PriceBand priceBand) {
        this.priceBand = priceBand;
    }

    /**
     * It get instrumentID
     * @return Number
     */
    public Number getInstrumentID() {
        return instrumentID;
    }

    /**
     * It set instrumentID
     * @param instrumentID Number
     */
    public void setInstrumentID(Number instrumentID) {
        this.instrumentID = instrumentID;
    }

    /**
     * It get boardLotQuantity
     * @return Number
     */
    public Number getBoardLotQuantity() {
        return boardLotQuantity;
    }

    /**
     * It set boardLotQuantity
     * @param boardLotQuantity Number
     */
    public void setBoardLotQuantity(Number boardLotQuantity) {
        this.boardLotQuantity = boardLotQuantity;
    }

    /**
     * It get deliveryMarginPerc
     * @return Number
     */
    public Number getDeliveryMarginPerc() {
        return deliveryMarginPerc;
    }

    /**
     * It set deliveryMarginPerc
     * @param deliveryMarginPerc Number
     */
    public void setDeliveryMarginPerc(Number deliveryMarginPerc) {
        this.deliveryMarginPerc = deliveryMarginPerc;
    }

    /**
     * It get eLMLongMargin
     * @return Number
     */
    public Number getELMLongMargin() {
        return eLMLongMargin;
    }

    /**
     * It set 
     * @param eLMLongMargin Number
     */
    public void setELMLongMargin(Number eLMLongMargin) {
        this.eLMLongMargin = eLMLongMargin;
    }

    /**
     * It get displayName
     * @return String
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * It set displayName
     * @param displayName String
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * It get multiplier
     * @return Number
     */
    public Number getMultiplier() {
        return multiplier;
    }

    /**
     * It set multiplier
     * @param multiplier Number
     */
    public void setMultiplier(Number multiplier) {
        this.multiplier = multiplier;
    }

    /**
     * It get bhavcopy
     * @return Bhavcopy
     */
    public Bhavcopy getBhavcopy() {
        return bhavcopy;
    }

    /**
     * It set bhavcopy
     * @param bhavcopy Bhavcopy
     */
    public void setBhavcopy(Bhavcopy bhavcopy) {
        this.bhavcopy = bhavcopy;
    }

    /**
     * It get isImpliedMarket
     * @return Boolean
     */
    public Boolean getIsImpliedMarket() {
        return isImpliedMarket;
    }

    /**
     * It set isImpliedMarket
     * @param isImpliedMarket Boolean
     */
    public void setIsImpliedMarket(Boolean isImpliedMarket) {
        this.isImpliedMarket = isImpliedMarket;
    }

    /**
     * It get tenderMargin
     * @return Number
     */
    public Number getTenderMargin() {
        return tenderMargin;
    }

    /**
     * It set tenderMargin
     * @param tenderMargin Number
     */
    public void setTenderMargin(Number tenderMargin) {
        this.tenderMargin = tenderMargin;
    }

    /**
     * It get marketType
     * @return Number
     */
    public Number getMarketType() {
        return marketType;
    }

    /**
     * It set marketType
     * @param marketType Number
     */
    public void setMarketType(Number marketType) {
        this.marketType = marketType;
    }

    /**
     * It get additionalPreExpiryMarginPerc
     * @return Number
     */
    public Number getAdditionalPreExpiryMarginPerc() {
        return additionalPreExpiryMarginPerc;
    }

    /**
     * It set additionalPreExpiryMarginPerc
     * @param additionalPreExpiryMarginPerc Number
     */
    public void setAdditionalPreExpiryMarginPerc(Number additionalPreExpiryMarginPerc) {
        this.additionalPreExpiryMarginPerc = additionalPreExpiryMarginPerc;
    }

    /**
     * It get specialMarginPercBuy
     * @return Number
     */
    public Number getSpecialMarginPercBuy() {
        return specialMarginPercBuy;
    }

    /**
     * It set specialMarginPercBuy
     * @param specialMarginPercBuy Number
     */
    public void setSpecialMarginPercBuy(Number specialMarginPercBuy) {
        this.specialMarginPercBuy = specialMarginPercBuy;
    }

    /**
     * It get cfiCode
     * @return String
     */
    public String getCfiCode() {
        return cfiCode;
    }

    /**
     * It set cfiCode
     * @param cfiCode String
     */
    public void setCfiCode(String cfiCode) {
        this.cfiCode = cfiCode;
    }

    /**
     * It get currentEligibleMarketType
     * @return Number
     */
    public Number getCurrentEligibleMarketType() {
        return currentEligibleMarketType;
    }

    /**
     * It set currentEligibleMarketType
     * @param currentEligibleMarketType Number
     */
    public void setCurrentEligibleMarketType(Number currentEligibleMarketType) {
        this.currentEligibleMarketType = currentEligibleMarketType;
    }

    /**
     * It get marketTypeStatusEligibility
     * @return MarketTypeStatusEligibility
     */
    public MarketTypeStatusEligibility getMarketTypeStatusEligibility() {
        return marketTypeStatusEligibility;
    }

    /**
     * It set marketTypeStatusEligibility
     * @param marketTypeStatusEligibility MarketTypeStatusEligibility
     */
    public void setMarketTypeStatusEligibility(MarketTypeStatusEligibility marketTypeStatusEligibility) {
        this.marketTypeStatusEligibility = marketTypeStatusEligibility;
    }

    /**
     * It get aGM
     * @return Boolean
     */ 
    public Boolean getAGM() {
        return aGM;
    }

    /**
     * It set aGM
     * @param aGM Boolean
     */
    public void setAGM(Boolean aGM) {
        this.aGM = aGM;
    }

    /**
     * It get priceNumerator
     * @return Number
     */
    public Number getPriceNumerator() {
        return priceNumerator;
    }

    /**
     * It set priceNumerator
     * @param priceNumerator Number
     */
    public void setPriceNumerator(Number priceNumerator) {
        this.priceNumerator = priceNumerator;
    }

    /**
     * It get eGM
     * @return Boolean
     */
    public Boolean getEGM() {
        return eGM;
    }

    /**
     * It set eGM
     * @param eGM Boolean
     */
    public void setEGM(Boolean eGM) {
        this.eGM = eGM;
    }

    /**
     * It get minimumFill
     * @return Boolean
     */
    public Boolean getMinimumFill() {
        return minimumFill;
    }

    /**
     * It set minimumFill
     * @param minimumFill Boolean
     */
    public void setMinimumFill(Boolean minimumFill) {
        this.minimumFill = minimumFill;
    }

    /**
     * It get iSIN
     * @return String
     */
    public String getISIN() {
        return iSIN;
    }

    /**
     * It set iSIN
     * @param iSIN String
     */
    public void setISIN(String iSIN) {
        this.iSIN = iSIN;
    }

    /**
     * It get freezeQty
     * @return Number
     */
    public Number getFreezeQty() {
        return freezeQty;
    }

    /**
     * It set freezeQty
     * @param freezeQty Number
     */
    public void setFreezeQty(Number freezeQty) {
        this.freezeQty = freezeQty;
    }

    /**
     * It get series
     * @return String
     */
    public String getSeries() {
        return series;
    }

    /**
     * It set series
     * @param series String
     */ 
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * It get fiftyTwoWeekHigh
     * @return Double
     */
    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    /**
     * It set fiftyTwoWeekHigh
     * @param fiftyTwoWeekHigh Double
     */
    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    /**
     * It get extendedMarketProperties
     * @return ExtendedMarketProperties
     */
    public ExtendedMarketProperties getExtendedMarketProperties() {
        return extendedMarketProperties;
    }

    /**
     * It set extendedMarketProperties
     * @param extendedMarketProperties ExtendedMarketProperties
     */
    public void setExtendedMarketProperties(ExtendedMarketProperties extendedMarketProperties) {
        this.extendedMarketProperties = extendedMarketProperties;
    }

    /**
     * It get ticksPerPoint
     * @return Number
     */
    public Number getTicksPerPoint() {
        return ticksPerPoint;
    }

    /**
     * It set ticksPerPoint
     * @param ticksPerPoint Number
     */
    public void setTicksPerPoint(Number ticksPerPoint) {
        this.ticksPerPoint = ticksPerPoint;
    }

    /**
     * It get nameWithSeries
     * @return String
     */
    public String getNameWithSeries() {
        return nameWithSeries;
    }

    /**
     * It set nameWithSeries
     * @param nameWithSeries String
     */
    public void setNameWithSeries(String nameWithSeries) {
        this.nameWithSeries = nameWithSeries;
    }

    /**
     * It get specialMarginPercSell
     * @return Number
     */
    public Number getSpecialMarginPercSell() {
        return specialMarginPercSell;
    }

    /**
     * It set specialMarginPercSell
     * @param specialMarginPercSell Number
     */
    public void setSpecialMarginPercSell(Number specialMarginPercSell) {
        this.specialMarginPercSell = specialMarginPercSell;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("callAuctionIndicator", callAuctionIndicator).append("instrumentType", instrumentType).append("additionalMarginPercShort", additionalMarginPercShort).append("vaRMargin", vaRMargin).append("initialMarginPerc", initialMarginPerc).append("name", name).append("interest", interest).append("displayNameWithExchange", displayNameWithExchange).append("industry", industry).append("callAuction1Flag", callAuction1Flag).append("rights", rights).append("issuedCapital", issuedCapital).append("spread", spread).append("maxTradeVolume", maxTradeVolume).append("displayNameWithSeries", displayNameWithSeries).append("minimumQty", minimumQty).append("exchangeSegment", exchangeSegment).append("auctionDetailInfo", auctionDetailInfo).append("tickSize", tickSize).append("lastUpdateTime", lastUpdateTime).append("isTradeable", isTradeable).append("dividend", dividend).append("lotSize", lotSize).append("faceValue", faceValue).append("status", status).append("allOrNone", allOrNone).append("additionalMarginPercLong", additionalMarginPercLong).append("bonus", bonus).append("quantityMultiplier", quantityMultiplier).append("eLMShortMargin", eLMShortMargin).append("gSMIndicator", gSMIndicator).append("exchangeInstrumentID", exchangeInstrumentID).append("decimalDisplace", decimalDisplace).append("exposureMarginPerc", exposureMarginPerc).append("fiftyTwoWeekLow", fiftyTwoWeekLow).append("symbolType", symbolType).append("displayNameWithSeriesAndExchange", displayNameWithSeriesAndExchange).append("auctionNumber", auctionNumber).append("description", description).append("eLMargin", eLMargin).append("priceDenominator", priceDenominator).append("priceBand", priceBand).append("instrumentID", instrumentID).append("boardLotQuantity", boardLotQuantity).append("deliveryMarginPerc", deliveryMarginPerc).append("eLMLongMargin", eLMLongMargin).append("displayName", displayName).append("multiplier", multiplier).append("bhavcopy", bhavcopy).append("isImpliedMarket", isImpliedMarket).append("tenderMargin", tenderMargin).append("marketType", marketType).append("additionalPreExpiryMarginPerc", additionalPreExpiryMarginPerc).append("specialMarginPercBuy", specialMarginPercBuy).append("cfiCode", cfiCode).append("currentEligibleMarketType", currentEligibleMarketType).append("marketTypeStatusEligibility", marketTypeStatusEligibility).append("aGM", aGM).append("priceNumerator", priceNumerator).append("eGM", eGM).append("minimumFill", minimumFill).append("iSIN", iSIN).append("freezeQty", freezeQty).append("series", series).append("fiftyTwoWeekHigh", fiftyTwoWeekHigh).append("extendedMarketProperties", extendedMarketProperties).append("ticksPerPoint", ticksPerPoint).append("nameWithSeries", nameWithSeries).append("specialMarginPercSell", specialMarginPercSell).toString();
    }
}

