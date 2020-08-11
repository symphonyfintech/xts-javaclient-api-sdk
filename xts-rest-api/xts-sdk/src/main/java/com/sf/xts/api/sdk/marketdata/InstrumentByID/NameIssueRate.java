package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NameIssueRate {

    @SerializedName("Name")
    @Expose
    private String name;

    /**
     * It get name 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * It set name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).toString();
    }

}
