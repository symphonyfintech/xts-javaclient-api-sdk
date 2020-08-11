
package com.sf.xts.api.sdk.interactive.orderbook;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OrderBook {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    /**
     *  it return list of Result of order Book
     * @return List of Result
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     *  it set list of Result for orderBook
     * @param result List of Result
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("result", result).toString();
    }
}
