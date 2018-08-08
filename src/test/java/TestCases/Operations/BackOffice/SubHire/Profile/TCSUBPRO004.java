package TestCases.Operations.BackOffice.SubHire.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCSUBPRO004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("SUBHIRE PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSUBPRO004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
       // Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice", "operations.menu.backoffice.subhire", "operations.menu.backoffice.subhire.profile");
      //  BackOffice.SubhireProfile();
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
