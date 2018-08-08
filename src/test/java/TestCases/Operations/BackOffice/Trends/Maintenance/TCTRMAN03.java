package TestCases.Operations.BackOffice.Trends.Maintenance;

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

public class TCTRMAN03 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("BACKOFFICE")
    @Story("TRENDS MAINTENANCE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCTRAN01_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.backoffice",
                "operations.menu.backoffice.trends", "operations.menu.backoffice.trends.maintenance");
        Generics.FieldPopulate("Finacial Year", "maintance.field.finyear", "17");
        Generics.FieldPopulate("Strcture Number", "maintance.field.strno", "1");
        Generics.FieldPopulate("Level Number", "maintance.field.levno", "2");
        Generics.ClickButtonLink("nonrevenue.button.add", "nonrevenue.button.add");
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }


}
