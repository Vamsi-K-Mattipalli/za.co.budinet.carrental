package TestCases.Operations.Quotation.Enquiry;

import config.DataProviders;
import config.TestCore;
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
public class TCQUOENQ05 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }


    @Epic("OPERATIONS")
    @Feature("QOUTATION")
    @Story("ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCQUOENQ05_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("operations.menu.operation", "operations.menu.quotation", "operations.menu.quotation.enquiry");
        driverwait();
      //  Generics.FieldPopulate("PickUp Date", "qoutation.field.PUDATE", "2018-01-25");
        //Generics.CheckBoxSelect("Bidvest Qoutation", "qoutation.field.BUDGETINTERNET");
      //  Generics.ClickButtonLink("analysis.analysis.button.Submit", "analysis.analysis.button.Submit");
        driver.close();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
