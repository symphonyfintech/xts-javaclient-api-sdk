package com.sf.xts.api.sdk.interactive;

/**
 * Object class for PositionResponse
 * 
 * @author SymphonyFintech
 */
public class PositionResponse {

	private String ExchangeSegment;
	private Number ExchangeInstrumentID;
	private String LoginID;
	private String ClientID;
	private String ProductType;
	private Number LongPosition;
	private Number ShortPosition;
	private Number NetPosition;
	private String BuyAveragePrice;
	private String SellAveragePrice;
	private String BuyValue;
	private String SellValue;
	private String NetValue;
	private String UnrealizedMTM;
	private String RealizedMTM;
	private String MTM;
	private String BEP;
	private String SumOfTradedQuantityAndPriceBuy;
	private String SumOfTradedQuantityAndPriceSell;
	private String UniqueKey;
	private Number MessageCode;
	private Number MessageVersion;
	private Number TokenID;
	private Number ApplicationType;
	
	/**
	 * it return exchangeSegment
	 * @return String
	 */
	public String getExchangeSegment() {
		return ExchangeSegment;
	}
	
	/**
	 * it set exchangeSegment
	 * @param exchangeSegment String
	 */
	public void setExchangeSegment(String exchangeSegment) {
		ExchangeSegment = exchangeSegment;
	}
	
	/**
	 * it return exchangeInstrumentID
	 * @return Number
	 */
	public Number getExchangeInstrumentID() {
		return ExchangeInstrumentID;
	}
	
	/**
	 * it set exchangeInstrumentID
	 * @param exchangeInstrumentID Number
	 */
	public void setExchangeInstrumentID(Number exchangeInstrumentID) {
		ExchangeInstrumentID = exchangeInstrumentID;
	}
	
	/**
	 * it return loginID
	 * @return String
	 */
	public String getLoginID() {
		return LoginID;
	}
	
	/**
	 * it set loginID
	 * @param loginID String
	 */
	public void setLoginID(String loginID) {
		LoginID = loginID;
	}
	
	/**
	 * it return ClientID
	 * @return String
	 */
	public String getClientID() {
		return ClientID;
	}
	
	/**
	 * it set ClientID
	 * @param clientID String
	 */
	public void setClientID(String clientID) {
		ClientID = clientID;
	}
	
	/**
	 * it return productType
	 * @return String
	 */
	public String getProductType() {
		return ProductType;
	}
	
	/**
	 * it set productType
	 * @param productType String
	 */
	public void setProductType(String productType) {
		ProductType = productType;
	}
	
	/**
	 * it return longPosition
	 * @return Number
	 */
	public Number getLongPosition() {
		return LongPosition;
	}
	
	/**
	 * it set longPosition
	 * @param longPosition Number
	 */
	public void setLongPosition(Number longPosition) {
		LongPosition = longPosition;
	}
	
	/**
	 * it return shortPosition
	 * @return Number
	 */
	public Number getShortPosition() {
		return ShortPosition;
	}
	
	/**
	 * it set shortPosition
	 * @param shortPosition Number
	 */
	public void setShortPosition(Number shortPosition) {
		ShortPosition = shortPosition;
	}
	
	/**
	 * it return netPosition
	 * @return Number
	 */
	public Number getNetPosition() {
		return NetPosition;
	}
	
	/**
	 * it set netPosition
	 * @param netPosition Number
	 */
	public void setNetPosition(Number netPosition) {
		NetPosition = netPosition;
	}
	
	/**
	 * it return buyAveragePrice
	 * @return String
	 */
	public String getBuyAveragePrice() {
		return BuyAveragePrice;
	}
	
	/**
	 * it set buyAveragePrice
	 * @param buyAveragePrice String
	 */
	public void setBuyAveragePrice(String buyAveragePrice) {
		BuyAveragePrice = buyAveragePrice;
	}
	
	/**
	 * it return sellAveragePrice
	 * @return String
	 */
	public String getSellAveragePrice() {
		return SellAveragePrice;
	}
	
	/**
	 * it set sellAveragePrice
	 * @param sellAveragePrice String
	 */
	public void setSellAveragePrice(String sellAveragePrice) {
		SellAveragePrice = sellAveragePrice;
	}

	/**
	 * it return buyValue
	 * @return String
	 */
	public String getBuyValue() {
		return BuyValue;
	}
	
	/**
	 * it set buyValue
	 * @param buyValue String
	 */
	public void setBuyValue(String buyValue) {
		BuyValue = buyValue;
	}
	
	/**
	 * it return sellValue
	 * @return String
	 */
	public String getSellValue() {
		return SellValue;
	}
	
	/**
	 * it set sellValue
	 * @param sellValue String
	 */
	public void setSellValue(String sellValue) {
		SellValue = sellValue;
	}
	
	/**
	 * it return netValue
	 * @return String
	 */
	public String getNetValue() {
		return NetValue;
	}
	
	/**
	 * it set netValue
	 * @param netValue String
	 */
	public void setNetValue(String netValue) {
		NetValue = netValue;
	}
	
	/**
	 * it return unrealizedMTM
	 * @return String
	 */
	public String getUnrealizedMTM() {
		return UnrealizedMTM;
	}
	
