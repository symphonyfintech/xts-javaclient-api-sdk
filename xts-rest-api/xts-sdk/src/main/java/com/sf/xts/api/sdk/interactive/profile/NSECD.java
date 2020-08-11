
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NSECD {

    @SerializedName("ClientId")
    @Expose
    private String clientId;
    @SerializedName("ExchangeSegNumber")
    @Expose
    private Number exchangeSegNumber;
    @SerializedName("Enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("ParticipantCode")
    @Expose
    private String participantCode;

    /**
     * it get clientId
     * @return String
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * it set the clientId
     * @param clientId String
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * it get exchangeSegNumber
     * @return Number
     */
    public Number getExchangeSegNumber() {
        return exchangeSegNumber;
    }

    /**
     * it set the exchangeSegNumber
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
     * it set value to true / false 
     * @param enabled Boolean
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * it get participantCode
     * @return String
     */
    public String getParticipantCode() {
        return participantCode;
    }

    /**
     * it set the participantCode
     * @param participantCode String
     */
    public void setParticipantCode(String participantCode) {
        this.participantCode = participantCode;
    }

}
