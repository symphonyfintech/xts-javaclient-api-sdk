
package com.sf.xts.api.sdk.interactive.positionConvert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("UserID")
    @Expose
    private String UserID;
    
    @SerializedName("ClientID")
    @Expose
    private String ClientID;
    
    @SerializedName("OldProductType")
    @Expose
    private String OldProductType;
    
    @SerializedName("NewProductType")
    @Expose
    private String NewProductType;
    
    @SerializedName("ExchangeSegment")
    @Expose
    private String ExchangeSegment;
    
    @SerializedName("ExchangeInstrumentId")
    @Expose
    private String ExchangeInstrumentId;
    
    @SerializedName("CovertedQty")
    @Expose
    private String CovertedQty;

	/**
	 * it return UserID
	 * @return String
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * it set the UserID
	 * @param userID String
	 */
	public void setUserID(String userID) {
		UserID = userID;
	}

	/**
	 * it return ClientID
	 * @return String
	 */
	public String getClientID() {
		return ClientID;
	}

	/**
	 * it set the ClientID
	 * @param clientID String
	 */
	public void setClientID(String clientID) {
		ClientID = clientID;
	}

	/**
	 * it return OldProductType
	 * @return String
	 */
	public String getOldProductType() {
		return OldProductType;
	}

	/**
	 * it set the OldProductType
	 * @param oldProductType String
	 */
	public void setOldProductType(String oldProductType) {
		OldProductType = oldProductType;
	}

	/**
	 * it return NewProductType
	 * @return String
	 */
	public String getNewProductType() {
		return NewProductType;
	}

	/**
	 * it set the NewProductType
	 * @param newProductType String
	 */
	public void setNewProductType(String newProductType) {
		NewProductType = newProductType;
	}

	/**
	 * it return ExchangeSegment
	 * @return String
	 */
	public String getExchangeSegment() {
		return ExchangeSegment;
	}

	/**
	 * it set the ExchangeSegment
	 * @param exchangeSegment String
	 */
	public void setExchangeSegment(String exchangeSegment) {
		ExchangeSegment = exchangeSegment;
	}

	/**
	 * it return ExchangeInstrumentId
	 * @return String
	 */
	public String getExchangeInstrumentId() {
		return ExchangeInstrumentId;
	}

	/**
	 * it set the ExchangeInstrumentId
	 * @param exchangeInstrumentId String
	 */
	public void setExchangeInstrumentId(String exchangeInstrumentId) {
		ExchangeInstrumentId = exchangeInstrumentId;
	}

	/**
	 * it return CovertedQty
	 * @return String
	 */
	public String getCovertedQty() {
		return CovertedQty;
	}

	/**
	 * it set the CovertedQty
	 * @param covertedQty String
	 */
	public void setCovertedQty(String covertedQty) {
		CovertedQty = covertedQty;
	}

	@Override
	public String toString() {
		return "Result [UserID=" + UserID + ", ClientID=" + ClientID
				+ ", OldProductType=" + OldProductType + ", NewProductType="
				+ NewProductType + ", ExchangeSegment=" + ExchangeSegment
				+ ", ExchangeInstrumentId=" + ExchangeInstrumentId
				+ ", CovertedQty=" + CovertedQty + "]";
	}

    
}
