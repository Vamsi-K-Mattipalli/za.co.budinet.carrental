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

public class TCTACORP046 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL AGREEMENT")
    @Story("CORPORATE / INDIVIDUAL ACCCOUNT HOLDER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTACORP046_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
        Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        Reservation.populate();
        //Generics.DropdownSelector("ID Type", "raprofile.dropdown.idtype", "SA ID");
        //Generics.ClearTextField("raprofile.field.identifyingno");
       // Generics.FieldPopulate("ID No", "raprofile.field.identifyingno", "79112952000841");
       // Reservation.SelectProduct("raprofile.link.waivers", "raprofile.field.cdw");
      //  Generics.ClickButtonLink("raprofile.button.confirm", "raprofile.button.confirm");
      //  Generics.PopMessege("Format of Id No. 79112952000841 invalid - please re-enter");
        driverwait();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
