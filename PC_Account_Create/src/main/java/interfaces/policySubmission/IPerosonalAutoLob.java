package interfaces.policySubmission;

public interface IPerosonalAutoLob {


    //SelectBoxes
    public String offerings = "//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']//option[@value='%s']";
//sub
    public String basic="Basic Program";
    public String standard="Standard Program";
    public String premium="Premium Program";
//sub

    public String currentlyInsuredOrNot="//select[@name='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-ChoiceSelectInput_NoPost']//option[@value='%s']";

//sub
    public String yes="Yes";
    public String noNewDriver="No - New Driver";
    public String noDidntRenew="No - previous policy did not renew";

//sub

    public String driverLicenseState="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']//option[@value='%S']";

    public String numberOfAccidentsPolicyLevel="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents']//option[@value='%s']";
    public String numberOfAccidentsAccountLevel="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfAccidents']//option[@value='%s']";
    public String numberOfViolationsPolicyLevel="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-PolicyDriverNumberOfViolations']//option[@value='%s']";
    public String numberOfViolationsAccountLevel="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-1-PolicyContactRolePanelSet-DriverNumberOfViolations']//option[@value='%s']";

    public String vehicleLicenseState="//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV']//option[@value='%s']";



    //Buttons

    public String next="//div[@id='SubmissionWizard-Next']";

    public String addDriver="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver']";

    public  String existingDriver="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact']";
    public String existingDriverName="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact-0-UnassignedDriver']";

    public String createVehicle="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add']";

    public String driverRoleTab="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-RolesCardTab']";

    public String addDriverForVehicle="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver']";

    public String driverName="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver-0-Driver']";

    public String additionalCoverageTab="//div[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-AdditionalCoveragesTab\"]";

    public String contigencies="//div[@id=\"SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ContingenciesCardTab\"]";
    public String quote="//div[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote']";

    //TextBoxes

    public String dateQuoteneeded ="Date Quote Needed";

    public String dateOfBirth="Date of Birth";

    public String licensenumber="License #";

    public String yearFirstLicensed="Year First Licensed";

    public String vin="VIN";

    public String costNew="Cost New";




}
