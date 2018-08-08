package pageLibrary;

import config.TestCore;
import controlers.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FinanceScheme extends TestCore{
    public static void populate()throws Exception
    {
         List<WebElement> elements = driver.findElements(By.tagName("frame"));
         driver.switchTo().frame(elements.get(1));
        Generics.FieldPopulate("Date","finance.field.edate","2017-08-01");
        Generics.DropdownSelector("House","finance.field.house2","");
        Generics.FieldPopulate("Scheme ","finance.field.scheme1","scheme");
        Generics.FieldPopulate("Descrption","finance.field.description","Amen");
        Generics.FieldPopulate("From Date","finance.field.fdate","2016-01-01");
        Generics.FieldPopulate("To Date","finance.field.tdate","2017-01-01");
        Generics.DropdownSelector("Contract Type","finance.field.contracttype","");
        Generics.FieldPopulate("BFT","finance.field.bft","BFF");
        Generics.FieldPopulate("Provision","finance.field.provision","Provision");
        Generics.FieldPopulate("Expenses","finance.field.expense","900");
        Generics.FieldPopulate("Interested","finance.field.interest","5");
    }
}
