
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MarginUtilized {

    @SerializedName("GrossExposureMarginPresent")
    @Expose
    private String grossExposureMarginPresent;
    @SerializedName("BuyExposureMarginPresent")
    @Expose
    private String buyExposureMarginPresent;
    @SerializedName("SellExposureMarginPresent")
    @Expose
    private String sellExposureMarginPresent;
    @SerializedName("VarELMarginPresent")
    @Expose
    private String varELMarginPresent;
    @SerializedName("ScripBasketMarginPresent")
    @Expose
    private String scripBasketMarginPresent;
    @SerializedName("GrossExposureLimitPresent")
    @Expose
    private String grossExposureLimitPresent;
    @SerializedName("BuyExposureLimitPresent")
    @Expose
    private String buyExposureLimitPresent;
    @SerializedName("SellExposureLimitPresent")
    @Expose
    private String sellExposureLimitPresent;
    @SerializedName("CNCLimitUsed")
    @Expose
    private String cNCLimitUsed;
    @SerializedName("CNCAmountUsed")
    @Expose
    private String cNCAmountUsed;
    @SerializedName("MarginUsed")
    @Expose
    private String marginUsed;
    @SerializedName("LimitUsed")
    @Expose
    private String limitUsed;
    @SerializedName("TotalSpanMargin")
    @Expose
    private String totalSpanMargin;
    @SerializedName("ExposureMarginPresent")
    @Expose
    private String exposureMarginPresent;

    /**
     * it return grossExposureMarginPresent
     * @return String
     */
    public String getGrossExposureMarginPresent() {
        return grossExposureMarginPresent;
    }

    /**
     * it set the grossExposureMarginPresent
     * @param grossExposureMarginPresent String
     */
    public void setGrossExposureMarginPresent(String grossExposureMarginPresent) {
        this.grossExposureMarginPresent = grossExposureMarginPresent;
    }

    /**
     * it return buyExposureMarginPresent
     * @return String
     */
    public String getBuyExposureMarginPresent() {
        return buyExposureMarginPresent;
    }

    /**
     * it set the buyExposureMarginPresent
     * @param buyExposureMarginPresent String
     */
    public void setBuyExposureMarginPresent(String buyExposureMarginPresent) {
        this.buyExposureMarginPresent = buyExposureMarginPresent;
    }

    /**
     * it return sellExposureMarginPresent
     * @return String
     */
    public String getSellExposureMarginPresent() {
        return sellExposureMarginPresent;
    }

    /**
     * it set the sellExposureMarginPresent
     * @param sellExposureMarginPresent String
     */
    public void setSellExposureMarginPresent(String sellExposureMarginPresent) {
        this.sellExposureMarginPresent = sellExposureMarginPresent;
    }

    /**
     * it return varELMarginPresent
     * @return String
     */
    public String getVarELMarginPresent() {
        return varELMarginPresent;
    }

    /**
     * it set the varELMarginPresent
     * @param varELMarginPresent String
     */
    public void setVarELMarginPresent(String varELMarginPresent) {
        this.varELMarginPresent = varELMarginPresent;
    }

    /**
     * it return scripBasketMarginPresent
     * @return String
     */
    public String getScripBasketMarginPresent() {
        return scripBasketMarginPresent;
    }

    /**
     * it set the scripBasketMarginPresent
     * @param scripBasketMarginPresent String
     */
    public void setScripBasketMarginPresent(String scripBasketMarginPresent) {
        this.scripBasketMarginPresent = scripBasketMarginPresent;
    }

    /**
     * it return grossExposureLimitPresent
     * @return String
     */
    public String getGrossExposureLimitPresent() {
        return grossExposureLimitPresent;
    }

    /**
     * it set the grossExposureLimitPresent
     * @param grossExposureLimitPresent String
     */
    public void setGrossExposureLimitPresent(String grossExposureLimitPresent) {
        this.grossExposureLimitPresent = grossExposureLimitPresent;
    }

    /**
     * it return buyExposureLimitPresent
     * @return String
     */
    public String getBuyExposureLimitPresent() {
        return buyExposureLimitPresent;
    }

    /**
     * it set the buyExposureLimitPresent
     * @param buyExposureLimitPresent String
     */
    public void setBuyExposureLimitPresent(String buyExposureLimitPresent) {
        this.buyExposureLimitPresent = buyExposureLimitPresent;
    }

    /**
     * it return sellExposureLimitPresent
     * @return String
     */
    public String getSellExposureLimitPresent() {
        return sellExposureLimitPresent;
    }

    /**
     * it set the sellExposureLimitPresent
     * @param sellExposureLimitPresent String
     */
    public void setSellExposureLimitPresent(String sellExposureLimitPresent) {
        this.sellExposureLimitPresent = sellExposureLimitPresent;
    }

    /**
     * it return cNCLimitUsed value
     * @return String
     */
    public String getCNCLimitUsed() {
        return cNCLimitUsed;
    }

    /**
     * it set the cNCLimitUsed value
     * @param cNCLimitUsed String
     */
    public void setCNCLimitUsed(String cNCLimitUsed) {
        this.cNCLimitUsed = cNCLimitUsed;
    }

    /**
     * it return cNCAmountUsed value
     * @return String
     */
    public String getCNCAmountUsed() {
        return cNCAmountUsed;
    }

    /**
     * it set the cNCAmountUsed value
     * @param cNCAmountUsed String
     */
    public void setCNCAmountUsed(String cNCAmountUsed) {
        this.cNCAmountUsed = cNCAmountUsed;
    }

    /**
     * it return marginUsed used
     * @return String
     */
    public String getMarginUsed() {
        return marginUsed;
    }

    /**
     * it set the marginUsed used
     * @param marginUsed String
     */
    public void setMarginUsed(String marginUsed) {
        this.marginUsed = marginUsed;
    }

    /**
     * it return limitUsed
     * @return String
     */
    public String getLimitUsed() {
        return limitUsed;
    }

    /**
     * it set the limitUsed
     * @param limitUsed String
     */
    public void setLimitUsed(String limitUsed) {
        this.limitUsed = limitUsed;
    }

    /**
     * it return totalSpanMargin
     * @return String
     */
    public String getTotalSpanMargin() {
        return totalSpanMargin;
    }

    /**
     * it set the totalSpanMargin 
     * @param totalSpanMargin String
     */
    public void setTotalSpanMargin(String totalSpanMargin) {
        this.totalSpanMargin = totalSpanMargin;
    }

    /**
     * it return exposureMarginPresent
     * @return String
     */
    public String getExposureMarginPresent() {
        return exposureMarginPresent;
    }

    /**
     * it set the exposureMarginPresent
     * @param exposureMarginPresent String
     */
    public void setExposureMarginPresent(String exposureMarginPresent) {
        this.exposureMarginPresent = exposureMarginPresent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("grossExposureMarginPresent", grossExposureMarginPresent).append("buyExposureMarginPresent", buyExposureMarginPresent).append("sellExposureMarginPresent", sellExposureMarginPresent).append("varELMarginPresent", varELMarginPresent).append("scripBasketMarginPresent", scripBasketMarginPresent).append("grossExposureLimitPresent", grossExposureLimitPresent).append("buyExposureLimitPresent", buyExposureLimitPresent).append("sellExposureLimitPresent", sellExposureLimitPresent).append("cNCLimitUsed", cNCLimitUsed).append("cNCAmountUsed", cNCAmountUsed).append("marginUsed", marginUsed).append("limitUsed", limitUsed).append("totalSpanMargin", totalSpanMargin).append("exposureMarginPresent", exposureMarginPresent).toString();
    }

}
