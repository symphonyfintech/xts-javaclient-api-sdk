
package com.sf.xts.api.sdk.interactive.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DealerCredential {

    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("MacId")
    @Expose
    private String macId;
    @SerializedName("ServerVerficationImageId")
    @Expose
    private Number serverVerficationImageId;
    @SerializedName("LoginPassword")
    @Expose
    private String loginPassword;
    @SerializedName("TransactionPassword")
    @Expose
    private String transactionPassword;
    @SerializedName("Enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("EnabledOn")
    @Expose
    private String enabledOn;
    @SerializedName("ReasonDisabled")
    @Expose
    private Number reasonDisabled;
    @SerializedName("DisabledOn")
    @Expose
    private String disabledOn;
    @SerializedName("InvalidAttempts")
    @Expose
    private Number invalidAttempts;
    @SerializedName("Invalid2FAAttempts")
    @Expose
    private Number invalid2FAAttempts;
    @SerializedName("Level2FAChangedOn")
    @Expose
    private String level2FAChangedOn;
    @SerializedName("TransactionPasswordChangedOn")
    @Expose
    private String transactionPasswordChangedOn;
    @SerializedName("LoginPasswordChangedOn")
    @Expose
    private String loginPasswordChangedOn;
    @SerializedName("LastSuccessfulLoginOn")
    @Expose
    private String lastSuccessfulLoginOn;
    @SerializedName("LastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("DaysOfWarning")
    @Expose
    private Number daysOfWarning;
    @SerializedName("ClientId")
    @Expose
    private String clientId;
    @SerializedName("ReGenLoginPassword")
    @Expose
    private Boolean reGenLoginPassword;
    @SerializedName("ReGenTransPassword")
    @Expose
    private Boolean reGenTransPassword;
    @SerializedName("Reset2FA")
    @Expose
    private Boolean reset2FA;
    @SerializedName("DateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("UserAccessType")
    @Expose
    private Number userAccessType;
    @SerializedName("Privilege")
    @Expose
    private Number privilege;
    @SerializedName("RoleName")
    @Expose
    private String roleName;
    @SerializedName("ClientOverview")
    @Expose
    private Boolean clientOverview;
    @SerializedName("MaxScripPerSession")
    @Expose
    private Number maxScripPerSession;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;

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
     * it return macId
     * @return String
     */
    public String getMacId() {
        return macId;
    }

    /**
     * it set the macId
     * @param macId String
     */
    public void setMacId(String macId) {
        this.macId = macId;
    }

    /**
     * it return serverVerficationImageId
     * @return Number
     */
    public Number getServerVerficationImageId() {
        return serverVerficationImageId;
    }

    /**
     * it set the serverVerficationImageId
     * @param serverVerficationImageId Number
     */
    public void setServerVerficationImageId(Number serverVerficationImageId) {
        this.serverVerficationImageId = serverVerficationImageId;
    }

    /**
     * it return loginPassword
     * @return String
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * it set the loginPassword
     * @param loginPassword String
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * it return transactionPassword
     * @return String
     */
    public String getTransactionPassword() {
        return transactionPassword;
    }

    /**
     * it set the transactionPassword
     * @param transactionPassword String
     */
    public void setTransactionPassword(String transactionPassword) {
        this.transactionPassword = transactionPassword;
    }

    /**
     * it return true / false
     * @return Boolean
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * it set the true / false
     * @param enabled Boolean
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * it return enabledOn
     * @return String
     */
    public String getEnabledOn() {
        return enabledOn;
    }

    /**
     * it set the enabledOn
     * @param enabledOn String
     */
    public void setEnabledOn(String enabledOn) {
        this.enabledOn = enabledOn;
    }

    /**
     * it return reasonDisabled
     * @return Number
     */
    public Number getReasonDisabled() {
        return reasonDisabled;
    }

    /**
     * it set the reasonDisabled
     * @param reasonDisabled Number
     */
    public void setReasonDisabled(Number reasonDisabled) {
        this.reasonDisabled = reasonDisabled;
    }

    /**
     * it return disabledOn
     * @return String
     */
    public String getDisabledOn() {
        return disabledOn;
    }

    /**
     * it set the disabledOn
     * @param disabledOn String
     */
    public void setDisabledOn(String disabledOn) {
        this.disabledOn = disabledOn;
    }

    /**
     * it return invalidAttempts
     * @return Number
     */
    public Number getInvalidAttempts() {
        return invalidAttempts;
    }

    /**
     * it set the invalidAttempts
     * @param invalidAttempts Number
     */
    public void setInvalidAttempts(Number invalidAttempts) {
        this.invalidAttempts = invalidAttempts;
    }

    /**
     * it return invalid2FAAttempts
     * @return Number
     */
    public Number getInvalid2FAAttempts() {
        return invalid2FAAttempts;
    }

    /**
     * it set the invalid2FAAttempts
     * @param invalid2FAAttempts Number
     */
    public void setInvalid2FAAttempts(Number invalid2FAAttempts) {
        this.invalid2FAAttempts = invalid2FAAttempts;
    }

    /**
     * it return level2FAChangedOn
     * @return String
     */
    public String getLevel2FAChangedOn() {
        return level2FAChangedOn;
    }

    /**
     * it set the level2FAChangedOn
     * @param level2FAChangedOn String
     */
    public void setLevel2FAChangedOn(String level2FAChangedOn) {
        this.level2FAChangedOn = level2FAChangedOn;
    }

    /**
     * it return transactionPasswordChangedOn
     * @return String
     */
    public String getTransactionPasswordChangedOn() {
        return transactionPasswordChangedOn;
    }

    /**
     * it set the transactionPasswordChangedOn
     * @param transactionPasswordChangedOn String
     */
    public void setTransactionPasswordChangedOn(String transactionPasswordChangedOn) {
        this.transactionPasswordChangedOn = transactionPasswordChangedOn;
    }

    /**
     * it return loginPasswordChangedOn
     * @return String
     */
    public String getLoginPasswordChangedOn() {
        return loginPasswordChangedOn;
    }

    /**
     * it set the loginPasswordChangedOn
     * @param loginPasswordChangedOn String
     */
    public void setLoginPasswordChangedOn(String loginPasswordChangedOn) {
        this.loginPasswordChangedOn = loginPasswordChangedOn;
    }

    /**
     * it return lastSuccessfulLoginOn
     * @return String
     */
    public String getLastSuccessfulLoginOn() {
        return lastSuccessfulLoginOn;
    }

    /**
     * it set the lastSuccessfulLoginOn
     * @param lastSuccessfulLoginOn String
     */
    public void setLastSuccessfulLoginOn(String lastSuccessfulLoginOn) {
        this.lastSuccessfulLoginOn = lastSuccessfulLoginOn;
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
     * it return daysOfWarning
     * @return Number
     */
    public Number getDaysOfWarning() {
        return daysOfWarning;
    }

    /**
     * it set the daysOfWarning
     * @param daysOfWarning Number
     */
    public void setDaysOfWarning(Number daysOfWarning) {
        this.daysOfWarning = daysOfWarning;
    }

    /**
     * it return clientId
     * @return String
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * it set the clientId
     * @param clientId String
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * it return reGenLoginPassword
     * @return Boolean
     */
    public Boolean getReGenLoginPassword() {
        return reGenLoginPassword;
    }

    /**
     * it set the reGenLoginPassword
     * @param reGenLoginPassword Boolean
     */
    public void setReGenLoginPassword(Boolean reGenLoginPassword) {
        this.reGenLoginPassword = reGenLoginPassword;
    }

    /**
     * it return reGenTransPassword
     * @return Boolean
     */
    public Boolean getReGenTransPassword() {
        return reGenTransPassword;
    }

    /**
     * it set the reGenTransPassword
     * @param reGenTransPassword Boolean
     */
    public void setReGenTransPassword(Boolean reGenTransPassword) {
        this.reGenTransPassword = reGenTransPassword;
    }

    /**
     * it return reset2FA
     * @return Boolean
     */
    public Boolean getReset2FA() {
        return reset2FA;
    }

    /**
     * it set the reset2FA
     * @param reset2FA Boolean
     */
    public void setReset2FA(Boolean reset2FA) {
        this.reset2FA = reset2FA;
    }

    /**
     * it return dateOfBirth
     * @return String
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * it set the dateOfBirth
     * @param dateOfBirth String
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * it return userAccessType
     * @return Number
     */
    public Number getUserAccessType() {
        return userAccessType;
    }

    /**
     * it set the userAccessType
     * @param userAccessType Number
     */
    public void setUserAccessType(Number userAccessType) {
        this.userAccessType = userAccessType;
    }

    /**
     * it return privilege
     * @return Number
     */
    public Number getPrivilege() {
        return privilege;
    }

    /**
     * it set the privilege
     * @param privilege Number
     */
    public void setPrivilege(Number privilege) {
        this.privilege = privilege;
    }

    /**
     * it return roleName
     * @return String
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * it set the roleName
     * @param roleName String
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * it return clientOverview
     * @return Boolean
     */
    public Boolean getClientOverview() {
        return clientOverview;
    }

    /**
     * it set the clientOverview
     * @param clientOverview Boolean
     */
    public void setClientOverview(Boolean clientOverview) {
        this.clientOverview = clientOverview;
    }

    /**
     * it return maxScripPerSession
     * @return Number
     */
    public Number getMaxScripPerSession() {
        return maxScripPerSession;
    }

    /**
     * it set the maxScripPerSession
     * @param maxScripPerSession Number
     */
    public void setMaxScripPerSession(Number maxScripPerSession) {
        this.maxScripPerSession = maxScripPerSession;
    }

    /**
     * it return iPAddress
     * @return String
     */
    public String getIPAddress() {
        return iPAddress;
    }

    /**
     * it set the iPAddress
     * @param iPAddress String
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

}
