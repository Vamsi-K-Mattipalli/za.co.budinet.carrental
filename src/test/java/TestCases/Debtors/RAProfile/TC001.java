package TestCases.Debtors.RAProfile;

import config.TestCore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TC001 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Test
    public void TC001_DEBTORS_RAPROFILE() throws Exception {
        LogIn.SignIn("951532", "111111");
        Menu.NavigateTo2("debtors.menu.debtors", "debtors.menu.raprofile");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
