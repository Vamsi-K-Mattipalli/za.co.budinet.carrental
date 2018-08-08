package TestCases.Fleet.Order.Enquiry;

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
public class TCFO023 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("ORDER")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFO023_FLEET_ORDER_ENQUIRY(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.order", "fleet.menu.order.enquiry");
        driverwait();
        Generics.ClickButtonLink("order.link.deliveries","order.link.deliveries");
        Generics.DropdownSelector("Order Type", "order.dropdown.ordertype", "Fleet Order");
        Generics.DropdownSelector("Order Status", "order.dropdown.orderstatus", "Open");
        Generics.DropdownSelector("Country", "order.dropdown.countrydel", "South Africa");
        Generics.ClickButtonLink("order.link.delcurrentmonth", "order.link.delcurrentmonth");
        Generics.ClickButtonLink("order.link.delcurrentmonth", "order.link.delcurrentmonth");
        //Generics.ClickButtonLink("order.dropdown.ordersubmit", "order.dropdown.ordersubmit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
