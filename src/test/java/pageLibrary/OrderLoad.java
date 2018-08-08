package pageLibrary;

import config.TestCore;
import controlers.Generics;

/**
 * Created by GregZwane on 2017/07/14.
 */
public class OrderLoad extends TestCore {
    public static void DealerSelect() throws Exception{
        driver.switchTo().frame("mainTabs");
        driver.switchTo().frame("tabData");
        Generics.DropdownSelector("Dealer Factory","order.field.dealerfactory","Toyota SA");
        Generics.ClickButtonLink("order.button.submit.load","order.button.submit.load");
    }
    public static void Populate() throws Exception
    {
        driverwait();
        Generics.CurrentDate("Date","order.field.date");
        Generics.DropdownSelector("Vehicle Model","order.field.vehiclemodel","SVMR Avanza 1.5 SX");
        Generics.ClearTextField("order.field.purchaseprice");
        Generics.FieldPopulate("Purchase Price", "order.field.purchaseprice", "120000");
        Generics.DropdownSelector("Fleet Coy","order.field.fleetcoy","South Africa");
        Generics.DropdownSelector("Usage Type","order.field.usagetype","Rental");
        Generics.ClearTextField("order.field.retailprince");
        Generics.FieldPopulate("Retail Price","order.field.retailprince","130000");
        Generics.FutureDate("Delivery Date","order.field.deliverydate");
        Generics.DropdownSelector("Delivery Branch","order.field.deliverybranch","OR Tambo Intl Airport JS");
        Generics.ClearTextField("order.field.vehicleno");
        Generics.FieldPopulate("No. of Vehicles Required","order.field.vehicleno","10");
        Generics.DropdownSelector("Finance Scheme","order.field.financescehme","ABSA");
        Generics.DropdownSelector("Contract Type","order.field.contacttype","Finance Plan");
        Generics.ClearTextField("order.field.leaseperiod");
        Generics.FieldPopulate("Lease Period","order.field.leaseperiod","12");
        Generics.DropdownSelector("Disposal Type","order.field.dispoaltype","Sell Vehicle");
        Generics.ClearTextField("order.field.repuchaseprice");
        Generics.FieldPopulate("Repurchase Price", "order.field.repuchaseprice", "115000");
    }
}
