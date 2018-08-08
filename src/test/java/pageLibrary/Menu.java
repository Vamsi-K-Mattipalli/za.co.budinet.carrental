package pageLibrary;


import config.GlobalDriver;
import config.TestCore;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by GregDev on 2017/05/16.
 */
public class Menu extends TestCore{
    @Step("Navigate Menu")
    public static void NavigateTo2(String MainMenu, String MainMenuSub) throws Exception
    {
        LocalDate localDate = LocalDate.now();
        String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
        SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
        Calendar c = Calendar.getInstance();
        String TimeNow = (String)(formattedDate.format(c.getTime()));
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        Actions Mouse = new Actions(GlobalDriver.driver);
        WebElement element = getWebElement(MainMenu);
        String text = element.getText();
        if(element.isDisplayed())
            try {
                {
                    Reporter.log(DateNow +" "+ TimeNow + " Hover on" + text);
                    Mouse.moveToElement(element).perform();
                    System.out.println(DateNow +" "+ TimeNow + " Hover on " + text);
                }
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                WebElement element1 = getWebElement(MainMenuSub);
                String text1 = element1.getText();
                if (element1.isDisplayed()) {
                    Reporter.log(DateNow +" "+ TimeNow + " Click on " + text1);
                    element1.click();
                    System.out.println(DateNow +" "+ TimeNow +" Clicked on " + text1);
                    driverwait();
                }
            } catch (Exception e) {
                e.getMessage();
            }
    }
    @Step("Navigate Menu")
    public static void NavigateTo3(String MainMenu, String MainMenuSub, String MainMenuSubSub) throws Exception
    {
        Actions Mouse = new Actions(GlobalDriver.driver);
        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            WebElement element = getWebElement(MainMenu);
            String text = element.getText();
            if (element.isEnabled()) {
                Reporter.log(DateNow +" "+ TimeNow + " Hover on " + text);
                Mouse.moveToElement(element).perform();
                System.out.println(DateNow +" "+ TimeNow + " Hover on " + text);
            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement element1 = getWebElement(MainMenuSub);
            String text1 = element1.getText();

            if (element1.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow +" Mouse over " + text1);
                Mouse.moveToElement(element1).perform();
                System.out.println(DateNow +" "+ TimeNow +" Hover on " + text1);

            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement element2 = getWebElement(MainMenuSubSub);
            String text2 = element2.getText();

            if (element2.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow + " Clicking on " + text2);
                System.out.println(DateNow +" "+ TimeNow + " Clicking on " + text2);
                element2.click();
                Reporter.log(DateNow +" "+ TimeNow + " Clicked on " + text2);
                System.out.println(DateNow +" "+ TimeNow + " Clicked on " + text2);
                driverwait();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    @Step("Navigate Menu")
    public static void NavigateTo4(String MainMenu, String MainMenuSub, String MainMenuSubSub, String MainMenuSubSubSub) throws Exception
    {
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        Actions Mouse = new Actions(GlobalDriver.driver);
        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            WebElement element = getWebElement(MainMenu);
            String text = element.getText();
            if (element.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow + " Hover on " + text);
                System.out.println(DateNow +" "+ TimeNow + " Hover on " + text);
                Mouse.moveToElement(element).perform();

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement element1 = getWebElement(MainMenuSub);
            String text1 = element1.getText();

            if (element1.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow + " Hover on " + text1);
                System.out.println(DateNow +" "+ TimeNow + " Hover on " + text1);
                Mouse.moveToElement(element1).perform();


            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement element2 = getWebElement(MainMenuSubSub);
            String text2 = element2.getText();

            if (element2.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow + " Hover on " + text2);
                System.out.println(DateNow +" "+ TimeNow +  " Hover on " + text2);
                Mouse.moveToElement(element2).perform();

            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement element3 = getWebElement(MainMenuSubSubSub);
            String text3 = element3.getText();
            if (element3.isDisplayed()) {
                Reporter.log(DateNow +" "+ TimeNow + " Click on " + text3);
                System.out.println(DateNow +" "+ TimeNow + " Click on " + text3);
                element3.click();
                Reporter.log(DateNow +" "+ TimeNow +  " Clicked on " + text3);
                System.out.println(DateNow +" "+ TimeNow +  " Clicked on " + text3);
                driverwait();
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }
    }
}
