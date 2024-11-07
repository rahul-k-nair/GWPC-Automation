package interfaces.common;

public interface ILeftMenu_Bar {

    //TobBar Tabs
    public String desktopTab="//div[@id='TabBar-DesktopTab']";
    public String accountTab="//div[@id='TabBar-AccountTab']";
    public String policyTab="//div[@id='TabBar-PolicyTab']";
    public String contactTab="//div[@id='TabBar-ContactTab']";
    public String searchTab="//div[@id='TabBar-SearchTab']";
    public String teamTab="//div[@id='TabBar-TeamTab']";
    public String administrationTab="//div[@id='TabBar-AdminTab']";


    //Action x path
    public String actions="//div[@id=\"AccountFile-AccountFileMenuActions\"]//div[@class=\"gw-action--inner\"]";


    //Action Desktop Items
    public String createAction="//div[@id=\"Desktop-DesktopMenuActions-DesktopMenuActions_Create\"]";
    public String newSubmissionAction="//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]";
    public String newAccountAction="//div[@id=\"Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewAccount\"]";




    //Action Account Items
    public String newEmail="//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewEmail']";



}
