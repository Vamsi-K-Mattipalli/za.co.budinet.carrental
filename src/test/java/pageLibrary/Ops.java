package pageLibrary;

import config.TestCore;
import controlers.Generics;

public class Ops extends TestCore{
    public static void ReservationsEnquiry(String FieldLabel, String DropdownField, String DropdownValue, String FieldLabel1, String FieldName, String FieldValue) throws Exception
    {
        Generics.DropdownSelector(FieldLabel, DropdownField, DropdownValue);
        Generics.FieldPopulate(FieldLabel1, FieldName, FieldValue);

    }
    public static void OperationEnquiry()throws Exception
    {
        Generics.DropdownSelector("", "", "");
        Generics.DropdownSelector("", "", "");
        Generics.FieldPopulate("", "", "");
    }


}
