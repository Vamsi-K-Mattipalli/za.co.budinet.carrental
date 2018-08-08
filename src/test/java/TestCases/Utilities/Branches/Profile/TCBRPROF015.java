package TestCases.Utilities.Branches.Profile;

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

public class TCBRPROF015 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("BRANCH")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBRPROF015_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.branches", "utilities.menu.utilities.branches.profile");
        Generics.switchToFrame("core");
        Generics.FieldPopulate("Branch Code", "utilities.field.txtBranchCode1", "JS");
        Generics.ClickButtonLink("utilities.button.binacular1", "utilities.button.binacular1");
        Generics.ClickButtonLink("utilities.tabs.%s", "utilities.tabs.%s");
        driverwait();
        //Generics.DropdownSelector("Type", "utilities.dropdown.types", "Revenue");
       // Generics.FieldPopulate("Date", "utilities.field.dates", "2017-10-01");
      //  Generics.FieldPopulate("Percentage", "utilities.field.perc", "5");
      //  Generics.ClickButtonLink("utilities.button.Add", "utilities.button.Add");
        driverwait();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
