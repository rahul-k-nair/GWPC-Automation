package interfaces.policySubmission;

public interface ISubmission {


    public String accountNumber="Account Number";
    public String orgnization="Organization";

//    public String accountNumber="//input[@name='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account']";
//    public String orgnization="//input[@name='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-ProducerSelectionInputSet-Producer']";
    public String orgnizationbutton="//div[@id='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-ProducerSelectionInputSet-Producer-SelectOrganization']";
    //public String accNobutton="//div[@id='NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account-SelectAccount']";
    public String returnNewsubmission="//div[@id='OrganizationSearchPopup-__crumb__']";

    public String lobType="//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-%s-addSubmission' and @data-gw-click='fireEvent']";

    public String bussinessowners="//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-0-addSubmission']";
    //public String bussinessowners="0";
    public String commercialAuto="1";
    public String commercialPackage="2";
    public String commercialProperty="3";
    public String generalLiability="4";
    public String homeowners="//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-6-addSubmission']";
    public String inlandMarine="6";
    public String workersCompensation="7";
    //public String personalAuto="8";
    public String personalAuto="//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-8-addSubmission']";



    //Radio Button

    public  String singlepolicy="//input[@id=\"NewSubmission-NewSubmissionScreen-ProductSettingsDV-CreateSingle_0\"]";
    public String multiplepolicies="//input[@id=\"NewSubmission-NewSubmissionScreen-ProductSettingsDV-CreateSingle_1\"]";


}
