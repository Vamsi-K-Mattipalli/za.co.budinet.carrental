package TestCases.Utilities.Codes.InternationalRA;

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

public class TCINTRA004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("INTERNATIONAL RA")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCINTRA004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.internationalRA");
        driverwait();
        Generics.switchToFrame("mainTabs");
        //Generics.DropdownSelector("International RA Type", "utilities.intra.dropdown.intratype", "Mozambique");
        Generics.FieldPopulate("International RA Type", "utilities.intra.field.IBType", "MZ");
        Generics.FieldPopulate("Description", "utilities.intra.field.Description", "Mozambique");
        Generics.DropdownSelector("Operating Currency", "utilities.intra.dropdown.OpCurrency", "US Dollars");
        Generics.FieldPopulate("RA Prefix", "utilities.intra.field.RAPrefix", "MZ");
        Generics.CheckBoxSelect("Currency Required", "utilities.intra.field.CURRENCYREQ");
        Generics.CheckBoxSelect("Exchange Rate Required", "utilities.intra.field.EXRATEREQ");
        Generics.CheckBoxSelect("GST Inclusive/Exclusive Required", "utilities.intra.field.GSTINCEXCL");
        Generics.CheckBoxSelect("Daily Revenue Required", "utilities.intra.field.DAILYREVREQ");
        Generics.CheckBoxSelect("Currency Conversion Required", "utilities.intra.field.CURRCONVREQ");
        Generics.DropdownSelector("Account Type", "utilities.intra.dropdown.text1", "IB Mozambique - TO");
        Generics.DropdownSelector("Currency", "utilities.intra.dropdown.text2", "South African Rand");
        Generics.ClickButtonLink("utilities.intra.button.Add", "utilities.intra.button.Add");
        Generics.ClickButtonLink("utilities.intra.button.Submit","utilities.intra.button.Submit");
        driverwait();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
