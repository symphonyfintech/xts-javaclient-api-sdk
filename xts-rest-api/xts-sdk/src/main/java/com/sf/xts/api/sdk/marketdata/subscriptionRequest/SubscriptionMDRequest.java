package com.sf.xts.api.sdk.marketdata.subscriptionRequest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.Instrument;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SubscriptionMDRequest {

    @SerializedName("instruments")
    @Expose
    private List<Instrument> instruments = null;
    @SerializedName("xtsMessageCode")
    @Expose
    private Number xtsMessageCode;

    /**
     * It get list of instruments
     * @return list of instruments
     */
    public List<Instrument> getInstruments() {
        return instruments;
    }

    /**
     * It set list of instruments 
     * @param instruments list of instruments
     */
    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    /**
     * It get xtsMessageCode
     * @return Number
     */
    public Number getXtsMessageCode() {
        return xtsMessageCode;
    }

    /**
     * It set xtsMessageCode
     * @param xtsMessageCode Number
     */
    public void setXtsMessageCode(Number xtsMessageCode) {
        this.xtsMessageCode = xtsMessageCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instruments", instruments).append("xtsMessageCode", xtsMessageCode).toString();
    }
}
