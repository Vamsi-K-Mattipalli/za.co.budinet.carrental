package pageLibrary;

import config.TestCore;
import controlers.Generics;
import io.qameta.allure.Step;

/**
 * Created by GregDev on 2017/05/16.
 */
public class NonRevenue extends TestCore
{
    @Step("Capturing Non-Revenue Information")
    public static void populate() throws Exception {
        Generics.switchToFrame("mainTabs");
        Generics.switchToFrame("tabData");
        Generics.ClickButtonLink("nonrevenue.field.txtRegNo2", "nonrevenue.field.txtRegNo2");
        Generics.FieldPopulate("Registration Number", "nonrevenue.field.txtRegNo2", "DD67DNGP");
        Generics.ClickButtonLink("nonrevenue.field.txtReqBy", "nonrevenue.field.txtReqBy");
        Generics.FieldPopulate("Requested By", "nonrevenue.field.txtReqBy", "Gregory");
        Generics.DropdownSelector("Non-Rev Route", "nonrevenue.dropdown.cmbNonRevRoute", "Route 1");
        Generics.DropdownSelector("Non-Revenue Type", "nonrevenue.dropdown.cmbNonRevType", "Private Use");
        Generics.DropdownSelector("Out branch", "nonrevenue.dropdown.cmbOutBranch", "OR Tambo Intl Airport JS");
        Generics.ClickButtonLink("nonrevenue.field.txtOutDate", "nonrevenue.field.txtOutDate");
        Generics.CurrentDate("Out Date","nonrevenue.field.txtOutDate");
        Generics.FutureDate("Out Date","nonrevenue.field.txtDueDate");
        Generics.FieldPopulate("Out Kms", "nonrevenue.field.txtOutKms", "14987");
        Generics.ClearTextField("nonrevenue.field.txtOutTime");
        Generics.FieldPopulate("Due Time", "nonrevenue.field.txtOutTime", "1200");
        Generics.DropdownSelector("In Branch", "nonrevenue.dropdown.cmbDueBackBranch", "OR Tambo Intl Airport JS");
        Generics.ClearTextField("nonrevenue.field.txtDueTime");
        Generics.FieldPopulate("Due Time", "nonrevenue.field.txtDueTime", "1200");
        Generics.FieldPopulate("Out Driver", "nonrevenue.field.txtOutDriver", "Kagiso");
        Generics.DropdownSelector("Employee Number", "nonrevenue.dropdown.nonRevUserID", "AMANDA ROSE - 241004");
    }
    @Step("Capturing Convoy Information")
    public static void ConvoyProfile() throws Exception {
        Generics.switchToFrame("mainTabs");
        Generics.DropdownSelector("Out Branch", "nonrevenue.dropdown.outBranch", "OR Tambo Intl Airport JS");
        Generics.DropdownSelector("Receiving Branch", "nonrevenue.dropdown.inBranch", "OR Tambo Intl Airport JS");
        Generics.ClickButtonLink("nonrevenue.field.efftodate", "nonrevenue.field.efftodate");
        Generics.CurrentDate("Date","nonrevenue.field.efftodate");
        Generics.FutureTime("Time","nonrevenue.field.efftotime");
        Generics.FieldPopulate("Reg No", "nonrevenue.field.RegNo", "DD67DNGP");
        Generics.FieldPopulate("Out Kms", "nonrevenue.field.BayNo", "14987");
        Generics.FieldPopulate("Driver", "nonrevenue.field.Driver", "Kagiso");
        Generics.ClickButtonLink("nonrevenue.button.add", "nonrevenue.button.add");
    }

}
