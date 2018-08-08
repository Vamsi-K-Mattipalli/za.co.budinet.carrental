package TestCases.Operations.InternationalRA.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class RAPRO006 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("INTERNATIONAL RA")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void RAPRO006_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
      //  Menu.NavigateTo3("operations.menu.operation", "operations.menu.InternationRA", "operations.menu.InternationRA.profile");
        driverwait();
      //  Operational.iRAPayment();
     //   Operational.iRARental();
      //  Operational.iRAExchange();
        //Generics.ClickButtonLink("international.button.submit", "international.button.submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
