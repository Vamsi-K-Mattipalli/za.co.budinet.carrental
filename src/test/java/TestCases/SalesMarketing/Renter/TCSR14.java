package TestCases.SalesMarketing.Renter;

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
public class TCSR14 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("SALES")
    @Feature("MARKERTING")
    @Story("RENTER")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCSR14_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("salesmarketing.menu.sales", "salesmarketing.menu.renter", "salesmarketing.menu.renter.profile");
        driverwait();
        driver.switchTo().frame("MainTabs");
        Generics.DropdownSelector("ID Type", "renter.dropdown.ipIdType", "SA ID");
        Generics.FieldPopulate("ID No", "renter.field.IDNo", "9101015303081");
        Generics.DropdownSelector("Title", "renter.dropdown.ipTitle", "Mr");
        Generics.FieldPopulate("Initials", "renter.field.initial", "J");
        Generics.FieldPopulate("First Name", "renter.field.fname", "Junior");
        Generics.FieldPopulate("Surname", "renter.field.surname", "Phala");
        Generics.ClickButtonLink("loyalty.button.Submit", "loyalty.button.Submit");
        driver.close();



    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
