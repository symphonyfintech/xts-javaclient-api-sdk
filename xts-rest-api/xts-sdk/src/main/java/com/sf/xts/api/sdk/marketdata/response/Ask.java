package com.sf.xts.api.sdk.marketdata.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Object class for Ask
 * 
 * @author SymphonyFintech
 */
public class Ask {

    @SerializedName("Size")
    @Expose
    private Number size;
    @SerializedName("Price")
    @Expose
    private Double price;
    @SerializedName("TotalOrders")
    @Expose
    private Number totalOrders;
    @SerializedName("BuyBackMarketMaker")
    @Expose
    private Number buyBackMarketMaker;

    /**
     * It get size
     * @return Number
     */
    public Number getSize() {
        return size;
    }

    /**
     * It set size
     * @param size Number
     */
    public void setSize(Number size) {
        this.size = size;
    }

    /**
     * It get price
     * @return Double
     */
    public Double getPrice() {
        return price;
    }

    /**
     * It set price
     * @param price Double
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * It get totalOrders
     * @return Number
     */
    public Number getTotalOrders() {
        return totalOrders;
    }

    /**
     * It set totalOrders 
     * @param totalOrders Number
     */
    public void setTotalOrders(Number totalOrders) {
        this.totalOrders = totalOrders;
    }

    /**
     * It get buyBackMarketMaker
     * @return Number
     */
    public Number getBuyBackMarketMaker() {
        return buyBackMarketMaker;
    }

    /**
     * It set buyBackMarketMaker
     * @param buyBackMarketMaker Number
     */
    public void setBuyBackMarketMaker(Number buyBackMarketMaker) {
        this.buyBackMarketMaker = buyBackMarketMaker;
    }

}
