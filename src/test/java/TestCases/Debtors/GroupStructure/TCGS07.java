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

public class TCGS07 extends TestCore
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
    public void TCGS07_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo2("debtors.menu.debtors", "debtors.menu.group");
        driverwait();
        //Generics.DropdownSelector("Structure Type", "debtors.dropdown.structuretype", "Rebates");
      //  Generics.DropdownSelector("Customer Group", "debtors.dropdown.customergroup", "A M S");
       // Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
      //  Generics.FieldPopulate("Level Type", "debtors.field.leveltype", "G");
      //  Generics.FieldPopulate("Description", "debtors.field.description", "Fixed");
     //   Generics.ClickButtonLink("debtors.button.add", "debtors.button.add");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
