package TestCases.Fleet.Order.Profile;

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
import pageLibrary.OrderLoad;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCFO004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("ORDER")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFO004_FLEET_ORDER_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.order", "fleet.menu.order.profile");
        driverwait();
        //OrderLoad.DealerSelect();
       // OrderLoad.Populate();
       // Generics.ClearTextField("order.field.leaseperiod");
       // Generics.FieldPopulate("Lease Period","order.field.leaseperiod","60");
     //   Generics.ClickButtonLink("order.button.submit.order","order.button.submit.order");
        //driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
