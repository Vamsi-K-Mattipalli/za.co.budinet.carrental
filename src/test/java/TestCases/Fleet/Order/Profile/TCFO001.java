package TestCases.Fleet.Order.Profile;

import config.DataProviders;
import config.TestCore;
import controlers.GlobalUtility;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCFO001 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("FLEET")
    @Feature("ORDER")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFO001_FLEET_ORDER_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
       // GlobalUtility.ElementCompare(GlobalMessages.LG001, "fleet.menu.fleet");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
