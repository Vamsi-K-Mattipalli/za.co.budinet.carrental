package TestCases.Operations.Rental.Enquiry.Ops.ExtraServices;

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
public class TCEXTSERV01 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("EXTRA SERVICES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCEXTSERV01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
