package TestCases.Utilities.Accessories.Profile;

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

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCPROF06 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("ACCESSORIES")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCPROF06_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.accessories", "utilities.menu.utilities.accessories.profile");
        driverwait();
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("utilities.field.SerialNo", "utilities.field.SerialNo");
        Generics.FieldPopulate("Serial No", "utilities.field.SerialNo", "321564987");
        Generics.ClickButtonLink("utilities.field.banicular2", "utilities.field.banicular2");
       // Assert.fail();
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
