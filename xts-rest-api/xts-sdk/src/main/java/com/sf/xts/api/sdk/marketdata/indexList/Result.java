package com.sf.xts.api.sdk.marketdata.indexList;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("exchangeSegment")
    @Expose
    private String exchangeSegment;
    
    @SerializedName("indexList")
    @Expose
    private List<String> indexList;
    

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
	 * It get indexList
	 * @return List of String
	 */
	public List<String> getIndexList() {
		return indexList;
	}

	/**
	 * It set indexList 
	 * @param indexList List of String
	 */
	public void setIndexList(List<String> indexList) {
		this.indexList = indexList;
	}

	@Override
	public String toString() {
		return "Result [exchangeSegment=" + exchangeSegment + ", indexList="
				+ indexList + "]";
	}
}
