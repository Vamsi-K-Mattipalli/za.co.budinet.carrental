package TestCases.Fleet.MultipleUtilities.Disposal;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.Disposal;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCFMU007 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("MULTIPLE UTILITIES")
    @Story("DISPOSAL")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFMU007_FLEET_MULTIPLEUTILITIES_DISPOSAL(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.multipleutil", "fleet.menu.multipleutil.disposal");
        Disposal.populate();

        Generics.ClickButtonLink("disposal.button.adder","disposal.button.adder");
        Generics.ClickButtonLink("disposal.button.modify","disposal.button.modify");
        Generics.ClearTextField("disposal.field.reg");
        Generics.FieldPopulate("", "disposal.field.reg", "KCK978GP");
        Generics.ClickButtonLink("disposal.button.adder", "disposal.button.adder");
        Generics.ClickButtonLink("disposal.button.submiter","disposal.button.submiter");

        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
