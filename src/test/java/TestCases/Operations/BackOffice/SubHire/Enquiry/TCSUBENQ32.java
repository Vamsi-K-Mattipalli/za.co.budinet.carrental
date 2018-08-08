package TestCases.Operations.BackOffice.SubHire.Enquiry;

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

public class TCSUBENQ32 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("SUBHIRE ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSUBENQ32_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
                "operations.menu.backoffice.subhire", "operations.menu.backoffice.subhire.enquiry");
        driverwait();
        Generics.ClickButtonLink("order.link.statuses", "order.link.statuses");
        Generics.DropdownSelector("Order Type", "order.dropdown.ordertype", "Sub Hire Order");
        Generics.DropdownSelector("Status", "order.dropdown.orderstatus", "Open");
        Generics.FieldPopulate("From Date", "order.dropdown.orderfdate", "2018-02-22");
        Generics.FieldPopulate("To Date", "order.dropdown.ordertdate", "2018-02-25");
        Generics.ClickButtonLink("order.dropdown.ordersubmit", "order.dropdown.ordersubmit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
