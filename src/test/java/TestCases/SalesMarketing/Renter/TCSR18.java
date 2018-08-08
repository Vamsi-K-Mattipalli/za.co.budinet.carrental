package TestCases.SalesMarketing.Renter;

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
public class TCSR18 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("RENTER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSR18_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.renter", "salesmarketing.menu.renter.enquiry");
        driverwait();
        Generics.DropdownSelector("Renter Type", "renter.dropdown.RENTERIDTYPE", "SA ID");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        Generics.ClickButtonLink("loyalty.link.renterid", "loyalty.link.renterid");
        driver.switchTo().frame("core");
        Generics.ClickButtonLink("renter.tab.correspondence", "renter.tab.correspondence");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
