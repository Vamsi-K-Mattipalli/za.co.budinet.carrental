package TestCases.Operations.Quotation.Profile.TravelAgentCorporation;

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
public class TCTAfCR150 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("QOUTATION")
    @Story("TRAVEL AGENT FOR CORPORATE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTAfCR150_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.quotation", "operations.menu.quotation.profile");
        Qoute.NavigateTo("Travel Agent (For Corporate)");
        Qoute.minipopulateCorp();
        Qoute.populate("qoute.dropdown.txtIncludeRateType", "qoute.button.weavers");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
