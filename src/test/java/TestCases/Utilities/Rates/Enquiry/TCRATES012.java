package TestCases.Utilities.Rates.Enquiry;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCRATES012 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }


    @Epic("UTILITIES")
    @Feature("RATE")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCRATES012_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.rates", "utilities.menu.utilities.rates.enquiry");
        driverwait();
       // Generics.DropdownSelector("Rate Type", "utilities.dropdown.cmbRateType", "Brochure Exclusive");
       // Generics.ClickButtonLink("utilities.intra.button.Submit", "utilities.intra.button.Submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
