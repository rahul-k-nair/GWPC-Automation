package pages.policyAccountCreation;

import dataOperation.DataReading;
import interfaces.pcAccountCreate.ISearch_Create_New_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Elements;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;




public class Search_Create_New_Account implements ISearch_Create_New_Account {

    public void searchAccount(String account_Type,WebDriver driver) throws IOException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Elements ele =new Elements();

        Map<String,String> data= DataReading.getData();

       // Map<String,String> personData= DataReading.getData();

        switch (account_Type)
        {

            case company:

                ele.enterText(companyName,data.get("Company Name"),driver);
                ele.click_Button(search,driver);
                if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gw-message-and-suffix"))).isDisplayed())
                    ele.click_Button(createNewAccount,driver);
                   driver.findElement(By.xpath(company)).click();

                break;
            case person:

                ele.enterText(firstName,data.get("First Name"),driver);
                ele.enterText(lastName,data.get("Last Name"),driver);
                ele.click_Button(search,driver);
                if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gw-message-and-suffix"))).isDisplayed())
                    ele.click_Button(createNewAccount,driver);
                   driver.findElement(By.xpath(person)).click();

                break;


        }



    }





}
