
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDealerMappingList_ {

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
     * it get the value of dealerId
     * @return String
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * it set the value to dealerId
     * @param dealerId String
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * it get the value of clientId
     * @return String
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * it set the value to clientId
     * @param clientId String
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * it get the value of createdBy
     * @return String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * it set the value to createdBy
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * it get the value of createdOn
     * @return String
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * it set the value to createdOn
     * @param createdOn String
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

}
