package pages.common;

import interfaces.common.ILogin;
import utilities.Elements;
import org.openqa.selenium.WebDriver;

public class Login_PC implements ILogin {

   // WebDriver driver;
    public void login(WebDriver driver)
    {
        Elements ele = new Elements();
        ele.enterText(userName,"su",driver);
        ele.enterText(password,"gw",driver);
        ele.click_Button(login,driver);

    }
}
