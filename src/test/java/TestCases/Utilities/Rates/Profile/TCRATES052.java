package TestCases.Utilities.Rates.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.Utilities;

public class TCRATES052 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("RATE")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCRATES052_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.rates", "utilities.menu.utilities.rates.profile");
        driverwait();
        Utilities.RatePopulating();
      //  Generics.CheckBoxSelect("Vehicle Extras", "utilities.link.AdditionalExtras");
     //   Generics.CheckBoxSelect("GPS", "utilities.field.gps");
      //  Generics.ClickButtonLink("utilities.intra.button.Submit", "utilities.intra.button.Submit");

        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
