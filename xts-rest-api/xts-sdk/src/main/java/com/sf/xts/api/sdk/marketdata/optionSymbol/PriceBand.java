package com.sf.xts.api.sdk.marketdata.optionSymbol;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceBand {

    @SerializedName("High")
    @Expose
    private Double High;
    
    @SerializedName("Low")
    @Expose
    private Double Low;
    
    @SerializedName("HighString")
    @Expose
    private String HighString;
    
    @SerializedName("LowString")
    @Expose
    private String LowString;
    
    @SerializedName("CreditRating")
    @Expose
    private String CreditRating;

    /** 
	 * It get High value
	 * @return Double
	 */
	public Double getHigh() {
		return High;
	}

	/**
	 * It set High value
	 * @param high Double
	 */
	public void setHigh(Double high) {
		High = high;
	}

	/**
	 * It get low value
	 * @return Double
	 */
	public Double getLow() {
		return Low;
	}

	/**
	 * It set low value
	 * @param low Double
	 */
	public void setLow(Double low) {
		Low = low;
	}

	/**
	 * It get highString
	 * @return String
	 */
	public String getHighString() {
		return HighString;
	}

	/**
	 * It set highString
	 * @param highString String
	 */
	public void setHighString(String highString) {
		HighString = highString;
	}

	/**
	 * It get lowString
	 * @return String
	 */
	public String getLowString() {
		return LowString;
	}

	/**
	 * It set lowString
	 * @param lowString String
	 */
	public void setLowString(String lowString) {
		LowString = lowString;
	}

	/**
	 * It get creditRating
	 * @return String
	 */
	public String getCreditRating() {
		return CreditRating;
	}

	/**
	 * It set creditRating
	 * @param creditRating String
	 */
	public void setCreditRating(String creditRating) {
		CreditRating = creditRating;
	}

	@Override
	public String toString() {
		return "PriceBand [High=" + High + ", Low=" + Low + ", HighString="
				+ HighString + ", LowString=" + LowString + ", CreditRating="
				+ CreditRating + "]";
	}   
}
