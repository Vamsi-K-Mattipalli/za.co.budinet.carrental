package TestCases.Operations.BackOffice.Sanral.Unallocated;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCUNET07 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("SANRAL UNALLOCATED")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCUNET07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
      //  Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice", "operations.menu.backoffice.sanral", "operations.menu.backoffice.sanral.unallocsanral");
       // Generics.DropdownSelector("SANRAL Division", "backoffice.dropdown.sanraldivision", "OR Tambo Intl Airport JS");
       // Generics.FieldPopulate("Transaction Date", "backoffice.field.transactiondate", "2017-10-27");
       // Generics.ClickButtonLink("backoffice.button.submit", "backoffice.button.submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
