package TestCases.Operations.Rental.Door2Door;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCD2D006 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("DOOR TO DOOR")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCD2D001_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
      //  driver.switchTo().frame("core");
       // Generics.FieldPopulate("Bidvest No", "raprofile.field.bidvestno", "JS51702I01");
       // Generics.ClickButtonLink("raprofile.button.binaculars", "raprofile.button.binaculars");
        driverwait();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
