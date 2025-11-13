
package com.sf.xts.api.sdk.interactive.position;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PositionList {

    @SerializedName("TradingSymbol")
    @Expose
    private String tradingSymbol;
    @SerializedName("MessageVersion")
    @Expose
    private Number messageVersion;
    @SerializedName("BuyValue")
    @Expose
    private String buyValue;
    @SerializedName("SumOfTradedQuantityAndPriceBuy")
    @Expose
    private String sumOfTradedQuantityAndPriceBuy;
    @SerializedName("SellValue")
    @Expose
    private String sellValue;
    @SerializedName("MessageCode")
    @Expose
    private Number messageCode;
    @SerializedName("AccountID")
    @Expose
    private String loginID;
    @SerializedName("MTM")
    @Expose
    private String mTM;
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("OpenSellQuantity")
    @Expose
    private Number openSellQuantity;
    @SerializedName("SellAveragePrice")
    @Expose
    private String sellAveragePrice;
    @SerializedName("BEP")
    @Expose
    private String bEP;
    @SerializedName("OpenBuyQuantity")
    @Expose
    private Number openBuyQuantity;
    @SerializedName("BuyAveragePrice")
    @Expose
    private String buyAveragePrice;
    @SerializedName("LongPosition")
    @Expose
    private Number longPosition;
    @SerializedName("UnrealizedMTM")
    @Expose
    private String unrealizedMTM;
    @SerializedName("Quantity")
    @Expose
    private Number netPosition;
    @SerializedName("BuyAmount")
    @Expose
    private Number buyAmount;
    @SerializedName("SellAmount")
    @Expose
    private Number sellAmount;
    @SerializedName("NetAmount")
    @Expose
    private Number netAmount;
    @SerializedName("ApplicationType")
    @Expose
    private Number applicationType;
    @SerializedName("ExchangeSegment")
    @Expose
    private String exchangeSegment;
    @SerializedName("UniqueKey")
    @Expose
    private String uniqueKey;
    @SerializedName("ExchangeInstrumentId")
    @Expose
    private Number exchangeInstrumentID;
    @SerializedName("ShortPosition")
    @Expose
    private Number shortPosition;
    @SerializedName("NetValue")
    @Expose
    private String netValue;
    @SerializedName("ClientID")
    @Expose
    private String clientID;
    @SerializedName("RealizedMTM")
    @Expose
    private String realizedMTM;
    @SerializedName("SumOfTradedQuantityAndPriceSell")
    @Expose
    private String sumOfTradedQuantityAndPriceSell;
    @SerializedName("TokenID")
    @Expose
    private Number tokenID;

    /**
     * it return messageVersion
     * @return Number
     */
    public Number getMessageVersion() {
        return messageVersion;
    }

    /**
     * it set the messageVersion
     * @param messageVersion Number
     */
    public void setMessageVersion(Number messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * it return buyValue
     * @return String
     */
    public String getBuyValue() {
        return buyValue;
    }

    /**
     * it set the buyValue
     * @param buyValue String
     */
    public void setBuyValue(String buyValue) {
        this.buyValue = buyValue;
    }

    /**
     * it return tradingSymbol
     * @return String
     */
    public String getTradingSymbol() {
        return tradingSymbol;
    }

    /**
     * it set the tradingSymbol
     * @param tradingSymbol String
     */
    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    /**
     * it return sumOfTradedQuantityAndPriceBuy
     * @return String
     */
    public String getSumOfTradedQuantityAndPriceBuy() {
        return sumOfTradedQuantityAndPriceBuy;
    }

    /**
     * it set the sumOfTradedQuantityAndPriceBuy
     * @param sumOfTradedQuantityAndPriceBuy String
     */
    public void setSumOfTradedQuantityAndPriceBuy(String sumOfTradedQuantityAndPriceBuy) {
        this.sumOfTradedQuantityAndPriceBuy = sumOfTradedQuantityAndPriceBuy;
    }

    /**
     * it return sellValue
     * @return String
     */
    public String getSellValue() {
        return sellValue;
    }

    /**
     * it set the sellValue
     * @param sellValue String
     */
    public void setSellValue(String sellValue) {
        this.sellValue = sellValue;
    }

    /**
     * it return messageCode
     * @return Number
     */
    public Number getMessageCode() {
        return messageCode;
    }

    /**
     * it set the messageCode
     * @param messageCode Number
     */
    public void setMessageCode(Number messageCode) {
        this.messageCode = messageCode;
    }

    /**
     * it return loginID
     * @return String
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * it set the loginID
     * @param loginID String
     */
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * it return mTM
     * @return String
     */
    public String getMTM() {
        return mTM;
    }

    /**
     * it set the mTM
     * @param mTM String
     */
    public void setMTM(String mTM) {
        this.mTM = mTM;
    }

    /**
     * it return productType
     * @return String
     */
    public String getProductType() {
        return productType;
    }

    /**
     * it set the productType
     * @param productType String
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * it return openSellQuantity
     * @return Number
     */
    public Number getOpenSellQuantity() {
        return openSellQuantity;
    }

    /**
     * it set the openSellQuantity
     * @param openSellQuantity Number
     */
    public void setOpenSellQuantity(Number openSellQuantity) {
        this.openSellQuantity = openSellQuantity;
    }

    /**
     * it return sellAveragePrice
     * @return String
     */
    public String getSellAveragePrice() {
        return sellAveragePrice;
    }

    /**
     * it set the sellAveragePrice
     * @param sellAveragePrice String
     */
    public void setSellAveragePrice(String sellAveragePrice) {
        this.sellAveragePrice = sellAveragePrice;
    }

    /**
     * it return bEP
     * @return String
     */
    public String getBEP() {
        return bEP;
    }

    /**
     * it set the bEP
     * @param bEP String
     */
    public void setBEP(String bEP) {
        this.bEP = bEP;
    }

    /**
     * it return openBuyQuantity
     * @return Number
     */
    public Number getOpenBuyQuantity() {
        return openBuyQuantity;
    }

    /**
     * it set the openBuyQuantity
     * @param openBuyQuantity Number
     */
    public void setOpenBuyQuantity(Number openBuyQuantity) {
        this.openBuyQuantity = openBuyQuantity;
    }

    /**
     * it return buyAveragePrice
     * @return String
     */
    public String getBuyAveragePrice() {
        return buyAveragePrice;
    }

    /**
     * it set the buyAveragePrice
     * @param buyAveragePrice String
     */
    public void setBuyAveragePrice(String buyAveragePrice) {
        this.buyAveragePrice = buyAveragePrice;
    }

    /**
     * it return longPosition
     * @return Number
     */
    public Number getLongPosition() {
        return longPosition;
    }

    /**
     * it set the longPosition
     * @param longPosition Number
     */
    public void setLongPosition(Number longPosition) {
        this.longPosition = longPosition;
    }

    /**
     * it return unrealizedMTM
     * @return Number
     */
    public String getUnrealizedMTM() {
        return unrealizedMTM;
    }

    /**
     * it set the unrealizedMTM
     * @param unrealizedMTM  Number
     */
    public void setUnrealizedMTM(String unrealizedMTM) {
        this.unrealizedMTM = unrealizedMTM;
    }

    /**
     * it return netPosition
     * @return Number
     */
    public Number getNetPosition() {
        return netPosition;
    }

    /**
     * it set the netPosition
     * @param netPosition Number
     */
    public void setNetPosition(Number netPosition) {
        this.netPosition = netPosition;
    }

    /**
     * it return buyAmount
     * @return Number
     */
    public Number getBuyAmount() {
        return buyAmount;
    }

    /**
     * it set the buyAmount
     * @param buyAmount Number
     */
    public void setBuyAmount(Number buyAmount) {
        this.buyAmount = buyAmount;
    }

    /**
     * it return sellAmount
     * @return Number
     */
    public Number getSellAmount() {
        return sellAmount;
    }

    /**
     * it set the sellAmount
     * @param sellAmount Number
     */
    public void setSellAmount(Number sellAmount) {
        this.sellAmount = sellAmount;
    }

    /**
     * it return netAmount
     * @return Number
     */
    public Number getNetAmount() {
        return netAmount;
    }

    /**
     * it set the netAmount
     * @param netAmount Number
     */
    public void setNetAmount(Number netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * it return applicationType
     * @return Number
     */
    public Number getApplicationType() {
        return applicationType;
    }

    /**
     * it set the applicationType
     * @param applicationType Number
     */
    public void setApplicationType(Number applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * it return exchangeSegment
     * @return String
     */
    public String getExchangeSegment() {
        return exchangeSegment;
    }

    /**
     * it set the exchangeSegment
     * @param exchangeSegment String
     */
    public void setExchangeSegment(String exchangeSegment) {
        this.exchangeSegment = exchangeSegment;
    }

    /**
     * it return uniqueKey
     * @return String
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * it set the uniqueKey
     * @param uniqueKey String
     */
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    /**
     * it return exchangeInstrumentID
     * @return Number
     */
    public Number getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    /**
     * it set the exchangeInstrumentID
     * @param exchangeInstrumentID Number
     */
    public void setExchangeInstrumentID(Number exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    /**
     * it return shortPosition
     * @return Number
     */
    public Number getShortPosition() {
        return shortPosition;
    }

    /**
     * it set the shortPosition
     * @param shortPosition Number
     */
    public void setShortPosition(Number shortPosition) {
        this.shortPosition = shortPosition;
    }

    /**
     * it return netValue
     * @return String
     */
    public String getNetValue() {
        return netValue;
    }

    /**
     * it set the netValue
     * @param netValue String
     */
    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }

    /**
     * it return clientID
     * @return String
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * it set the clientID
     * @param clientID String
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * it return realizedMTM
     * @return String
     */
    public String getRealizedMTM() {
        return realizedMTM;
    }

    /**
     * it set the realizedMTM
     * @param realizedMTM String
     */
    public void setRealizedMTM(String realizedMTM) {
        this.realizedMTM = realizedMTM;
    }

    /**
     * it return sumOfTradedQuantityAndPriceSell
     * @return String
     */
    public String getSumOfTradedQuantityAndPriceSell() {
        return sumOfTradedQuantityAndPriceSell;
    }

    /**
     * it set the sumOfTradedQuantityAndPriceSell
     * @param sumOfTradedQuantityAndPriceSell String
     */
    public void setSumOfTradedQuantityAndPriceSell(String sumOfTradedQuantityAndPriceSell) {
        this.sumOfTradedQuantityAndPriceSell = sumOfTradedQuantityAndPriceSell;
    }

    /**
     * it return tokenID
     * @return Number
     */
    public Number getTokenID() {
        return tokenID;
    }

    /**
     * it set the tokenID
     * @param tokenID Number
     */
    public void setTokenID(Number tokenID) {
        this.tokenID = tokenID;
    }

	@Override
	public String toString() {
		return "Result [messageVersion=" + messageVersion + ", buyValue="
				+ buyValue + ", sumOfTradedQuantityAndPriceBuy="
				+ sumOfTradedQuantityAndPriceBuy + ", sellValue=" + sellValue
				+ ", messageCode=" + messageCode + ", loginID=" + loginID
				+ ", mTM=" + mTM + ", productType=" + productType
				+ ", sellAveragePrice=" + sellAveragePrice + ", bEP=" + bEP
				+ ", buyAveragePrice=" + buyAveragePrice + ", longPosition="
				+ longPosition + ", unrealizedMTM=" + unrealizedMTM
				+ ", netPosition=" + netPosition + ", applicationType="
				+ applicationType + ", exchangeSegment=" + exchangeSegment
				+ ", uniqueKey=" + uniqueKey + ", exchangeInstrumentID="
				+ exchangeInstrumentID + ", shortPosition=" + shortPosition
				+ ", netValue=" + netValue + ", clientID=" + clientID
				+ ", realizedMTM=" + realizedMTM
				+ ", sumOfTradedQuantityAndPriceSell="
				+ sumOfTradedQuantityAndPriceSell + ", tokenID=" + tokenID
				+ "]";
	}
}
