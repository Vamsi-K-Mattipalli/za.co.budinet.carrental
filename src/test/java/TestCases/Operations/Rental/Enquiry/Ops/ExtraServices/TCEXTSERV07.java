package TestCases.Operations.Rental.Enquiry.Ops.ExtraServices;

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
public class TCEXTSERV07 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("EXTRA SERVICES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCEXTSERV07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        Generics.ClickButtonLink("ops.link.reservationbycollectionbranch", "ops.link.reservationbycollectionbranch");
        Generics.DropdownSelector("Region", "ops.dropdown.DUEBACKBRANCH", "Centurion Hotel CV");
        Generics.FieldPopulate("Pick up Time", "raprofile.field.duebacktime", "0800");
        Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
