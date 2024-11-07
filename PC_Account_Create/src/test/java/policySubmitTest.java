import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.common.LeftMenu_Bar;
import pages.common.Login_PC;
import pages.common.TopMenu_Bar;
import pages.issuePolicy.NewSubmission;
import pages.issuePolicy.PaymentMethodSelection;

import java.io.IOException;
import java.time.Duration;

import static interfaces.common.ILeftMenu_Bar.accountTab;
import static interfaces.common.ILeftMenu_Bar.newSubmissionAction;
import static interfaces.policySubmission.IPaymentMethodAndPlan.directBill;
import static interfaces.policySubmission.IPaymentMethodAndPlan.everyOtherWeek;
import static interfaces.policySubmission.ISubmission.personalAuto;
import static interfaces.policySubmission.ISubmission.singlepolicy;

public class policySubmitTest {

    WebDriver driver;
    public TopMenu_Bar top = new TopMenu_Bar();
    public LeftMenu_Bar left = new LeftMenu_Bar();

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

//    @Test(priority = 1)
//    public void pc_acc_create_test() throws IOException {
//
////        LeftMenu_Bar left = new LeftMenu_Bar();
////        left.action(accountTab,newEmail,driver);
//
//        top.tab_bar(account, newAccount, driver);
//
//        Search_Create_New_Account search = new Search_Create_New_Account();
//
//        search.searchAccount(person, driver);
//
//        Enter_Account_Info_Create_Account acc = new Enter_Account_Info_Create_Account();
//
//        acc.createAccount(person, driver);
//
//        Assert.assertTrue(driver.findElement(By.xpath(accountSummaryTitle)).isDisplayed(), "Account creation Failed");
//
//
//    }

    @Test(priority = 2)
    public void policySubmission() throws InterruptedException, IOException {
        //top.tab_bar(policy, newSubmission, driver);

        left.action(accountTab,newSubmissionAction,driver);


        NewSubmission sub = new NewSubmission();
        sub.submission(personalAuto,singlepolicy,driver);
        PaymentMethodSelection pay = new PaymentMethodSelection();
        pay.paymentMethodAndPlan(directBill,everyOtherWeek,driver);

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
