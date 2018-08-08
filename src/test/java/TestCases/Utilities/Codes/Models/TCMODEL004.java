package TestCases.Utilities.Codes.Models;

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

public class TCMODEL004 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("UTILITIES")
    @Feature("CODES")
    @Story("MODELS")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCMODEL004_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.codes", "utilities.menu.utilities.codes.models");
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Model Code", "utilities.models.field.model", "26001");
        Generics.FieldPopulate("Original Code", "utilities.models.field.originalcode", "26001");
        Generics.DropdownSelector("Group", "utilities.models.dropdown.CVEHGRP", "C - Toyota Corolla Quest/similar");
        Generics.FieldPopulate("Description", "utilities.models.field.description1", "Kia Cerato 1.6 M/T Sedan");
        Generics.CheckBoxSelect("Factory Unit Number Required", "utilities.models.field.factory");
        Generics.FieldPopulate("CO2 Factor", "utilities.models.field.co2", "23");
        Generics.DropdownSelector("International Car Class", "utilities.models.dropdown.CINTCLS", "Economy");
        Generics.DropdownSelector("Car Type", "utilities.models.dropdown.CINTTP", "4 DR");
        Generics.DropdownSelector("Transmission", "utilities.models.dropdown.CINTTRNS", "Manual");
        Generics.DropdownSelector("Air-Condition", "utilities.models.dropdown.CINTACON", "Yes");
        Generics.FieldPopulate("Dealer Service", "utilities.models.field.dealerservice", "15000");
        Generics.FieldPopulate("First Scheduled Service", "utilities.models.field.firstservice", "15000");
        Generics.FieldPopulate("Scheduled Interval", "utilities.models.field.serviceint", "15000");
        Generics.DropdownSelector("Vehicle Class", "utilities.models.dropdown.vehclass", "Class 2 Light Vehicles");
        Generics.CheckBoxSelect("Dual Class Indicator", "utilities.models.field.dualClassInd");
        Generics.DropdownSelector("Axle Class", "utilities.models.dropdown.axleclass", "2 Axles");
        Generics.DropdownSelector("SANRAL Vehicle Brand", "utilities.models.dropdown.vehbrand", "BRAND 1");
        Generics.FieldPopulate("M&M Code", "utilities.models.field.mmcode", "2");
        Generics.ClickButtonLink("utilities.models.button.Add", "utilities.models.button.Add");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
