package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CorporateAction {

    @SerializedName("Value")
    @Expose
    private String value;
    
    @SerializedName("Name")
    @Expose
    private NameCorporateAction name;

    /**
     * It get value
     * @return String
     */
    public String getValue() {
        return value;
    }

    /**
     * It set value
     * @param value String
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * It get name
     * @return NameCorporateAction
     */
    public NameCorporateAction getName() {
        return name;
    }

    /**
     * It set name
     * @param name NameCorporateAction
     */
    public void setName(NameCorporateAction name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("name", name).toString();
    }

}
