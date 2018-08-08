package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class BackOffice extends TestCore {
    public static void KeyBookEnquiry()throws Exception
    {
        Generics.DropdownSelector("", "", "");
        Generics.DropdownSelector("", "", "");
    }
    public static void KeyBookProfilePopulate()throws Exception
    {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.ClickButtonLink("keybook.field.RegNo", "keybook.field.RegNo");
        Generics.FieldPopulate("Reg No", "keybook.field.RegNo", "XPW106GP");
        Generics.FieldPopulate("Bay No", "keybook.field.BayNo", "C19");
        Generics.FieldPopulate("KMS In", "keybook.field.KmsIn", "25000");
        Generics.FieldPopulate("Damages", "keybook.field.Damages", "Crack Window");
        Generics.DropdownSelector("Location ", "keybook.field.cmbLocation", "CARPARK");
        // if(getWebElement("keybook.field.cmbLocation").isEnabled()) {
        //     Generics.DropdownSelector("Location ", "keybook.field.cmbLocation", "CARPARK");
        //  }

    }

    public static void EnquiryFB() throws Exception {
        Generics.DropdownSelector("Vehicle Group", "fullybooked.dropdown.VEHGRP", "ALL");
        Generics.DropdownSelector("Status", "fullybooked.dropdown.Status", "Current");
        Generics.DropdownSelector("Country", "fullybooked.dropdown.Country", "South Africa");

    }

    public static void ProfileFB() throws Exception {
        Generics.FieldPopulate("Effective From Date", "fullybooked.field.efffromdate", "2017-10-09");
        Generics.FieldPopulate("Time", "fullybooked.field.efffromtime", "0800");
        Generics.FieldPopulate("Effective To Date", "fullybooked.field.efftodate", "2017-10-16");
        Generics.FieldPopulate("Time", "fullybooked.field.efftotime", "0800");
        Generics.DropdownSelector("Fully Booked Type", "fullybooked.dropdown.FBTYPE", "Branch");
        if (getWebElement("fullybooked.dropdown.Branch").isDisplayed()) {
            Generics.DropdownSelector("Code", "fullybooked.dropdown.Branch", "OR Tambo Intl Airport JS");
        } else if (getWebElement("").isDisplayed()) {
            Generics.DropdownSelector("Code", "", "Gauteng Central");
        } else if (getWebElement("").isDisplayed()) {

            Generics.DropdownSelector("Country", "fullybooked.dropdown.Country", "South Africa");
        }
        Generics.DropdownSelector("Vehicle Group", "fullybooked.dropdown.VEHGRP", "A - Chevy Spark/similar");
    }

    public static void SubhireProfile() throws Exception {
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Order Date", "utilities.field.txtOrderDate", "2017-08-22");
        Generics.DropdownSelector("Vehicle Model", "utilities.dropdown.cmbVehModel", "KIA Picanto");
        Generics.DropdownSelector("Vehicle Group", "utilities.dropdown.vGrp", "E - Toyota Corolla Auto/similar");
        Generics.DropdownSelector("Sub-Hire Company", "utilities.dropdown.cmbSubHireCoy", "Avis Car Hire");
        Generics.FieldPopulate("Sub-Hire Contact Number", "utilities.field.txtSHCONTACT", "Sphiwe");
        Generics.FieldPopulate("Email Address", "utilities.field.txtSHEMAIL", "email@email.com");
        Generics.FieldPopulate("Sub-Hire Contact Name", "utilities.field.txtSHTELNO", "0125487658");
        Generics.FieldPopulate("Required Delivery Date", "utilities.field.txtDelDate", "2017-11-01");
        Generics.DropdownSelector("Delivery Branch", "utilities.dropdown.cmbDelBranch", "OR Tambo Intl Airport JS");
        Generics.FieldPopulate("No of Vehicles Required", "utilities.field.txtNoVehicle", "9");
        Generics.FieldPopulate("Due Back Date", "utilities.field.txtDueBackDate", "2017-11-10");
        Generics.ClickButtonLink("utilities.button.submit", "utilities.button.submit");
    }

    public static void BlackListProfile() throws Exception {
        driver.switchTo().frame("mainTabs");
        Generics.DropdownSelector("Card Origin", "blacklist.dropdown.cmbCardOrigin", "SOUTH AFRICAN");
        Generics.DropdownSelector("Card Indicator", "blacklist.dropdown.cmbCardIndicator", "BIDVEST CARD");
        Generics.FieldPopulate("Card Number", "blacklist.field.txtCardNumber", "4565462192007012");
        Generics.FieldPopulate("Card Prefix", "blacklist.field.txtCardPrefix", "123456");
        Generics.FieldPopulate("Voucher Number", "blacklist.field.txtVoucherNo", "148956");
        Generics.FieldPopulate("Voucher Range From", "blacklist.field.txtVoucherRangeFrom", "148910");
        Generics.FieldPopulate("Voucher Range To", "blacklist.field.txtVoucherRangeTo", "148900");
        Generics.DropdownSelector("Card Type", "blacklist.dropdown.cmbCardType", "CARD HOLDER BLACKLISTED");
        Generics.DropdownSelector("Status", "blacklist.dropdown.cmbStatus", "Yes");
    }
}
