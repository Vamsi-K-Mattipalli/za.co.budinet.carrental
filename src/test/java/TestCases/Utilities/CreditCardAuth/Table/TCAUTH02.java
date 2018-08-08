package TestCases.Utilities.CreditCardAuth.Table;

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
import pageLibrary.Utilities;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCAUTH02 extends TestCore {
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("UTILITIES")
    @Feature("CREDIT CARD")
    @Story("AUTH TABLE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCAUTH02_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo3("utilities.menu.utilities", "utilities.menu.utilities.creditcardauth", "utilities.menu.utilities.creditcardauth.authtable");
        driverwait();
        Utilities.CredtiCardAuth("Corporate");
        Generics.ClickButtonLink("utilities.field.emailAdd", "utilities.field.emailAdd");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
