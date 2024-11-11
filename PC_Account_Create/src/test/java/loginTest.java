import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.common.Base;
import pages.common.Login_PC;


public class loginTest extends Base {



   @BeforeTest


    public void setup() {

       try {
           openBrowser();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
//        WebDriverManager.chromedriver().setup();
//       driver = new ChromeDriver();
//        //driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://localhost:8180/pc/PolicyCenter.do");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    }
@Test

    public void loginTesting()
{
    Login_PC log = new Login_PC();
    log.login(driver);
}



   @AfterTest

    public void tearDown() throws InterruptedException {

        Thread.sleep(10000);
        driver.close();
    }


}
