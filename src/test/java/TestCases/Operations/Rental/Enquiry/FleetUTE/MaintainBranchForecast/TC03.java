package TestCases.Operations.Rental.Enquiry.FleetUTE.MaintainBranchForecast;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TC03 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL PROCEDURES")
    @Story("ENQUIRIES FLEET UTE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TC03_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.fleetute");
        Generics.ClickButtonLink("fleetute.link.maintainbranchforecast","fleetute.link.maintainbranchforecast");
        Generics.DropdownSelector("Branch", "fleetute.dropdown.branchbdb1", "OR Tambo Intl Airport JS");
        Generics.FieldPopulate("Financial Year starting July", "fleetute.field.financialyearstartingjuly", "2017");
        Generics.ClickButtonLink("fleetute.button.submit", "fleetute.button.submit");
        driverwait();
        //Generics.ClickButtonLink("fleetute.button.returntofleetutilisationenquiries", "fleetute.button.returntofleetutilisationenquiries");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
