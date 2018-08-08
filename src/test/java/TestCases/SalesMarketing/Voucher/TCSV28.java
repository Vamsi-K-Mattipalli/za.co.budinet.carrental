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
public class TCSV28 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("VOUCHER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSV28_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.vourcher", "salesmarketing.menu.vourcher.print");
        driverwait();
        Generics.switchToFrame("core");
        Generics.ClearDropDownField("voucher.dropdown.cmbByStatus");
        Generics.DropdownSelector("Print By Status","voucher.dropdown.cmbByStatus","Allocated");
        Generics.FieldPopulate("Voucher Number", "voucher.field.txtRangeFromNo", "145610");
        Generics.FieldPopulate("Printer Number", "voucher.field.txtPrinterNo", "0190");
        Generics.ClickButtonLink("voucher.button.RePrint", "voucher.button.RePrint");
        //driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
