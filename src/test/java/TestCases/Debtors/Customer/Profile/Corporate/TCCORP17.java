package TestCases.Debtors.Customer.Profile.Corporate;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.Debtors;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCCORP17 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Feature("DEBTORS")
    @Story("CUSTOMER PROFILE CORPORATE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCORP17_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.customers", "debtors.menu.customers.profile");
        Debtors.populateCustomerProfile("Corporate");
     //   Generics.ClickSubmit("debtors.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
