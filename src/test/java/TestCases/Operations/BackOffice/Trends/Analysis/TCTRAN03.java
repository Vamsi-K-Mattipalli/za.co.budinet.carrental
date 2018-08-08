package TestCases.Operations.BackOffice.Trends.Analysis;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;

public class TCTRAN03 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }


    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("TRENDS ANALYSIS")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTRAN01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
       // Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
     //           "operations.menu.backoffice.trends", "operations.menu.backoffice.trends.analysis");
     //   Generics.DropdownSelector("Highest Leve No", "analysis.dropdown.HighLevelNo", "BIDVEST CAR RENTAL");
     //   Generics.ClickButtonLink("analysis.field.Month", "analysis.field.Month");
    //    Generics.FieldPopulate("Month", "analysis.field.Month", "09");
    //    Generics.FieldPopulate("Year", "analysis.field.Year", "17");
      //  Generics.DropdownSelector("Trend Selection", "analysis.dropdown.TRENDS", "Trends by Rate Group");
      //  Generics.ClickButtonLink("analysis.button.SendToPrinter", "analysis.button.SendToPrinter");
     //   driverwait();
        driverwait();
     //   Object[] allWindows = driver.getWindowHandles().toArray();
     //   driver.switchTo().window(allWindows[2].toString());
     //   driver.switchTo().activeElement();
     //   Generics.DropdownSelector("Select printer from Branch", "analysis.dropdown.brancono", "OR Tambo Intl Airport JS");
     //   Generics.ClickButtonLink("analysis.button.retrieveprinter", "analysis.button.retrieveprinter");
     //   driverwait();
     //   Generics.ClickButtonLink("analysis.link.printer", "analysis.link.printer");
     //   driverwait();
     //   driver.switchTo().window(allWindows[1].toString());
      //  Generics.ClickButtonLink("analysis.analysis.button.Submit", "analysis.analysis.button.Submit");
        driver.close();


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }


}
