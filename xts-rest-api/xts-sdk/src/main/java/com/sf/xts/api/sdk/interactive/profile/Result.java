
package com.sf.xts.api.sdk.interactive.profile;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("IsInvestorClient")
    @Expose
    private Boolean isInvestorClient;
    @SerializedName("ClientId")
    @Expose
    private String clientId;
    @SerializedName("BranchId")
    @Expose
    private String branchId;
    @SerializedName("ClientName")
    @Expose
    private String clientName;
    @SerializedName("EmailId")
    @Expose
    private String emailId;
    @SerializedName("PAN")
    @Expose
    private String pAN;
    @SerializedName("ClientType")
    @Expose
    private Number clientType;
    @SerializedName("ClientStatus")
    @Expose
    private Number clientStatus;
    @SerializedName("Context")
    @Expose
    private Number context;
    @SerializedName("IncludeInAutoSquareoff")
    @Expose
    private Boolean includeInAutoSquareoff;
    @SerializedName("IsProClient")
    @Expose
    private Boolean isProClient;
    @SerializedName("IncludeInAutoSquareoffBlocked")
    @Expose
    private Boolean includeInAutoSquareoffBlocked;
    @SerializedName("OrderTypesAssigned")
    @Expose
    private Number orderTypesAssigned;
    @SerializedName("ProductsAssigned")
    @Expose
    private Number productsAssigned;
    @SerializedName("ResidentialAddress")
    @Expose
    private String residentialAddress;
    @SerializedName("OfficeAddress")
    @Expose
    private String officeAddress;
    @SerializedName("MobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("LastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("LastUpdatedBy")
    @Expose
    private String lastUpdatedBy;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("GroupName")
    @Expose
    private String groupName;
    @SerializedName("ClientBankInfoList")
    @Expose
    private List<Object> clientBankInfoList = null;
    @SerializedName("DealerCredential")
    @Expose
    private DealerCredential dealerCredential;
    @SerializedName("ClientExchangeDetailsList")
    @Expose
    private ClientExchangeDetailsList clientExchangeDetailsList;
    @SerializedName("ClientDealerMappingList")
    @Expose
    private List<ClientDealerMappingList> clientDealerMappingList = null;
    @SerializedName("Dealer")
    @Expose
    private Dealer dealer;
    @SerializedName("IsConvertToInvestorClient")
    @Expose
    private Boolean isConvertToInvestorClient;

    /**
     * it get the value of isInvestorClient
     * @return Boolean
     */
    public Boolean getIsInvestorClient() {
        return isInvestorClient;
    }

    /**
     * it set the value to isInvestorClient
     * @param isInvestorClient Boolean  
     */
    public void setIsInvestorClient(Boolean isInvestorClient) {
        this.isInvestorClient = isInvestorClient;
    }

    /**
     * it get the value of clientId
     * @return String
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * it set the value to clientId
     * @param clientId String 
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * it get the value of branchId
     * @return String
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * it set the value to branchId
     * @param branchId String 
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * it get the value of clientName
     * @return String
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * it set the value to clientName
     * @param clientName String
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * it get the value of emailId
     * @return String
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * it set the value to emailId 
     * @param emailId String 
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * it get the value of pAN
     * @return String
     */
    public String getPAN() {
        return pAN;
    }

    /**
     * it set the value to pAN
     * @param pAN String 
     */
    public void setPAN(String pAN) {
        this.pAN = pAN;
    }

    /**
     * it get the value of clientType
     * @return Number
     */
    public Number getClientType() {
        return clientType;
    }

    /**
     * it set the value to clientType
     * @param clientType  Number
     */
    public void setClientType(Number clientType) {
        this.clientType = clientType;
    }

    /**
     * it get the value of clientStatus
     * @return Number
     */
    public Number getClientStatus() {
        return clientStatus;
    }

    /**
     * it set the value to clientStatus
     * @param clientStatus Number 
     */
    public void setClientStatus(Number clientStatus) {
        this.clientStatus = clientStatus;
    }

    /**
     * it get the value of context
     * @return Number
     */
    public Number getContext() {
        return context;
    }

    /**
     * it set the value to context
     * @param context Number 
     */
    public void setContext(Number context) {
        this.context = context;
    }

    /**
     * it get the value of includeInAutoSquareoff
     * @return Boolean
     */
    public Boolean getIncludeInAutoSquareoff() {
        return includeInAutoSquareoff;
    }

    /**
     * it set the value to includeInAutoSquareoff
     * @param includeInAutoSquareoff Boolean 
     */
    public void setIncludeInAutoSquareoff(Boolean includeInAutoSquareoff) {
        this.includeInAutoSquareoff = includeInAutoSquareoff;
    }

    /**
     * it get the value of isProClient or not
     * @return Boolean
     */
    public Boolean getIsProClient() {
        return isProClient;
    }

    /**
     * it set the value to true / false
     * @param isProClient Boolean
     */
    public void setIsProClient(Boolean isProClient) {
        this.isProClient = isProClient;
    }

    /**
     * it get the value of includeInAutoSquareoffBlocked
     * @return Boolean
     */
    public Boolean getIncludeInAutoSquareoffBlocked() {
        return includeInAutoSquareoffBlocked;
    }

    /**
     * it set the value to true / false
     * @param includeInAutoSquareoffBlocked Boolean 
     */
    public void setIncludeInAutoSquareoffBlocked(Boolean includeInAutoSquareoffBlocked) {
        this.includeInAutoSquareoffBlocked = includeInAutoSquareoffBlocked;
    }

    /**
     * it get the value of orderTypesAssigned
     * @return Number
     */
    public Number getOrderTypesAssigned() {
        return orderTypesAssigned;
    }

    /**
     * it set the value to orderTypesAssigned
     * @param orderTypesAssigned Number
     */
    public void setOrderTypesAssigned(Number orderTypesAssigned) {
        this.orderTypesAssigned = orderTypesAssigned;
    }

    /**
     * it get the value of productsAssigned
     * @return Number
     */
    public Number getProductsAssigned() {
        return productsAssigned;
    }

    /**
     * it set the value to productsAssigned
     * @param productsAssigned Number 
     */
    public void setProductsAssigned(Number productsAssigned) {
        this.productsAssigned = productsAssigned;
    }

    /**
     * it get the value of residentialAddress
     * @return String
     */
    public String getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * it set the value to residentialAddress
     * @param residentialAddress String 
     */
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    /**
     * it get the value of officeAddress
     * @return String
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * it set the value to officeAddress
     * @param officeAddress String
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * it get the mobileNo
     * @return String
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * it set the mobileNo
     * @param mobileNo String
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * it get the value of lastUpdatedOn
     * @return String
     */
    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    /**
     * it set the value to lastUpdatedOn
     * @param lastUpdatedOn String 
     */
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    /**
     * it get the value of lastUpdatedBy
     * @return String
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * it set the value to lastUpdatedBy
     * @param lastUpdatedBy String 
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * it get the value of createdOn
     * @return String
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * it set the value to createdOn
     * @param createdOn String
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * it get the value of createdBy
     * @return String
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * it set the value to createdBy
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * it get the groupName
     * @return String
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * it set the value to groupName
     * @param groupName String 
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * it get the value of List of clientBankInfoList
     * @return List of clientBankInfoList
     */
    public List<Object> getClientBankInfoList() {
        return clientBankInfoList;
    }

    /**
     * it set the value to List of clientBankInfoList
     * @param clientBankInfoList List of clientBankInfoList
     */
    public void setClientBankInfoList(List<Object> clientBankInfoList) {
        this.clientBankInfoList = clientBankInfoList;
    }

    /**
     * it get the value of dealerCredential
     * @return DealerCredential
     */
    public DealerCredential getDealerCredential() {
        return dealerCredential;
    }

    /**
     * it set the value to dealerCredential
     * @param dealerCredential  DealerCredential
     */
    public void setDealerCredential(DealerCredential dealerCredential) {
        this.dealerCredential = dealerCredential;
    }

    /**
     * it get the value of ClientExchangeDetailsList
     * @return ClientExchangeDetailsList
     */
    public ClientExchangeDetailsList getClientExchangeDetailsList() {
        return clientExchangeDetailsList;
    }

    /**
     * it set the value to ClientExchangeDetailsList
     * @param clientExchangeDetailsList ClientExchangeDetailsList
     */
    public void setClientExchangeDetailsList(ClientExchangeDetailsList clientExchangeDetailsList) {
        this.clientExchangeDetailsList = clientExchangeDetailsList;
    }

    /**
     * it get the List of clientDealerMappingList
     * @return List of clientDealerMappingList
     */
    public List<ClientDealerMappingList> getClientDealerMappingList() {
        return clientDealerMappingList;
    }

    /**
     * it set the value to List of clientDealerMappingList
     * @param clientDealerMappingList List of clientDealerMappingList
     */
    public void setClientDealerMappingList(List<ClientDealerMappingList> clientDealerMappingList) {
        this.clientDealerMappingList = clientDealerMappingList;
    }

    /**
     * it get the value of dealer
     * @return Dealer
     */
    public Dealer getDealer() {
        return dealer;
    }

    /**
     * it set the value to dealer
     * @param dealer Dealer 
     */
    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    /**
     * it get the value of isConvertToInvestorClient
     * @return Boolean
     */
    public Boolean getIsConvertToInvestorClient() {
        return isConvertToInvestorClient;
    }

    /**
     * it set the value to true / false
     * @param isConvertToInvestorClient Boolean
     */
    public void setIsConvertToInvestorClient(Boolean isConvertToInvestorClient) {
        this.isConvertToInvestorClient = isConvertToInvestorClient;
    }

	@Override
	public String toString() {
		return "Result [isInvestorClient=" + isInvestorClient + ", clientId="
				+ clientId + ", branchId=" + branchId + ", clientName="
				+ clientName + ", emailId=" + emailId + ", pAN=" + pAN
				+ ", clientType=" + clientType + ", clientStatus="
				+ clientStatus + ", context=" + context
				+ ", includeInAutoSquareoff=" + includeInAutoSquareoff
				+ ", isProClient=" + isProClient
				+ ", includeInAutoSquareoffBlocked="
				+ includeInAutoSquareoffBlocked + ", orderTypesAssigned="
				+ orderTypesAssigned + ", productsAssigned=" + productsAssigned
				+ ", residentialAddress=" + residentialAddress
				+ ", officeAddress=" + officeAddress + ", mobileNo=" + mobileNo
				+ ", lastUpdatedOn=" + lastUpdatedOn + ", lastUpdatedBy="
				+ lastUpdatedBy + ", createdOn=" + createdOn + ", createdBy="
				+ createdBy + ", groupName=" + groupName
				+ ", clientBankInfoList=" + clientBankInfoList
				+ ", dealerCredential=" + dealerCredential
				+ ", clientExchangeDetailsList=" + clientExchangeDetailsList
				+ ", clientDealerMappingList=" + clientDealerMappingList
				+ ", dealer=" + dealer + ", isConvertToInvestorClient="
				+ isConvertToInvestorClient + "]";
	}
}
