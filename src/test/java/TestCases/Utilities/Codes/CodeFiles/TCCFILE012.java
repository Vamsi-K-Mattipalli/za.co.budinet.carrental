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

public class TCCFILE012 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("CODE FILES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCFILE012_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.codefile");
        driverwait();
        Generics.DropdownSelector("Code", "utilities.codefiles.dropdown.SETOFDATA", "Add New");
        Generics.ClickButtonLink("utilities.codefiles.button.MaintainCode", "utilities.codefiles.button.MaintainCode");
        Generics.FieldPopulate("Original Code", "utilities.codefiles.field.originalcode", "COB1");
        Generics.FieldPopulate("Code", "utilities.codefiles.field.code", "COB");
        Generics.FieldPopulate("Description", "utilities.codefiles.field.description1", "COB Description");
        Generics.ClickButtonLink("utilities.button.Add", "utilities.button.Add");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
