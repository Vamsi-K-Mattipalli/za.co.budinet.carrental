package TestCases.Operations.Rental.Enquiry.FleetUTE.ProjectedVehicleGroup;

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

public class TCFUTE002 extends TestCore
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
    public void TCFUTE002_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.fleetute");
        Generics.ClickButtonLink("fleetute.link.projectedvehiclegroupavailability","fleetute.link.projectedvehiclegroupavailability");
        Generics.DropdownSelector("Branch", "fleetute.dropdown.branchbfu", "OR Tambo Intl Airport JS");
        Generics.DropdownSelector("Vehicle Group", "fleetute.dropdown.vehiclegroupbfu", "B - Hyundai Grand I10/similar");
        Generics.ClickButtonLink("fleetute.button.submit", "fleetute.button.submit");
        driverwait();
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
