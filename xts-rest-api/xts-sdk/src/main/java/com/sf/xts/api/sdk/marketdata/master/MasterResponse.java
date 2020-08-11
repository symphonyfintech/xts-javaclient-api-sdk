package com.sf.xts.api.sdk.marketdata.master;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MasterResponse {

    @SerializedName("result")
    @Expose
    private String result;
    
    @SerializedName("code")
    @Expose
    private String code;
    
    @SerializedName("description")
    @Expose
    private String description;
    
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * it return String
     * @return String
     */
    public String getResult() {
        return result;
    }

    /**
     * it set the String
     * @param result String 
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * it return code
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     * it set the code
     * @param code String
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * it return description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * it set the description
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * it return type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * it set the type
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("result", result).append("code", code).append("description", description).append("type", type).toString();
    }

}
