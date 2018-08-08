package TestCases.Operations.BackOffice.KeyBook.Enquiry;

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

public class TCKEYENQ02 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("KEYBOOK ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCKEYENQ02_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
                "operations.menu.backoffice.keybook", "operations.menu.backoffice.keybook.enquiry");
        driver.switchTo().frame("core");
        Generics.DropdownSelector("Status", "keybook.dropdown.txtStatus", "Key Book");
        Generics.ClickButtonLink("operation.button.submit.keybook", "operation.button.submit.keybook");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
