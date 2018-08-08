package TestCases.Fleet.Vehicle.Profile;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import controlers.GlobalUtility;
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
public class TCFV039 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("VEHICLE")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFV039_FLEET_VEHICLE_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.vehicle", "fleet.menu.vehicle.profile");
        Vehicle.vehicleNavigate();
        driverwait();
        Vehicle.vehiclePopulate();
        Generics.ClickButtonLink("vehicle.button.submitP", "vehicle.button.submitP");
        driverwait();
        GlobalUtility.SnapShot(this.getClass().getSimpleName(), "Results" + this.getClass().getSimpleName());
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
