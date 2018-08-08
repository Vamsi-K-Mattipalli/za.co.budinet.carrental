package TestCases.Operations.Rental.Enquiry.FleetUTE.ProjectedFleetAnalysis;

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

public class TCFUTE003 extends TestCore
{
    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("RENTAL PROCEDURES")
    @Story("ENQUIRIES FLEET UTE")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCFUTE003_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental", "operations.menu.rental.enquiries", "operations.menu.rental.enquiries.fleetute");
        Generics.ClickButtonLink("fleetute.link.projectedfleetanalysis","fleetute.link.projectedfleetanalysis");
        Generics.DropdownSelector("For Region", "fleetute.dropdown.forregion", "Gauteng Central");
        Generics.CurrentDate("From Date", "fleetute.field.fromdate");
        Generics.ClickButtonLink("fleetute.button.submit", "fleetute.button.submit");
        driverwait();
       // Generics.ClickButtonLink("fleetute.button.selectionbfu", "fleetute.button.selectionbfu");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
