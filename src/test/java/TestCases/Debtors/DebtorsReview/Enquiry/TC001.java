package TestCases.Debtors.DebtorsReview.Enquiry;

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
    public void TC001_DEBTORS_REVIEW_ENQUIRY() throws Exception {
        LogIn.SignIn("951532", "111111");
        Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.review", "debtors.menu.review.enquiry");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
