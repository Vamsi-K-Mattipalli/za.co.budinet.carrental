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
public class TCSV38 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV38_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.renter", "salesmarketing.menu.renter.merge");
        driverwait();
        driver.switchTo().frame("mainTabs");
        Generics.ClearDropDownField("voucher.dropdown.txtRenterIDType");
        Generics.DropdownSelector("Renter ID Type","voucher.dropdown.txtRenterIDType","SA ID");
        Generics.FieldPopulate("Renter ID Number","voucher.field.txtRenterIDNo","7610245175087");
        Generics.DropdownSelector("Merge With Renter ID Type","voucher.dropdown.IDType","SA ID");
        Generics.FieldPopulate("Merge With Renter ID Number","voucher.field.IDNo","0000000000000");
        Generics.ClickButtonLink("voucher.button.add","voucher.button.add");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
