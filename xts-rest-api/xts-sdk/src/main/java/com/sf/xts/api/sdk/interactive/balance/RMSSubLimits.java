
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RMSSubLimits {

    @SerializedName("cashAvailable")
    @Expose
    private String cashAvailable;
    @SerializedName("collateral")
    @Expose
    private Number collateral;
    @SerializedName("marginUtilized")
    @Expose
    private String marginUtilized;
    @SerializedName("netMarginAvailable")
    @Expose
    private String netMarginAvailable;
    @SerializedName("MTM")
    @Expose
    private String mTM;
    @SerializedName("UnrealizedMTM")
    @Expose
    private String unrealizedMTM;
    @SerializedName("RealizedMTM")
    @Expose
    private String realizedMTM;

    /**
     * it return cashAvailable
     * @return String
     */
    public String getCashAvailable() {
        return cashAvailable;
    }

    /**
     * it set the cashAvailable
     * @param cashAvailable String
     */
    public void setCashAvailable(String cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    /**
     * it return collateral
     * @return Number
     */
    public Number getCollateral() {
        return collateral;
    }

    /**
     * it set the collateral
     * @param collateral Number
     */
    public void setCollateral(Number collateral) {
        this.collateral = collateral;
    }

    /**
     * it return marginUtilized
     * @return String
     */
    public String getMarginUtilized() {
        return marginUtilized;
    }

    /**
     * it set the marginUtilized
     * @param marginUtilized String
     */
    public void setMarginUtilized(String marginUtilized) {
        this.marginUtilized = marginUtilized;
    }

    /**
     * it return netMarginAvailable
     * @return String
     */
    public String getNetMarginAvailable() {
        return netMarginAvailable;
    }

    /**
     * it set the netMarginAvailable
     * @param netMarginAvailable String
     */
    public void setNetMarginAvailable(String netMarginAvailable) {
        this.netMarginAvailable = netMarginAvailable;
    }

    /**
     * it return mTM value
     * @return String
     */
    public String getMTM() {
        return mTM;
    }

    /**
     * it set the mTM value
     * @param mTM String
     */
    public void setMTM(String mTM) {
        this.mTM = mTM;
    }

    /**
     * it return unrealizedMTM value
     * @return String
     */
    public String getUnrealizedMTM() {
        return unrealizedMTM;
    }

    /**
     * it set the unrealizedMTM value
     * @param unrealizedMTM String
     */
    public void setUnrealizedMTM(String unrealizedMTM) {
        this.unrealizedMTM = unrealizedMTM;
    }

    /**
     * it return realizedMTM value
     * @return String
     */
    public String getRealizedMTM() {
        return realizedMTM;
    }

    /**
     * it set the realizedMTM value
     * @param realizedMTM String
     */
    public void setRealizedMTM(String realizedMTM) {
        this.realizedMTM = realizedMTM;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cashAvailable", cashAvailable).append("collateral", collateral).append("marginUtilized", marginUtilized).append("netMarginAvailable", netMarginAvailable).append("mTM", mTM).append("unrealizedMTM", unrealizedMTM).append("realizedMTM", realizedMTM).toString();
    }

}
