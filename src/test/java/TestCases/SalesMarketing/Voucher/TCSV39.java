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
public class TCSV39 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV39_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.loyal", "salesmarketing.menu.loyal.enquiry");
        driverwait();
        Generics.DropdownSelector("Loyalty Program","loyalty.dropdown.cmbLoyaltyProgram","Voyager");
        Generics.DropdownSelector("Loyalty Reward Status","loyalty.dropdown.cmbLoyaltyStatus","Credit Created");
        Generics.FieldPopulate("Loyalty Number","loyalty.field.txtLoyaltyNo","1106715");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        driver.close();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
