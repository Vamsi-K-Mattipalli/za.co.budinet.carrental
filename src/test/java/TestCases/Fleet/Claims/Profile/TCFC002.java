package TestCases.Fleet.Claims.Profile;

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
public class TCFC002 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("CLAIMS")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFC002_FLEET_CLAIMS_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.claims", "fleet.menu.claims.profile");
        driverwait();
        //Claims.populate();
        Generics.switchToFrame("core");
        Generics.FieldPopulate("Claim Number", "claim.field.claimno1", "1W7111975");
        //Generics.ClickButtonLink("order.dropdown.ordersubmit", "order.dropdown.ordersubmit");
        Generics.ClickButtonLink("order.button.biniculars", "order.button.biniculars");
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
