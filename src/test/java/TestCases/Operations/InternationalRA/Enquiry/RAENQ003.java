package TestCases.Operations.InternationalRA.Enquiry;

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

public class RAENQ003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("INTERNATIONAL RA")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void RAENQ03_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.InternationRA", "operations.menu.InternationRA.enquiry");
        driverwait();
        Generics.FieldPopulate("RA No", "ops.field.RANO", "IB27014F01");
        Generics.ClickButtonLink("nonrevenue.button.submit", "nonrevenue.button.submit");
        driverwait();
       // Generics.ClickButtonLink("nonrevenue.button.reset", "nonrevenue.button.reset");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
