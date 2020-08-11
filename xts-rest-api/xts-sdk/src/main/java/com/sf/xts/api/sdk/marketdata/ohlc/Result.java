package com.sf.xts.api.sdk.marketdata.ohlc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("exchangeSegment")
    @Expose
    private String exchangeSegment;
    
    @SerializedName("exchangeInstrumentID")
    @Expose
    private String exchangeInstrumentID;
    
    @SerializedName("dataReponse")
    @Expose
    private String dataReponse = null;

    /**
     * It get exchangeSegment
     * @return String
     */
    public String getExchangeSegment() {
		return exchangeSegment;
	}

	/**
	 * It set exchangeSegment
	 * @param exchangeSegment String
	 */
	public void setExchangeSegment(String exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
	}

	/**
	 * It get exchangeInstrumentID
	 * @return String
	 */
	public String getExchangeInstrumentID() {
		return exchangeInstrumentID;
	}

	/**
	 * It set exchangeInstrumentID
	 * @param exchangeInstrumentID String
	 */
	public void setExchangeInstrumentID(String exchangeInstrumentID) {
		this.exchangeInstrumentID = exchangeInstrumentID;
	}

	/**
	 * It get dataReponse
	 * @return String
	 */
	public String getDataReponse() {
		return dataReponse;
	}

	/**
	 * It set dataReponse
	 * @param dataReponse String
	 */
	public void setDataReponse(String dataReponse) {
		this.dataReponse = dataReponse;
	}

	@Override
	public String toString() {
		return "Result [exchangeSegment=" + exchangeSegment
				+ ", exchangeInstrumentID=" + exchangeInstrumentID
				+ ", dataReponse=" + dataReponse + "]";
	}
}
