package TestCases.Utilities.InternetFleet;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.Utilities;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCINTF04 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("INTERNET")
    @Story("FLEET")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCINTF04_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo2("utilities.menu.utilities", "utilities.menu.utilities.internetfleet");
        Generics.ClickButtonLink("utilities.button.AddNew", "utilities.button.AddNew");
        Utilities.internetFleet();
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
        driverwait();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
