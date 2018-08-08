package TestCases.Operations.Quotation.Profile.TourOperator;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.Qoute;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCTOPR44 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("QOUTATION")
    @Story("TOUR OPERATOR")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTOPR44_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.quotation", "operations.menu.quotation.profile");
        Qoute.NavigateTo("Tour Operator");
        Qoute.minipopulate("qoute.dropdown.txtIncludeRateType", "qoute.button.weavers");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
