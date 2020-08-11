
package com.sf.xts.api.sdk.interactive.orderbook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("LoginID")
    @Expose
    private String loginID;
    
    @SerializedName("ClientID")
    @Expose
    private String clientID;
    
    @SerializedName("AppOrderID")
    @Expose
    private Number appOrderID;
    
    @SerializedName("OrderReferenceID")
    @Expose
    private String orderReferenceID;
    @SerializedName("GeneratedBy")
    @Expose
    private String generatedBy;
    @SerializedName("ExchangeOrderID")
    @Expose
    private String exchangeOrderID;
    @SerializedName("OrderCategoryType")
    @Expose
    private String orderCategoryType;
    @SerializedName("ExchangeSegment")
    @Expose
    private String exchangeSegment;
    @SerializedName("ExchangeInstrumentID")
    @Expose
    private Number exchangeInstrumentID;
    @SerializedName("OrderSide")
    @Expose
    private String orderSide;
    @SerializedName("OrderType")
    @Expose
    private String orderType;
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("TimeInForce")
    @Expose
    private String timeInForce;
    @SerializedName("OrderPrice")
    @Expose
    private Number orderPrice;
    @SerializedName("OrderQuantity")
    @Expose
    private Number orderQuantity;
    @SerializedName("OrderStopPrice")
    @Expose
    private Number orderStopPrice;
    @SerializedName("OrderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("OrderAverageTradedPrice")
    @Expose
    private String orderAverageTradedPrice;
    @SerializedName("LeavesQuantity")
    @Expose
    private Number leavesQuantity;
    @SerializedName("CumulativeQuantity")
    @Expose
    private Number cumulativeQuantity;
    @SerializedName("OrderDisclosedQuantity")
    @Expose
    private Number orderDisclosedQuantity;
    @SerializedName("OrderGeneratedDateTime")
    @Expose
    private String orderGeneratedDateTime;
    @SerializedName("ExchangeTransactTime")
    @Expose
    private String exchangeTransactTime;
    @SerializedName("LastUpdateDateTime")
    @Expose
    private String lastUpdateDateTime;
    @SerializedName("OrderExpiryDate")
    @Expose
    private String orderExpiryDate;
    @SerializedName("CancelRejectReason")
    @Expose
    private String cancelRejectReason;
    @SerializedName("OrderUniqueIdentifier")
    @Expose
    private String orderUniqueIdentifier;
    @SerializedName("OrderLegStatus")
    @Expose
    private String orderLegStatus;
    @SerializedName("MessageCode")
    @Expose
    private Number messageCode;
    @SerializedName("MessageVersion")
    @Expose
    private Number messageVersion;
    @SerializedName("TokenID")
    @Expose
    private Number tokenID;
    @SerializedName("ApplicationType")
    @Expose
    private Number applicationType;

    /**
     * it return loginID
     * @return String
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * it set loginID
     * @param loginID String
     */
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * it return clientID
     * @return String
     */
    public String getClientID() {
        return clientID;
    }

    /**
     *   - it set clientID
     * @param clientID String
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * it return appOrderID
     * @return Number
     */
    public Number getAppOrderID() {
        return appOrderID;
    }

    /**
     * it set appOrderID
     * @param appOrderID Number
     */
    public void setAppOrderID(Number appOrderID) {
        this.appOrderID = appOrderID;
    }

    /**
     * it return orderReferenceID
     * @return String
     */
    public String getOrderReferenceID() {
        return orderReferenceID;
    }

    /**
     * it set orderReferenceID
     * @param orderReferenceID String
     */
    public void setOrderReferenceID(String orderReferenceID) {
        this.orderReferenceID = orderReferenceID;
    }

    /**
     * it return generatedBy
     * @return String
     */
    public String getGeneratedBy() {
        return generatedBy;
    }

    /**
     * it set generatedBy
     * @param generatedBy String
     */
    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    /**
     * it return exchangeOrderID
     * @return String
     */
    public String getExchangeOrderID() {
        return exchangeOrderID;
    }

    /**
     * it set exchangeOrderID
     * @param exchangeOrderID String
     */
    public void setExchangeOrderID(String exchangeOrderID) {
        this.exchangeOrderID = exchangeOrderID;
    }

    /**
     * it return orderCategoryType
     * @return String
     */
    public String getOrderCategoryType() {
        return orderCategoryType;
    }

    /**
     * it set orderCategoryType
     * @param orderCategoryType String
     */
    public void setOrderCategoryType(String orderCategoryType) {
        this.orderCategoryType = orderCategoryType;
    }

    /**
     * it return exchangeSegment
     * @return String
     */
    public String getExchangeSegment() {
        return exchangeSegment;
    }

    /**
     * it set exchangeSegment
     * @param exchangeSegment String
     */
    public void setExchangeSegment(String exchangeSegment) {
        this.exchangeSegment = exchangeSegment;
    }

    /**
     * it return exchangeInstrumentID
     * @return Number
     */
    public Number getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    /**
     * it set exchangeInstrumentID
     * @param exchangeInstrumentID Number
     */
    public void setExchangeInstrumentID(Number exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    /**
     * it return orderSide
     * @return String
     */
    public String getOrderSide() {
        return orderSide;
    }

    /**
     * it set orderSide
     * @param orderSide String
     */
    public void setOrderSide(String orderSide) {
        this.orderSide = orderSide;
    }

    /**
     * it return orderType
     * @return String
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
     * it return productType
     * @return String
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
     * it return timeInForce
     * @return String
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
     * it return orderPrice
     * @return Number
     */
    public Number getOrderPrice() {
        return orderPrice;
    }

    /**
     * it set orderPrice
     * @param orderPrice Number
     */
    public void setOrderPrice(Number orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * it return orderQuantity
     * @return Number
     */
    public Number getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * it set orderQuantity
     * @param orderQuantity Number
     */
    public void setOrderQuantity(Number orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * it return orderStopPrice
     * @return Number
     */
    public Number getOrderStopPrice() {
        return orderStopPrice;
    }

    /**
     * it set orderStopPrice
     * @param orderStopPrice Number
     */
    public void setOrderStopPrice(Number orderStopPrice) {
        this.orderStopPrice = orderStopPrice;
    }

    /** 
     * it return orderStatus
     * @return String
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * it set orderStatus
     * @param orderStatus String
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * it return orderAverageTradedPrice
     * @return String
     */
    public String getOrderAverageTradedPrice() {
        return orderAverageTradedPrice;
    }

    /**
     * it set orderAverageTradedPrice
     * @param orderAverageTradedPrice String
     */
    public void setOrderAverageTradedPrice(String orderAverageTradedPrice) {
        this.orderAverageTradedPrice = orderAverageTradedPrice;
    }

    /**
     * it return leavesQuantity
     * @return Number
     */
    public Number getLeavesQuantity() {
        return leavesQuantity;
    }

    /**
     * it return leavesQuantity
     * @param leavesQuantity Number
     */
    public void setLeavesQuantity(Number leavesQuantity) {
        this.leavesQuantity = leavesQuantity;
    }

    /**
     * it return cumulativeQuantity
     * @return Number
     */
    public Number getCumulativeQuantity() {
        return cumulativeQuantity;
    }

    /**
     * it set cumulativeQuantity
     * @param cumulativeQuantity Number
     */
    public void setCumulativeQuantity(Number cumulativeQuantity) {
        this.cumulativeQuantity = cumulativeQuantity;
    }

    /**
     * it return orderDisclosedQuantity
     * @return Number
     */
    public Number getOrderDisclosedQuantity() {
        return orderDisclosedQuantity;
    }

    /**
     * it set orderDisclosedQuantity
     * @param orderDisclosedQuantity Number
     */
    public void setOrderDisclosedQuantity(Number orderDisclosedQuantity) {
        this.orderDisclosedQuantity = orderDisclosedQuantity;
    }

    /**
     * it return orderGeneratedDateTime
     * @return String
     */
    public String getOrderGeneratedDateTime() {
        return orderGeneratedDateTime;
    }

    /**
     * it set orderGeneratedDateTime
     * @param orderGeneratedDateTime String
     */
    public void setOrderGeneratedDateTime(String orderGeneratedDateTime) {
        this.orderGeneratedDateTime = orderGeneratedDateTime;
    }

    /**
     * it return exchangeTransactTime
     * @return String
     */
    public String getExchangeTransactTime() {
        return exchangeTransactTime;
    }

    /**
     * it set exchangeTransactTime
     * @param exchangeTransactTime String
     */
    public void setExchangeTransactTime(String exchangeTransactTime) {
        this.exchangeTransactTime = exchangeTransactTime;
    }

    /**
     * it return lastUpdateDateTime
     * @return String
     */
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * it set lastUpdateDateTime
     * @param lastUpdateDateTime String
     */
    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * it return orderExpiryDate
     * @return String
     */
    public String getOrderExpiryDate() {
        return orderExpiryDate;
    }

    /**
     * it set orderExpiryDate
     * @param orderExpiryDate String
     */
    public void setOrderExpiryDate(String orderExpiryDate) {
        this.orderExpiryDate = orderExpiryDate;
    }

    /**
     * it return cancelRejectReason
     * @return String
     */
    public String getCancelRejectReason() {
        return cancelRejectReason;
    }

    /**
     * it set cancelRejectReason
     * @param cancelRejectReason String
     */
    public void setCancelRejectReason(String cancelRejectReason) {
        this.cancelRejectReason = cancelRejectReason;
    }

    /**
     * it return orderUniqueIdentifier
     * @return String
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

    /**
     * it return orderLegStatus
     * @return String
     */
    public String getOrderLegStatus() {
        return orderLegStatus;
    }

    /**
     * it set orderLegStatus
     * @param orderLegStatus String
     */
    public void setOrderLegStatus(String orderLegStatus) {
        this.orderLegStatus = orderLegStatus;
    }

    /**
     * it return messageCode
     * @return Number
     */
    public Number getMessageCode() {
        return messageCode;
    }

    /**
     * it set messageCode
     * @param messageCode Number
     */
    public void setMessageCode(Number messageCode) {
        this.messageCode = messageCode;
    }

    /**
     * it return messageVersion
     * @return Number
     */
    public Number getMessageVersion() {
        return messageVersion;
    }

    /**
     * it set messageVersion
     * @param messageVersion Number
     */
    public void setMessageVersion(Number messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * it return tokenID
     * @return Number
     */
    public Number getTokenID() {
        return tokenID;
    }

    /**
     * it set tokenID
     * @param tokenID Number
     */
    public void setTokenID(Number tokenID) {
        this.tokenID = tokenID;
    }

    /**
     * it return applicationType
     * @return Number
     */
    public Number getApplicationType() {
        return applicationType;
    }

    /**
     * it set applicationType
     * @param applicationType Number
     */
    public void setApplicationType(Number applicationType) {
        this.applicationType = applicationType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loginID", loginID).append("clientID", clientID).append("appOrderID", appOrderID).append("orderReferenceID", orderReferenceID).append("generatedBy", generatedBy).append("exchangeOrderID", exchangeOrderID).append("orderCategoryType", orderCategoryType).append("exchangeSegment", exchangeSegment).append("exchangeInstrumentID", exchangeInstrumentID).append("orderSide", orderSide).append("orderType", orderType).append("productType", productType).append("timeInForce", timeInForce).append("orderPrice", orderPrice).append("orderQuantity", orderQuantity).append("orderStopPrice", orderStopPrice).append("orderStatus", orderStatus).append("orderAverageTradedPrice", orderAverageTradedPrice).append("leavesQuantity", leavesQuantity).append("cumulativeQuantity", cumulativeQuantity).append("orderDisclosedQuantity", orderDisclosedQuantity).append("orderGeneratedDateTime", orderGeneratedDateTime).append("exchangeTransactTime", exchangeTransactTime).append("lastUpdateDateTime", lastUpdateDateTime).append("orderExpiryDate", orderExpiryDate).append("cancelRejectReason", cancelRejectReason).append("orderUniqueIdentifier", orderUniqueIdentifier).append("orderLegStatus", orderLegStatus).append("messageCode", messageCode).append("messageVersion", messageVersion).append("tokenID", tokenID).append("applicationType", applicationType).toString();
    }

}
