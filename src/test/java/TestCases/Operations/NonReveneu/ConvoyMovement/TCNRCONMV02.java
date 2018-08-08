package TestCases.Operations.NonReveneu.ConvoyMovement;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.NonRevenue;

public class TCNRCONMV02 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("NON REVENUE")
    @Story("CONVOY MOVEMENT")
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class , description = "Convoy movement")
    public void TCNRCONMV02_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.nonreveue", "operations.menu.nonreveue.convoymvnts");
        NonRevenue.ConvoyProfile();
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
