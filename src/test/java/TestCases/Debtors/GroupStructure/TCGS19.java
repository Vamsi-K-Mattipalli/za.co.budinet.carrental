package TestCases.Debtors.GroupStructure;

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

public class TCGS19 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("GROUP")
    @Story("STRUCTURE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCGS19_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo2("debtors.menu.debtors", "debtors.menu.group");

        driver.switchTo().frame("mainTabs");
        //Generics.DropdownSelector("Country", "debtors.dropdown.country", "Namibia South Africa");
        Generics.DropdownSelector("Structure Type", "debtors.dropdown.structuretype", "Rebates");
        Generics.DropdownSelector("Customer Group", "debtors.dropdown.customergroup", "A M S");
        Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
        //Generics.ClickTab("Structure");
        //Generics.FieldPopulate("Level Name", "debtors.field.levelname", "Hold");
       // Generics.DropdownSelector("Level Type", "debtors.dropdown.leveltype", "G");
       // Generics.DropdownSelector("Report To Level", "debtors.dropdown.reporttolevel", "");
       // Generics.CheckBoxSelect("Page Break Required on Level Totals", "debtors.field.leveltotals");
       // Generics.ClickSubmit("debtors.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
