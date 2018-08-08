package pageLibrary;

import config.TestCore;
import controlers.Generics;
import io.qameta.allure.Step;

/**
 * Created by GregZwane on 2017/07/18.
 */
public class Operational extends TestCore{
    @Step("Selecting Other")
    public static void Enquiry()throws Exception
    {
       Generics.DropdownSelector("Res Though","operation.dropdown.resthrough","Other");
    }
    @Step("Capturing RA Payment")
    public static void iRAPayment() throws Exception {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.DropdownSelector("IB Type", "international.dropdown.BRANCH", "International Sunny Cars");
        Generics.DropdownSelector("Account Type", "international.dropdown.ACCTYPE", "Sunny Cars - SU");
        Generics.DropdownSelector("Regions", "international.dropdown.REGIONS", "Not applicable");
        Generics.FieldPopulate("Foreign RA No", "international.field.forrano", "ZAR01");
        Generics.FieldPopulate("Customer Account No", "international.field.custaccno", "1234567890");
        Generics.FieldPopulate("Vourcher No", "international.field.voucherno", "1458960");
        Generics.FieldPopulate("Order No", "international.field.orderno", "158000");
    }
    public static void iRARental() throws Exception {
        driverwait();
        Generics.FieldPopulate("Renter Name", "international.field.rentername", "Tjo");
        Generics.DropdownSelector("Title", "international.dropdown.title", "Mr");
        Generics.FieldPopulate("Intials", "international.field.intials", "JP");
        Generics.FieldPopulate("Renter From", "international.field.rentedfrom", "AMEN");
        Generics.CurrentDate("Open Date","international.field.opdate");
        Generics.FutureTime("Open Time","international.field.optime");
        Generics.DropdownSelector("Vehicle Group", "international.dropdown.vehiclegrp", "CCAR");
    }
    public static void iRAExchange() throws Exception {
        driverwait();
        Generics.FieldPopulate("Exchange Rate", "international.field.exrate", "RANDS");
        Generics.DropdownSelector("Currency Code", "international.dropdown.currcode", "South African Rand");
        Generics.DropdownSelector("Covert Currency", "international.dropdown.convertcurr", "No");
        Generics.DropdownSelector("Incl/Excl Tax", "international.dropdown.inexcltax", "Exclusive");
        Generics.DropdownSelector("Calc Tax", "international.dropdown.calctax", "No");
    }
    public static void iRAChangesCommissions() throws Exception {
        driverwait();
        Generics.FieldPopulate("Daily Charges", "international.field.PRD_Value", "55");
        Generics.FieldPopulate("V.A.T./G.S.T.", "international.field.PRD_Value", "TANK");
        Generics.FieldPopulate("IRIS commission", "international.field.IBIRIS", "10");
        Generics.FieldPopulate("Interface Fee", "international.field.IBINTF", "105");
    }
}
