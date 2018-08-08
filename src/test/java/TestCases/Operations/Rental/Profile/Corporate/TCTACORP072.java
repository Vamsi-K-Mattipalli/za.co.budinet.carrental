package TestCases.Operations.Rental.Profile.Corporate;

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
import pageLibrary.Reservation;

public class TCTACORP072 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("RENTAL AGREEMENT")
    @Story("CORPORATE / INDIVIDUAL ACCCOUNT HOLDER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTACORP072_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
        Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        Reservation.minipopulate("Namibian ID", "740528007208");
        Generics.ClickButtonLink("raprofile.button.binacularreferralname", "raprofile.button.binacularreferralname");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
