
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientExchangeDetailsList {

    @SerializedName("NSECM")
    @Expose
    private NSECM nSECM;
    @SerializedName("NSEFO")
    @Expose
    private NSEFO nSEFO;
    @SerializedName("NSECD")
    @Expose
    private NSECD nSECD;

    /**
     * it return NSECM
     * @return NSECM
     */
    public NSECM getNSECM() {
        return nSECM;
    }

    /**
     * it set value to NSECM
     * @param nSECM NSECM
     */
    public void setNSECM(NSECM nSECM) {
        this.nSECM = nSECM;
    }

    /**
     * it return NSEFO
     * @return NSEFO
     */
    public NSEFO getNSEFO() {
        return nSEFO;
    }

    /**
     * it set value to NSEFO
     * @param nSEFO NSEFO
     */
    public void setNSEFO(NSEFO nSEFO) {
        this.nSEFO = nSEFO;
    }

    /**
     * it return NSECD
     * @return NSECD
     */
    public NSECD getNSECD() {
        return nSECD;
    }

    /**
     * it set value to NSECD
     * @param nSECD NSECD
     */
    public void setNSECD(NSECD nSECD) {
        this.nSECD = nSECD;
    }

}
