package com.sf.xts.api.sdk.marketdata.series;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeriesResponse {

    @SerializedName("result")
    @Expose
    private List<String> result;
    
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
     * it return List of String
     * @return List of String
     */
    public List<String> getResult() {
        return result;
    }

    /**
     * it set the List of String
     * @param result List of String 
     */
    public void setResult(List<String> result) {
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
		return "SeriesResponse [result=" + result + ", code=" + code
				+ ", description=" + description + ", type=" + type + "]";
	}

	
}
