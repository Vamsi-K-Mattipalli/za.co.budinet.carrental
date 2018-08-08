package TestCases.Operations.Rental.MultipleUtilites.AllocMultVeh;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCMUAV005 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("MULTIPLE UTILITIES")
    @Story("ALLOCATION MULTIPLE VEHICLE")
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCMUAV005_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.multiple","operations.menu.rental.multiple.alloc.multi");
        driverwait();
        //Generics.DropdownSelector("Vehicle Group","fullybooked.dropdown.VEHGRP","B1 - Ford Fiesta/similar SnappD");
        Generics.ClickButtonLink("backoffice.button.submit","backoffice.button.submit");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
