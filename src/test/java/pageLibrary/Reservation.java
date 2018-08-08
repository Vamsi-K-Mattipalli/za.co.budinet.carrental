package pageLibrary;

import config.GlobalDriver;
import config.TestCore;
import controlers.Generics;

/**
 * Created by GregDev on 2017/05/16.
 */
public class Reservation extends TestCore {
    public static void halfpopulate() throws Exception {
        Generics.FieldPopulate("Name", "raprofile.field.name", "Test");
        Generics.FieldPopulate("Tel No", "raprofile.field.telno", "0122663839");
        Generics.FieldPopulate("Email Address", "raprofile.field.emailaddress", "jan.zwane@bcx.co.za");
        Generics.DropdownSelector("ID Type", "raprofile.dropdown.idtype", "SA ID");
        Generics.FieldPopulate("ID No", "raprofile.field.identifyingno", "7911295200084");
        Generics.DropdownSelector("Renter Status", "raprofile.dropdown.renterstatus", "CAUTION - OPERATIONS");
        Generics.DropdownSelector("Counter Activity", "raprofile.dropdown.counteractivity", "NO RENTALS - OUTSTANDING DEBT");
        Generics.DropdownSelector("Pickup Branch", "raprofile.dropdown.pickupbranch", "OR Tambo Intl Airport JS");
        Generics.CurrentDate("Pickup Date","raprofile.field.date");
        Generics.FutureTime("Pickup Time","raprofile.field.time");
        Generics.FutureDate("Dropoff Date","raprofile.field.duebackdate");
        Generics.FutureTime("Dropoff Time","raprofile.field.duebacktime");
    }

    public static void minipopulate(String IDType, String IDNo) throws Exception {
        Generics.FieldPopulate("Name", "raprofile.field.name", "1KoMan");
        Generics.FieldPopulate("Tel No", "raprofile.field.telno", "0122663839");
        Generics.FieldPopulate("Email Address", "raprofile.field.emailaddress", "jan.zwane@bcx.co.za");
        Generics.DropdownSelector("ID Type", "raprofile.dropdown.idtype", IDType);
        driverwait();
        if (getWebElement("raprofile.dropdown.idtype").isDisplayed()) {
            Generics.FieldPopulate("ID No", "raprofile.field.identifyingno", IDNo);
            Generics.FieldPopulate("Surname", "raprofile.field.identifyingsurname", "ZWANE");
        } else if (getWebElement("").isDisplayed()) {
            Generics.DropdownSelector("Chauffeur", "raprofile.field.chauffeurs", "Chauffeur");
            Generics.DropdownSelector("Name", "", IDNo);
        }
    }

    public static void endpopulate() throws Exception {
        Generics.FieldPopulate("Name", "raprofile.field.name", "Test");
        Generics.FieldPopulate("Tel No", "raprofile.field.telno", "0122663839");
        Generics.FieldPopulate("Email Address", "raprofile.field.emailaddress", "jan.zwane@bcx.co.za");
        Generics.DropdownSelector("Brand", "raprofile.dropdown.brand", "AutoEurope");
        Generics.DropdownSelector("ID Type", "raprofile.dropdown.idtype", "Passport");
        Generics.FieldPopulate("ID No", "raprofile.field.identifyingno", "213654pss");
        Generics.FieldPopulate("Surname", "raprofile.field.identifyingsurname", "ZWANE");
        Generics.DropdownSelector("Title", "raprofile.dropdown.title", "Mr");
        Generics.FieldPopulate("Intials", "raprofile.field.initials", "JGP");
        Generics.FieldPopulate("Surname", "raprofile.field.surname", "Zwane");


    }

    public static void populate()throws Exception
    {
        driverwait();
        Generics.FieldPopulate("Name","raprofile.field.name","Test");
        Generics.FieldPopulate("Tel No","raprofile.field.telno","0122663839");
        Generics.FieldPopulate("Email Address","raprofile.field.emailaddress","jan.zwane@bcx.co.za");
        /*  <----Since DropDown removed,commented----->
        Generics.DropdownSelector("Brand", "raprofile.dropdown.brand", "AutoEurope"); */
        Generics.DropdownSelector("ID Type","raprofile.dropdown.idtype","Passport");
        Generics.FieldPopulate("ID No", "raprofile.field.identifyingno", "213654pss");
        Generics.FieldPopulate("Surname","raprofile.field.identifyingsurname","ZWANE");
        Generics.DropdownSelector("Title","raprofile.dropdown.title","Mr");
        Generics.FieldPopulate("Intials","raprofile.field.initials","JGP");
        Generics.FieldPopulate("Surname","raprofile.field.surname","Zwane");
        Generics.FieldPopulate("First Name 1","raprofile.field.firstname1","Test1");
        Generics.FieldPopulate("Telephone No","raprofile.field.telephoneno","0122663839");
        Generics.DropdownSelector("Pickup Branch","raprofile.dropdown.pickupbranch","OR Tambo Intl Airport JS");
        Generics.DropdownSelector("Due Back Branch","raprofile.dropdown.duebackbranch","OR Tambo Intl Airport JS");
        Generics.CurrentDate("Pickup Date","raprofile.field.date");
        Generics.FutureTime("Pickup Time","raprofile.field.time");
        Generics.FutureDate("Dropoff Date","raprofile.field.duebackdate");
        Generics.FutureTime("Dropoff Time","raprofile.field.time");
        Generics.FieldPopulate("Flight No","raprofile.field.flightno","BD1283");
        Generics.FieldPopulate("","raprofile.field.duebackflight","BJ5465");
        Generics.DropdownSelector("Vehicle Group","raprofile.dropdwon.vehiclegroup","C - Toyota Corolla Quest/similar");
        Generics.CheckBoxSelect("Ignore Duplicate Check", "raprofile.field.ignoreduplicate");
        Generics.DropdownSelector("Payment Method","raprofile.dropdwon.paymentmethod","Miscellaneous");
        Generics.FieldPopulate("Rate", "raprofile.field.reservedrate", "STD");
    }
    public static void NavigateTo(String SegmentName)throws Exception {
        driverwait();
        Generics.switchToFrame("MainTabs");
        Generics.DropdownSelector("Res By","raprofile.dropdown.resby",SegmentName);
    }

