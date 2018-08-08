package TestCases.Utilities.CreditCardAuth.Auth;

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

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCCCAUTH05 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CREDIT CARD")
    @Story("AUTH")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCCAUTH05_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.creditcardauth", "utilities.menu.utilities.creditcardauth.authamounts");
        driverwait();
        Generics.DropdownSelector("Market Segment", "utilities.dropdown.MarketSegment", "Travel Agent");
        Generics.DropdownSelector("Vehicle Group", "utilities.dropdown.VehicleGroup", "C - Toyota Corolla Quest/similar");
        Generics.CheckBoxSelect("STD", "utilities.field.SUP");
        Generics.FieldPopulate("Number of Days", "utilities.field.Days", "05");
       // Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
