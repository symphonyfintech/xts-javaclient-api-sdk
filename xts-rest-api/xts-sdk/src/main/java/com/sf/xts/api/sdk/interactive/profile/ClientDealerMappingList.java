
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDealerMappingList {

    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("ClientId")
    @Expose
    private String clientId;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;

    /**
     * it return dealerId
     * @return String
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * it set the dealerId
     * @param dealerId String
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * it return clientId
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
     * it return createdBy value
     * @return String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * it set the createdBy value
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * it return createdOn
     * @return String
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * it set the createdOn
     * @param createdOn String
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

}
