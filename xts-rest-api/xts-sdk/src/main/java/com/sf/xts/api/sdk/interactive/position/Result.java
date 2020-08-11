
package com.sf.xts.api.sdk.interactive.position;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

	@SerializedName("positionList")
    @Expose
    private List<PositionList> positionList;

	/**
	 * it return the List of PositionList
	 * @return List of PositionList
	 */
	public List<PositionList> getPositionList() {
		return positionList;
	}

	/**
	 * it set List of PositionList
	 * @param positionList List of PositionList
	 */
	public void setPositionList(List<PositionList> positionList) {
		this.positionList = positionList;
	}

	@Override
	public String toString() {
		return "Result [positionList=" + positionList + "]";
	}
}
