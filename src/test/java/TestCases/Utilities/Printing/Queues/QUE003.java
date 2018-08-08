package TestCases.Utilities.Printing.Queues;

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

public class QUE003 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("PRINTING")
    @Story("QUEUES")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void QUE003_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.printing", "utilities.menu.utilities.printing.quenue");
        driverwait();
        Generics.FieldPopulate("Run Date", "utilities.field.rundate", "2017-01-31");
        //Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
       // Generics.ClickButtonLink("utilities.button.reports", "utilities.button.reports");
       // Generics.ClickButtonLink("utilities.button.newrequest", "utilities.button.newrequest");

      //  Generics.FieldPopulate("Destination Address", "utilities.field.desadd", "gregzwane@bcr.co.za");
    //    Generics.FieldPopulate("Attention", "utilities.field.DelTo", "TANYA");
     //   Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
