package com.sf.xts.api.sdk.interactive.placeCoverOrder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("EntryAppOrderID")
    @Expose
    private String EntryAppOrderID;
    
    @SerializedName("ExitAppOrderID")
    @Expose
    private String ExitAppOrderID;

	/**
	 * it return entryAppOrderID
	 * @return String
	 */
	public String getEntryAppOrderID() {
		return EntryAppOrderID;
	}

	/**
	 * it set entryAppOrderID
	 * @param entryAppOrderID String
	 */
	public void setEntryAppOrderID(String entryAppOrderID) {
		EntryAppOrderID = entryAppOrderID;
	}

	/**
	 * it return exitAppOrderID
	 * @return String
	 */
	public String getExitAppOrderID() {
		return ExitAppOrderID;
	}

	/**
	 * it setexitAppOrderID
	 * @param exitAppOrderID String
	 */
	public void setExitAppOrderID(String exitAppOrderID) {
		ExitAppOrderID = exitAppOrderID;
	}

	@Override
	public String toString() {
		return "Result [EntryAppOrderID=" + EntryAppOrderID
				+ ", ExitAppOrderID=" + ExitAppOrderID + "]";
	}
}
