package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class Disposal extends TestCore{
    public static void populate()throws Exception
    {
        Generics.switchToFrame("mainTabs");
        Generics.FieldPopulate("Sold Date","disposal.field.date","2017-07-30");
        Generics.DropdownSelector("MMH Dealer","disposal.field.mmh","MMH");
        Generics.FieldPopulate("Sold To","disposal.field.sold","VW Mcarty");
        Generics.FieldPopulate("Reg No","disposal.field.reg","XPW106GP");
        Generics.CheckBoxSelect("Sold","dispoal.field.sold");
        Generics.FieldPopulate("Selling Price","disposal.field.sellprice","150000");
        Generics.FieldPopulate("Invoice Debit No","disposal.field.invoiceno","215415");
    }
}
