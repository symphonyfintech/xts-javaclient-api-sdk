package com.sf.xts.api.sdk.interactive.exchangeMessage;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageList {

    @SerializedName("ExchangeSegment")
    @Expose
    private String ExchangeSegment;

    @SerializedName("ExchangeTimeStamp")
    @Expose
    private String ExchangeTimeStamp;
    
    @SerializedName("BroadcastMessage")
    @Expose
    private String BroadcastMessage;

    @SerializedName("SequenceId")
    @Expose
    private String SequenceId;
    
    @SerializedName("MessageCode")
    @Expose
    private String MessageCode;
    
    @SerializedName("MessageVersion")
    @Expose
    private String MessageVersion;
    
    @SerializedName("TokenID")
    @Expose
    private String TokenID;
    
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;
    
    @SerializedName("SequenceNumber")
    @Expose
    private String SequenceNumber;

	/**
	 * it return exchangeSegment
	 * @return String
	 */
	public String getExchangeSegment() {
		return ExchangeSegment;
	}

	/**
	 * it set exchangeSegment
	 * @param exchangeSegment String
	 */
	public void setExchangeSegment(String exchangeSegment) {
		ExchangeSegment = exchangeSegment;
	}

	/**
	 * it return exchangeTimeStamp
	 * @return String
	 */
	public String getExchangeTimeStamp() {
		return ExchangeTimeStamp;
	}

	/**
	 * it set exchangeTimeStamp
	 * @param exchangeTimeStamp String
	 */
	public void setExchangeTimeStamp(String exchangeTimeStamp) {
		ExchangeTimeStamp = exchangeTimeStamp;
	}

	/**
	 * it return broadcastMessage
	 * @return String
	 */
	public String getBroadcastMessage() {
		return BroadcastMessage;
	}

	/**
	 * it set broadcastMessage
	 * @param broadcastMessage String
	 */
	public void setBroadcastMessage(String broadcastMessage) {
		BroadcastMessage = broadcastMessage;
	}

	/**
	 * it return sequenceId
	 * @return String
	 */
	public String getSequenceId() {
		return SequenceId;
	}

	/**
	 * it set sequenceId
	 * @param sequenceId String
	 */
	public void setSequenceId(String sequenceId) {
		SequenceId = sequenceId;
	}

	/**
	 * it return messageCode
	 * @return String
	 */
	public String getMessageCode() {
		return MessageCode;
	}

	/**
	 * it set messageCode
	 * @param messageCode String
	 */
	public void setMessageCode(String messageCode) {
		MessageCode = messageCode;
	}

	/**
	 * it return messageVersion
	 * @return String
	 */
	public String getMessageVersion() {
		return MessageVersion;
	}

	/**
	 * it set messageVersion
	 * @param messageVersion String
	 */
	public void setMessageVersion(String messageVersion) {
		MessageVersion = messageVersion;
	}

	/**
	 * it return tokenID
	 * @return String
	 */
	public String getTokenID() {
		return TokenID;
	}

	/**
	 * it set tokenID
	 * @param tokenID String
	 */
	public void setTokenID(String tokenID) {
		TokenID = tokenID;
	}

	/**
	 * it return applicationType
	 * @return  String
	 */
	public String getApplicationType() {
		return ApplicationType;
	}

	/**
	 * it set applicationType
	 * @param applicationType String
	 */
	public void setApplicationType(String applicationType) {
		ApplicationType = applicationType;
	}

	/**
	 * it return sequenceNumber
	 * @return String
	 */
	public String getSequenceNumber() {
		return SequenceNumber;
	}

	/**
	 * it set sequenceNumber
	 * @param sequenceNumber String
	 */
	public void setSequenceNumber(String sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}

	@Override
	public String toString() {
		return "MessageList [ExchangeSegment=" + ExchangeSegment
				+ ", ExchangeTimeStamp=" + ExchangeTimeStamp
				+ ", BroadcastMessage=" + BroadcastMessage + ", SequenceId="
				+ SequenceId + ", MessageCode=" + MessageCode
				+ ", MessageVersion=" + MessageVersion + ", TokenID=" + TokenID
				+ ", ApplicationType=" + ApplicationType + ", SequenceNumber="
				+ SequenceNumber + "]";
	}
    
    
}
