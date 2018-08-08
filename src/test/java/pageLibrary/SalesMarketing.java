package pageLibrary;

import controlers.Generics;

import static config.GlobalDriver.driver;
import static config.GlobalDriver.driverwait;

public class SalesMarketing {
    public static void LoyaltyPopulate() throws Exception {
        Generics.DropdownSelector("Loyalty Program", "loyalty.dropdown.cmbLoyaltyProgram", "Voyager");
        Generics.FieldPopulate("Loyalty Number", "loyalty.field.txtLoyaltyNo", "1255321");

    }

    public static void RenterPopulate() throws Exception {
        driverwait();
        Generics.switchToFrame("MainTabs");
        Generics.DropdownSelector("ID Type", "renter.dropdown.ipIdType", "Passport");
        Generics.DropdownSelector("Title", "renter.dropdown.ipTitle", "Mr");
        Generics.FieldPopulate("ID No", "renter.field.IDNo", "PASSWORD");
        Generics.FieldPopulate("Initials", "renter.field.initial", "JP");
        Generics.FieldPopulate("First Name", "renter.field.fname", "JAN");
        Generics.FieldPopulate("Addition Name", "renter.field.fname4", "Phoso");
        Generics.FieldPopulate("Surname", "renter.field.surname", "ZWANE");
        Generics.CheckBoxSelect("Titanium Renter", "renter.field.Titanium");
        Generics.CheckBoxSelect("SnappDrive Indicator", "renter.field.KeylessInd");

    }
    public static void IncomingPopulate() throws Exception {
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("Incoming.tab.corresponded", "Incoming.tab.corresponded");
        Generics.switchToFrame("MainTabs");
        Generics.ClickButtonLink("Incoming.button.addincomming", "Incoming.button.addincomming");
        Generics.DropdownSelector("Type", "Incoming.dropdown.type", "Incoming phone call");
        Generics.DropdownSelector("Primary Reason", "Incoming.dropdown.preason", "Renter Profile Update");
        Generics.FieldPopulate("Reason", "Incoming.field.reason", "Reason for update");
        Generics.DropdownSelector("Customer Attitude", "Incoming.dropdown.CustomerAttitude", "Normal");
        Generics.FieldPopulate("From", "Incoming.field.from", "Pretoria");
        Generics.CheckBoxSelect("Documentation", "Incoming.field.documentation");
        Generics.FieldPopulate("Comment", "Incoming.field.comment", "No Commment at the moment");
        Generics.DropdownSelector("Escalate To", "Incoming.dropdown.EscalateTo", "TANYA HEYNEKE");
        Generics.FieldPopulate("Escalation Notes", "Incoming.field.escalatenotes", "No notes");
    }

    public static void OutgoingPopulate() throws Exception {
        driverwait();
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("Incoming.tab.corresponded", "Incoming.tab.corresponded");
        driver.switchTo().frame("MainTabs");
        Generics.ClickButtonLink("Incoming.button.addincamming", "Incoming.button.addincamming");
        Generics.DropdownSelector("Type", "Incoming.dropdown.type", "Review");
        Generics.DropdownSelector("Primary Reason", "Incoming.dropdown.preason", "CheckThru");
        Generics.FieldPopulate("Reason", "Incoming.field.reason", "Reason for update");
        Generics.FieldPopulate("From", "Incoming.field.from", "Gregory");
        Generics.DropdownSelector("Customer Attitude", "Incoming.dropdown.CustomerAttitude", "Normal");
        Generics.FieldPopulate("Comment", "Incoming.field.comment", "No Commment at the moment");
    }

    public static void RenterStatusPopulate() throws Exception {
        driverwait();
        Generics.switchToFrame("core");
        Generics.ClickButtonLink("Incoming.tab.status", "Incoming.tab.status");
        driver.switchTo().frame("MainTabs");
        Generics.DropdownSelector("Renter Status", "renter.dropdown.renterstatus", "TESTING");
        Generics.FieldPopulate("Remarks", "renter.field.remarks1", "Remarks field");
        Generics.DropdownSelector("Counter Activity Status", "renter.dropdown.counteractivitystatus", "NO RENTALS - OUTSTANDING DEBT");
        Generics.FieldPopulate("Remarks", "renter.field.remarks2", "Remarks Field");
        Generics.DropdownSelector("Current Credit Ststus", "renter.dropdown.creditstatus", "Credit Worthy");
        Generics.FieldPopulate("Last Credit Check Date", "renter.field.creditcheckdate", "2017-06-01");
        Generics.FieldPopulate("No of Rental", "renter.field.norentals", "1");
        Generics.DropdownSelector("Escalate", "renter.dropdown.escalateto", "TANYA HEYNEKE");
        Generics.FieldPopulate("Reason", "renter.field.reason", "No Reasen for now");

    }

    public static void VoucherAllocation() throws Exception {
        Generics.FieldPopulate("Referral Account", "voucher.field.txtReferralAccNo", "00006");
        Generics.DropdownSelector("Voucher Type", "voucher.dropdown.cmbVoucherType", "Referral");
        Generics.DropdownSelector("Lodge Card type", "voucher.dropdown.cmbLodgeCardType", "Master Card");
        Generics.FieldPopulate("Lodge Card Number", "voucher.field.txtLodgeCardNumber", "1234567891234");
        Generics.FieldPopulate("Quantity Required", "voucher.field.txtQtyReqd", "05");
        Generics.DropdownSelector("Allocated To", "voucher.dropdown.txtAllocatedTo", "TANYA HEYNEKE");
    }

    public static void VoucherCancel() throws Exception {
        Generics.FieldPopulate("Referral Account", "voucher.field.txtReferralAccNumber", "000051");
        Generics.FieldPopulate("Range From", "voucher.field.txtRangeFrom", "145610");
        Generics.FieldPopulate("Range To", "voucher.field.txtRangeTo", "145620");
        Generics.FieldPopulate("Voucher Number", "voucher.field.txtCancelVoucherNo", "145615");
        Generics.DropdownSelector("Reason", "voucher.dropdown.cmbReason", "No longer required");
    }
}
