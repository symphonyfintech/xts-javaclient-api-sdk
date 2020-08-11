package com.sf.xts.api.sdk.marketdata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Instrument {

    @SerializedName("exchangeSegment")
    @Expose
    private Number exchangeSegment;
    
    @SerializedName("exchangeInstrumentID")
    @Expose
    private Number exchangeInstrumentID;
    
    

    /**
     * It get exchangeSegment
     * @return Number
     */
    public Number getExchangeSegment() {
        return exchangeSegment;
    }

    /**
     * It set exchangeSegment
     * @param exchangeSegment Number
     */
    public void setExchangeSegment(Number exchangeSegment) {
        this.exchangeSegment = exchangeSegment;
    }

    /**
     * It get exchangeInstrumentID
     * @return Number
     */
    public Number getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    /**
     * It set exchangeInstrumentID
     * @param exchangeInstrumentID Number
     */
    public void setExchangeInstrumentID(Number exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }



    
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("exchangeSegment", exchangeSegment).append("exchangeInstrumentID", exchangeInstrumentID).toString();
    }

}
