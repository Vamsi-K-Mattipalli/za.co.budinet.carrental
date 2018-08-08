package pageLibrary;

import controlers.Generics;

import static config.GlobalDriver.driverwait;
import static config.GlobalDriver.driverwaitmenu;
import static config.TestCore.getWebElement;

public class Utilities {
    public static void UtilitiesRequest(String ReportSchedule) throws Exception {
        driverwait();
        Generics.ClickButtonLink("utilities.button.NewRequest", "utilities.button.NewRequest");
        Generics.ClickButtonLink(ReportSchedule, ReportSchedule);
        Generics.FieldPopulate("Date Required", "utilities.button.datereq", "2017-10-09");
        Generics.ClickButtonLink("utilities.button.desaddress", "utilities.button.desaddress");
        Generics.FieldPopulate("Email Address", "utilities.button.desaddress", "janz@bcx.co.za");
        Generics.DropdownSelector("Parameter", "utilities.dropdown.branch", "OR Tambo Intl Airport JS");
        Generics.FieldPopulate("Financial Month", "utilities.field.finacial", "2017-12-31");
        if (getWebElement("utilities.field.runUntil").isDisplayed()) {
            Generics.FieldPopulate("Run Until", "utilities.field.runUntil", "20170901");
        }
        if (getWebElement("utilities.dropdown.DayOfWeek").isDisplayed()) {
            Generics.DropdownSelector("Day of Week", "utilities.dropdown.DayOfWeek", "Monday");
        }
    }

