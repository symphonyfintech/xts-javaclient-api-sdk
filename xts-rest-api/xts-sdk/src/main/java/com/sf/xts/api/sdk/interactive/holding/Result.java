
package com.sf.xts.api.sdk.interactive.holding;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("RMSHoldingList")
    @Expose
    private List<Object> rMSHoldingList = null;
    
    @SerializedName("ClientId")
    @Expose
    private String clientId;

    /**
     * it return rMSHoldingList
     * @return List of Object
     */
    public List<Object> getRMSHoldingList() {
        return rMSHoldingList;
    }

    /**
     * it set the rMSHoldingList
     * @param rMSHoldingList List of Object
     */
    public void setRMSHoldingList(List<Object> rMSHoldingList) {
        this.rMSHoldingList = rMSHoldingList;
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

	@Override
	public String toString() {
		return "Result [rMSHoldingList=" + rMSHoldingList + ", clientId="
				+ clientId + "]";
	}
}
