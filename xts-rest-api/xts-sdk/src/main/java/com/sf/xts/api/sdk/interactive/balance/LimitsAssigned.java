
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LimitsAssigned {

    @SerializedName("CNCLimit")
    @Expose
    private String cNCLimit;
    @SerializedName("TurnoverLimitPresent")
    @Expose
    private String turnoverLimitPresent;
    @SerializedName("MTMLossLimitPresent")
    @Expose
    private String mTMLossLimitPresent;
    @SerializedName("BuyExposureLimit")
    @Expose
    private String buyExposureLimit;
    @SerializedName("SellExposureLimit")
    @Expose
    private String sellExposureLimit;
    @SerializedName("GrossExposureLimit")
    @Expose
    private String grossExposureLimit;
    @SerializedName("GrossExposureDerivativesLimit")
    @Expose
    private String grossExposureDerivativesLimit;
    @SerializedName("BuyExposureFuturesLimit")
    @Expose
    private String buyExposureFuturesLimit;
    @SerializedName("BuyExposureOptionsLimit")
    @Expose
    private String buyExposureOptionsLimit;
    @SerializedName("SellExposureOptionsLimit")
    @Expose
    private String sellExposureOptionsLimit;
    @SerializedName("SellExposureFuturesLimit")
    @Expose
    private String sellExposureFuturesLimit;

    /**
     * it return cNCLimit
     * @return String
     */
    public String getCNCLimit() {
        return cNCLimit;
    }

    /**
     * it set the cNCLimit
     * @param cNCLimit String
     */
    public void setCNCLimit(String cNCLimit) {
        this.cNCLimit = cNCLimit;
    }

    /**
     * it return turnoverLimitPresent
     * @return String
     */
    public String getTurnoverLimitPresent() {
        return turnoverLimitPresent;
    }

    /**
     * it set the turnoverLimitPresent
     * @param turnoverLimitPresent String
     */
    public void setTurnoverLimitPresent(String turnoverLimitPresent) {
        this.turnoverLimitPresent = turnoverLimitPresent;
    }

    /**
     * it return mTMLossLimitPresent
     * @return String
     */
    public String getMTMLossLimitPresent() {
        return mTMLossLimitPresent;
    }

    /**
     * it set the mTMLossLimitPresent
     * @param mTMLossLimitPresent String
     */
    public void setMTMLossLimitPresent(String mTMLossLimitPresent) {
        this.mTMLossLimitPresent = mTMLossLimitPresent;
    }

    /**
     * it return buyExposureLimit
     * @return String
     */
    public String getBuyExposureLimit() {
        return buyExposureLimit;
    }

    /**
     * it set the buyExposureLimit
     * @param buyExposureLimit String
     */
    public void setBuyExposureLimit(String buyExposureLimit) {
        this.buyExposureLimit = buyExposureLimit;
    }

    /**
     * it return sellExposureLimit
     * @return String
     */
    public String getSellExposureLimit() {
        return sellExposureLimit;
    }

    /**
     * it set the sellExposureLimit
     * @param sellExposureLimit String
     */
    public void setSellExposureLimit(String sellExposureLimit) {
        this.sellExposureLimit = sellExposureLimit;
    }

    /**
     * it return grossExposureLimit
     * @return String
     */
    public String getGrossExposureLimit() {
        return grossExposureLimit;
    }

    /**
     * it set the grossExposureLimit
     * @param grossExposureLimit String
     */
    public void setGrossExposureLimit(String grossExposureLimit) {
        this.grossExposureLimit = grossExposureLimit;
    }

    /**
     * it return grossExposureDerivativesLimit
     * @return String
     */
    public String getGrossExposureDerivativesLimit() {
        return grossExposureDerivativesLimit;
    }

    /**
     * it set the grossExposureDerivativesLimit
     * @param grossExposureDerivativesLimit String
     */
    public void setGrossExposureDerivativesLimit(String grossExposureDerivativesLimit) {
        this.grossExposureDerivativesLimit = grossExposureDerivativesLimit;
    }

    /**
     * it return buyExposureFuturesLimit
     * @return String
     */
    public String getBuyExposureFuturesLimit() {
        return buyExposureFuturesLimit;
    }

    /**
     * it set the buyExposureFuturesLimit
     * @param buyExposureFuturesLimit String
     */
    public void setBuyExposureFuturesLimit(String buyExposureFuturesLimit) {
        this.buyExposureFuturesLimit = buyExposureFuturesLimit;
    }

    /**
     * it return buyExposureOptionsLimit
     * @return String
     */
    public String getBuyExposureOptionsLimit() {
        return buyExposureOptionsLimit;
    }

    /**
     * it set the buyExposureOptionsLimit
     * @param buyExposureOptionsLimit String
     */
    public void setBuyExposureOptionsLimit(String buyExposureOptionsLimit) {
        this.buyExposureOptionsLimit = buyExposureOptionsLimit;
    }

    /**
     * it return sellExposureOptionsLimit
     * @return String
     */
    public String getSellExposureOptionsLimit() {
        return sellExposureOptionsLimit;
    }

    /**
     * it set the sellExposureOptionsLimit
     * @param sellExposureOptionsLimit String
     */
    public void setSellExposureOptionsLimit(String sellExposureOptionsLimit) {
        this.sellExposureOptionsLimit = sellExposureOptionsLimit;
    }

    /**
     * it return sellExposureFuturesLimit
     * @return String
     */
    public String getSellExposureFuturesLimit() {
        return sellExposureFuturesLimit;
    }

    /**
     * it set the sellExposureFuturesLimit
     * @param sellExposureFuturesLimit String
     */
    public void setSellExposureFuturesLimit(String sellExposureFuturesLimit) {
        this.sellExposureFuturesLimit = sellExposureFuturesLimit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cNCLimit", cNCLimit).append("turnoverLimitPresent", turnoverLimitPresent).append("mTMLossLimitPresent", mTMLossLimitPresent).append("buyExposureLimit", buyExposureLimit).append("sellExposureLimit", sellExposureLimit).append("grossExposureLimit", grossExposureLimit).append("grossExposureDerivativesLimit", grossExposureDerivativesLimit).append("buyExposureFuturesLimit", buyExposureFuturesLimit).append("buyExposureOptionsLimit", buyExposureOptionsLimit).append("sellExposureOptionsLimit", sellExposureOptionsLimit).append("sellExposureFuturesLimit", sellExposureFuturesLimit).toString();
    }

}
