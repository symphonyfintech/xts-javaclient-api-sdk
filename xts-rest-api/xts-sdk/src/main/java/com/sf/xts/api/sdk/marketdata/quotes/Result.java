package com.sf.xts.api.sdk.marketdata.quotes;

import java.util.Arrays;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.Instrument;

public class Result {

    @SerializedName("mdp")
    @Expose
    private Number mdp;
    
    @SerializedName("quotesList")
    @Expose
    private Instrument[] quotesList = null;
    
    @SerializedName("listQuotes")
    @Expose
    private String[] listQuotes;

	/**
	 * It get mdp
	 * @return Number
	 */
	public Number getMdp() {
		return mdp;
	}

	/**
	 * It set mdp
	 * @param mdp Number
	 */
	public void setMdp(Number mdp) {
		this.mdp = mdp;
	}

	/**
	 * It get quotesList
	 * @return Instrument
	 */
	public Instrument[] getQuotesList() {
		return quotesList;
	}

	/**
	 * It set quotesList
	 * @param quotesList Instrument
	 */
	public void setQuotesList(Instrument[] quotesList) {
		this.quotesList = quotesList;
	}

	/**
	 * It get listQuotes
	 * @return String array
	 */
	public String[] getListQuotes() {
		return listQuotes;
	}

	/**
	 * It set listQuotes
	 * @param listQuotes String array
	 */
	public void setListQuotes(String[] listQuotes) {
		this.listQuotes = listQuotes;
	}

	@Override
	public String toString() {
		return "Result [mdp=" + mdp + ", quotesList=" + quotesList
				+ ", listQuotes=" + listQuotes + "]";
	}

	
}
