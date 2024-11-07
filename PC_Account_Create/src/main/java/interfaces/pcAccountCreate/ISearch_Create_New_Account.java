package interfaces.pcAccountCreate;

public interface ISearch_Create_New_Account {


    //accounts
public String company="//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Company']//div[@class='gw-action--inner gw-hasDivider']";
public String person="//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person']//div[@class='gw-action--inner gw-hasDivider']";


//Textboxes

    public String companyName="Company Name";

    public String firstName="First name";
    public String lastName="Last name";







//Buttons
    public String search ="//div[contains(@class, 'gw-shortcutKey') and text() = 'S']";



 public String createNewAccount="//div[@id='NewAccount-NewAccountScreen-NewAccountButton']";
    public String reset ="//div[contains(@class, 'gw-shortcutKey') and text() = 'R']";

//public String country="//select[@name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']";




}
