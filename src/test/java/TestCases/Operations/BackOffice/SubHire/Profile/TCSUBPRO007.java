package TestCases.Operations.BackOffice.SubHire.Profile;

import config.DataProviders;
import config.TestCore;
import controlers.GlobalUtility;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.BackOffice;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCSUBPRO007 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("SUBHIRE PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSUBPRO007_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice", "operations.menu.backoffice.subhire", "operations.menu.backoffice.subhire.profile");
        driverwait();
        BackOffice.SubhireProfile();
        driverwait();
        GlobalUtility.SnapShot(this.getClass().getSimpleName(), "Results" + this.getClass().getSimpleName());
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
