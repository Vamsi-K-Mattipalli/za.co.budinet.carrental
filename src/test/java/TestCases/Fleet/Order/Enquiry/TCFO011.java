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
public class TCFO011 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("FLEET")
    @Feature("ORDER")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFO011_FLEET_ORDER_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.order", "fleet.menu.order.enquiry");
        driverwait();
        Generics.ClickButtonLink("order.link.vehiclegroup","order.link.vehiclegroup");

        Generics.DropdownSelector("Order Type", "order.dropdown.ordertype", "Fleet Order");
        Generics.DropdownSelector("Order Status", "order.dropdown.orderstatus", "Open");
        Generics.ClickButtonLink("order.dropdown.ordersubmit","order.dropdown.ordersubmit");
        driver.close();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
