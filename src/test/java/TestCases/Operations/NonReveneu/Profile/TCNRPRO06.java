package TestCases.Operations.NonReveneu.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCNRPRO06 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("NON REVENUE")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TC006_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
    /**    Menu.NavigateTo3("operations.menu.operation", "operations.menu.nonreveue", "operations.menu.nonreveue.profile");
        GlobalDriver.driver.switchTo().frame("core");
        driverwait();
        driver.switchTo().frame("core");
        Generics.ClickButtonLink("nonrevenue.field.nonrevenuenumber", "nonrevenue.field.nonrevenuenumber");
        Generics.FieldPopulate("Non-Revenue Number", "nonrevenue.field.nonrevenuenumber", "1WNR00015014");
        Generics.ClickButtonLink("nonrevenue.button.find", "nonrevenue.button.find");
        driverwait();
        GlobalDriver.driver.switchTo().frame("mainTabs");
        GlobalDriver.driver.switchTo().frame("tabStrips");
        Generics.ClickButtonLink("nonrevenue.tab.inmovement", "nonrevenue.tab.inmovement");
        driverwait();
        GlobalDriver.driver.switchTo().frame("tabData"); **/
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
