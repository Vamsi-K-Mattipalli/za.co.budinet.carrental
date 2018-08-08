package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class Debtors extends TestCore
{
    public static void populateCustomerProfile(String accType) throws Exception
    {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.switchToFrame("tabData");
        Generics.FieldPopulate("Effective From Date", "debtors.field.effectivefromdate", "2017-12-31");
        Generics.DropdownSelector("Account Type", "debtors.dropdown.accounttype", accType);
        Generics.DropdownSelector("Market Segment", "debtors.dropdown.marketsegment", "Corporate");
        Generics.FieldPopulate("Surname/Company Name", "debtors.field.surnamecompanyname", "BCX");
        Generics.DropdownSelector("Country of Origin", "debtors.dropdown.customer.countryoforigin", "SOUTH AFRICA");
        Generics.DropdownSelector("McCarthy Prefix", "debtors.dropdown.mccarthyprefix", "Namibia South Africa");
        Generics.DropdownSelector("Country of Operation", "debtors.dropdown.countryofoperation", "SOUTH AFRICA");
        Generics.DropdownSelector("McCarthy Prefix", "debtors.dropdown.mccarthyprefix", "Namibia South Africa");
        Generics.DropdownSelector("Contact Type", "debtors.dropdown.contacttype", "Account Manager");
        Generics.DropdownSelector("Name", "debtors.dropdown.name", "NETWORK");
        Generics.ClickButtonLink("debtors.button.add", "debtors.button.add");
        Generics.DropdownSelector("Risk Factor", "debtors.dropdown.riskfactor", "Medium");
        Generics.FieldPopulate("Last Credit Check Date", "debtors.field.lastcreditcheckdate", "2017-06-23");
        Generics.ClearTextField("debtors.field.creditlimit");
        Generics.FieldPopulate("Credit Limit", "debtors.field.creditlimit", "5");
        Generics.DropdownSelector("Alert Status", "debtors.dropdown.alertstatus", "AOD");
        Generics.DropdownSelector("Counter Activity", "debtors.dropdown.counteractivity", "Credit limit exceeded");
        Generics.CheckBoxSelect("Flythru", "debtors.field.flythru");
        Generics.DropdownSelector("Data Extract Types", "debtors.dropdown.dataextracttypes", "CSIR");
        Generics.ClickButtonLink("debtors.button.add", "debtors.button.add");
        Generics.DropdownSelector("Delivery Type", "debtors.dropdown.deliverytype", "By Post");
        Generics.FieldPopulate("Number of Invoices Required", "debtors.field.numberinvoicesrequired", "2");
        Generics.DropdownSelector("Invoice Frequency", "debtors.dropdown.invoicefrequency", "Daily");
        Generics.DropdownSelector("Day of Week", "debtors.dropdown.dayofweek", "Tuesday");
        Generics.ClickButtonLink("debtors.button.add", "debtors.button.add");
        Generics.DropdownSelector("Delivery Type", "debtors.dropdown.customer.deliverytype", "By Post");
        Generics.FieldPopulate("No of Statements Required", "debtors.field.nostatementsrequired", "1");
        Generics.ClickButtonLink("debtors.button.add", "debtors.button.add");
        Generics.FieldPopulate("Date Surety Letter Received", "debtors.field.datesuretyreceived", "2017-12-31");
        Generics.FieldPopulate("Surety Signatory", "debtors.field.suretysignatory", "Manager");
        Generics.CheckBoxSelect("Company Resolution", "debtors.field.companyresolution");
    }
    public static void minPopulateCustomerProfile(String accType)throws Exception
    {
        driverwait();
        Generics.switchToFrame("mainTabs");
        Generics.switchToFrame("tabData");
        Generics.FieldPopulate("Effective From Date", "debtors.field.effectivefromdate", "2017-12-31");
        Generics.DropdownSelector("Account Type", "debtors.dropdown.accounttype", accType);
        Generics.DropdownSelector("Market Segment", "debtors.dropdown.marketsegment", "Corporate");
        Generics.FieldPopulate("Surname/Company Name", "debtors.field.surnamecompanyname", "BCX");
        Generics.DropdownSelector("McCarthy Prefix", "debtors.dropdown.mccarthyprefix", "Namibia South Africa");

    }



}
