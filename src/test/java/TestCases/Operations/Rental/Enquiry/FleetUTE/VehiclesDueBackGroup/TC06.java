package TestCases.Operations.Rental.Enquiry.FleetUTE.VehiclesDueBackGroup;

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

public class TC06 extends TestCore
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
    public void TC06_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.fleetute");
        Generics.ClickButtonLink("fleetute.link.vehiclesduebackbygroup","fleetute.link.vehiclesduebackbygroup");
        Generics.DropdownSelector("Due Back Branch", "fleetute.dropdown.duebackbranchbrh", "OR Tambo Intl Airport JS");
        Generics.ClearTextField("fleetute.field.duebackdatebrh");
        Generics.ClickButtonLink("fleetute.button.submit", "fleetute.button.submit");
        Generics.ClickButtonLink("fleetute.button.backbrh", "fleetute.button.backbrh");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
