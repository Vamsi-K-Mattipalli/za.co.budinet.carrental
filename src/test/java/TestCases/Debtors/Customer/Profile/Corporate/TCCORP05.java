package TestCases.Debtors.Customer.Profile.Corporate;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.Debtors;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCCORP05 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("CUSTOMER")
    @Story("CORPORATE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCORP05_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.customers", "debtors.menu.customers.profile");
        Debtors.populateCustomerProfile("Corporate");
        Generics.ClearDropDownField("debtors.dropdown.accounttype");
        Generics.ClearDropDownField("debtors.dropdown.marketsegment");
        Generics.DropdownSelector("Account Type", "debtors.dropdown.accounttype", "Corporate");
        Generics.DropdownSelector("Market Segment", "debtors.dropdown.marketsegment", "Travel Agent");
        Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
