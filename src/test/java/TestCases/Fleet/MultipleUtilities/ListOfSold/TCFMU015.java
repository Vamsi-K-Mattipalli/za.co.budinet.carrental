package TestCases.Fleet.MultipleUtilities.ListOfSold;

import config.DataProviders;
import config.TestCore;
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
public class TCFMU015 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("MULTIPLE UTILITIES")
    @Story("LIST SOLD")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFMU015_FLEET_MULTIPLEUTILITIES_LISTOFSOLD(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        //Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.multipleutil", "fleet.menu.multipleutil.listsold");
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.vehicle", "fleet.menu.vehicle.profile");
        //Generics.FieldPopulate("Reg No","vehicle.Field.txtRegNo","FT57CYGP");
        // Generics.ClickSubmit("disposal.button.binacular");
        driverwait();

        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
