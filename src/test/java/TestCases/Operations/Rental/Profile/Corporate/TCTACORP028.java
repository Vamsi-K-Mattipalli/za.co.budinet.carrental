package TestCases.Operations.Rental.Profile.Corporate;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;
import pageLibrary.Reservation;

public class TCTACORP028 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("RENTAL AGREEMENT")
    @Story("CORPORATE / INDIVIDUAL ACCCOUNT HOLDER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTACORP028_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
        Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        Reservation.halfpopulate();
      //  Generics.ClickButtonLink("raprofile.button.retrievedefaults", "raprofile.button.retrievedefaults");
    //    Generics.CheckBoxSelect("raprofile.button.viewoneway", "raprofile.button.viewoneway");
     //   driverwait();
     //   Object[] allWindows = GlobalDriver.driver.getWindowHandles().toArray();
     //   GlobalDriver.driver.switchTo().window(allWindows[2].toString());
     //   GlobalDriver.driver.switchTo().activeElement();
    //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //    Generics.ClickButtonLink("raprofile.button.confirm", "raprofile.button.confirm");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
