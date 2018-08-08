package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class Claims extends TestCore{
    public static void populate()throws Exception
    {

        Generics.switchToFrame("MainTabs");
        Generics.ClickButtonLink("claim.field.claimno", "claim.field.claimno");
        Generics.FieldPopulate("No Captured", "claim.field.claimno", "JS123456");
        Generics.FieldPopulate("Claim Open Date", "claim.field.claimodate", "2016-01-01");
        Generics.FieldPopulate("Closed Date", "claim.field.claimcdate", "2017-03-01");
        Generics.DropdownSelector("Claim Type", "claim.field.claimtype", "Accident");
        Generics.FieldPopulate("Claim Amount", "claim.field.claimamount", "5000");
        Generics.FieldPopulate("Registration No", "claim.field.claimregno", "XPW106GP");
        Generics.FieldPopulate("No capturing", "claim.field.claimmovement", "1245");
        Generics.FieldPopulate("3rd Party Name", "claim.field.claim3rdname", "Outsurance");
        Generics.FieldPopulate("3rd Party Conatct No", "claim.field.claim3rdcontactno", "0122660102");

    }
}
