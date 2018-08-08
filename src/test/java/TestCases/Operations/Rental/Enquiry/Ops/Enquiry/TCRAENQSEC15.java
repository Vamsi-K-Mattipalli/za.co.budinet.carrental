package TestCases.Operations.Rental.Enquiry.Ops.Enquiry;

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
public class TCRAENQSEC15 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("OPS ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCRAENQSEC15_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        Generics.ClickButtonLink("ops.link.reservationbychangeoverbranch", "ops.link.reservationbychangeoverbranch");
        Generics.DropdownSelector("ChangeOverBranch", "ops.dropdown.DUEBACKBRANCH", "Crystal towers CT");
        Generics.FieldPopulate("Pick Up time", "ops.field.TIME", "0800");
        Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");

        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
