
package com.sf.xts.api.sdk.interactive.tradebook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("OrderReferenceID")
    @Expose
    private String orderReferenceID;
    @SerializedName("LoginID")
    @Expose
    private String loginID;
    @SerializedName("OrderCategoryType")
    @Expose
    private String orderCategoryType;
    @SerializedName("OrderDisclosedQuantity")
    @Expose
    private Number orderDisclosedQuantity;
    @SerializedName("LastUpdateDateTime")
    @Expose
    private String lastUpdateDateTime;
    @SerializedName("CancelRejectReason")
    @Expose
    private String cancelRejectReason;
    @SerializedName("OrderLegStatus")
    @Expose
    private String orderLegStatus;
    @SerializedName("ExecutionReportIndex")
    @Expose
    private Number executionReportIndex;
    @SerializedName("LastExecutionTransactTime")
    @Expose
    private String lastExecutionTransactTime;
    @SerializedName("OrderQuantity")
    @Expose
    private Number orderQuantity;
    @SerializedName("OrderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("OrderGeneratedDateTime")
    @Expose
    private String orderGeneratedDateTime;
    @SerializedName("LastTradedPrice")
    @Expose
    private Double lastTradedPrice;
    @SerializedName("ExchangeSegment")
    @Expose
    private String exchangeSegment;
    @SerializedName("OrderType")
    @Expose
    private String orderType;
    @SerializedName("TimeInForce")
    @Expose
    private String timeInForce;
    @SerializedName("LeavesQuantity")
    @Expose
    private Number leavesQuantity;
    @SerializedName("LastTradedQuantity")
    @Expose
    private Number lastTradedQuantity;
    @SerializedName("ExecutionID")
    @Expose
    private String executionID;
    @SerializedName("MessageVersion")
    @Expose
    private Number messageVersion;
    @SerializedName("GeneratedBy")
    @Expose
    private String generatedBy;
    @SerializedName("MessageCode")
    @Expose
    private Number messageCode;
    @SerializedName("ExchangeTransactTime")
    @Expose
    private String exchangeTransactTime;
    @SerializedName("OrderAverageTradedPrice")
    @Expose
    private String orderAverageTradedPrice;
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("OrderPrice")
    @Expose
    private Number orderPrice;
    @SerializedName("ExchangeOrderID")
    @Expose
    private String exchangeOrderID;
    @SerializedName("CumulativeQuantity")
    @Expose
    private Number cumulativeQuantity;
    @SerializedName("ApplicationType")
    @Expose
    private Number applicationType;
    @SerializedName("ExchangeInstrumentID")
    @Expose
    private Number exchangeInstrumentID;
    @SerializedName("AppOrderID")
    @Expose
    private Number appOrderID;
    @SerializedName("OrderUniqueIdentifier")
    @Expose
    private String orderUniqueIdentifier;
    @SerializedName("ClientID")
    @Expose
    private String clientID;
    @SerializedName("OrderStopPrice")
    @Expose
    private Number orderStopPrice;
    @SerializedName("TokenID")
    @Expose
    private Number tokenID;
    @SerializedName("OrderSide")
    @Expose
    private String orderSide;

    /**
     * it return orderReferenceID
     * @return String
     */
    public String getOrderReferenceID() {
        return orderReferenceID;
    }

    /**
     * it set the orderReferenceID
     * @param orderReferenceID String
     */
    public void setOrderReferenceID(String orderReferenceID) {
        this.orderReferenceID = orderReferenceID;
    }

    /**
     * it return loginID
     * @return String
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * it set the loginID
     * @param loginID String
     */
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * it return orderCategoryType
     * @return String
     */
    public String getOrderCategoryType() {
        return orderCategoryType;
    }

    /**
     * it set the orderCategoryType
     * @param orderCategoryType String
     */
    public void setOrderCategoryType(String orderCategoryType) {
        this.orderCategoryType = orderCategoryType;
    }

    /**
     * it return orderDisclosedQuantity
     * @return Number
     */
    public Number getOrderDisclosedQuantity() {
        return orderDisclosedQuantity;
    }

    /**
     * it set the orderDisclosedQuantity
     * @param orderDisclosedQuantity Number
     */
    public void setOrderDisclosedQuantity(Number orderDisclosedQuantity) {
        this.orderDisclosedQuantity = orderDisclosedQuantity;
    }

    /**
     * it return lastUpdateDateTime
     * @return String
     */
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * it set the lastUpdateDateTime
     * @param lastUpdateDateTime String
     */
    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * it return cancelRejectReason
     * @return String
     */
    public String getCancelRejectReason() {
        return cancelRejectReason;
    }

    /**
     * it set the cancelRejectReason
     * @param cancelRejectReason String
     */
    public void setCancelRejectReason(String cancelRejectReason) {
        this.cancelRejectReason = cancelRejectReason;
    }

    /**
     * it return orderLegStatus
     * @return String
     */
    public String getOrderLegStatus() {
        return orderLegStatus;
    }

    /**
     * it set the orderLegStatus
     * @param orderLegStatus String
     */
    public void setOrderLegStatus(String orderLegStatus) {
        this.orderLegStatus = orderLegStatus;
    }

    /**
     * it return executionReportIndex
     * @return Number
     */
    public Number getExecutionReportIndex() {
        return executionReportIndex;
    }

    /**
     * it set the executionReportIndex
     * @param executionReportIndex Number
     */
    public void setExecutionReportIndex(Number executionReportIndex) {
        this.executionReportIndex = executionReportIndex;
    }

    /**
     * it return lastExecutionTransactTime
     * @return String
     */
    public String getLastExecutionTransactTime() {
        return lastExecutionTransactTime;
    }

    /**
     * it set the lastExecutionTransactTime
     * @param lastExecutionTransactTime String
     */
    public void setLastExecutionTransactTime(String lastExecutionTransactTime) {
        this.lastExecutionTransactTime = lastExecutionTransactTime;
    }

    /**
     * it return orderQuantity
     * @return Number
     */
    public Number getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * it set the orderQuantity
     * @param orderQuantity Number
     */
    public void setOrderQuantity(Number orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * it return orderStatus
     * @return String
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * it set the orderStatus
     * @param orderStatus String
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * it return orderGeneratedDateTime
     * @return String
     */
    public String getOrderGeneratedDateTime() {
        return orderGeneratedDateTime;
    }

    /**
     * it set the orderGeneratedDateTime
     * @param orderGeneratedDateTime String
     */
    public void setOrderGeneratedDateTime(String orderGeneratedDateTime) {
        this.orderGeneratedDateTime = orderGeneratedDateTime;
    }

    /**
     * it return lastTradedPrice
     * @return Double
     */
    public Double getLastTradedPrice() {
        return lastTradedPrice;
    }

    /**
     * it set the lastTradedPrice
     * @param lastTradedPrice Double
     */
    public void setLastTradedPrice(Double lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }

    /**
     * it return exchangeSegment
     * @return String
     */
    public String getExchangeSegment() {
        return exchangeSegment;
    }

    /**
     * it set the exchangeSegment
     * @param exchangeSegment String
     */
    public void setExchangeSegment(String exchangeSegment) {
        this.exchangeSegment = exchangeSegment;
    }

    /**
     * it return orderType
     * @return String
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * it set the orderType
     * @param orderType String
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * it return timeInForce
     * @return String
     */
    public String getTimeInForce() {
        return timeInForce;
    }

    /**
     * it set the timeInForce
     * @param timeInForce String
     */
    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    /**
     * it return leavesQuantity
     * @return Number
     */
    public Number getLeavesQuantity() {
        return leavesQuantity;
    }

    /**
     * it set the leavesQuantity
     * @param leavesQuantity Number
     */
    public void setLeavesQuantity(Number leavesQuantity) {
        this.leavesQuantity = leavesQuantity;
    }

    /**
     * it return lastTradedQuantity
     * @return Number
     */
    public Number getLastTradedQuantity() {
        return lastTradedQuantity;
    }

    /**
     * it set the lastTradedQuantity
     * @param lastTradedQuantity Number
     */
    public void setLastTradedQuantity(Number lastTradedQuantity) {
        this.lastTradedQuantity = lastTradedQuantity;
    }

    /**
     * it return executionID
     * @return String
     */
    public String getExecutionID() {
        return executionID;
    }

    /**
     * it set the executionID
     * @param executionID String
     */
    public void setExecutionID(String executionID) {
        this.executionID = executionID;
    }

    /**
     * it return messageVersion
     * @return Number
     */
    public Number getMessageVersion() {
        return messageVersion;
    }

    /**
     * it set the messageVersion
     * @param messageVersion Number
     */
    public void setMessageVersion(Number messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * it return generatedBy
     * @return String
     */
    public String getGeneratedBy() {
        return generatedBy;
    }

    /**
     * it set the generatedBy
     * @param generatedBy String
     */
    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    /**
     * it return messageCode
     * @return Number
     */
    public Number getMessageCode() {
        return messageCode;
    }

    /**
     * it set the messageCode
     * @param messageCode Number
     */
    public void setMessageCode(Number messageCode) {
        this.messageCode = messageCode;
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
     * it return orderAverageTradedPrice
     * @return String
     */
    public String getOrderAverageTradedPrice() {
        return orderAverageTradedPrice;
    }

    /**
     * it set the orderAverageTradedPrice
     * @param orderAverageTradedPrice String
     */
    public void setOrderAverageTradedPrice(String orderAverageTradedPrice) {
        this.orderAverageTradedPrice = orderAverageTradedPrice;
    }

    /**
     * it return productType
     * @return String
     */
    public String getProductType() {
        return productType;
    }

    /**
     * it set the productType
     * @param productType String
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * it return orderPrice
     * @return Number
     */
    public Number getOrderPrice() {
        return orderPrice;
    }

    /**
     * it set the orderPrice
     * @param orderPrice Number
     */
    public void setOrderPrice(Number orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * it return exchangeOrderID
     * @return String
     */
    public String getExchangeOrderID() {
        return exchangeOrderID;
    }

    /**
     * it set the exchangeOrderID
     * @param exchangeOrderID String
     */
    public void setExchangeOrderID(String exchangeOrderID) {
        this.exchangeOrderID = exchangeOrderID;
    }

    /**
     * it return cumulativeQuantity
     * @return Number
     */
    public Number getCumulativeQuantity() {
        return cumulativeQuantity;
    }

    /**
     * it set the cumulativeQuantity
     * @param cumulativeQuantity Number
     */
    public void setCumulativeQuantity(Number cumulativeQuantity) {
        this.cumulativeQuantity = cumulativeQuantity;
    }

    /**
     * it return applicationType
     * @return Number
     */
    public Number getApplicationType() {
        return applicationType;
    }

    /**
     * it set the applicationType
     * @param applicationType Number
     */
    public void setApplicationType(Number applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * it return exchangeInstrumentID
     * @return Number
     */
    public Number getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    /**
     * it set the exchangeInstrumentID
     * @param exchangeInstrumentID Number
     */
    public void setExchangeInstrumentID(Number exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    /**
     * it return appOrderID
     * @return Number
     */
    public Number getAppOrderID() {
        return appOrderID;
    }

    /**
     * it set the appOrderID
     * @param appOrderID Number
     */
    public void setAppOrderID(Number appOrderID) {
        this.appOrderID = appOrderID;
    }

    /**
     * it return orderUniqueIdentifier
     * @return String
     */
    public String getOrderUniqueIdentifier() {
        return orderUniqueIdentifier;
    }

    /**
     * it set the orderUniqueIdentifier
     * @param orderUniqueIdentifier String
     */
    public void setOrderUniqueIdentifier(String orderUniqueIdentifier) {
        this.orderUniqueIdentifier = orderUniqueIdentifier;
    }

    /**
     * it return clientID
     * @return String
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * it set the clientID
     * @param clientID String
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * it return orderStopPrice
     * @return Number
     */
    public Number getOrderStopPrice() {
        return orderStopPrice;
    }

    /**
     * it set the orderStopPrice
     * @param orderStopPrice Number
     */
    public void setOrderStopPrice(Number orderStopPrice) {
        this.orderStopPrice = orderStopPrice;
    }

    /**
     * it return tokenID
     * @return Number
     */
    public Number getTokenID() {
        return tokenID;
    }

    /**
     * it set the tokenID
     * @param tokenID Number
     */
    public void setTokenID(Number tokenID) {
        this.tokenID = tokenID;
    }

    /**
     * it return orderSide
     * @return String
     */
    public String getOrderSide() {
        return orderSide;
    }

    /**
     * it set the orderSide
     * @param orderSide String
     */
    public void setOrderSide(String orderSide) {
        this.orderSide = orderSide;
    }

	@Override
	public String toString() {
		return "Result [orderReferenceID=" + orderReferenceID + ", loginID="
				+ loginID + ", orderCategoryType=" + orderCategoryType
				+ ", orderDisclosedQuantity=" + orderDisclosedQuantity
				+ ", lastUpdateDateTime=" + lastUpdateDateTime
				+ ", cancelRejectReason=" + cancelRejectReason
				+ ", orderLegStatus=" + orderLegStatus
				+ ", executionReportIndex=" + executionReportIndex
				+ ", lastExecutionTransactTime=" + lastExecutionTransactTime
				+ ", orderQuantity=" + orderQuantity + ", orderStatus="
				+ orderStatus + ", orderGeneratedDateTime="
				+ orderGeneratedDateTime + ", lastTradedPrice="
				+ lastTradedPrice + ", exchangeSegment=" + exchangeSegment
				+ ", orderType=" + orderType + ", timeInForce=" + timeInForce
				+ ", leavesQuantity=" + leavesQuantity
				+ ", lastTradedQuantity=" + lastTradedQuantity
				+ ", executionID=" + executionID + ", messageVersion="
				+ messageVersion + ", generatedBy=" + generatedBy
				+ ", messageCode=" + messageCode + ", exchangeTransactTime="
				+ exchangeTransactTime + ", orderAverageTradedPrice="
				+ orderAverageTradedPrice + ", productType=" + productType
				+ ", orderPrice=" + orderPrice + ", exchangeOrderID="
				+ exchangeOrderID + ", cumulativeQuantity="
				+ cumulativeQuantity + ", applicationType=" + applicationType
				+ ", exchangeInstrumentID=" + exchangeInstrumentID
				+ ", appOrderID=" + appOrderID + ", orderUniqueIdentifier="
				+ orderUniqueIdentifier + ", clientID=" + clientID
				+ ", orderStopPrice=" + orderStopPrice + ", tokenID=" + tokenID
				+ ", orderSide=" + orderSide + "]";
	}
}
