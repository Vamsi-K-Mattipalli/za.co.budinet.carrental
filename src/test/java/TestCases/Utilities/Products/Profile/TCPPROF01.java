package TestCases.Utilities.Products.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCPPROF01 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRODUCTS")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)

    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCPPROF01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
