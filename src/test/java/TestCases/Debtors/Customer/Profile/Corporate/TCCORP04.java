package TestCases.Debtors.Customer.Profile.Corporate;

import config.DataProviders;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

import java.util.List;

public class TCCORP04 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("CUSTOMER")
    @Story("CORPORATE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCORP04_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.customers", "debtors.menu.customers.profile");
        driverwait();
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("mainTabs")));
        driver.switchTo().frame("tabData");

        String add = "input[type='button'][value='Add']";

        List<WebElement> x = driver.findElements(By.cssSelector(add));
        Generics.FieldPopulate("Effective From Date", "debtors.field.effectivefromdate", "2017-11-01");
        Generics.DropdownSelector("Account Type", "debtors.dropdown.accounttype", "Corporate");
        Generics.DropdownSelector("Market Segment", "debtors.dropdown.marketsegment", "Corporate");
        Generics.FieldPopulate("Surname/Company Name", "debtors.field.surnamecompanyname", "BCX");
        Generics.DropdownSelector("Country of Origin", "debtors.dropdown.customer.countryoforigin", "SOUTH AFRICA");
        Generics.DropdownSelector("Country of Operation", "debtors.dropdown.countryofoperation", "SOUTH AFRICA");
        Generics.DropdownSelector("McCarthy Prefix", "debtors.dropdown.mccarthyprefix", "Namibia South Africa");
        Generics.DropdownSelector("Contact Type", "debtors.dropdown.contacttype", "Account Manager");
        x.get(0).click();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
