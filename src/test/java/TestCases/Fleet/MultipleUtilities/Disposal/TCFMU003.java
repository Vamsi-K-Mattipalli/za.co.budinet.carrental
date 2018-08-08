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
public class TCFMU003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("MULTIPLE UTILITIES")
    @Story("DISPOSAL")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFMU003_FLEET_MULTIPLEUTILITIES_DISPOSAL(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.multipleutil", "fleet.menu.multipleutil.disposal");
        Disposal.populate();
        //Generics.ClickButtonLink("disposal.button.adder", "disposal.button.adder");
        Generics.ClearTextField("disposal.field.date");
        Generics.FieldPopulate("Date", "disposal.field.date", "2015-01-01");
        Generics.ClickButtonLink("disposal.button.adder", "disposal.button.adder");
        Generics.ClickButtonLink("disposal.button.submiter", "disposal.button.submiter");
        //Generics.PopMessege(V004);

        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
