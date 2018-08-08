package TestCases.Debtors.Financial.MngmntBal;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

public class TCFMB02 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("FINANCIAL")
    @Story("MANAGEMENT BALANCE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFMB02_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.finance", "debtors.menu.finance.managementbalance");
        driverwait();
      //  Generics.FieldPopulate("Date", "debtors.field.date", "201701");
      //  Generics.DropdownSelector("Balancing View", "debtors.dropdown.balancingview", "Overall group customers");
       // Generics.DropdownSelector("Type", "debtors.dropdown.financial.type", "Corporate");
      //  Generics.DropdownSelector("Print Requirements", "debtors.dropdown.printrequirements", "Send EMail");
       //Generics.ClickSubmit("debtors.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
