package TestCases.Debtors.Financial.CrNote.Profile;

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

public class TCFIP03 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("FINANCIAL CREDIT NOTE")
    @Story("PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFIP03_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("debtors.menu.debtors", "debtors.menu.finance", "debtors.menu.finance.note", "debtors.menu.finance.note.profile");
        Generics.CheckBoxSelect("Default Printer", "debtors.field.financial.defaultprinter");
        Generics.DropdownSelector("Printing Requirements", "debtors.dropdown.financial.printingrequirements", "Local Invoices");
        Generics.DropdownSelector("Type of Run", "debtors.dropdown.financial.typeofrun", "Print");
        Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
