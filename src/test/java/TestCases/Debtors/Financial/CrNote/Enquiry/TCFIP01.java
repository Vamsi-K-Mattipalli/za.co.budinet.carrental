package TestCases.Debtors.Financial.CrNote.Enquiry;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCFIP01 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("FINANCIAL CREDIT NOTE")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFIP01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
