package pages.policyAccountCreation;

import dataOperation.DataReading;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Elements;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

public class Enter_Account_Info_Create_Account implements interfaces.pcAccountCreate.Enter_Account_Info_Create_Account {






public void createAccount(String accountType,WebDriver driver) throws IOException {


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    Map<String,String> data= DataReading.getData();

    //Map<String,String> personData= DataReading.getData();


    Elements ele = new Elements();


    if(accountType.equals(company)) {

        ele.enterText(officePhone, data.get("Office Phone"), driver);
        ele.enterText(fax, data.get("Fax"), driver);


    } else if (accountType.equals(person)) {
        ele.enterText(homePhone, data.get("Home Phone"), driver);
        ele.enterText(mobilePhone, data.get("Mobile Phone"), driver);

    }


    ele.enterText(primaryEmail,data.get("Primary Email"),driver);
    ele.enterText(secondaryEmail,data.get("Secondary Email"),driver);
    ele.enterDropdown(country,data.get("Country"),driver);
    ele.enterText(address,data.get("Address"),driver);
    ele.enterText(city,data.get("City"),driver);
    ele.enterText(county,data.get("County"),driver);
    ele.enterDropdown(state,data.get("State"),driver);
    ele.enterText(zipcode,data.get("Zip code"),driver);
    ele.enterText(orgnization,data.get("Organizations"),driver);
    ele.enterDropdown(addressType,data.get("Address Type"),driver);
    ele.click_Button(update,driver);
    //Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageTilte))).isDisplayed(),"Account Name displayed");



    }

}


