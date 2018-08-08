package TestCases.EndToEnd;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.*;

/**
 * Created by GregDev on 2017/05/16.
 */
public class ENDTOEND001 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("END")
    @Feature("TO")
    @Story("END")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void ENDTOEND001_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.quotation", "operations.menu.quotation.profile");
        Qoute.NavigateTo("Corporate Account Holder");
        Qoute.populate("qoute.dropdown.txtQuoteRateType", "qoute.button.weavers");
        Generics.FieldPopulate("Account No", "qoute.field.txtAccountNo", "10632400009");
        Generics.FieldPopulate("Account Name", "qoute.field.txtAccountName", "ENGEN PETROLEUM LTD");
        Generics.ClickButtonLink("qoute.button.submitqoute", "qoute.button.submitqoute");
        driverwait();
        Generics.ConfirmSubmit(Username, Password);
        driverwait();

        //Menu.NavigateTo3("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.profile");
        //Reservation.NavigateTo("Corporate / Indiv Acct Holder");
        Reservation.populate();
        Reservation.SelectProduct("raprofile.link.waivers", "raprofile.field.cdw");
        Generics.ClickButtonLink("raprofile.button.confirm", "raprofile.button.confirm");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
