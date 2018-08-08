package TestCases.Operations.NonReveneu.Enquiry;

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

public class TCNRENQ04 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("NON REVENUE")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCNRENQ04_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.nonreveue", "operations.menu.nonreveue.enquiry");
        Generics.ClickButtonLink("nonrevenue.field.NONREVNO", "nonrevenue.field.NONREVNO");
        Generics.FieldPopulate("Non-Revenue Number", "nonrevenue.field.NONREVNO", "1WNR00015014");
        Generics.ClickButtonLink("nonrevenue.button.submit", "nonrevenue.button.submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
