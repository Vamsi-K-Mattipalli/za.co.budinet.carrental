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
import pageLibrary.Vehicle;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCFV003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("FLEET")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFV003_FLEET_VEHICLE_ENQUIRY(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.vehicle", "fleet.menu.vehicle.enquiry");
        driverwait();
        Generics.ClickButtonLink("vehicle.link.RegionsPerMonth","vehicle.link.RegionsPerMonth");
        Vehicle.populateVal("vehicle.field.yearmonth", "201801");
        //driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
