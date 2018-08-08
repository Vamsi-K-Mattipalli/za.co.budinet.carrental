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
public class TCSV33 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV33_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.vourcher", "salesmarketing.menu.vourcher.reistate");
        driverwait();
        Generics.FieldPopulate("Voucher Number","voucher.field.VoucherNo","14460727");
        Generics.ClickButtonLink("voucher.button.find","voucher.button.find");
        Generics.FieldPopulate("Reason For Cancel", "voucher.field.ReinstateReason", "Not Needed");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        driver.close();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
