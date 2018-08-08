package TestCases.Debtors.Customer.Profile.FreeHire;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCFH001 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("CUSTOMER")
    @Story(" FREE HIRE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFH01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
