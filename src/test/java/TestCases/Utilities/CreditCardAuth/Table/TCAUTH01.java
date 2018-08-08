package TestCases.Utilities.CreditCardAuth.Table;

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
public class TCAUTH01 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CREDIT CARD")
    @Story("AUTH TABLE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCAUTH01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
