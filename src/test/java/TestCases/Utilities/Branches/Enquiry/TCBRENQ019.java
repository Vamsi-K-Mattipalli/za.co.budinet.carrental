package TestCases.Utilities.Branches.Enquiry;

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

public class TCBRENQ019 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("BRANCH")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBRENQ019_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.branches", "utilities.menu.utilities.branches.enquiry");
        driverwait();
        Generics.DropdownSelector("Company Type", "utilities.dropdown.COMPANYTYPE", "Depot");
        Generics.DropdownSelector("Operating Regions", "utilities.dropdown.REGION", "Head Office");
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
