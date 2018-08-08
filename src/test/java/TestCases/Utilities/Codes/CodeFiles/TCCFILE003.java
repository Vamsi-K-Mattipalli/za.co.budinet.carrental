package TestCases.Utilities.Codes.CodeFiles;

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

public class TCCFILE003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("CODE FILES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCFILE003_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.codefile");
        driverwait();
        Generics.DropdownSelector("Code", "utilities.codefiles.dropdown.SETOFDATA", "RCRTP - Credit Types");
        Generics.ClickButtonLink("utilities.codefiles.button.MaintainHeading", "utilities.codefiles.button.MaintainHeading");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