    public static void SelectProduct(String Prodact, String ProdactName) throws Exception {
        driverwait();
        Generics.ClickButtonLink(Prodact, Prodact);
        //Generics.ClickButtonLink(ProdactName, ProdactName);
        Generics.ClickButtonLink("raprofile.field.scdw", "raprofile.field.scdw");
        Generics.ClickButtonLink("raprofile.field.tlw", "raprofile.field.tlw");
        Generics.ClickButtonLink("raprofile.field.stlw", "raprofile.field.stlw");
        Generics.ClickButtonLink("raprofile.field.vehicleassist", "raprofile.field.vehicleassist");
        Generics.ClickButtonLink("raprofile.field.tyrewaiver", "raprofile.field.tyrewaiver");
        Generics.ClickButtonLink("raprofile.field.haildamage", "raprofile.field.haildamage");
        Generics.ClickButtonLink("raprofile.field.glasswaiver", "raprofile.field.glasswaiver");

    }

    public static void ReservationBy() throws Exception {
        driverwait();
        Generics.ClickButtonLink("operation.button.Submits", "operation.button.Submits");
        driverwait();
        Generics.ClickButtonLink("rental.link.ranumber", "rental.link.ranumber");
    }

    public static void SearchRA(String RANumber) throws Exception {
        Generics.FieldPopulate("RA Number", "raprofile.field.bidvestno", RANumber);
        Generics.ClickButtonLink("analysis.analysis.button.Submit", "analysis.analysis.button.Submit");
    }

    public static void SelectRenterLookUp(String SelecCreate) throws Exception {
        driverwait();
        Object[] allWindows = GlobalDriver.driver.getWindowHandles().toArray();
        GlobalDriver.driver.switchTo().window(allWindows[2].toString());
        GlobalDriver.driver.switchTo().activeElement();
        Generics.ClickButtonLink(SelecCreate, SelecCreate);
        driverwait();

    }

    public static void MopsPopulate() throws Exception {
        driverwait();
        if (getWebElement("mops.button.Select").isDisplayed()) {
            Generics.switchToFrame("core");
            Generics.ClickButtonLink("mops.tab.mop", "mops.tab.mop");
        } else {
            driverwait();
            Generics.switchToFrame("MainTabs");
            Generics.ClickButtonLink("mops.button.Select", "mops.button.Select");
            driverwait();
            Generics.DropdownSelector("Type of Payment", "mops.dropdown.DYNDEPPAYTYPE", "Cash Deposit");
            Generics.DropdownSelector("Currency", "", "South Africa Rand");
            Generics.FieldPopulate("Receipt No/Refund Number", "mops.dropdown.DYNDEPRECNO", "246851379");
            Generics.FieldPopulate("Amount", "mops.dropdown.DYNDEPCURRAMT", "150000");
            Generics.FieldPopulate("Drawers Name", "mops.dropdown.DYNDEPCURRCODE", "0001");
            //   Generics.FieldPopulate("Cheque/Voucher Nos","","");
            //  Generics.ClickButtonLink("","");
            Generics.DropdownSelector("Type", "mops.dropdown.DYNTELTYPE", "Cell");
            Generics.FieldPopulate("Country", "mops.field.DYNCOUNTRYCODE", "27");
            Generics.FieldPopulate("Area Code", "mops.field.DYNDIALINGCODE", "12");
            Generics.FieldPopulate("Number", "mops.field.DYNTELEPHONENO", "266");
            Generics.FieldPopulate("Ext", "mops.field.DYNEXTENSIONNO", "5063");
            Generics.ClickButtonLink("mops.button.Add", "mops.button.Add");
            Generics.DropdownSelector("PO Box Ind", "", "Invoice Address");
        //    Generics.ClickButtonLink("", "");
        //    Generics.DropdownSelector("Address Type", "", "");
        //    Generics.FieldPopulate("Flat No.", "", "");
       //     Generics.FieldPopulate("Building/Complex", "", "");
        //    Generics.FieldPopulate("Street No.", "", "");
        //    Generics.FieldPopulate("Street Name", "", "");
       //     Generics.FieldPopulate("Suburb", "", "");
       //     Generics.FieldPopulate("City", "", "");
            Generics.DropdownSelector("Province", "mops.dropdown.DYNPROVINCE", "Gauteng");
            Generics.DropdownSelector("Country", "mops.dropdown.DYNCOUNTRY", "SOUTH AFRICA");
            Generics.FieldPopulate("Postal Code", "", "");
           // Generics.ClickButtonLink("", "");
        }
    }

}
