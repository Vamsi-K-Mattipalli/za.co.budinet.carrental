package TestCases.Utilities.Codes.InternationalRA;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCINTRA008 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("INTERNATIONAL RA")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCINTRA008_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.internationalRA");
        driverwait();
       // Generics.switchToFrame("core");
      //  Generics.DropdownSelector("International RA Type", "utilities.intra.dropdown.intratype", "Mozambique");
      //  Generics.ClickButtonLink("utilities.intra.button.find", "utilities.intra.button.find");
     //   Generics.ClickButtonLink("utilities.tab.tab2sel", "utilities.tab.tab2sel");
     //   Generics.DropdownSelector("Type", "utilities.intra.dropdown.type", "Royalty %");
    //    Generics.FieldPopulate("Date", "utilities.intra.field.date1", "2017-10-31");
     //   Generics.ClickButtonLink("utilities.intra.button.Add", "utilities.intra.button.Add");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
