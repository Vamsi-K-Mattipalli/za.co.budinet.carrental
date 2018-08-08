package TestCases.Fleet.Vehicle.Profile;

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

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCFV031 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("VEHICLE")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFV031_FLEET_VEHICLE_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.vehicle", "fleet.menu.vehicle.profile");
        //GlobalDriver.driver.switchTo().frame("core");
        Generics.switchToFrame("core");
        Generics.FieldPopulate("Reg No", "vehicle.Field.txtRegNo", "FT57CVGP");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
