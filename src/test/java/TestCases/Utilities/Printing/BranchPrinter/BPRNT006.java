package TestCases.Utilities.Printing.BranchPrinter;

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

public class BPRNT006 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRINTING")
    @Story("BRANCH PRINTER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void BPRNT006_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.printing", "utilities.menu.utilities.printing.branchprinters");
        driverwait();
        Generics.DropdownSelector("Branch Name", "utilities.printing.dropdown.branchname", "OR Tambo Intl Airport JS");
        Generics.ClickButtonLink("utilities.printing.button.linktoprinters", "utilities.printing.button.linktoprinters");
        Generics.DropdownSelector("Printer", "utilities.printing.dropdown.printer", "9999 - EP - RA Printer - 9999");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
