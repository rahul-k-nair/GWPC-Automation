package interfaces.pcAccountCreate;

public interface Enter_Account_Info_Create_Account {




    //TextBoxes
    public String companyName ="Company Name";

    public String firstName="First name";
    public String lastName="Last name";
    public String officePhone="Office Phone";
    public String fax="Fax";
    public String primaryEmail="Primary Email";
    public String secondaryEmail="Secondary Email";
    public String mobilePhone="Mobile Phone";
    public String homePhone="Home Phone";

    public String address="Address 1";
    public String city="City";
    public String county="County";
   public String zipcode="ZIP Code";

   // public String zipcode="//*[text()='ZIP Code']/parent::div//div[@class='gw-vw--value']//input";
    public String orgnization="Organization";



//SelectBoxes


    public String country="//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']//option[@value='%S']";

    public String state="//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']//option[@value='%s']";

    public String addressType="//select[@name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType']//option[@value='%s']";


    //accounts
    public String company="//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Company']//div[@class='gw-action--inner gw-hasDivider']";
    public String person="//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person']//div[@class='gw-action--inner gw-hasDivider']";


    //buttons

    public String update="//div[contains(@class, 'gw-shortcutKey') and text() = 'U']";

     public String accountSummaryTitle="//div[contains(@class, 'gw-TitleBar--title')]";











}
