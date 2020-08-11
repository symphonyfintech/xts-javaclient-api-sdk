package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketTypeStatusEligibility {

    @SerializedName("CallAuction2")
    @Expose
    private CallAuction2 callAuction2;
    
    @SerializedName("CallAuction1")
    @Expose
    private CallAuction1 callAuction1;
    
    @SerializedName("Auction")
    @Expose
    private Auction auction;
    
    @SerializedName("Normal")
    @Expose
    private Normal normal;
    
    @SerializedName("OddLot")
    @Expose
    private OddLot oddLot;
    
    @SerializedName("RetailDebt")
    @Expose
    private RetailDebt retailDebt;

    /**
     * It get CallAuction2
     * @return CallAuction2
     */
    public CallAuction2 getCallAuction2() {
        return callAuction2;
    }

    /**
     * It set CallAuction2
     * @param callAuction2 CallAuction2
     */
    public void setCallAuction2(CallAuction2 callAuction2) {
        this.callAuction2 = callAuction2;
    }

    /**
     * It get CallAuction1
     * @return CallAuction1
     */
    public CallAuction1 getCallAuction1() {
        return callAuction1;
    }

    /**
     * It set CallAuction1
     * @param callAuction1 CallAuction1
     */
    public void setCallAuction1(CallAuction1 callAuction1) {
        this.callAuction1 = callAuction1;
    }

    /**
     * It get Auction
     * @return Auction
     */
    public Auction getAuction() {
        return auction;
    }

    /**
     * It set Auction
     * @param auction Auction
     */
    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    /**
     * It get Normal value
     * @return Normal
     */
    public Normal getNormal() {
        return normal;
    }

    /**
     * It set Normal
     * @param normal Normal
     */
    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    /**
     * It get OddLot
     * @return OddLot
     */
    public OddLot getOddLot() {
        return oddLot;
    }

    /**
     * It set OddLot
     * @param oddLot OddLot
     */
    public void setOddLot(OddLot oddLot) {
        this.oddLot = oddLot;
    }

    /**
     * It get RetailDebt
     * @return RetailDebt
     */
    public RetailDebt getRetailDebt() {
        return retailDebt;
    }

    /**
     * It set RetailDebt
     * @param retailDebt RetailDebt
     */
    public void setRetailDebt(RetailDebt retailDebt) {
        this.retailDebt = retailDebt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("callAuction2", callAuction2).append("callAuction1", callAuction1).append("auction", auction).append("normal", normal).append("oddLot", oddLot).append("retailDebt", retailDebt).toString();
    }

}
