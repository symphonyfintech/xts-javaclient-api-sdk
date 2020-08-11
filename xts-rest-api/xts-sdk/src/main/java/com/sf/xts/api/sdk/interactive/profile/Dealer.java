
package com.sf.xts.api.sdk.interactive.profile;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Dealer {

    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("DealerName")
    @Expose
    private String dealerName;
    @SerializedName("BranchId")
    @Expose
    private String branchId;
    @SerializedName("EmailId")
    @Expose
    private String emailId;
    @SerializedName("PAN")
    @Expose
    private String pAN;
    @SerializedName("IncludeInAutoSquareoff")
    @Expose
    private Boolean includeInAutoSquareoff;
    @SerializedName("IncludeInAutoSquareoffBlock")
    @Expose
    private Boolean includeInAutoSquareoffBlock;
    @SerializedName("OrderTypesAssigned")
    @Expose
    private Number orderTypesAssigned;
    @SerializedName("ProductsAssigned")
    @Expose
    private Number productsAssigned;
    @SerializedName("Pincode")
    @Expose
    private String pincode;
    @SerializedName("ResidentialAddress")
    @Expose
    private String residentialAddress;
    @SerializedName("LastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("CreatedPrivilegeBy")
    @Expose
    private Number createdPrivilegeBy;
    @SerializedName("Count")
    @Expose
    private Number count;
    @SerializedName("DealerExchangeDetailsList")
    @Expose
    private List<DealerExchangeDetailsList> dealerExchangeDetailsList = null;
    @SerializedName("LastUpdatedBy")
    @Expose
    private String lastUpdatedBy;
    @SerializedName("MobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("IsInvestorClient")
    @Expose
    private Boolean isInvestorClient;
    @SerializedName("AllowedProOrder")
    @Expose
    private Boolean allowedProOrder;
    @SerializedName("ProClientId")
    @Expose
    private String proClientId;
    @SerializedName("DealerCredentialObj")
    @Expose
    private DealerCredentialObj dealerCredentialObj;
    @SerializedName("ClientDealerMappingList")
    @Expose
    private List<ClientDealerMappingList_> clientDealerMappingList = null;

    /**
     * it return dealerId
     * @return String
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * it set the dealerId
     * @param dealerId String
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * it return dealerName
     * @return String
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * it set the dealerName
     * @param dealerName String
     */
    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    /**
     * it return branchId
     * @return String
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * it set the branchId
     * @param branchId String
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * it return emailId
     * @return String
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * it set the emailId
     * @param emailId String
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * it return pAN
     * @return String
     */
    public String getPAN() {
        return pAN;
    }

    /**
     * it set the pAN
     * @param pAN String
     */
    public void setPAN(String pAN) {
        this.pAN = pAN;
    }

    /**
     * it return includeInAutoSquareoff
     * @return Boolean
     */
    public Boolean getIncludeInAutoSquareoff() {
        return includeInAutoSquareoff;
    }

    /**
     * it set the includeInAutoSquareoff
     * @param includeInAutoSquareoff Boolean
     */
    public void setIncludeInAutoSquareoff(Boolean includeInAutoSquareoff) {
        this.includeInAutoSquareoff = includeInAutoSquareoff;
    }

    /**
     * it return includeInAutoSquareoffBlock
     * @return Boolean
     */
    public Boolean getIncludeInAutoSquareoffBlock() {
        return includeInAutoSquareoffBlock;
    }

    /**
     * it set the includeInAutoSquareoffBlock
     * @param includeInAutoSquareoffBlock Boolean
     */
    public void setIncludeInAutoSquareoffBlock(Boolean includeInAutoSquareoffBlock) {
        this.includeInAutoSquareoffBlock = includeInAutoSquareoffBlock;
    }

    /**
     * it return orderTypesAssigned
     * @return Number
     */
    public Number getOrderTypesAssigned() {
        return orderTypesAssigned;
    }

    /**
     * it set the orderTypesAssigned
     * @param orderTypesAssigned Number
     */
    public void setOrderTypesAssigned(Number orderTypesAssigned) {
        this.orderTypesAssigned = orderTypesAssigned;
    }

    /**
     * it return productsAssigned
     * @return Number
     */
    public Number getProductsAssigned() {
        return productsAssigned;
    }

    /**
     * it set the productsAssigned
     * @param productsAssigned Number
     */
    public void setProductsAssigned(Number productsAssigned) {
        this.productsAssigned = productsAssigned;
    }

    /**
     * it return pincode
     * @return String
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * it set the pincode
     * @param pincode String
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * it return residentialAddress
     * @return String
     */
    public String getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * it set the residentialAddress
     * @param residentialAddress String
     */
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    /**
     * it return lastUpdatedOn
     * @return String
     */
    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    /**
     * it set the lastUpdatedOn
     * @param lastUpdatedOn String
     */
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    /**
     * it return createdOn
     * @return String
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * it set the createdOn
     * @param createdOn String
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * it return createdBy
     * @return String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * it set the createdBy
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * it return createdPrivilegeBy
     * @return Number
     */
    public Number getCreatedPrivilegeBy() {
        return createdPrivilegeBy;
    }

    /**
     * it set the createdPrivilegeBy
     * @param createdPrivilegeBy Number
     */
    public void setCreatedPrivilegeBy(Number createdPrivilegeBy) {
        this.createdPrivilegeBy = createdPrivilegeBy;
    }

    /**
     * it return count
     * @return Number
     */
    public Number getCount() {
        return count;
    }

    /**
     * it set the count
     * @param count Number
     */
    public void setCount(Number count) {
        this.count = count;
    }

    /**
     * it return dealerExchangeDetailsList
     * @return dealerExchangeDetailsList
     */
    public List<DealerExchangeDetailsList> getDealerExchangeDetailsList() {
        return dealerExchangeDetailsList;
    }

    /**
     * it set the dealerExchangeDetailsList
     * @param dealerExchangeDetailsList dealerExchangeDetailsList
     */
    public void setDealerExchangeDetailsList(List<DealerExchangeDetailsList> dealerExchangeDetailsList) {
        this.dealerExchangeDetailsList = dealerExchangeDetailsList;
    }

    /**
     * it return lastUpdatedBy
     * @return String
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * it set the lastUpdatedBy
     * @param lastUpdatedBy String
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * it return mobileNumber
     * @return String
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * it set the mobileNumber
     * @param mobileNumber String
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * it return isInvestorClient
     * @return Boolean
     */
    public Boolean getIsInvestorClient() {
        return isInvestorClient;
    }

    /**
     * it set the isInvestorClient
     * @param isInvestorClient Boolean
     */
    public void setIsInvestorClient(Boolean isInvestorClient) {
        this.isInvestorClient = isInvestorClient;
    }

    /**
     * it return allowedProOrder
     * @return Boolean
     */
    public Boolean getAllowedProOrder() {
        return allowedProOrder;
    }

    /**
     * it set the allowedProOrder
     * @param allowedProOrder Boolean
     */
    public void setAllowedProOrder(Boolean allowedProOrder) {
        this.allowedProOrder = allowedProOrder;
    }

    /**
     * it return proClientId
     * @return String
     */
    public String getProClientId() {
        return proClientId;
    }

    /**
     * it set the proClientId
     * @param proClientId String
     */
    public void setProClientId(String proClientId) {
        this.proClientId = proClientId;
    }

    /**
     * it return dealerCredentialObj
     * @return DealerCredentialObj
     */
    public DealerCredentialObj getDealerCredentialObj() {
        return dealerCredentialObj;
    }

    /**
     * it set the dealerCredentialObj
     * @param dealerCredentialObj DealerCredentialObj
     */
    public void setDealerCredentialObj(DealerCredentialObj dealerCredentialObj) {
        this.dealerCredentialObj = dealerCredentialObj;
    }

    /**
     * it return List of clientDealerMappingList
     * @return List of clientDealerMappingList
     */
    public List<ClientDealerMappingList_> getClientDealerMappingList() {
        return clientDealerMappingList;
    }

    /**
     * it set the List of clientDealerMappingList
     * @param clientDealerMappingList List of clientDealerMappingList
     */
    public void setClientDealerMappingList(List<ClientDealerMappingList_> clientDealerMappingList) {
        this.clientDealerMappingList = clientDealerMappingList;
    }

}
