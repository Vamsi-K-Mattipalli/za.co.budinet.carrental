package TestCases.Debtors.Financial.CrNote;

import config.TestCore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;
import pageLibrary.LogIn;
import pageLibrary.Menu;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TC001 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Test
    public void TC001_DEBTORS_FINANCE_CREDITNOTE() throws Exception {
        LogIn.SignIn("951532", "111111");
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.finance", "debtors.menu.finance.note");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
