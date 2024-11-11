package pages.issuePolicy;

import dataOperation.DataReadForSubmission;
import interfaces.policySubmission.IPerosonalAutoLob;
import org.openqa.selenium.WebDriver;
import utilities.Elements;

import java.io.IOException;
import java.util.Map;

import static interfaces.policySubmission.ISubmission.*;

public class DataPassingforPolicySubmission implements IPerosonalAutoLob {

    public void dataForSubmission(String lobType, WebDriver driver) throws IOException, InterruptedException {
        Elements ele = new Elements();
        Map<String, String> data = DataReadForSubmission.getSubmissionData();


        switch (lobType) {

            case personalAuto:
                ele.enterDropdown(offerings, data.get("Offerings"), driver);
                ele.click_Button(next, driver);
                ele.enterDropdown(currentlyInsuredOrNot, data.get("Currently Insured or Not"), driver);
                ele.click_Button(next, driver);
                ele.enterText(dateQuoteneeded, data.get("Date Quote Needed"), driver);
                ele.click_Button(next, driver);

                ele.click_Button(addDriver, driver);
                ele.mousehover(existingDriver, driver);
                ele.click_Button(existingDriverName, driver);
                ele.enterText(dateOfBirth, data.get("Date of Birth"), driver);
                ele.enterText(licensenumber, data.get("License Number"), driver);
                ele.enterDropdown(driverLicenseState, data.get("Driver License State"), driver);
                ele.click_Button(driverRoleTab, driver);
                ele.enterText(yearFirstLicensed, data.get("Year First Licensed"), driver);
                ele.enterDropdown(numberOfAccidentsPolicyLevel, data.get("Number of Accidents PolicyLevel"), driver);
                ele.enterDropdown(numberOfAccidentsAccountLevel, data.get("Number of Accidents AccountLevel"), driver);
                ele.enterDropdown(numberOfViolationsPolicyLevel, data.get("Number of Violations PolicyLevel"), driver);
                ele.enterDropdown(numberOfViolationsAccountLevel, data.get("Number of Violations AccountLevel"), driver);
                ele.click_Button(next, driver);

                ele.click_Button(createVehicle, driver);
                ele.enterText(vin, data.get("VIN"), driver);
                ele.enterDropdown(vehicleLicenseState, data.get("Vehicle License State"), driver);
                ele.click_Button(addDriverForVehicle, driver);
                ele.click_Button(driverName, driver);
                ele.enterText(costNew, data.get("Cost New"), driver);
                ele.click_Button(next, driver);

                ele.click_Button(additionalCoverageTab, driver);
                ele.click_Button(next, driver);

                ele.click_Button(contigencies, driver);
                ele.click_Button(next, driver);


                ele.click_Button(quote, driver);


                ele.click_Button(next, driver);
                Thread.sleep(1000);

                ele.click_Button(next, driver);

                break;


            case homeowners:


                break;

            case bussinessowners:


                break;
            case commercialAuto:


                break;

            case commercialPackage:


                break;

            case commercialProperty:


                break;

            case generalLiability:


                break;

            case inlandMarine:


                break;

            case workersCompensation:


                break;


            default:
        }
    }
}
