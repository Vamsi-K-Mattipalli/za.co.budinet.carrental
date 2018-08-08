package TestCases.Debtors.DebtorsReview.Profile;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
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

    @Feature("DEBTORS")
    @Story("DEBTORS REVIEW PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TC001_DEBTORS_REVIEW_PROFILE(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        //Menu.NavigateTo3("debtors.menu.debtors", "debtors.menu.review", "debtors.menu.review.profile");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
