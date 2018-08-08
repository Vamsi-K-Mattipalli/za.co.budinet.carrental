package TestCases.Utilities.Accessories.Enquiry;

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
public class TCENQ09 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("ACCESSORIES")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCENQ09_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.accessories", "utilities.menu.utilities.accessories.enquiry");
        Generics.DropdownSelector("Located at Branch", "utilities.dropdown.LocatedAtBranch", "OR Tambo Intl Airport JS");
        Generics.DropdownSelector("Accessory Type", "utilities.dropdown.AccessoryType1", "GPS");
        Generics.DropdownSelector("Accessory Status", "utilities.dropdown.Status1", "Rental");
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
