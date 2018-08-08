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
public class TCEXTE08 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("EXTERNAL ENQUIRIES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCEXTE08_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        Generics.ClickButtonLink("ops.link.reservationbyenquiry", "ops.link.reservationbyenquiry");
        Generics.DropdownSelector("Customer", "ops.dropdown.CUSTOMER", "Emirates");
        Generics.FieldPopulate("Renter Surname", "raprofile.field.surname", "Smith");
        Generics.FieldPopulate("Initails", "ops.field.RENTERINIT", "JP");
        Generics.FieldPopulate("External Reference No", "ops.field.EXTREFERENCE", "00000000000");
        Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
