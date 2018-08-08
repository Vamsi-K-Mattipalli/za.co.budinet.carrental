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
public class TCSV36 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV36_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.renter", "salesmarketing.menu.renter.enquiry");
        driverwait();
        Generics.FieldPopulate("Renter ID", "renter.field.RENTERID", "7405280072087");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        Generics.switchToFrame("MainTabs");
        driver.switchTo().frame(1);
        Generics.ClickButtonLink("loyalty.button.modify","loyalty.button.modify");
        driverwait();
        Generics.CurrentDate("Effective To Date","renter.field.efftodate");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