	/**
	 * it set unrealizedMTM
	 * @param unrealizedMTM String
	 */
	public void setUnrealizedMTM(String unrealizedMTM) {
		UnrealizedMTM = unrealizedMTM;
	}
	
	/**
	 * it return realizedMTM
	 * @return String
	 */
	public String getRealizedMTM() {
		return RealizedMTM;
	}
	
	/**
	 * it set realizedMTM
	 * @param realizedMTM String
	 */
	public void setRealizedMTM(String realizedMTM) {
		RealizedMTM = realizedMTM;
	}

	/**
	 * it return mtm
	 * @return String
	 */
	public String getMTM() {
		return MTM;
	}

	/**
	 * set mtm value
	 * @param mTM String
	 */
	public void setMTM(String mTM) {
		MTM = mTM;
	}
	
	/**
	 * it return bEP
	 * @return String
	 */
	public String getBEP() {
		return BEP;
	}
	
	/**
	 * it set bEP
	 * @param bEP String
	 */
	public void setBEP(String bEP) {
		BEP = bEP;
	}
	
	/**
	 * it return sumOfTradedQuantityAndPriceBuy
	 * @return String
	 */
	public String getSumOfTradedQuantityAndPriceBuy() {
		return SumOfTradedQuantityAndPriceBuy;
	}
	
	/**
	 * it set sumOfTradedQuantityAndPriceBuy
	 * @param sumOfTradedQuantityAndPriceBuy String
	 */
	public void setSumOfTradedQuantityAndPriceBuy(String sumOfTradedQuantityAndPriceBuy) {
		SumOfTradedQuantityAndPriceBuy = sumOfTradedQuantityAndPriceBuy;
	}

	/**
	 * it return sumOfTradedQuantityAndPriceSell
	 * @return String
	 */
	public String getSumOfTradedQuantityAndPriceSell() {
		return SumOfTradedQuantityAndPriceSell;
	}
	
	/**
	 * it set sumOfTradedQuantityAndPriceSell
	 * @param sumOfTradedQuantityAndPriceSell String
	 */
	public void setSumOfTradedQuantityAndPriceSell(String sumOfTradedQuantityAndPriceSell) {
		SumOfTradedQuantityAndPriceSell = sumOfTradedQuantityAndPriceSell;
	}
	
	/**
	 * it return uniqueKey
	 * @return String
	 */
	public String getUniqueKey() {
		return UniqueKey;
	}
	
	/**
	 * it set uniqueKey
	 * @param uniqueKey String
	 */
	public void setUniqueKey(String uniqueKey) {
		UniqueKey = uniqueKey;
	}
	
	/**
	 * it return xts messageCode
	 * @return Number
	 */
	public Number getMessageCode() {
		return MessageCode;
	}
	
	/**
	 * it set xts messageCode
	 * @param messageCode Number
	 */
	public void setMessageCode(Number messageCode) {
		MessageCode = messageCode;
	}
	
	/**
	 * it return xts messageVersion
	 * @return Number
	 */
	public Number getMessageVersion() {
		return MessageVersion;
	}
	
	/**
	 * it set messageVersion
	 * @param messageVersion Number
	 */
	public void setMessageVersion(Number messageVersion) {
		MessageVersion = messageVersion;
	}

	/**
	 * it return tokenID
	 * @return Number
	 */
	public Number getTokenID() {
		return TokenID;
	}
	
	/**
	 * it set tokenID
	 * @param tokenID Number
	 */
	public void setTokenID(Number tokenID) {
		TokenID = tokenID;
	}
	
	/**
	 * it return applicationType
	 * @return Number
	 */
	public Number getApplicationType() {
		return ApplicationType;
	}

	/**
	 * it set applicationType
	 * @param applicationType Number
	 */
	public void setApplicationType(Number applicationType) {
		ApplicationType = applicationType;
	}
	
	@Override
	public String toString() {
		return "PositionResponse [ExchangeSegment=" + ExchangeSegment + ", ExchangeInstrumentID=" + ExchangeInstrumentID
				+ ", LoginID=" + LoginID + ", ClientID=" + ClientID + ", ProductType=" + ProductType + ", LongPosition="
				+ LongPosition + ", ShortPosition=" + ShortPosition + ", NetPosition=" + NetPosition + ", BuyAveragePrice="
				+ BuyAveragePrice + ", SellAveragePrice=" + SellAveragePrice + ", BuyValue=" + BuyValue + ", SellValue="
				+ SellValue + ", NetValue=" + NetValue + ", UnrealizedMTM=" + UnrealizedMTM + ", RealizedMTM=" + RealizedMTM
				+ ", MTM=" + MTM + ", BEP=" + BEP + ", SumOfTradedQuantityAndPriceBuy=" + SumOfTradedQuantityAndPriceBuy
				+ ", SumOfTradedQuantityAndPriceSell=" + SumOfTradedQuantityAndPriceSell + ", UniqueKey=" + UniqueKey
				+ ", MessageCode=" + MessageCode + ", MessageVersion=" + MessageVersion + ", TokenID=" + TokenID
				+ ", ApplicationType=" + ApplicationType + "]";
	}



}
