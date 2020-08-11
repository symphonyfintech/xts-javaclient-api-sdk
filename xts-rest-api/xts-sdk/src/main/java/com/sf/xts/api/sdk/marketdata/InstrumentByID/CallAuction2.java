package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CallAuction2 {

    @SerializedName("TradingStatus")
    @Expose
    private Number tradingStatus;
    
    @SerializedName("Eligibile")
    @Expose
    private Boolean eligibile;
    
    @SerializedName("MarketType")
    @Expose
    private Number marketType;

    /**
     * It get tradingStatus
     * @return Number
     */
    public Number getTradingStatus() {
        return tradingStatus;
    }

    /**
     * It set tradingStatus
     * @param tradingStatus Number
     */
    public void setTradingStatus(Number tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    /**
     * It get eligibile
     * @return Boolean
     */
    public Boolean getEligibile() {
        return eligibile;
    }

    /**
     * It set eligibile
     * @param eligibile Boolean
     */
    public void setEligibile(Boolean eligibile) {
        this.eligibile = eligibile;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tradingStatus", tradingStatus).append("eligibile", eligibile).append("marketType", marketType).toString();
    }

}
