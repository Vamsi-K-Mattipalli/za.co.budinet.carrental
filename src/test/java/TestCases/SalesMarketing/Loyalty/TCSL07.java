package TestCases.SalesMarketing.Loyalty;

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
import pageLibrary.SalesMarketing;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCSL07 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("LOYALTY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSL07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.loyal", "salesmarketing.menu.loyal.extloy");
        driverwait();
        SalesMarketing.LoyaltyPopulate();
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
