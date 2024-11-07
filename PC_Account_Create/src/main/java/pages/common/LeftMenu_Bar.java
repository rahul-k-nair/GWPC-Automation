package pages.common;

import interfaces.common.ILeftMenu_Bar;
import org.openqa.selenium.WebDriver;
import utilities.Elements;

public class LeftMenu_Bar implements ILeftMenu_Bar {
    Elements ele = new Elements();

    public void action(String tabBarMenu, String actionItem, WebDriver driver)
    {


        switch (tabBarMenu)
        {
            case desktopTab:
                ele.click_Button(desktopTab,driver);
                ele.click_Button(actions,driver);
                if(actionItem.equals(createAction))
                    ele.click_Button(createAction,driver);
                else if (actionItem.equals(newSubmissionAction))
                    ele.click_Button(newSubmissionAction,driver);
                else if(actionItem.equals(newAccountAction))
                    ele.click_Button(newAccountAction,driver);

                break;

            case accountTab:
                ele.click_Button(accountTab,driver);
                ele.click_Button(actions,driver);
                if(actionItem.equals(createAction))
                    ele.click_Button(createAction,driver);
                else if (actionItem.equals(newSubmissionAction))
                    ele.click_Button(newSubmissionAction,driver);
                else if(actionItem.equals(newAccountAction))
                    ele.click_Button(newAccountAction,driver);
                //ele.click_Button(newEmail,driver);
                break;

            case policyTab:
                ele.click_Button(policyTab,driver);
                ele.click_Button(actions,driver);
                break;

            case contactTab:
                ele.click_Button(contactTab,driver);
                ele.click_Button(actions,driver);
                break;

            case searchTab:
                ele.click_Button(searchTab,driver);
                ele.click_Button(actions,driver);
                break;

            case teamTab:
                ele.click_Button(teamTab,driver);
                break;

            case administrationTab:
                ele.click_Button(administrationTab,driver);
                ele.click_Button(actions,driver);
                break;

        }

    }
    public void sideBar(String tabBarMenu,String sideBarItem,WebDriver driver)
    {

        switch (tabBarMenu)
        {
            case desktopTab:
                ele.click_Button(desktopTab,driver);

                break;

            case accountTab:
                ele.click_Button(accountTab,driver);

                break;

            case policyTab:
                ele.click_Button(policyTab,driver);

                break;

            case contactTab:
                ele.click_Button(contactTab,driver);

                break;

            case searchTab:
                ele.click_Button(searchTab,driver);
                ele.click_Button(actions,driver);
                break;

            case teamTab:
                ele.click_Button(teamTab,driver);
                break;

            case administrationTab:
                ele.click_Button(administrationTab,driver);

                break;

        }

    }


}
