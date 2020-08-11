package com.sf.xts.api.sdk.marketdata.InstrumentByID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedMarketProperties {

    @SerializedName("CallAuctionIndicator")
    @Expose
    private CallAuctionIndicator callAuctionIndicator;
    
    @SerializedName("BookClosureEndDate")
    @Expose
    private BookClosureEndDate bookClosureEndDate;
    
    @SerializedName("InterestPaymentDate")
    @Expose
    private InterestPaymentDate interestPaymentDate;
    
    @SerializedName("RecordDate")
    @Expose
    private RecordDate recordDate;
    
    @SerializedName("NoDeliveryEndDate")
    @Expose
    private NoDeliveryEndDate noDeliveryEndDate;
    
    @SerializedName("ListingDate")
    @Expose
    private ListingDate listingDate;
    
    @SerializedName("IssueRate")
    @Expose
    private IssueRate issueRate;
    
    @SerializedName("VARMargin")
    @Expose
    private VARMargin vARMargin;
    
    @SerializedName("WarningPercent")
    @Expose
    private WarningPercent warningPercent;
    
    @SerializedName("IssueStartDate")
    @Expose
    private IssueStartDate issueStartDate;
    
    @SerializedName("CompanyName")
    @Expose
    private CompanyName companyName;
    
    @SerializedName("IssueMaturityDate")
    @Expose
    private IssueMaturityDate issueMaturityDate;
    
    @SerializedName("NoDeliveryStartDate")
    @Expose
    private NoDeliveryStartDate noDeliveryStartDate;
    
    @SerializedName("ReservedIdentifier")
    @Expose
    private ReservedIdentifier reservedIdentifier;
    
    @SerializedName("UniqueKey")
    @Expose
    private UniqueKey uniqueKey;
    
    @SerializedName("Remarks")
    @Expose
    private Remarks remarks;
    
    @SerializedName("ExpulsionDate")
    @Expose
    private ExpulsionDate expulsionDate;
    
    @SerializedName("ExDate")
    @Expose
    private ExDate exDate;
    
    @SerializedName("ReAdmissionDate")
    @Expose
    private ReAdmissionDate reAdmissionDate;
    
    @SerializedName("CorporateAction")
    @Expose
    private CorporateAction corporateAction;
    
    @SerializedName("SettlementNo")
    @Expose
    private SettlementNo settlementNo;
    
    @SerializedName("BookClosureStartDate")
    @Expose
    private BookClosureStartDate bookClosureStartDate;
    
    @SerializedName("MarketType")
    @Expose
    private MarketType marketType;
    
    @SerializedName("Margin")
    @Expose
    private Margin margin;

    /**
     * It get callAuctionIndicator
     * @return CallAuctionIndicator
     */
    public CallAuctionIndicator getCallAuctionIndicator() {
        return callAuctionIndicator;
    }

    /**
     * It set callAuctionIndicator
     * @param callAuctionIndicator CallAuctionIndicator
     */
    public void setCallAuctionIndicator(CallAuctionIndicator callAuctionIndicator) {
        this.callAuctionIndicator = callAuctionIndicator;
    }

    /**
     * It get bookClosureEndDate
     * @return BookClosureEndDate
     */
    public BookClosureEndDate getBookClosureEndDate() {
        return bookClosureEndDate;
    }

    /**
     * It set bookClosureEndDate
     * @param bookClosureEndDate BookClosureEndDate
     */
    public void setBookClosureEndDate(BookClosureEndDate bookClosureEndDate) {
        this.bookClosureEndDate = bookClosureEndDate;
    }

    /**
     * It get interestPaymentDate
     * @return InterestPaymentDate
     */
    public InterestPaymentDate getInterestPaymentDate() {
        return interestPaymentDate;
    }

    /**
     * It set interestPaymentDate
     * @param interestPaymentDate InterestPaymentDate
     */
    public void setInterestPaymentDate(InterestPaymentDate interestPaymentDate) {
        this.interestPaymentDate = interestPaymentDate;
    }

    /**
     * It get recordDate
     * @return RecordDate
     */
    public RecordDate getRecordDate() {
        return recordDate;
    }

    /**
     * It set recordDate
     * @param recordDate RecordDate
     */
    public void setRecordDate(RecordDate recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * It get noDeliveryEndDate
     * @return NoDeliveryEndDate
     */
    public NoDeliveryEndDate getNoDeliveryEndDate() {
        return noDeliveryEndDate;
    }

    /**
     * It set noDeliveryEndDate
     * @param noDeliveryEndDate NoDeliveryEndDate
     */
    public void setNoDeliveryEndDate(NoDeliveryEndDate noDeliveryEndDate) {
        this.noDeliveryEndDate = noDeliveryEndDate;
    }

    /**
     * It get listingDate
     * @return ListingDate
     */
    public ListingDate getListingDate() {
        return listingDate;
    }

    /**
     * It set listingDate
     * @param listingDate ListingDate
     */
    public void setListingDate(ListingDate listingDate) {
        this.listingDate = listingDate;
    }

    /**
     * It get issueRate
     * @return IssueRate
     */
    public IssueRate getIssueRate() {
        return issueRate;
    }

    /**
     * It set issueRate
     * @param issueRate IssueRate
     */
    public void setIssueRate(IssueRate issueRate) {
        this.issueRate = issueRate;
    }

    /**
     * It get vARMargin
     * @return VARMargin
     */
    public VARMargin getVARMargin() {
        return vARMargin;
    }

    /**
     * It set vARMargin
     * @param vARMargin VARMargin
     */
    public void setVARMargin(VARMargin vARMargin) {
        this.vARMargin = vARMargin;
    }

    /**
     * It get warningPercent
     * @return WarningPercent
     */
    public WarningPercent getWarningPercent() {
        return warningPercent;
    }

    /**
     * It set warningPercent
     * @param warningPercent WarningPercent
     */
    public void setWarningPercent(WarningPercent warningPercent) {
        this.warningPercent = warningPercent;
    }

    /**
     * It get issueStartDate
     * @return IssueStartDate
     */
    public IssueStartDate getIssueStartDate() {
        return issueStartDate;
    }

    /**
     * It set issueStartDate
     * @param issueStartDate IssueStartDate
     */
    public void setIssueStartDate(IssueStartDate issueStartDate) {
        this.issueStartDate = issueStartDate;
    }

    /**
     * It get companyName
     * @return CompanyName
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * It set companyName
     * @param companyName CompanyName
     */
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    /**
     * It get issueMaturityDate
     * @return IssueMaturityDate
     */
    public IssueMaturityDate getIssueMaturityDate() {
        return issueMaturityDate;
    }

    /**
     * It set issueMaturityDate
     * @param issueMaturityDate IssueMaturityDate
     */
    public void setIssueMaturityDate(IssueMaturityDate issueMaturityDate) {
        this.issueMaturityDate = issueMaturityDate;
    }

    /**
     * It get noDeliveryStartDate
     * @return NoDeliveryStartDate
     */
    public NoDeliveryStartDate getNoDeliveryStartDate() {
        return noDeliveryStartDate;
    }

    /**
     * It set noDeliveryStartDate
     * @param noDeliveryStartDate NoDeliveryStartDate
     */
    public void setNoDeliveryStartDate(NoDeliveryStartDate noDeliveryStartDate) {
        this.noDeliveryStartDate = noDeliveryStartDate;
    }

    /**
     * It get reservedIdentifier
     * @return ReservedIdentifier
     */
    public ReservedIdentifier getReservedIdentifier() {
        return reservedIdentifier;
    }

    /**
     * It set reservedIdentifier
     * @param reservedIdentifier ReservedIdentifier
     */
    public void setReservedIdentifier(ReservedIdentifier reservedIdentifier) {
        this.reservedIdentifier = reservedIdentifier;
    }

    /**
     * It get uniqueKey
     * @return UniqueKey
     */
    public UniqueKey getUniqueKey() {
        return uniqueKey;
    }

    /**
     * It set uniqueKey
     * @param uniqueKey UniqueKey
     */
    public void setUniqueKey(UniqueKey uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    /**
     * It get remarks
     * @return Remarks
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * It set remarks
     * @param remarks Remarks
     */
    public void setRemarks(Remarks remarks) {
        this.remarks = remarks;
    }

    /**
     * It get expulsionDate
     * @return ExpulsionDate
     */
    public ExpulsionDate getExpulsionDate() {
        return expulsionDate;
    }

    /**
     * It set expulsionDate
     * @param expulsionDate ExpulsionDate
     */
    public void setExpulsionDate(ExpulsionDate expulsionDate) {
        this.expulsionDate = expulsionDate;
    }

    /**
     * It get exDate
     * @return ExDate
     */
    public ExDate getExDate() {
        return exDate;
    }

    /**
     * It set exDate
     * @param exDate ExDate
     */
    public void setExDate(ExDate exDate) {
        this.exDate = exDate;
    }

    /**
     * It get reAdmissionDate
     * @return ReAdmissionDate
     */
    public ReAdmissionDate getReAdmissionDate() {
        return reAdmissionDate;
    }

    /**
     * It set reAdmissionDate
     * @param reAdmissionDate ReAdmissionDate
     */
    public void setReAdmissionDate(ReAdmissionDate reAdmissionDate) {
        this.reAdmissionDate = reAdmissionDate;
    }

    /**
     * It get corporateAction
     * @return CorporateAction
     */
    public CorporateAction getCorporateAction() {
        return corporateAction;
    }

    /**
     * It set corporateAction
     * @param corporateAction CorporateAction
     */
    public void setCorporateAction(CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    /**
     * It get settlementNo
     * @return SettlementNo
     */
    public SettlementNo getSettlementNo() {
        return settlementNo;
    }

    /**
     * It set settlementNo
     * @param settlementNo SettlementNo
     */
    public void setSettlementNo(SettlementNo settlementNo) {
        this.settlementNo = settlementNo;
    }

    /**
     * It get bookClosureStartDate
     * @return BookClosureStartDate
     */
    public BookClosureStartDate getBookClosureStartDate() {
        return bookClosureStartDate;
    }

    /**
     * It set bookClosureStartDate
     * @param bookClosureStartDate BookClosureStartDate
     */
    public void setBookClosureStartDate(BookClosureStartDate bookClosureStartDate) {
        this.bookClosureStartDate = bookClosureStartDate;
    }

    /**
     * It get marketType
     * @return MarketType
     */
    public MarketType getMarketType() {
        return marketType;
    }

    /**
     * It set marketType
     * @param marketType MarketType
     */
    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
    }

    /**
     * It get margin
     * @return Margin
     */
    public Margin getMargin() {
        return margin;
    }

    /**
     * It set margin
     * @param margin Margin
     */
    public void setMargin(Margin margin) {
        this.margin = margin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("callAuctionIndicator", callAuctionIndicator).append("bookClosureEndDate", bookClosureEndDate).append("interestPaymentDate", interestPaymentDate).append("recordDate", recordDate).append("noDeliveryEndDate", noDeliveryEndDate).append("listingDate", listingDate).append("issueRate", issueRate).append("vARMargin", vARMargin).append("warningPercent", warningPercent).append("issueStartDate", issueStartDate).append("companyName", companyName).append("issueMaturityDate", issueMaturityDate).append("noDeliveryStartDate", noDeliveryStartDate).append("reservedIdentifier", reservedIdentifier).append("uniqueKey", uniqueKey).append("remarks", remarks).append("expulsionDate", expulsionDate).append("exDate", exDate).append("reAdmissionDate", reAdmissionDate).append("corporateAction", corporateAction).append("settlementNo", settlementNo).append("bookClosureStartDate", bookClosureStartDate).append("marketType", marketType).append("margin", margin).toString();
    }

}
