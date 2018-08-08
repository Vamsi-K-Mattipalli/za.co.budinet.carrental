package TestCases.Operations.Rental.Enquiry.Ops.Enquiry;

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
public class TCRAENQSEC06 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL")
    @Story("OPS ENQUIRY")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCRAENQSEC06_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.ops");
        //Generics.ClickButtonLink("ops.link.reservationbypickup", "ops.link.reservationbypickup");
        Generics.FieldPopulate("RA Number","ops.field.RANO","JS15428J01");
        Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");
        driverwait();
       // Generics.DropdownSelector("Vehicle Group", "fullybooked.dropdown.VEHGRP", "G - Audi A4 Auto/similar");
      //  Generics.DropdownSelector("Premium Product", "ops.field.express", "Premium");
       // Generics.FieldPopulate("Credit No", "ops.field.CREDITCARDNO", "123456");
       // Generics.CheckBoxSelect("All Records", "ops.field.ALLRECORDS");
        //Generics.ClickButtonLink("blacklist.button.Submit", "blacklist.button.Submit");
        //driver.switchTo().frame("core");
        Generics.ClickButtonLink("ops.button.printra", "ops.button.printra");

        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
