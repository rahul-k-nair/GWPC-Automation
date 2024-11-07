import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.common.LeftMenu_Bar;
import pages.common.Login_PC;
import pages.common.TopMenu_Bar;

import java.time.Duration;


public class loginTest {

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


    }
@Test

    public void loginTesting()
{
    Login_PC log = new Login_PC();
    log.login(driver);
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
