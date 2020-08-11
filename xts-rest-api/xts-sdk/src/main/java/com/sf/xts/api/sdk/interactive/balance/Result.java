package com.sf.xts.api.sdk.interactive.balance;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

	@SerializedName("BalanceList")
    @Expose
    private List<BalanceList> balanceList = null;

    /**
     * it return list of BalanceList
     * @return list of BalanceList
     */
    public List<BalanceList> getBalanceList() {
        return balanceList;
    }

    /**
     * it set the list of BalanceList
     * @param balanceList list of BalanceList
     */
    public void setBalanceList(List<BalanceList> balanceList) {
        this.balanceList = balanceList;
    }

	@Override
	public String toString() {
		return "Result [balanceList=" + balanceList + "]";
	}

    
}
