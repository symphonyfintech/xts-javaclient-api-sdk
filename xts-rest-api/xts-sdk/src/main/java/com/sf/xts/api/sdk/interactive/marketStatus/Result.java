package com.sf.xts.api.sdk.interactive.marketStatus;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("marketStatus")
    @Expose
    private List<MarketStatus> marketStatus;

	/**
	 * it return list of marketStatus
	 * @return list of marketStatus
	 */
	public List<MarketStatus> getMarketStatus() {
		return marketStatus;
	}

	/**
	 * it set the list of marketStatus
	 * @param marketStatus list of marketStatus
	 */
	public void setMarketStatus(List<MarketStatus> marketStatus) {
		this.marketStatus = marketStatus;
	}

	@Override
	public String toString() {
		return "Result [marketStatus=" + marketStatus + "]";
	}
}
