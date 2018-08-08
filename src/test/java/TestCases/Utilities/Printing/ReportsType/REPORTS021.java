package TestCases.Utilities.Printing.ReportsType;

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
public class REPORTS021 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRINTING")
    @Story("REPORT TYPE")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void REPORTS021_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.printing", "utilities.menu.utilities.printing.reportscheduler");
        driverwait();
        Generics.FieldPopulate("Description", "utilities.button.description", "AUDIT DATA");
        Generics.ClickButtonLink("utilities.button.Search1", "utilities.button.Search1");
        driverwait();
        Generics.ClickButtonLink("utilities.button.newrequest","utilities.button.newrequest");
        driverwait();
        Generics.ClickButtonLink("utilities.button.immediate","utilities.button.immediate");
        Generics.FieldPopulate("Destination Address","utilities.button.desaddress","jan.zwane@bcx.co.za");
        Generics.FieldPopulate("Attention","utilities.field.DelTo","AUTOMATION REPORT");
        Generics.DropdownSelector("Branch","ParmTable","OR Tambo Intl Airport JS");
      //  Generics.FieldPopulate("","","201712");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
