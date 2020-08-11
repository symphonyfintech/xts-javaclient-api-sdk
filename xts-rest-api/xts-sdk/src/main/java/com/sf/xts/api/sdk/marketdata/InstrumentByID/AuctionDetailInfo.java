package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AuctionDetailInfo {

    @SerializedName("AuctionNumber")
    @Expose
    private Number auctionNumber;
    
    @SerializedName("BestBuyPrice")
    @Expose
    private Double bestBuyPrice;
    
    @SerializedName("BestSellPrice")
    @Expose
    private Double bestSellPrice;
    
    @SerializedName("AuctionStatus")
    @Expose
    private Number auctionStatus;
    
    @SerializedName("TotalBuyQty")
    @Expose
    private Number totalBuyQty;
    
    @SerializedName("TotalSellQty")
    @Expose
    private Number totalSellQty;
    
    @SerializedName("InitiatorType")
    @Expose
    private Number initiatorType;
    
    @SerializedName("AuctionQty")
    @Expose
    private Number auctionQty;
    
    @SerializedName("AuctionPrice")
    @Expose
    private Double auctionPrice;
    
    @SerializedName("SettlementPeriod")
    @Expose
    private Number settlementPeriod;

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
     * It get bestBuyPrice
     * @return Number
     */
    public Number getBestBuyPrice() {
        return bestBuyPrice;
    }

    /**
     * It set bestBuyPrice
     * @param bestBuyPrice Double
     */
    public void setBestBuyPrice(Double bestBuyPrice) {
        this.bestBuyPrice = bestBuyPrice;
    }

    /**
     * It get bestSellPrice
     * @return Double
     */
    public Number getBestSellPrice() {
        return bestSellPrice;
    }

    /**
     * It set bestSellPrice
     * @param bestSellPrice Double
     */
    public void setBestSellPrice(Double bestSellPrice) {
        this.bestSellPrice = bestSellPrice;
    }

    /**
     * It get auctionStatus
     * @return Number
     */
    public Number getAuctionStatus() {
        return auctionStatus;
    }

    /**
     * It set auctionStatus
     * @param auctionStatus Number
     */
    public void setAuctionStatus(Number auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    /**
     * It get totalBuyQty
     * @return Number
     */
    public Number getTotalBuyQty() {
        return totalBuyQty;
    }

    /**
     * It set totalBuyQty
     * @param totalBuyQty Number
     */
    public void setTotalBuyQty(Number totalBuyQty) {
        this.totalBuyQty = totalBuyQty;
    }

    /**
     * It get totalSellQty
     * @return Number
     */
    public Number getTotalSellQty() {
        return totalSellQty;
    }

    /**
     * It set totalSellQty
     * @param totalSellQty Number
     */ 
    public void setTotalSellQty(Number totalSellQty) {
        this.totalSellQty = totalSellQty;
    }

    /**
     * It get initiatorType
     * @return Number
     */
    public Number getInitiatorType() {
        return initiatorType;
    }

    /**
     * It set initiatorType
     * @param initiatorType Number
     */
    public void setInitiatorType(Number initiatorType) {
        this.initiatorType = initiatorType;
    }

    /**
     * It get auctionQty
     * @return Number
     */
    public Number getAuctionQty() {
        return auctionQty;
    }

    /**
     * It set auctionQty
     * @param auctionQty Number
     */
    public void setAuctionQty(Number auctionQty) {
        this.auctionQty = auctionQty;
    }

    /**
     * It get auctionPrice
     * @return Double
     */
    public Number getAuctionPrice() {
        return auctionPrice;
    }

    /**
     * It set auctionPrice
     * @param auctionPrice Double
     */
    public void setAuctionPrice(Double auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    /**
     * It get settlementPeriod
     * @return Number
     */
    public Number getSettlementPeriod() {
        return settlementPeriod;
    }

    /**
     * It set settlementPeriod
     * @param settlementPeriod Number
     */
    public void setSettlementPeriod(Number settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("auctionNumber", auctionNumber).append("bestBuyPrice", bestBuyPrice).append("bestSellPrice", bestSellPrice).append("auctionStatus", auctionStatus).append("totalBuyQty", totalBuyQty).append("totalSellQty", totalSellQty).append("initiatorType", initiatorType).append("auctionQty", auctionQty).append("auctionPrice", auctionPrice).append("settlementPeriod", settlementPeriod).toString();
    }

}
