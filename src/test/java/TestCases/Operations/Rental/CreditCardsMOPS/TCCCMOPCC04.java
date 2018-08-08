package TestCases.Operations.Rental.CreditCardsMOPS;

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
public class TCCCMOPCC04 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("CREDIT CARD")
    @Story("MOPS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCNRCONMV04_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        Generics.ClickButtonLink("operation.link.resevetionsbyres", "operation.link.resevetionsbyres");
//        Reservation.ReservationBy();
   //     driverwait();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
