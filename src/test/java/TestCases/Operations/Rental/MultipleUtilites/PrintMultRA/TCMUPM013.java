package TestCases.Operations.Rental.MultipleUtilites.PrintMultRA;

import config.DataProviders;
import config.TestCore;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
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
public class TCMUPM013 extends TestCore {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @Epic("OPERATIONS")
    @Feature("MULTIPLE UTILITIES")
    @Story("PRINT MULTIPLE VEHICLE")
    @Test(dataProvider = "login", dataProviderClass = DataProviders.class)
    public void TCMUPM013_Test1(String Username, String Password) throws Exception {
        LogIn.SignIn(Username, Password);
        Menu.NavigateTo4("operations.menu.operation", "operations.menu.rental",
                "operations.menu.rental.multiple","operations.menu.rental.multiple.print.multi");
        driverwait();
       // Generics.DropdownSelector("Branch","keybook.field.cmbBranch","OR Tambo Intl Airport JS");

   //     Generics.DropdownSelector("Branch","multiple.deallocation.vehicle.group","C - Toyota Corolla Quest/similar");
   //     Generics.FieldPopulate("Date From","multiple.deallocation.datefrom","2017-10-30");
   //     Generics.FieldPopulate("Date To","multiple.deallocation.dateto","2017-12-31");
   //     Generics.ClickButtonLink("backoffice.button.submit","backoffice.button.submit");
        driverwait();
  //      Generics.CheckBoxSelect("De-Allocate","multiple.deallocation.deallocate");
  //      Generics.ClickButtonLink("backoffice.button.submit","backoffice.button.submit");


    }

    @AfterMethod
    public void tearDown() throws Exception {
        CloseWebDriver.browser();

    }
}
