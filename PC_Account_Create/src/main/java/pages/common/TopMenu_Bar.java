package pages.common;


import interfaces.common.ITopbar;
import org.openqa.selenium.WebDriver;
import utilities.Elements;

public class TopMenu_Bar implements ITopbar {


    public void tab_bar(String top_bar_Item, String top_bar_SubItem,WebDriver driver)
    {
        Elements ele = new Elements();

        //DeskTop

        switch (top_bar_Item)
        {
            case desktop:

                ele.topbar_Menu_Items(main,desktop,driver);
                if (top_bar_SubItem.equals(summary))
                    ele.topbar_Menu_Items(desktopsub,summary,driver);
                else if (top_bar_SubItem.equals(myActivites)) {
                    ele.topbar_Menu_Items(desktopsub,myActivites,driver);
                    
                } else if (top_bar_SubItem.equals(myAccounts)) {
                    ele.topbar_Menu_Items(desktopsub,myAccounts,driver);

                } else if (top_bar_SubItem.equals(mySubmissions)) {
                    ele.topbar_Menu_Items(desktopsub,mySubmissions,driver);

                } else if (top_bar_SubItem.equals(myRenewals)) {
                    ele.topbar_Menu_Items(desktopsub,myRenewals,driver);

                } else if (top_bar_SubItem.equals(otherPolicyTransactions)) {
                    ele.topbar_Menu_Items(desktopsub,otherPolicyTransactions,driver);

                }  else if (top_bar_SubItem.equals(myQueues)) {
                    ele.topbar_Menu_Items(desktopsub,myQueues,driver);

                }
                break;

            case account:

                ele.topbar_Menu_Items(main,account,driver);
                if (top_bar_SubItem.equals(newAccount))
                {
                    ele.topbar_Menu_Items(accountsub,newAccount,driver);
                }

                break;

            case policy:

                ele.topbar_Menu_Items(main,policy,driver);
                if (top_bar_SubItem.equals(newSubmission))
                {
                    ele.topbar_Menu_Items(policysub,newSubmission,driver);
                }
                break;

            case contact:

                ele.topbar_Menu_Items(main,contact,driver);
                if (top_bar_SubItem.equals(newContact))
                {
                    ele.topbar_Menu_Items(contactsub,newContact,driver);

                } else if (top_bar_SubItem.equals(searchContact)) {
                    ele.topbar_Menu_Items(contactsub,searchContact,driver);

                }

                break;

            case search:

                ele.topbar_Menu_Items(main,search,driver);
                if (top_bar_SubItem.equals(policies))
                    ele.topbar_Menu_Items(searchsub,summary,driver);
                else if (top_bar_SubItem.equals(myActivites)) {
                    ele.topbar_Menu_Items(searchsub,myActivites,driver);

                } else if (top_bar_SubItem.equals(accounts)) {
                    ele.topbar_Menu_Items(searchsub,myAccounts,driver);

                } else if (top_bar_SubItem.equals(producerCodes)) {
                    ele.topbar_Menu_Items(searchsub,producerCodes,driver);

                } else if (top_bar_SubItem.equals(activites)) {
                    ele.topbar_Menu_Items(searchsub,activites,driver);

                } else if (top_bar_SubItem.equals(sContacts)) {
                    ele.topbar_Menu_Items(searchsub,sContacts,driver);

                }
                break;

            case team:

                ele.topbar_Menu_Items(main,team,driver);
                break;

            case administration:

                ele.topbar_Menu_Items(main,administration,driver);
                if (top_bar_SubItem.equals(usersandSecurity))
                    ele.topbar_Menu_Items(administrationsub,usersandSecurity,driver);

                else if (top_bar_SubItem.equals(rating)) {
                    ele.topbar_Menu_Items(administrationsub,rating,driver);

                } else if (top_bar_SubItem.equals(bussinessSettings)) {
                    ele.topbar_Menu_Items(administrationsub,bussinessSettings,driver);

                } else if (top_bar_SubItem.equals(monitoring)) {
                    ele.topbar_Menu_Items(administrationsub,monitoring,driver);

                }else if (top_bar_SubItem.equals(utilities)) {
                    ele.topbar_Menu_Items(administrationsub,utilities,driver);

                }


                break;

        }

    }


}
