package TestCases.Utilities.Codes.Messages;

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

public class TCMSSG004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("MESSAGES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCMSSG004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.messages");
        driverwait();
        Generics.DropdownSelector("Users", "utilities.messages.dropdown.toUsers", "AARON FOX");
        Generics.ClickButtonLink("utilities.messages.button.Add", "utilities.messages.button.Add");
        Generics.ClickButtonLink("utilities.messages.button.Send", "utilities.messages.button.Send");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
