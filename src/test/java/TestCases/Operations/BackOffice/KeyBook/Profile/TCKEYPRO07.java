package TestCases.Operations.BackOffice.KeyBook.Profile;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.BackOffice;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCKEYPRO07 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("KEYBOOK PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCKEYPRO07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
                "operations.menu.backoffice.keybook", "operations.menu.backoffice.keybook.profile");
        BackOffice.KeyBookProfilePopulate();
        Generics.ClearTextField("keybook.field.RegNo");
        Generics.FieldPopulate("RegNo", "keybook.field.RegNo", "ZRB083GP");
        Generics.ClickButtonLink("keybook.button.add", "keybook.button.add");
        Generics.ClickButtonLink("operation.button.submit.keybook", "operation.button.submit.keybook");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
