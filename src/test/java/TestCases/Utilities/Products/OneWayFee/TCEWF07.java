package TestCases.Utilities.Products.OneWayFee;

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

public class TCEWF07 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRODUCTS")
    @Story("ONE WAY FEE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCEWF07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.products", "utilities.menu.utilities.products.onewayfee");
        Generics.FieldPopulate("Effective Date", "utilities.field.EFFFROMDATE", "2017-11-01");
        Generics.DropdownSelector("Market Segment", "utilities.dropdown.MKTSEG", "Corporate");
        Generics.DropdownSelector("Pick Up Branch", "utilities.dropdown.PUBRANCH", "OR Tambo Intl Airport JS");
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
