package TestCases.Utilities.Security.UserGroups;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.LogIn;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCSG001 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("SECURITY")
    @Story("USER GROUPS")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSG001_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        // Menu.NavigateTo("","","");

    }
    // @AfterMethod
    //  public void tearDown() throws Exception
    //  {
    //       CloseWebDriver.browser();

    //   }
}
