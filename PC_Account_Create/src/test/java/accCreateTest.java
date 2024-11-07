import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.common.LeftMenu_Bar;
import pages.common.Login_PC;
import pages.common.TopMenu_Bar;
import pages.policyAccountCreation.Enter_Account_Info_Create_Account;
import pages.policyAccountCreation.Search_Create_New_Account;

import java.io.IOException;
import java.time.Duration;

import static interfaces.common.ITopbar.account;
import static interfaces.common.ITopbar.newAccount;
import static interfaces.pcAccountCreate.Enter_Account_Info_Create_Account.accountSummaryTitle;
import static interfaces.pcAccountCreate.ISearch_Create_New_Account.person;

public class accCreateTest {

    WebDriver driver;
    public TopMenu_Bar top = new TopMenu_Bar();


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8180/pc/PolicyCenter.do");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Login_PC log = new Login_PC();
        log.login(driver);

    }

    @Test(priority = 1)
    public void pc_acc_create_test() throws IOException {

//        LeftMenu_Bar left = new LeftMenu_Bar();
//        left.action(accountTab,newEmail,driver);

        top.tab_bar(account, newAccount, driver);

        Search_Create_New_Account search = new Search_Create_New_Account();

        search.searchAccount(person, driver);

        Enter_Account_Info_Create_Account acc = new Enter_Account_Info_Create_Account();

        acc.createAccount(person, driver);

        Assert.assertTrue(driver.findElement(By.xpath(accountSummaryTitle)).isDisplayed(), "Account creation Failed");


    }




//   @AfterTest
//
//    public void tearDown() throws InterruptedException {
//
//        Thread.sleep(10000);
//        driver.close();
//    }
//
}
