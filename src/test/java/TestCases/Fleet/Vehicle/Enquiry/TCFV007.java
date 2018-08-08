package TestCases.Fleet.Vehicle.Enquiry;

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

public class TCFV007 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("FLEET")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFV007_FLEET_VEHICLE_ENQUIRY(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.vehicle", "fleet.menu.vehicle.enquiry");
        Generics.ClickButtonLink("vehicle.link.vehiclemodelstatus","vehicle.link.vehiclemodelstatus");
        Generics.DropdownSelector("Vehicle Model", "vehicle.dropdown.vehiclemodel2", "KIA Picanto");
        Generics.ClickButtonLink("vehicle.button.submitVE", "vehicle.button.submitVE");
        //driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
