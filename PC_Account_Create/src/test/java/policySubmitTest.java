import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.common.Base;
import pages.common.LeftMenu_Bar;
import pages.common.TopMenu_Bar;
import pages.issuePolicy.NewSubmission;
import pages.issuePolicy.PaymentMethodSelection;

import java.io.IOException;

import static interfaces.common.ILeftMenu_Bar.accountTab;
import static interfaces.common.ILeftMenu_Bar.newSubmissionAction;
import static interfaces.policySubmission.IPaymentMethodAndPlan.directBill;
import static interfaces.policySubmission.IPaymentMethodAndPlan.everyOtherWeek;
import static interfaces.policySubmission.ISubmission.personalAuto;
import static interfaces.policySubmission.ISubmission.singlepolicy;

public class policySubmitTest extends Base {

    public TopMenu_Bar top = new TopMenu_Bar();
    public LeftMenu_Bar left = new LeftMenu_Bar();


    @Test(priority = 1)
    public void policySubmission() throws InterruptedException, IOException {


        left.action(accountTab,newSubmissionAction,driver);


        NewSubmission sub = new NewSubmission();
        sub.submission(personalAuto,singlepolicy,driver);
        PaymentMethodSelection pay = new PaymentMethodSelection();
        pay.paymentMethodAndPlan(directBill,everyOtherWeek,driver);

    }


   @AfterTest

    public void tearDown() throws InterruptedException {

        Thread.sleep(10000);
        driver.close();
    }

}
