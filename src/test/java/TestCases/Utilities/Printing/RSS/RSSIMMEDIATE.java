package TestCases.Utilities.Printing.RSS;

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
public class RSSIMMEDIATE extends TestCore {
    @BeforeMethod()
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("PRINTING")
    @Story("RSS IMMEDIATE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "Reports", dataProviderClass = DataProviders.class)
    public void RSSDAILY_Test1(String ReportNo, String Catergory) throws Exception {
        LogIn.SignIn("951532", "testing5");
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.printing", "utilities.menu.utilities.printing.reportscheduler");

        Generics.DropdownSelector("Category","utilities.dropdown.category",Catergory);
        Generics.FieldPopulate("Report No", "utilities.button.report", ReportNo);
        Generics.ClickButtonLink("utilities.button.Search", "utilities.button.Search");
        Generics.ClickButtonLink("utilities.button.newrequest","utilities.button.newrequest");
        Generics.ClickButtonLink("utilities.button.immediate","utilities.button.immediate");
        if(getWebElement("utilities.dropdown.Destination").isDisplayed() && getWebElement("utilities.dropdown.Destination").isEnabled())
        {
            Generics.DropdownSelector("Destination Type","utilities.dropdown.Destination","Email - with attached report");
        }
        driverwait();
        Generics.ClearTextField("utilities.button.desaddres");
        Generics.FieldPopulate("Destination Address","utilities.button.desaddress","jan.zwane@bcx.co.za");
        Generics.FieldPopulate("Destination Address","utilities.field.DelTo",ReportNo);
        //if(getWebElement("utilities.field.finacial")
       // {
       //     Generics.FieldPopulate("","utilities.field.fromdate","20171101");
       // }


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
