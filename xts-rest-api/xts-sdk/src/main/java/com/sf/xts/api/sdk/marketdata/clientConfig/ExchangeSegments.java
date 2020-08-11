package com.sf.xts.api.sdk.marketdata.clientConfig;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExchangeSegments {

    @SerializedName("NSECM")
    @Expose
    private Number NSECM;
    
    @SerializedName("NSEFO")
    @Expose
    private Number NSEFO;
    
    @SerializedName("NSECD")
    @Expose
    private Number NSECD;
    
    @SerializedName("NSECO")
    @Expose
    private Number NSECO;
    
    @SerializedName("BSECM")
    @Expose
    private Number BSECM;
    
    @SerializedName("BSEFO")
    @Expose
    private Number BSEFO;
    
    @SerializedName("BSECD")
    @Expose
    private Number BSECD;
    
    @SerializedName("NCDEX")
    @Expose
    private Number NCDEX;
    
    @SerializedName("MSECM")
    @Expose
    private Number MSECM;
    
    @SerializedName("MSEFO")
    @Expose
    private Number MSEFO;
    
    @SerializedName("MSECD")
    @Expose
    private Number MSECD;
    
    @SerializedName("MCXFO")
    @Expose
    private Number MCXFO;
    
    /**
     * Get NSECM value
     * @return Number
     */
    public Number getNSECM() {
		return NSECM;
	}

	/**
	 * Set NSECM value
	 * @param nSECM Number
	 */
	public void setNSECM(Number nSECM) {
		NSECM = nSECM;
	}

	/**
	 * Get NSEFO value
	 * @return Number
	 */
	public Number getNSEFO() {
		return NSEFO;
	}

	/**
	 * Set NSEFO value
	 * @param nSEFO Number
	 */
	public void setNSEFO(Number nSEFO) {
		NSEFO = nSEFO;
	}

	/**
	 * Get NSECD value
	 * @return Number
	 */
	public Number getNSECD() {
		return NSECD;
	}

	/**
	 * Set NSECD value
	 * @param nSECD Number
	 */
	public void setNSECD(Number nSECD) {
		NSECD = nSECD;
	}

	/**
	 * Get NSECO value
	 * @return Number
	 */
	public Number getNSECO() {
		return NSECO;
	}

	/**
	 * Set NSECO value
	 * @param nSECO Number
	 */
	public void setNSECO(Number nSECO) {
		NSECO = nSECO;
	}

	/**
	 * Get BSECM value
	 * @return Number
	 */
	public Number getBSECM() {
		return BSECM;
	}

	/**
	 * Set BSECM value
	 * @param bSECM Number
	 */
	public void setBSECM(Number bSECM) {
		BSECM = bSECM;
	}

	/**
	 * Get BSEFO value
	 * @return Number
	 */
	public Number getBSEFO() {
		return BSEFO;
	}

	/**
	 * Set BSEFO value
	 * @param bSEFO Number
	 */
	public void setBSEFO(Number bSEFO) {
		BSEFO = bSEFO;
	}

	/**
	 * Get BSECD value
	 * @return Number
	 */
	public Number getBSECD() {
		return BSECD;
	}

	/**
	 * Set BSECD value
	 * @param bSECD Number
	 */
	public void setBSECD(Number bSECD) {
		BSECD = bSECD;
	}

	/**
	 * Get NCDEX value
	 * @return Number
	 */
	public Number getNCDEX() {
		return NCDEX;
	}

	/**
	 * Set NCDEX value
	 * @param nCDEX Number
	 */
	public void setNCDEX(Number nCDEX) {
		NCDEX = nCDEX;
	}

	/**
	 * Get MSECM value
	 * @return Number
	 */
	public Number getMSECM() {
		return MSECM;
	}

	/**
	 * Set MSECM value
	 * @param mSECM Number
	 */
	public void setMSECM(Number mSECM) {
		MSECM = mSECM;
	}

	/**
	 * Get MSEFO value
	 * @return Number
	 */
	public Number getMSEFO() {
		return MSEFO;
	}

	/**
	 * Set MSEFO value
	 * @param mSEFO Number
	 */
	public void setMSEFO(Number mSEFO) {
		MSEFO = mSEFO;
	}

	/**
	 * Set MSECD value
	 * @return Number
	 */
	public Number getMSECD() {
		return MSECD;
	}

	/**
	 * Set MSECD value
	 * @param mSECD Number
	 */
	public void setMSECD(Number mSECD) {
		MSECD = mSECD;
	}

	/**
	 * Get MCXFO value
	 * @return Number
	 */
	public Number getMCXFO() {
		return MCXFO;
	}

	/**
	 * Set MCXFO value
	 * @param mCXFO Number
	 */
	public void setMCXFO(Number mCXFO) {
		MCXFO = mCXFO;
	}

	@Override
	public String toString() {
		return "ExchangeSegments [NSECM=" + NSECM + ", NSEFO=" + NSEFO
				+ ", NSECD=" + NSECD + ", NSECO=" + NSECO + ", BSECM=" + BSECM
				+ ", BSEFO=" + BSEFO + ", BSECD=" + BSECD + ", NCDEX=" + NCDEX
				+ ", MSECM=" + MSECM + ", MSEFO=" + MSEFO + ", MSECD=" + MSECD
				+ ", MCXFO=" + MCXFO + "]";
	}
}
