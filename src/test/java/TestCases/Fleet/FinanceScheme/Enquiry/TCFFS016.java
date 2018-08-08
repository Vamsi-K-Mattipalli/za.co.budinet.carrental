package TestCases.Fleet.FinanceScheme.Enquiry;

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
public class TCFFS016 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("FLEET")
    @Feature("FINANCE SCHEME")
    @Story("EQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFFS016_FLEET_FINANCESCHEME_ENQUIRY(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("fleet.menu.fleet", "fleet.menu.financeclaim", "fleet.menu.financeclaim.enquiry");
        driverwait();
        Generics.FieldPopulate("Code", "finance.field.code", "BID");
        Generics.ClickButtonLink("order.dropdown.ordersubmit","order.dropdown.ordersubmit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
