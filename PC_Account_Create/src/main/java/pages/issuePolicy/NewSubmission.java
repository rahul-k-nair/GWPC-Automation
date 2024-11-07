package pages.issuePolicy;

import dataOperation.DataReadForSubmission;
import interfaces.policySubmission.ISubmission;
import org.openqa.selenium.WebDriver;
import utilities.Elements;

import java.io.IOException;
import java.util.Map;

public class NewSubmission implements ISubmission
{

    public void submission(String lobType,String policyType, WebDriver driver) throws IOException, InterruptedException
    {
        Elements ele = new Elements();
        Map<String,String> data= DataReadForSubmission.getSubmissionData();


//        ele.enterText(accountNumber, data.get("Account Number"), driver);
//        ele.enterText(orgnization, data.get("Organization"), driver);
//        ele.click_Button(orgnizationbutton, driver);
//        ele.click_Button(returnNewsubmission, driver);
        DataPassingforPolicySubmission datapass = new DataPassingforPolicySubmission();

        if(policyType.equals(singlepolicy))
        {
            ele.clickRadioButton(singlepolicy, driver);

            switch (lobType)
            {

                case personalAuto:


                    ele.click_Button(personalAuto, driver);
                    datapass.dataForSubmission(personalAuto, driver);

                    break;


                case homeowners:
                    ele.selectLob(homeowners, driver);

                    break;

                case bussinessowners:
                    break;
                case commercialAuto:
                    ele.selectLob(commercialAuto, driver);

                    break;

                case commercialPackage:
                    ele.selectLob(commercialPackage, driver);

                    break;

                case commercialProperty:
                    ele.selectLob(commercialProperty, driver);

                    break;

                case generalLiability:
                    ele.selectLob(generalLiability, driver);

                    break;

                case inlandMarine:
                    ele.selectLob(inlandMarine, driver);

                    break;

                case workersCompensation:
                    ele.selectLob(workersCompensation, driver);

                    break;


                default:
            }
        }
        else if (policyType.equals(multiplepolicies))
        {
            ele.clickRadioButton(multiplepolicies, driver);
                switch (lobType)
                {

                    case personalAuto:


                        ele.click_Button(personalAuto, driver);
                        //data.dataForSubmission(personalAuto, driver);

                        break;


                    case homeowners:
                        ele.selectLob(homeowners, driver);

                        break;

                    case bussinessowners:
                        break;
                    case commercialAuto:
                        ele.selectLob(commercialAuto, driver);

                        break;

                    case commercialPackage:
                        ele.selectLob(commercialPackage, driver);

                        break;

                    case commercialProperty:
                        ele.selectLob(commercialProperty, driver);

                        break;

                    case generalLiability:
                        ele.selectLob(generalLiability, driver);

                        break;

                    case inlandMarine:
                        ele.selectLob(inlandMarine, driver);

                        break;

                    case workersCompensation:
                        ele.selectLob(workersCompensation, driver);

                        break;


                    default:
                }


        }


    }
}
