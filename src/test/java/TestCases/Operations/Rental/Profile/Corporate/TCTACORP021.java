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

public class TCTACORP021 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL AGREEMENT")
    @Story("CORPORATE / INDIVIDUAL ACCCOUNT HOLDER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTACORP021_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
        Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        Reservation.populate();
      //  Generics.ClearTextField("raprofile.dropdwon.vehiclegroup");
    //    Generics.DropdownSelector("Vehicle Group", "raprofile.dropdwon.vehiclegroup", "D - Ford Fiesta 5dr Auto/similar");
     //   Reservation.SelectProduct("raprofile.link.waivers", "raprofile.field.cdw");
    //    Generics.ClickButtonLink("raprofile.button.confirm", "raprofile.button.confirm");
        // Reservation.SelectRenterLookUp("nonrevenue.button.select");
        driverwait();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
