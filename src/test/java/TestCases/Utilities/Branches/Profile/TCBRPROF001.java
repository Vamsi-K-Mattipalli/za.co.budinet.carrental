package TestCases.Utilities.Branches.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCBRPROF001 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("BRANCH")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBRPROF001_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.branches", "utilities.menu.utilities.branches.profile");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
