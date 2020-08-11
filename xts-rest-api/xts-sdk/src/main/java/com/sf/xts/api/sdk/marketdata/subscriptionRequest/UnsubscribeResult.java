package com.sf.xts.api.sdk.marketdata.subscriptionRequest;

import java.util.Arrays;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.Instrument;

public class UnsubscribeResult {

    @SerializedName("xtsMessageCode")
    @Expose
    private Number xtsMessageCode;
    
    @SerializedName("unsubList")
    @Expose
    private Instrument[] unsubList = null;

	/**
	 * It get xtsMessageCode
	 * @return Number
	 */
	public Number getXtsMessageCode() {
		return xtsMessageCode;
	}

	/**
	 * It set xtsMessageCode
	 * @param xtsMessageCode Number
	 */
	public void setXtsMessageCode(Number xtsMessageCode) {
		this.xtsMessageCode = xtsMessageCode;
	}

	/**
	 * It get unsubscribe list
	 * @return Instruments
	 */
	public Instrument[] getUnsubList() {
		return unsubList;
	}

	/**
	 * It set unsubscribe list
	 * @param unsubList Instruments
	 */
	public void setUnsubList(Instrument[] unsubList) {
		this.unsubList = unsubList;
	}

	@Override
	public String toString() {
		return "UnsubscribeResult [xtsMessageCode=" + xtsMessageCode
				+ ", unsubList=" + Arrays.toString(unsubList) + "]";
	}
}
