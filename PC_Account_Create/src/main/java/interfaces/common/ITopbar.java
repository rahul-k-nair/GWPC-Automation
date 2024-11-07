package interfaces.common;

public interface ITopbar {


    public String main ="//div[@id=\"TabBar-%s\"]//div[@class='gw-icon gw-icon--expand']";  //Main Menu

    public String desktopsub="//div[@id='TabBar-DesktopTab-Desktop_%s'] //div[@class='gw-action--inner gw-hasDivider']";

    //Desktop
    public String desktop="DesktopTab";

            public String summary="Underwriter_MySummary";
            public String myActivites="DesktopActivities";
            public String myAccounts="DesktopAccounts";
            public String mySubmissions="DesktopSubmissions";
            public String myRenewals="DesktopRenewals";

            public String otherPolicyTransactions="DesktopOtherWorkOrders";
            public String myQueues="DesktopAssignableQueues";


    //Account
    public String account="AccountTab";

    public String accountsub="//div[@id=\"TabBar-AccountTab-AccountTab_%s\"]//div[@class='gw-action--inner gw-hasDivider']";

            public String newAccount="NewAccount";


    //Policy
    public String policy="PolicyTab";
    public String policysub="//div[@id='TabBar-PolicyTab-PolicyTab_%s']//div[@class='gw-action--inner gw-hasDivider']";

            public String newSubmission="NewSubmission";


    //Contact
    public String contact="ContactTab";
    public String contactsub="//div[@id='TabBar-ContactTab-%s']";
             public String newContact="NewContact";
             public String searchContact="Search";
    //Search
    public String search="SearchTab";
    public String searchsub="//div[@id='TabBar-SearchTab-Search_%s']//div[@class='gw-action--inner gw-hasDivider']";

            public String policies="PolicySearch";
            public String accounts="AccountSearch";
            public String producerCodes="ProducerCodeSearch";
            public String activites="ActivitySearch";
            public String sContacts="ContactSearch";

    //Team
    public String team="TeamTab";


    //administration
    public String administration="AdminTab";
    public String administrationsub="//div[@id='TabBar-AdminTab-Admin_%s']";

            public String usersandSecurity = "UsersAndSecurity";

            public  String rating="Admin_Rating";
            public String bussinessSettings = "BusinessSettings";
            public String monitoring = "Monitoring";
            public String utilities = "Utilities";







}
