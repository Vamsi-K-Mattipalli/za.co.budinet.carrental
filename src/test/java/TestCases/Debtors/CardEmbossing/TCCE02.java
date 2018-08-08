package TestCases.Debtors.CardEmbossing;

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

public class TCCE02 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }
    @Epic("DEBTORS")
    @Feature("CARD")
    @Story("EMBOSSING")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCCE02_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo2("debtors.menu.debtors", "debtors.menu.card");
        driver.switchTo().frame("core");
        Generics.DropdownSelector("Card Embossing Type", "debtors.dropdown.cardembossingtype", "RapRez Card");
        Generics.CheckBoxSelect("Print Report", "debtors.field.printreport");
        Generics.CurrentDate("Download Date","debtors.field.downloaddate");
        //Generics.FieldPopulate("Download Date", "debtors.field.downloaddate", "2018-02-18");
        Generics.FieldPopulate("Printer", "debtors.field.printer", "2001");
        Generics.FieldPopulate("No of Copies", "debtors.field.noofcopies", "2");
        Generics.ClickButtonLink("debtors.button.submit","debtors.button.submit");
        driver.close();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();
    }
}
