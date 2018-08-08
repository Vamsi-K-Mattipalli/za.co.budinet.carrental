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

public class RAENQ005 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("INTERNATIONAL RA")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void RAENQ005_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.InternationRA", "operations.menu.InternationRA.enquiry");
        driverwait();
        Generics.DropdownSelector("Type", "international.dropdown.RAType", "International Sunny Cars");
        Generics.FieldPopulate("Pick Up Date", "operation.field.pickupdate", "2016-10-31");
        Generics.ClickButtonLink("nonrevenue.button.submit", "nonrevenue.button.submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
