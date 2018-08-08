package pageLibrary;

import config.TestCore;
import controlers.Generics;

/**
 * Created by GregDev on 2017/05/16.
 */
public class Qoute extends TestCore {
    public static void NavigateTo(String SegmentName) throws Exception {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.DropdownSelector("Market Segment", "qoute.dropdown.segmenttype", SegmentName);

    }

    public static void populate(String Rate, String Weaver) throws Exception {
        driverwait();
        Generics.DropdownSelector("Rate Type", Rate, "Individual/Corp Exclusive");
        Generics.DropdownSelector("Pick Up Branch", "qoute.dropdown.cmbPUBranch", "OR Tambo Intl Airport JS");
        Generics.CurrentDate("Pick Up Date","qoute.field.txtPUDate");
        Generics.FutureTime("Pick Up Time","qoute.field.txtPUTime");
        Generics.DropdownSelector("Drop Off Branch", "qoute.dropdown.cmbDOBranch", "OR Tambo Intl Airport JS");
        Generics.FutureDate("Drop Off Date","qoute.field.txtDODate");
        Generics.FieldPopulate("Drop Off Time", "qoute.field.txtDOTime", "17:00");
        Generics.DropdownSelector("Vehicle Group", "qoute.dropdown.cmbVehicleGroup", "C - Toyota Corolla Quest/similar");
        Generics.DropdownSelector("Title", "qoute.dropdown.txtRenterTitle", "Mr");
        Generics.FieldPopulate("Renter Initials", "qoute.field.txtRenterInitials", "JJO");
        Generics.FieldPopulate("Renter Last Name", "qoute.field.txtRenterSurName", "Surname");
        Generics.FieldPopulate("Renter First Names 1", "qoute.field.txtRenterName1", "Firstname 1");
        Generics.ClickButtonLink("qoute.link.weivers", "qoute.link.weivers");
        driverwait();
        Generics.CheckBoxSelect("Weavers", Weaver);
     }

    public static void minipopulate(String Rates, String Weaver) throws Exception {
        Generics.DropdownSelector("Rate Type", Rates, "Indiv/Corp Inclusive - Std Cover");
        Generics.DropdownSelector("Pick Up Branch", "qoute.dropdown.cmbPUBranch", "OR Tambo Intl Airport JS");
        Generics.DropdownSelector("Drop Off Branch", "qoute.dropdown.cmbDOBranch", "OR Tambo Intl Airport JS");
        Generics.CurrentDate("Pick Up Date","qoute.field.txtPUDate");
        Generics.FutureTime("Pick Up Time","qoute.field.txtPUTime");
        Generics.FutureDate("Drop Off Date","qoute.field.txtDODate");
        Generics.FieldPopulate("Drop Off Time", "qoute.field.txtDOTime", "1700");
        Generics.DropdownSelector("Vehicle Group", "qoute.dropdown.cmbVehicleGroup", "C - Toyota Corolla Quest/similar");
        Generics.DropdownSelector("Title", "qoute.dropdown.txtRenterTitle", "Miss");
        Generics.FieldPopulate("Renter Initials", "qoute.field.txtRenterInitials", "J");
        Generics.FieldPopulate("Renter Last Name", "qoute.field.txtRenterSurName", "Su");
        Generics.FieldPopulate("Renter First Names 1", "qoute.field.txtRenterName1", "1");
    }

    public static void minipopulateCorp()throws Exception
    {
        Generics.FieldPopulate("On Behalf of Account No", "qoute.field.txtOnBehalfOfNo", "12910700001");
        Generics.FieldPopulate("On Behalf of Account Name", "qoute.field.txtOnBehalfOfName", "ENGINEERING TOP TECH (PTY) LTD");

    }

}
