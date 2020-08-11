package com.sf.xts.api.sdk.interactive.placeOrder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("AppOrderID")
    @Expose
    private String AppOrderID;

	/**
	 * it return appOrderID
	 * @return String
	 */
	public String getAppOrderID() {
		return AppOrderID;
	}

	/**
	 * it set appOrderID
	 * @param appOrderID String
	 */
	public void setAppOrderID(String appOrderID) {
		AppOrderID = appOrderID;
	}

	@Override
	public String toString() {
		return "Result [AppOrderID=" + AppOrderID + "]";
	}
}
