
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DealerExchangeDetailsList {

    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("ExchangeSegNumber")
    @Expose
    private Number exchangeSegNumber;
    @SerializedName("Enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("ExchangeUserId")
    @Expose
    private String exchangeUserId;
    @SerializedName("TerminalInfo")
    @Expose
    private String terminalInfo;
    @SerializedName("IsInvertorClient")
    @Expose
    private Boolean isInvertorClient;

    /**
     * it return dealerId
     * @return String
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * it set dealerId
     * @param dealerId String
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * it return exchangeSegNumber
     * @return Number
     */
    public Number getExchangeSegNumber() {
        return exchangeSegNumber;
    }

    /**
     * it set exchangeSegNumber
     * @param exchangeSegNumber Number 
     */
    public void setExchangeSegNumber(Number exchangeSegNumber) {
        this.exchangeSegNumber = exchangeSegNumber;
    }

    /**
     * it return true / false
     * @return Boolean
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * it set true/false value
     * @param enabled Boolean
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * it return expiryDate
     * @return String
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * it set expiryDate
     * @param expiryDate String
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * it return exchangeUserId
     * @return String
     */
    public String getExchangeUserId() {
        return exchangeUserId;
    }

    /**
     * it set exchangeUserId
     * @param exchangeUserId String
     */
    public void setExchangeUserId(String exchangeUserId) {
        this.exchangeUserId = exchangeUserId;
    }

    /**
     * it return terminalInfo
     * @return String
     */
    public String getTerminalInfo() {
        return terminalInfo;
    }

    /**
     * it set terminalInfo
     * @param terminalInfo String
     */
    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    /**
     * it return isInvertorClient
     * @return Boolean
     */
    public Boolean getIsInvertorClient() {
        return isInvertorClient;
    }

    /**
     * it set isInvertorClient
     * @param isInvertorClient Boolean
     */
    public void setIsInvertorClient(Boolean isInvertorClient) {
        this.isInvertorClient = isInvertorClient;
    }

}
