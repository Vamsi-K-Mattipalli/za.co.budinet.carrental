package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class Vehicle extends TestCore{
    public static void DueOff() throws Exception
    {
        driverwait();
        Generics.DropdownSelector("Vehicle Group", "vehicle.dropdown.vehiclegroup", "C - Toyota Corolla Quest/similar");
        Generics.ClickButtonLink("vehicle.button.submit.due", "vehicle.button.submit.due");
        driverwait();
    }

    public static void populateVal(String locatorName, String valueName) throws Exception
    {
        driverwait();
        Generics.FieldPopulate("", locatorName, valueName);
        Generics.ClickButtonLink("vehicle.button.submit.enquiry", "vehicle.button.submit.enquiry");
        driverwait();
    }

    public static void selectVal(String dropValue) throws Exception
    {
        Generics.DropdownSelector("Owner Type", "vehicle.dropdown.ownertype", dropValue);
        Generics.ClickButtonLink("vehicle.button.submit.enquiry", "vehicle.button.submit.enquiry");
    }

    public static void selectVehicleType(String vehicleType) throws Exception
    {
        Generics.DropdownSelector("Vehicle Type", "vehicle.dropdown.vehicletype", vehicleType);
    }

    public static void selectColour(String vehicleColour) throws Exception
    {
        Generics.DropdownSelector("Vehicle Color", "vehicle.dropdown.vehiclecolour", vehicleColour);
    }

    public static void vehiclePopulate()throws Exception
    {
        driverwait();
        Generics.ClearTextField("vehicle.Field.dateOfFirstReg");
        Generics.FieldPopulate("Date of First Registration", "vehicle.Field.dateOfFirstReg", "2017");
        Generics.FieldPopulate("Registration No", "vehicle.Field.txtRegNo", "XPW106GP");
        Generics.FieldPopulate("Date into Fleet", "vehicle.Field.txtDateIntoFleet", "2017-08-01");
        Generics.DropdownSelector("Colour","vehicle.dropdown.cmbColour","Red");
        Generics.DropdownSelector("Registered In Region","vehicle.dropdown.cmbRegisteredInRegion","Gauteng");
        driverwait();

    }
    public static void vehicleNavigate()throws Exception {
      //  WebElement ParentFrame = GlobalDriver.driver.findElement(By.name("MainTabs"));
      //  driver.switchTo().frame(ParentFrame);
      //  WebElement CildFrame = GlobalDriver.driver.findElement(By.name("tabData"));
      //  driver.switchTo().frame(CildFrame);
        Generics.switchToFrame("MainTabs");
        Generics.switchToFrame("tabData");
        Generics.DropdownSelector("Vehicle Type","vehicle.dropdown.vehicletype","Fleet");
        Generics.ClickButtonLink("vehicle.button.submitP","vehicle.button.submitP");
        Generics.FieldPopulate("Order Number","vehicle.Field.ordernumber","100035727");
        Generics.ClickButtonLink("vehicle.button.submitP","vehicle.button.submitP");
        driverwait();
    }

    public static void vehichleSearch() throws Exception {
        driverwaitmenu();
        Generics.switchToFrame("core");
        driverwait();
        Generics.ClickButtonLink("vehicle.Field.txtRegNo", "vehicle.Field.txtRegNo");
        Generics.FieldPopulate("Reg. No", "vehicle.Field.txtRegNo", "CB72YYGP");
        Generics.ClickButtonLink("disposal.button.binacular", "disposal.button.binacular");
        driverwait();

    }
}
