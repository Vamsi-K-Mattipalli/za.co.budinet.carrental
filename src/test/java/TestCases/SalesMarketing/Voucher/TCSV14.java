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
public class TCSV14 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV14_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.vourcher", "salesmarketing.menu.vourcher.enquiry");
        driverwait();
        Generics.FieldPopulate("RA No", "voucher.field.RANO", "JS85847I01");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
