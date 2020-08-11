package com.sf.xts.api.sdk.interactive.cancelOrder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CancelOrderResponse {

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
	 * it return code
	 * @return String
	 */
	public String getCode() {
        return code;
    }

    /**
     * it set code
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
     * it set description
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
     * it set type
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Position [code=" + code
				+ ", description=" + description + ", type=" + type + "]";
	}
}
