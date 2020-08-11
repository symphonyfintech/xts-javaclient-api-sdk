
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LimitObject {

    @SerializedName("RMSSubLimits")
    @Expose
    private RMSSubLimits rMSSubLimits;
    @SerializedName("marginAvailable")
    @Expose
    private MarginAvailable marginAvailable;
    @SerializedName("marginUtilized")
    @Expose
    private MarginUtilized marginUtilized;
    @SerializedName("limitsAssigned")
    @Expose
    private LimitsAssigned limitsAssigned;
    @SerializedName("AccountID")
    @Expose
    private String accountID;

    /**
     * it return rMSSubLimits
     * @return RMSSubLimits
     */
    public RMSSubLimits getRMSSubLimits() {
        return rMSSubLimits;
    }

    /**
     * it set the rMSSubLimits
     * @param rMSSubLimits RMSSubLimits
     */
    public void setRMSSubLimits(RMSSubLimits rMSSubLimits) {
        this.rMSSubLimits = rMSSubLimits;
    }

    /**
     * it return marginAvailable
     * @return MarginAvailable
     */
    public MarginAvailable getMarginAvailable() {
        return marginAvailable;
    }

    /**
     * it set the marginAvailable
     * @param marginAvailable MarginAvailable
     */
    public void setMarginAvailable(MarginAvailable marginAvailable) {
        this.marginAvailable = marginAvailable;
    }

    /**
     * it return marginUtilized
     * @return MarginUtilized
     */
    public MarginUtilized getMarginUtilized() {
        return marginUtilized;
    }

    /**
     * it set the marginUtilized
     * @param marginUtilized MarginUtilized
     */
    public void setMarginUtilized(MarginUtilized marginUtilized) {
        this.marginUtilized = marginUtilized;
    }

    /**
     * it return limitsAssigned
     * @return LimitsAssigned
     */
    public LimitsAssigned getLimitsAssigned() {
        return limitsAssigned;
    }

    /**
     * it set the limitsAssigned
     * @param limitsAssigned LimitsAssigned
     */
    public void setLimitsAssigned(LimitsAssigned limitsAssigned) {
        this.limitsAssigned = limitsAssigned;
    }

    /**
     * it return accountID
     * @return String
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * it set the accountID
     * @param accountID String
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rMSSubLimits", rMSSubLimits).append("marginAvailable", marginAvailable).append("marginUtilized", marginUtilized).append("limitsAssigned", limitsAssigned).append("accountID", accountID).toString();
    }

}
