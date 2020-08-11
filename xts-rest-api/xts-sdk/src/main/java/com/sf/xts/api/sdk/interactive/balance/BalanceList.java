
package com.sf.xts.api.sdk.interactive.balance;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BalanceList {

    @SerializedName("limitHeader")
    @Expose
    private String limitHeader;
    
    @SerializedName("limitObject")
    @Expose
    private LimitObject limitObject;

    /**
     * it return limitHeader
     * @return String
     */
    public String getLimitHeader() {
        return limitHeader;
    }

    /**
     * it set the limitHeader
     * @param limitHeader String
     */
    public void setLimitHeader(String limitHeader) {
        this.limitHeader = limitHeader;
    }

    /**
     * it return limitObject
     * @return LimitObject
     */
    public LimitObject getLimitObject() {
        return limitObject;
    }

    /**
     * it set the limitObject
     * @param limitObject LimitObject
     */
    public void setLimitObject(LimitObject limitObject) {
        this.limitObject = limitObject;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("limitHeader", limitHeader).append("limitObject", limitObject).toString();
    }

}
