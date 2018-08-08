package TestCases.Operations.BackOffice.Trends.Analysis;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCTRAN01 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }


    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("TRENDS ANALYSIS")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTRAN01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }


}
