package pages.issuePolicy;

import dataOperation.DataReadForSubmission;
import interfaces.policySubmission.IPaymentMethodAndPlan;
import interfaces.policySubmission.IPerosonalAutoLob;
import org.openqa.selenium.WebDriver;
import utilities.Elements;

import java.io.IOException;
import java.util.Map;



public class PaymentMethodSelection implements IPaymentMethodAndPlan {

    public void paymentMethodAndPlan(String paymentMethod, String paymentPlan, WebDriver driver) throws IOException
    {
        Elements ele = new Elements();


        if(paymentMethod.equals(directBill))
        {

            ele.enterDropdown(billingMethod, directBill, driver);
        }
     else if(paymentMethod.equals(listBill))
        {
            ele.enterDropdown(billingMethod,listBill,driver);
        }

     switch (paymentPlan)
     {
         case monthly10percentDown9Maxinstallments:
             ele.clickRadioButton(monthly10percentDown9Maxinstallments,driver);
             break;

         case monthly10percentDownMax11installmentspublic:
             ele.clickRadioButton(monthly10percentDownMax11installmentspublic,driver);
             break;

         case monthly25percentDown11Maxinstallments:
             ele.clickRadioButton(monthly25percentDown11Maxinstallments,driver);
             break;

         case quarterly30percentDown3Maxinstallments:
             ele.clickRadioButton(quarterly30percentDown3Maxinstallments,driver);
             break;

         case semiAnnual60percentDown1Maxinstallments:
             ele.clickRadioButton(semiAnnual60percentDown1Maxinstallments,driver);
             break;

         case everyOtherWeek:
             ele.clickRadioButton(everyOtherWeek,driver);
             break;

         case annual100percentDown0Maxinstallments:
             ele.clickRadioButton(annual100percentDown0Maxinstallments,driver);
             break;

         case monthly10:
             ele.clickRadioButton(monthly10,driver);
             break;

         case monthly10AlwaysTransferExcess:
             ele.clickRadioButton(monthly10AlwaysTransferExcess,driver);
             break;

         case monthly10PolicyEffectiveDate:
             ele.clickRadioButton(monthly10PolicyEffectiveDate,driver);
             break;

         case plane7Zebra:
             ele.clickRadioButton(plane7Zebra,driver);
             break;

         case qA1PAYMENTPLAN01:
             ele.clickRadioButton(qA1PAYMENTPLAN01,driver);
             break;

         case qA1PAYMENTPLAN02:
             ele.clickRadioButton(qA1PAYMENTPLAN02,driver);
             break;

         case qA1PAYMENTPLAN03:
             ele.clickRadioButton(qA1PAYMENTPLAN03,driver);
             break;

         case qA1PAYMENTPLAN04:
             ele.clickRadioButton(qA1PAYMENTPLAN04,driver);
             break;

     }

     ele.click_Button(bindOption,driver);
     ele.click_Button(issuePolicy,driver);
     driver.switchTo().alert().accept();


    }
}
