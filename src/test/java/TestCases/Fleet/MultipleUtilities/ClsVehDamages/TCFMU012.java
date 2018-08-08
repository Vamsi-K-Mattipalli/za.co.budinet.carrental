package TestCases.Fleet.MultipleUtilities.ClsVehDamages;

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
public class TCFMU012 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("MULTIPLE UTILITIES")
    @Story("CLS VEHICLE DAMAGES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFMU012_FLEET_MULTIPLEUTILITIES_CLSVEHICLEDAMAGE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.multipleutil", "fleet.menu.multipleutil.vehicledamage");
        driverwait();
        driverwait();
        Generics.FieldPopulate("Reg No", "disposal.field.regno1", "FT57CYGP");
        Generics.ClickButtonLink("disposal.button.binaculars","disposal.button.binaculars");
        Generics.CheckBoxSelect("Close", "disposal.field.close");
        Generics.ClickButtonLink("disposal.button.submiter1", "disposal.button.submiter1");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
