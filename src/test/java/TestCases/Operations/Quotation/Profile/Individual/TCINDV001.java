package TestCases.Operations.Quotation.Profile.Individual;

import config.TestCore;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageLibrary.CloseWebDriver;

/**
 * Created by GregDev on 2017/05/16.
 */
public class TCINDV001 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("QOUTATION")
    @Story("INDIVIDUAL PROFILE")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void TCINDV01_Test1() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
