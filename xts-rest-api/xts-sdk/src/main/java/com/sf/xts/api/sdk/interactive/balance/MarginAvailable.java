
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MarginAvailable {

    @SerializedName("CashMarginAvailable")
    @Expose
    private String cashMarginAvailable;
    @SerializedName("AdhocMargin")
    @Expose
    private String adhocMargin;
    @SerializedName("NotinalCash")
    @Expose
    private String notinalCash;
    @SerializedName("PayInAmount")
    @Expose
    private String payInAmount;
    @SerializedName("PayOutAmount")
    @Expose
    private String payOutAmount;
    @SerializedName("CNCSellBenifit")
    @Expose
    private String cNCSellBenifit;
    @SerializedName("DirectCollateral")
    @Expose
    private String directCollateral;
    @SerializedName("HoldingCollateral")
    @Expose
    private String holdingCollateral;
    @SerializedName("ClientBranchAdhoc")
    @Expose
    private String clientBranchAdhoc;
    @SerializedName("SellOptionsPremium")
    @Expose
    private String sellOptionsPremium;
    @SerializedName("TotalBranchAdhoc")
    @Expose
    private String totalBranchAdhoc;
    @SerializedName("AdhocFOMargin")
    @Expose
    private String adhocFOMargin;
    @SerializedName("AdhocCurrencyMargin")
    @Expose
    private String adhocCurrencyMargin;
    @SerializedName("AdhocCommodityMargin")
    @Expose
    private String adhocCommodityMargin;

    /**
     * it return cashMarginAvailable value
     * @return String
     */
    public String getCashMarginAvailable() {
        return cashMarginAvailable;
    }

    /**
     * it set the cashMarginAvailable value
     * @param cashMarginAvailable String
     */
    public void setCashMarginAvailable(String cashMarginAvailable) {
        this.cashMarginAvailable = cashMarginAvailable;
    }

    /**
     * it return adhocMargin
     * @return String
     */
    public String getAdhocMargin() {
        return adhocMargin;
    }

    /**
     * it set the adhocMargin
     * @param adhocMargin String
     */
    public void setAdhocMargin(String adhocMargin) {
        this.adhocMargin = adhocMargin;
    }

    /**
     * it return notinalCash
     * @return String
     */
    public String getNotinalCash() {
        return notinalCash;
    }

    /**
     * it set the notinalCash
     * @param notinalCash String
     */
    public void setNotinalCash(String notinalCash) {
        this.notinalCash = notinalCash;
    }

    /**
     * it return payInAmount
     * @return String
     */
    public String getPayInAmount() {
        return payInAmount;
    }

    /**
     * it set the payInAmount
     * @param payInAmount String
     */
    public void setPayInAmount(String payInAmount) {
        this.payInAmount = payInAmount;
    }

    /**
     * it return payOutAmount
     * @return String
     */
    public String getPayOutAmount() {
        return payOutAmount;
    }

    /**
     * it set the payOutAmount
     * @param payOutAmount String
     */
    public void setPayOutAmount(String payOutAmount) {
        this.payOutAmount = payOutAmount;
    }

    /**
     * it return cNCSellBenifit
     * @return String
     */
    public String getCNCSellBenifit() {
        return cNCSellBenifit;
    }

    /**
     * it set the cNCSellBenifit
     * @param cNCSellBenifit String
     */
    public void setCNCSellBenifit(String cNCSellBenifit) {
        this.cNCSellBenifit = cNCSellBenifit;
    }

    /**
     * it return directCollateral
     * @return String
     */
    public String getDirectCollateral() {
        return directCollateral;
    }

    /**
     * it set the directCollateral
     * @param directCollateral String
     */
    public void setDirectCollateral(String directCollateral) {
        this.directCollateral = directCollateral;
    }

    /**
     * it return holdingCollateral
     * @return String
     */
    public String getHoldingCollateral() {
        return holdingCollateral;
    }

    /**
     * it set the holdingCollateral
     * @param holdingCollateral String
     */
    public void setHoldingCollateral(String holdingCollateral) {
        this.holdingCollateral = holdingCollateral;
    }

    /**
     * it return clientBranchAdhoc
     * @return String
     */
    public String getClientBranchAdhoc() {
        return clientBranchAdhoc;
    }

    /**
     * it set the clientBranchAdhoc
     * @param clientBranchAdhoc String
     */
    public void setClientBranchAdhoc(String clientBranchAdhoc) {
        this.clientBranchAdhoc = clientBranchAdhoc;
    }

    /**
     * it return sellOptionsPremium
     * @return String
     */
    public String getSellOptionsPremium() {
        return sellOptionsPremium;
    }

    /**
     * it set the sellOptionsPremium
     * @param sellOptionsPremium String
     */
    public void setSellOptionsPremium(String sellOptionsPremium) {
        this.sellOptionsPremium = sellOptionsPremium;
    }

    /**
     * it return totalBranchAdhoc
     * @return String
     */
    public String getTotalBranchAdhoc() {
        return totalBranchAdhoc;
    }

    /**
     * it set the totalBranchAdhoc
     * @param totalBranchAdhoc String
     */
    public void setTotalBranchAdhoc(String totalBranchAdhoc) {
        this.totalBranchAdhoc = totalBranchAdhoc;
    }

    /**
     * it return adhocFOMargin
     * @return String
     */
    public String getAdhocFOMargin() {
        return adhocFOMargin;
    }

    /**
     * it set the adhocFOMargin
     * @param adhocFOMargin String
     */
    public void setAdhocFOMargin(String adhocFOMargin) {
        this.adhocFOMargin = adhocFOMargin;
    }

    /**
     * it return adhocCurrencyMargin
     * @return String
     */
    public String getAdhocCurrencyMargin() {
        return adhocCurrencyMargin;
    }

    /**
     * it set the adhocCurrencyMargin
     * @param adhocCurrencyMargin String
     */
    public void setAdhocCurrencyMargin(String adhocCurrencyMargin) {
        this.adhocCurrencyMargin = adhocCurrencyMargin;
    }

    /**
     * it return adhocCommodityMargin
     * @return String
     */
    public String getAdhocCommodityMargin() {
        return adhocCommodityMargin;
    }

    /**
     * it set the adhocCommodityMargin
     * @param adhocCommodityMargin String
     */
    public void setAdhocCommodityMargin(String adhocCommodityMargin) {
        this.adhocCommodityMargin = adhocCommodityMargin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cashMarginAvailable", cashMarginAvailable).append("adhocMargin", adhocMargin).append("notinalCash", notinalCash).append("payInAmount", payInAmount).append("payOutAmount", payOutAmount).append("cNCSellBenifit", cNCSellBenifit).append("directCollateral", directCollateral).append("holdingCollateral", holdingCollateral).append("clientBranchAdhoc", clientBranchAdhoc).append("sellOptionsPremium", sellOptionsPremium).append("totalBranchAdhoc", totalBranchAdhoc).append("adhocFOMargin", adhocFOMargin).append("adhocCurrencyMargin", adhocCurrencyMargin).append("adhocCommodityMargin", adhocCommodityMargin).toString();
    }

}
