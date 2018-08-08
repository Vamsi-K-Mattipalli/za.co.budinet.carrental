package TestCases.Operations.Rental.MultipleUtilites.DeallocMultVeh;

import config.DataProviders;
import config.TestCore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TC001 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TC001_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        // Menu.NavigateTo("","","");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
