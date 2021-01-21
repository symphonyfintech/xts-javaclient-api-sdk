package com.sf.xts.api.sdk.interactive;

public class TradeConversionResponse {

	private String LoginID;
	private String UserId;
	private String UniqueKey;
	private String Success;
	private String ErrorMessage;
	private String OriginalProduct;
	private String TargetProduct;
	private Number OriginalQty;
	private Number TargetQty;
	private String EntityType;
	private String ExchangeSegment;
	private Number ExchangeInstrumentId;
	private String TargetEntityId;
	private Number NetValue;
	private String Status;
	private String RejectionReason;
	private String RejectedBy;
	private Number Price;
	private String NOWTimeStamp;
	private String OrderSide;
	private String IsProOrder;
	private Number MessageCode;
	private Number MessageVersion;
	private Number TokenID;
	private Number ApplicationType;
	private Number SequenceNumber;
	public String getLoginID() {
		return LoginID;
	}
	public void setLoginID(String loginID) {
		LoginID = loginID;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUniqueKey() {
		return UniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		UniqueKey = uniqueKey;
	}
	public String getSuccess() {
		return Success;
	}
	public void setSuccess(String success) {
		Success = success;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getOriginalProduct() {
		return OriginalProduct;
	}
	public void setOriginalProduct(String originalProduct) {
		OriginalProduct = originalProduct;
	}
	public String getTargetProduct() {
		return TargetProduct;
	}
	public void setTargetProduct(String targetProduct) {
		TargetProduct = targetProduct;
	}
	public Number getOriginalQty() {
		return OriginalQty;
	}
	public void setOriginalQty(Number originalQty) {
		OriginalQty = originalQty;
	}
	public Number getTargetQty() {
		return TargetQty;
	}
	public void setTargetQty(Number targetQty) {
		TargetQty = targetQty;
	}
	public String getEntityType() {
		return EntityType;
	}
	public void setEntityType(String entityType) {
		EntityType = entityType;
	}
	public String getExchangeSegment() {
		return ExchangeSegment;
	}
	public void setExchangeSegment(String exchangeSegment) {
		ExchangeSegment = exchangeSegment;
	}
	public Number getExchangeInstrumentId() {
		return ExchangeInstrumentId;
	}
	public void setExchangeInstrumentId(Number exchangeInstrumentId) {
		ExchangeInstrumentId = exchangeInstrumentId;
	}
	public String getTargetEntityId() {
		return TargetEntityId;
	}
	public void setTargetEntityId(String targetEntityId) {
		TargetEntityId = targetEntityId;
	}
	public Number getNetValue() {
		return NetValue;
	}
	public void setNetValue(Number netValue) {
		NetValue = netValue;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRejectionReason() {
		return RejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		RejectionReason = rejectionReason;
	}
	public String getRejectedBy() {
		return RejectedBy;
	}
	public void setRejectedBy(String rejectedBy) {
		RejectedBy = rejectedBy;
	}
	public Number getPrice() {
		return Price;
	}
	public void setPrice(Number price) {
		Price = price;
	}
	public String getNOWTimeStamp() {
		return NOWTimeStamp;
	}
	public void setNOWTimeStamp(String nOWTimeStamp) {
		NOWTimeStamp = nOWTimeStamp;
	}
	public String getOrderSide() {
		return OrderSide;
	}
	public void setOrderSide(String orderSide) {
		OrderSide = orderSide;
	}
	public String getIsProOrder() {
		return IsProOrder;
	}
	public void setIsProOrder(String isProOrder) {
		IsProOrder = isProOrder;
	}
	public Number getMessageCode() {
		return MessageCode;
	}
	public void setMessageCode(Number messageCode) {
		MessageCode = messageCode;
	}
	public Number getMessageVersion() {
		return MessageVersion;
	}
	public void setMessageVersion(Number messageVersion) {
		MessageVersion = messageVersion;
	}
	public Number getTokenID() {
		return TokenID;
	}
	public void setTokenID(Number tokenID) {
		TokenID = tokenID;
	}
	public Number getApplicationType() {
		return ApplicationType;
	}
	public void setApplicationType(Number applicationType) {
		ApplicationType = applicationType;
	}
	public Number getSequenceNumber() {
		return SequenceNumber;
	}
	public void setSequenceNumber(Number sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}
	@Override
	public String toString() {
		return "TradeConversionResponse [LoginID=" + LoginID + ", UserId=" + UserId + ", UniqueKey=" + UniqueKey
				+ ", Success=" + Success + ", ErrorMessage=" + ErrorMessage + ", OriginalProduct=" + OriginalProduct
				+ ", TargetProduct=" + TargetProduct + ", OriginalQty=" + OriginalQty + ", TargetQty=" + TargetQty
				+ ", EntityType=" + EntityType + ", ExchangeSegment=" + ExchangeSegment + ", ExchangeInstrumentId="
				+ ExchangeInstrumentId + ", TargetEntityId=" + TargetEntityId + ", NetValue=" + NetValue + ", Status="
				+ Status + ", RejectionReason=" + RejectionReason + ", RejectedBy=" + RejectedBy + ", Price=" + Price
				+ ", NOWTimeStamp=" + NOWTimeStamp + ", OrderSide=" + OrderSide + ", IsProOrder=" + IsProOrder
				+ ", MessageCode=" + MessageCode + ", MessageVersion=" + MessageVersion + ", TokenID=" + TokenID
				+ ", ApplicationType=" + ApplicationType + ", SequenceNumber=" + SequenceNumber + "]";
	}
	
	

}