    public static void AccessoryProfilePopulate(String aType) throws Exception {
        driverwait();
        Generics.switchToFrame("MainTabs");
        Generics.FutureDate("Effective From","utilities.field.EffectiveFromDate");
        Generics.FieldPopulate("Serial No", "utilities.field.SerialNo", "ABC123TESTING123");
        Generics.FieldPopulate("Description", "utilities.field.Description", "Description");
        Generics.DropdownSelector("Accessory Type", "utilities.dropdown.AccessoryType", aType);
        Generics.DropdownSelector("Purchased by Region", "utilities.dropdown.PurchRegion", "Gauteng Central");
        Generics.CurrentDate("Date Purchased","utilities.field.DatePurch");
        Generics.FieldPopulate("Purchase Cost", "utilities.field.PurchCost", "2000");
        Generics.DropdownSelector("Located at Branch", "utilities.dropdown.LocatedAtBranch", "OR Tambo Intl Airport JS");
    }
    public static void SundryLedgersPopulate() throws Exception {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Ledger Prod Code", "utilities.field.LedgerProdCode", "01");
        Generics.FieldPopulate("Ledger Company", "utilities.field.LedgerCoy", "01");
        Generics.FieldPopulate("Ledger Code", "utilities.field.LedgerCode", "10");
        Generics.FieldPopulate("AX Ledger Code", "utilities.field.AXLedgerCode", "111");
        Generics.ClickButtonLink("utilities.button.Add", "utilities.button.Add");
    }
    public static void BranchIndicators() throws Exception {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.DropdownSelector("Operating District", "utilities.dropdown.district", "Gauteng Airport Distric");
        Generics.DropdownSelector("Metro Area", "utilities.dropdown.metroar", "Johannesburg");
        Generics.DropdownSelector("Fleet Company", "utilities.dropdown.fleetcoy", "South Africa");
        Generics.DropdownSelector("Airport Ind", "utilities.dropdown.airportind", "Airport Location");
        Generics.DropdownSelector("Branch Status", "utilities.dropdown.branchstatus", "Open");
        Generics.DropdownSelector("Servicing Depot", "utilities.dropdown.servdepot", "Gauteng Depot TR");
        Generics.DropdownSelector("RSC Region", "utilities.dropdown.rscregion", "Witwatersrand");
        Generics.DropdownSelector("BFA Region", "utilities.dropdown.bfaregion", "Gauteng");
        Generics.DropdownSelector("Disallow Deliveries", "utilities.dropdown.OPALLDEL", "Allow All");
        Generics.DropdownSelector("Disallow Collections", "utilities.dropdown.OPALLPU", "Allow All");
    }
    public static void PrintingPopulating() throws Exception {
        driverwait();
        Generics.FieldPopulate("Seq No", "utilities.field.seqno", "0001");
        Generics.FieldPopulate("Printer No", "utilities.field.prnno", "A001");
        Generics.FieldPopulate("IP Address", "utilities.field.Address", "127.0.0.1");
        Generics.FieldPopulate("Description", "utilities.field.Desc", "Local Printer");
    }
    public static void RatePopulating() throws Exception {
        driverwaitmenu();
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Effective From Date", "utilities.field.EffFromDate", "2018-02-01");
        Generics.FieldPopulate("Effective To Date", "utilities.field.EffToDate", "2018-07-31");
        Generics.FieldPopulate("New Expiry Date", "utilities.field.ExtensionDate", "2018-07-31");
        Generics.DropdownSelector("Rate Type", "utilities.dropdown.RateType", "Special Inclusive - Std Cover");
        Generics.FieldPopulate("Rate Code", "utilities.field.RateCode", "CO2");
        Generics.FieldPopulate("Description", "utilities.field.Description", "Description");
        Generics.FieldPopulate("Description", "utilities.field.InvDesc", "Decriptioner");
        Generics.DropdownSelector("Sales Person", "utilities.dropdown.SalesArea", "NETWORK");
        Generics.CheckBoxSelect("Monday", "utilities.field.PuSpecDayMon");
        Generics.CheckBoxSelect("Tuesday", "utilities.field.PuSpecDayTue");
        Generics.CheckBoxSelect("Wednesday", "utilities.field.PuSpecDayWed");
        Generics.CheckBoxSelect("Thursday", "utilities.field.PuSpecDayThu");
        Generics.CheckBoxSelect("Friday", "utilities.field.PuSpecDayFri");
        Generics.FieldPopulate("PickUp Effective From Date", "utilities.field.PICKupEffFromDate", "2018-02-02");
        Generics.FieldPopulate("PickUp Effective to Date", "utilities.field.PICKupEffToDate", "2018-07-31");
        Generics.ClickButtonLink("utilities.button.Add", "utilities.button.Add");
        Generics.DropdownSelector("Include Discount for Vehicle Groups", "utilities.dropdown.CountrySelector", "South Africa");
        driverwait();
    }
    public static void CredtiCardAuth(String SegmentType) throws Exception {
        driverwait();
        Generics.FieldPopulate("Effective From Date", "utilities.field.EFFFROMDATE", "2018-02-1");
        Generics.FieldPopulate("Effective To Date", "utilities.field.EFFTODATE", "2018-07-31");
        Generics.DropdownSelector("Market Segment", "utilities.dropdown.text1", SegmentType);
        Generics.DropdownSelector("Vehicle Group", "utilities.dropdown.text2", "C - Toyota Corolla Quest/similar");
        Generics.FieldPopulate("Base Rate", "utilities.field.text3", "10");
        Generics.FieldPopulate("Daily Rental", "utilities.field.text4", "06");
        Generics.FieldPopulate("Weekend Rentals", "utilities.field.text5", "05");
        Generics.FieldPopulate("Thirthy Day Plus Rental", "utilities.field.text6", "01");
    }
    public static void internetFleet() throws Exception {
        driverwait();
        Generics.DropdownSelector("", "utilities.dropdown.VEHICLEGROUP", "C - Toyota Corolla Quest/similar");
        Generics.FieldPopulate("Vehicle Desription", "utilities.field.DESCRIPTION", "Vehicle Description");
        Generics.FieldPopulate("Tank Capacity", "utilities.field.TANKCAPACITY", "50");
        Generics.FieldPopulate("Milage", "utilities.field.MILAGE", "1500");
        Generics.FieldPopulate("Passenger Count", "utilities.field.PASSENGERCOUNT", "5");
        Generics.FieldPopulate("Seat Belt Count", "utilities.field.SEATBELTCOUNT", "5");
        Generics.FieldPopulate("Large Luggage", "utilities.field.LUGGAGELARGE", "3");
        Generics.FieldPopulate("Medium Luggage", "utilities.field.LUGGAGEMEDIUM", "5");
        Generics.FieldPopulate("Small Luggage", "utilities.field.LUGGAGESMALL", "10");
        Generics.FieldPopulate("Carryon Luggage", "utilities.field.LUGGAGECARRYON", "15");
        Generics.FieldPopulate("Image", "utilities.field.IMAGENAME", "Imager");
    }
    public static void ProductProfilePopulator() throws Exception {
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Effective From Date", "utilities.field.effectiveFromDate", "2018-02-01");
        Generics.FieldPopulate("Effective To Date", "utilities.field.effectiveToDate", "2018-07-31");
        Generics.DropdownSelector("Product Type", "utilities.dropdown.prodtype", "Additional Extras");
        Generics.FieldPopulate("Product Code", "utilities.field.ProductCode", "Weiv01");
        Generics.FieldPopulate("Product Description", "utilities.field.Description", "Auto Test");
        Generics.DropdownSelector("TRAC Element Code", "utilities.dropdown.traccode", "Allowance");
        Generics.FieldPopulate("Branch Code", "utilities.field.text1", "JS");
        Generics.FieldPopulate("Account", "utilities.field.text2", "100101");
        Generics.FieldPopulate("% Split", "utilities.field.text3", "100");
        Generics.DropdownSelector("Allocate to", "utilities.dropdown.text5", "Term Branch");
        Generics.FieldPopulate("Column Name", "utilities.field.colName", "Renter Name");
        Generics.FieldPopulate("Column Order", "utilities.field.colOrder", "Order Name");
        Generics.DropdownSelector("Product Mode", "utilities.dropdown.prodMode", "Not Displayed");
        Generics.DropdownSelector("Calculation Routine", "utilities.dropdown.calctype", "Charge per Kilometre");
    }
}
