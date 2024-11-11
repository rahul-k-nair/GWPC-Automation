package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static interfaces.policySubmission.ISubmission.*;


public class Elements {


    public Elements() {


    }

    //   public void enterText(String fieldName,String data,WebDriver driver)
//   {
//     String textBox ="//*[text()='s%']/parent::div//div[@class='gw-vw--value']//input";
//     String enterInfo =String.format(textBox,fieldName);
//       driver.findElement(By.xpath(enterInfo)).sendKeys(data);
//   }
    public void enterText(String fieldName, String data, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String text_box = "//*[text()='%s']/parent::div//div[@class='gw-vw--value']//input";
        String passing = String.format(text_box, fieldName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passing))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passing))).sendKeys(data);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(By.xpath(passing)).clear();
//        driver.findElement(By.xpath(passing)).sendKeys(data);

    }

//    public void enterOrg(String fieldName, String data, WebDriver driver) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountNumber))).clear();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountNumber))).sendKeys(data);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(orgnization))).clear();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(orgnization))).sendKeys(data);
//    }

//   public void click_Button(String buttonName,WebDriver driver)
//   {
//     String button ="//*[text()='%s']/parent::div[@role='button']";
//     String clicking=String.format(button,buttonName);
//     driver.findElement(By.xpath(clicking)).click();
//
//   }

    public void click_Button(String buttonName, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonName)));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonName))).click();
    }


    public void topbar_Menu_Items(String menu, String menuName, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String clicking = String.format(menu, menuName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clicking))).click();

    }


    public void enterDropdown(String dropDown, String dropDownName, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        String clicking = String.format(dropDown, dropDownName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clicking)));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clicking))).click();

    }

    public void selectLob(String typeOfLob, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Act
        String selecting = String.format(lobType, typeOfLob);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selecting))).submit();
        //Assert.assertTrue();
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath(selecting))).click();

    }

    public void mousehover(String elementName,WebDriver driver)
    {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(elementName));
        builder.moveToElement(element).build().perform();
    }

    public void clickRadioButton(String radioButtonName, WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(radioButtonName))).click();

    }


}
