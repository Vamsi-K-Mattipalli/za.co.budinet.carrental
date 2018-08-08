package TestCases.Operations.Rental.Enquiry.Ops.ExternalEnquiries;

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
public class TCEXTE06 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("EXTERNAL ENQUIRIES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCEXTE06_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        Generics.ClickButtonLink("ops.link.reservationbyawaitingconfirmation", "ops.link.reservationbyawaitingconfirmation");
        Generics.DropdownSelector("Customer", "ops.dropdown.CUSTOMER", "Emirates");
        Generics.FieldPopulate("FTP Date", "operation.field.pickupdate", "2017-09-30");
        Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");
        Generics.ClickButtonLink("ops.link.customerref", "ops.link.customerref");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
