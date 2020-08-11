package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bhavcopy {

    @SerializedName("High")
    @Expose
    private Double high;
    
    @SerializedName("TotalTrades")
    @Expose
    private Number totalTrades;
    
    @SerializedName("TotTrdVal")
    @Expose
    private Double totTrdVal;
    
    @SerializedName("Low")
    @Expose
    private Double low;
    
    @SerializedName("Close")
    @Expose
    private Double close;
    
    @SerializedName("TotTrdQty")
    @Expose
    private Number totTrdQty;
    
    @SerializedName("SettlementPrice")
    @Expose
    private Double settlementPrice;
    
    @SerializedName("TimeStamp")
    @Expose
    private String timeStamp;
    
    @SerializedName("Open")
    @Expose
    private Double open;
    
    @SerializedName("OpenInterest")
    @Expose
    private Double openInterest;

    /**
     * It get high
     * @return Double
     */
    public Double getHigh() {
        return high;
    }

    /**
     * It set high
     * @param high Double
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * It get totalTrades
     * @return Integer
     */
    public Number getTotalTrades() {
        return totalTrades;
    }

    /**
     * It set totalTrades
     * @param totalTrades Integer
     */
    public void setTotalTrades(Integer totalTrades) {
        this.totalTrades = totalTrades;
    }

    /**
     * It get totTrdVal
     * @return Double
     */
    public Double getTotTrdVal() {
        return totTrdVal;
    }

    /**
     * It set totTrdVal
     * @param totTrdVal Double
     */
    public void setTotTrdVal(Double totTrdVal) {
        this.totTrdVal = totTrdVal;
    }

    /**
     * It get low
     * @return Double
     */
    public Double getLow() {
        return low;
    }

    /**
     * It set low
     * @param low Double
     */
    public void setLow(Double low) {
        this.low = low;
    }

    /**
     * It get close
     * @return Double
     */
    public Double getClose() {
        return close;
    }

    /**
     * It set close
     * @param close Double
     */
    public void setClose(Double close) {
        this.close = close;
    }

    /**
     * It get totTrdQty
     * @return Integer
     */
    public Number getTotTrdQty() {
        return totTrdQty;
    }

    /**
     * It set totTrdQty
     * @param totTrdQty Integer
     */
    public void setTotTrdQty(Integer totTrdQty) {
        this.totTrdQty = totTrdQty;
    }

    /**
     * It get settlementPrice
     * @return Double
     */
    public Double getSettlementPrice() {
        return settlementPrice;
    }

    /**
     * It set settlementPrice
     * @param settlementPrice Double
     */
    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    /**
     * It get timeStamp
     * @return String
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * It set timeStamp
     * @param timeStamp String
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * It get open
     * @return Double
     */
    public Double getOpen() {
        return open;
    }

    /**
     * It set open
     * @param open Double
     */
    public void setOpen(Double open) {
        this.open = open;
    }

    /**
     * It get openInterest
     * @return Double
     */
    public Double getOpenInterest() {
        return openInterest;
    }

    /**
     * It set openInterest
     * @param openInterest Double
     */
    public void setOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("high", high).append("totalTrades", totalTrades).append("totTrdVal", totTrdVal).append("low", low).append("close", close).append("totTrdQty", totTrdQty).append("settlementPrice", settlementPrice).append("timeStamp", timeStamp).append("open", open).append("openInterest", openInterest).toString();
    }

}
