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

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCBRPROF004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("BRANCH")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCBRPROF004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.branches", "utilities.menu.utilities.branches.profile");
        driverwait();
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("utilities.field.txtBranchCode", "utilities.field.txtBranchCode");
        Generics.FieldPopulate("MMH Coy", "utilities.field.txtBranchCode", "579");
        Generics.ClickButtonLink("utilities.button.binacular", "utilities.button.binacular");
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.ClearTextField("utilities.field.tradname");
        Generics.FieldPopulate("Trading Name", "utilities.field.tradname", "OR Tambo Intl Airport JS");
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("utilities.button.reset", "utilities.button.reset");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
