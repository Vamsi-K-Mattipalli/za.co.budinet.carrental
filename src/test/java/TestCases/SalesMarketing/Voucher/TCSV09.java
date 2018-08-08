package TestCases.SalesMarketing.Voucher;

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
public class TCSV09 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV09_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.vourcher", "salesmarketing.menu.vourcher.enquiry");
        driverwait();
        Generics.DropdownSelector("Status", "voucher.dropdown.STATUS", "Stolen");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        Generics.ClickButtonLink("loyalty.link.customerno", "loyalty.link.customerno");
        Generics.switchToFrame("mainTabs");
        driver.switchTo().frame(1);
        Generics.ClickButtonLink("voucher.button.view", "voucher.button.view");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
