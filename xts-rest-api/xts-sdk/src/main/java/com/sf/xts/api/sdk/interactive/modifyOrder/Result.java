package com.sf.xts.api.sdk.interactive.modifyOrder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("appOrderID")
    @Expose
    private Double appOrderID;
    
    @SerializedName("productType")
    @Expose
    private String productType;
    
    @SerializedName("orderType")
    @Expose
    private String orderType;
    
    @SerializedName("modifiedOrderQuantity")
    @Expose
    private Number modifiedOrderQuantity;
    
    @SerializedName("modifiedDisclosedQuantity")
    @Expose
    private Number modifiedDisclosedQuantity;
    
    @SerializedName("modifiedStopPrice")
    @Expose
    private Number modifiedStopPrice;
    
    @SerializedName("timeInForce")
    @Expose
    private String timeInForce;
    
    @SerializedName("orderUniqueIdentifier")
    @Expose
    private String orderUniqueIdentifier;

	/**
	 * it return appOrderID
	 * @return - String
	 */
	public Double getAppOrderID() {
		return appOrderID;
	}

	/**
	 * it set appOrderID
	 * @param appOrderID String
	 */
	public void setAppOrderID(Double appOrderID) {
		this.appOrderID = appOrderID;
	}

	/**
	 * it return productType
	 * @return - String
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * it set productType
	 * @param productType String
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * it return orderType
	 * @return - String
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * it set orderType
	 * @param orderType String
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * it return modifiedOrderQuantity
	 * @return - String
	 */
	public Number getModifiedOrderQuantity() {
		return modifiedOrderQuantity;
	}

	/**
	 * it set modifiedOrderQuantity
	 * @param modifiedOrderQuantity String
	 */
	public void setModifiedOrderQuantity(Number modifiedOrderQuantity) {
		this.modifiedOrderQuantity = modifiedOrderQuantity;
	}

	/**
	 * it return modifiedDisclosedQuantity
	 * @return - String
	 */
	public Number getModifiedDisclosedQuantity() {
		return modifiedDisclosedQuantity;
	}

	/**
	 * it set modifiedDisclosedQuantity
	 * @param modifiedDisclosedQuantity String
	 */
	public void setModifiedDisclosedQuantity(Number modifiedDisclosedQuantity) {
		this.modifiedDisclosedQuantity = modifiedDisclosedQuantity;
	}

	/**
	 * it return modifiedStopPrice
	 * @return - String
	 */ 
	public Number getModifiedStopPrice() {
		return modifiedStopPrice;
	}

	/**
	 * it set modifiedStopPrice
	 * @param modifiedStopPrice String
	 */
	public void setModifiedStopPrice(Number modifiedStopPrice) {
		this.modifiedStopPrice = modifiedStopPrice;
	}

	/**
	 * it return timeInForce
	 * @return - String
	 */
	public String getTimeInForce() {
		return timeInForce;
	}

	/**
	 * it set timeInForce
	 * @param timeInForce String
	 */
	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	/**
	 * it return orderUniqueIdentifier
	 * @return - String
	 */
	public String getOrderUniqueIdentifier() {
		return orderUniqueIdentifier;
	}

	/**
	 * it set orderUniqueIdentifier
	 * @param orderUniqueIdentifier String
	 */
	public void setOrderUniqueIdentifier(String orderUniqueIdentifier) {
		this.orderUniqueIdentifier = orderUniqueIdentifier;
	}

	@Override
	public String toString() {
		return "Result [appOrderID=" + appOrderID + ", productType="
				+ productType + ", orderType=" + orderType
				+ ", modifiedOrderQuantity=" + modifiedOrderQuantity
				+ ", modifiedDisclosedQuantity=" + modifiedDisclosedQuantity
				+ ", modifiedStopPrice=" + modifiedStopPrice + ", timeInForce="
				+ timeInForce + ", orderUniqueIdentifier="
				+ orderUniqueIdentifier + "]";
	}
}
