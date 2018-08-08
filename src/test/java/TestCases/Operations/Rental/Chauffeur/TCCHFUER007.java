package TestCases.Operations.Rental.Chauffeur;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCCHFUER007 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("CHAUFFEUR")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCHFUER007_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
    //    Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        // Reservation.populate();
        //  Reservation.SelectProduct("raprofile.link.waivers", "raprofile.field.cdw");
        //   Generics.ClickButtonLink("raprofile.button.confirm", "raprofile.button.confirm");
        //Reservation.SelectRenterLookUp("nonrevenue.button.create");
        driverwait();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
