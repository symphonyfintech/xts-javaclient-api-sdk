package com.sf.xts.api.sdk.marketdata.subscriptionRequest;

import java.util.Arrays;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.Instrument;

public class SubscribeResult {

    @SerializedName("mdp")
    @Expose
    private Number mdp;
    
    @SerializedName("quotesList")
    @Expose
    private Instrument[] quotesList = null;
    
    @SerializedName("listQuotes")
    @Expose
    private String[] listQuotes;
    
    @SerializedName("Remaining_Subscription_Count")
    @Expose
    private Number Remaining_Subscription_Count;

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
	 * @return Instruments
	 */
	public Instrument[] getQuotesList() {
		return quotesList;
	}

	/**
	 * It set quotesList
	 * @param quotesList Instruments
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
	
	/**
	 * It get Remaining_Subscription_Count
	 * @return Number
	 */
	public Number getRemaining_Subscription_Count() {
		return Remaining_Subscription_Count;
	}

	/**
	 * It set Remaining_Subscription_Count
	 * @param remaining_Subscription_Count Number
	 */
	public void setRemaining_Subscription_Count(Number remaining_Subscription_Count) {
		Remaining_Subscription_Count = remaining_Subscription_Count;
	}

	@Override
	public String toString() {
		return "Result [mdp=" + mdp + ", quotesList="
				+ Arrays.toString(quotesList) + ", listQuotes="
				+ Arrays.toString(listQuotes)
				+ ", Remaining_Subscription_Count="
				+ Remaining_Subscription_Count + "]";
	}
}
