package interfaces.policySubmission;

public interface IPaymentMethodAndPlan {


    //Button
    public String billingMethod="//select[@name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-BillingMethod']//option[@value='%s']";

    //sub
    public String directBill="DirectBill";
    public String listBill="ListBill";
    //sub

    public String bindOption="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-BindOptions\"]";

    public String issuePolicy="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-BindOptions-BindAndIssue\"]";

    public String bindOnly="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-BindOptions-BindOnly\"]";
   //RadioButton

    public String monthly10percentDown9Maxinstallments ="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-0-InstallmentPlan_radio\"]";

     public  String monthly10percentDownMax11installmentspublic="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-1-InstallmentPlan\"]";
     public  String monthly25percentDown11Maxinstallments ="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-2-InstallmentPlan_radio\"]";
     public String quarterly30percentDown3Maxinstallments ="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-3-InstallmentPlan_radio\"]";
     public   String semiAnnual60percentDown1Maxinstallments="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-4-InstallmentPlan_radio\"]";
     public String everyOtherWeek="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-5-InstallmentPlan_radio\"]";
     public  String annual100percentDown0Maxinstallments="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-6-InstallmentPlan_radio\"]";
     public  String monthly10="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-7-InstallmentPlan_radio\"]";
     public  String monthly10AlwaysTransferExcess="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-8-InstallmentPlan_radio\"]";

     public String monthly10PolicyEffectiveDate="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-9-InstallmentPlan_radio\"]";
     public  String plane7Zebra="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-10-InstallmentPlan_radio\"]";
     public String qA1PAYMENTPLAN01="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-11-InstallmentPlan_radio\"]";
     public String qA1PAYMENTPLAN02="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-12-InstallmentPlan_radio\"]";
     public String qA1PAYMENTPLAN03="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-13-InstallmentPlan_radio\"]";
     public String qA1PAYMENTPLAN04="//div[@id=\"SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentsPlanDV-PaymentsPlanInputSet-InstallmentPlan-BillingAdjustmentsInstallmentsLV-14-InstallmentPlan_radio\"]";



}
