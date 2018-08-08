package TestCases.Utilities.Security.UserLinks;

import config.TestCore;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.LogIn;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TC001 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Test
    public void TC001_Test1() throws Exception {
        LogIn.SignIn("951532", "111111");
        // Menu.NavigateTo("","","");

    }
    // @AfterMethod
    //  public void tearDown() throws Exception
    //  {
    //       CloseWebDriver.browser();

    //   }
}
