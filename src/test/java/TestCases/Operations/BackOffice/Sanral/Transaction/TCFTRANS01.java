package TestCases.Operations.BackOffice.Sanral.Transaction;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCFTRANS01 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("SANRAL TRANSACTION")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFTRANS01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        //Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice", "operations.menu.backoffice.sanral", "operations.menu.backoffice.sanral.findtrans");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
