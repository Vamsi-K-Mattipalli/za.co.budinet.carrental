package controlers;

import config.GlobalDriver;
import config.TestCore;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Generics extends TestCore{
    @Step("Click on the Button/Link")
    public static void ClickButtonLink(String ButtonLinkValue, String ButtonLocatorName) throws Exception {

        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            String ButtonLinkLabel = getWebElement(ButtonLinkValue).getAttribute("value");
            if(ButtonLinkLabel!=null) {

                System.out.println(DateNow +" "+ TimeNow +" Click on the " + ButtonLinkLabel);
                Reporter.log(DateNow +" "+ TimeNow +" Click on the " + ButtonLinkLabel);
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getWebElement(ButtonLocatorName).click();
            if(ButtonLinkLabel !=null) {
                Reporter.log(DateNow +" "+ TimeNow +" "+ButtonLinkLabel + " Button/Link is clicked");
                System.out.println(DateNow +" "+ TimeNow +" "+ButtonLinkLabel + " Button/Link is clicked");
            }

        }catch (Exception e) {
            if (e.getMessage().contains("Unable to find element")) {
                Assert.fail("WebElement not loaded " + e.getMessage());
            }
        }
    }

    @Step("Clearing Field Value")
    public static void ClearTextField(String FieldName) throws Exception {
        LocalDate localDate = LocalDate.now();
        String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
        SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
        Calendar c = Calendar.getInstance();
        String TimeNow = (String)(formattedDate.format(c.getTime()));
        Reporter.log(DateNow +" "+ TimeNow + " Clearing Field");
        System.out.println(DateNow +" "+ TimeNow +" Clearing Field");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getWebElement(FieldName).clear();
        Reporter.log(DateNow +" "+ TimeNow +" Field is cleared");
        System.out.println(DateNow +" "+ TimeNow +" Field is cleared");
    }


    @Step("Clearing Selected Dropdown Value")
    public static void ClearDropDownField(String FieldName) throws Exception
    {
        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            Reporter.log(DateNow +" "+ TimeNow +" Clearing Dropdown Value");
            System.out.println(DateNow +" "+ TimeNow +" Clearing Dropdown Value");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getWebElement(FieldName).click();
            Select oSelect = new Select(getWebElement(FieldName));
            oSelect.selectByIndex(0);
            Reporter.log(DateNow +" "+ TimeNow +" Dropdown Value is cleared");
            System.out.println(DateNow +" "+ TimeNow +" Dropdown Value is cleared");
        }catch (Exception e)
        {
            if (e.getMessage().contains("Unable to find element")) {
                Assert.fail("WebElement not loaded " + e.getMessage());
                e.getMessage();
            }
        }
    }

    @Step("Selecting Dropdown Value")
    public static void DropdownSelector(String FieldLabel, String FieldName, String FieldValue) throws Exception {
        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            Reporter.log(DateNow +" "+ TimeNow +" Clicking on the " + FieldLabel);
            System.out.println(DateNow +" "+ TimeNow +" Clicking on the " + FieldLabel);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getWebElement(FieldName).click();
            Select oSelect = new Select(getWebElement(FieldName));
            oSelect.selectByVisibleText(FieldValue);
            String Options = oSelect.getFirstSelectedOption().getAttribute("value");
            Reporter.log(DateNow +" "+ TimeNow + " "+FieldLabel + " " + Options + " is selected");
            System.out.println(DateNow +" "+ TimeNow +" "+FieldLabel + " " + Options + " is selected");
        } catch (Exception e) {
            if (e.getMessage().contains("Unable to find element")) {
                Assert.fail("WebElement not loaded " + e.getMessage());
                e.getMessage();
            }
        }
    }

    @Step("Capturing Field Value")
    public static void FieldPopulate(String FieldLabel, String FieldName, String FieldValue) throws Exception
    {
        try {
            if(getWebElement(FieldName).isDisplayed()) {
                LocalDate localDate = LocalDate.now();
                String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
                SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
                Calendar c = Calendar.getInstance();
                String TimeNow = (String)(formattedDate.format(c.getTime()));
                Reporter.log(DateNow +" "+ TimeNow +" Capturing the " + FieldLabel);
                System.out.println(DateNow +" "+ TimeNow +" Capturing the " + FieldLabel);
                getWebElement(FieldName).sendKeys(FieldValue);
                Reporter.log(DateNow +" "+ TimeNow +" "+ FieldLabel + " is captured");
                System.out.println(DateNow +" "+ TimeNow +" "+FieldLabel + " is captured");


            }
        }catch (Exception e)
        {
            if (e.getMessage().contains("Unable to find element")) {
                Assert.fail("WebElement not loaded " + e.getMessage());
            }
        }
    }

    @Step("Selecting Enable/Disable CheckBox")
    public static void CheckBoxSelect(String FieldLabel, String FieldName) throws Exception
    {
        try {
            LocalDate localDate = LocalDate.now();
            String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
            SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
            Calendar c = Calendar.getInstance();
            String TimeNow = (String)(formattedDate.format(c.getTime()));
            Reporter.log(DateNow +" "+ TimeNow +" Selecting " + FieldLabel);
            System.out.println(DateNow +" "+ TimeNow + " Selecting " + FieldLabel);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            if(getWebElement(FieldName).isDisplayed() && getWebElement(FieldName).isEnabled()) {
                getWebElement(FieldName).click();
                Reporter.log(DateNow +" "+ TimeNow + " "+FieldLabel + " selected");
                System.out.println(DateNow +" "+ TimeNow +" "+FieldLabel + " selected");
            }
        }catch (Exception e)
        {
            Assert.fail("WebElement is not loaded " + e.getMessage());
        }

    }

    @Step("Confirm Login")
    public static void ConfirmSubmit(String Username, String Password) throws Exception {
        driverwait();
        Object[] allWindows = GlobalDriver.driver.getWindowHandles().toArray();
        GlobalDriver.driver.switchTo().window(allWindows[2].toString());
        GlobalDriver.driver.switchTo().activeElement();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (getWebElement("login.field.users").isDisplayed()) {
            FieldPopulate("Employee", "login.field.users", Username);
            FieldPopulate("Password", "login.field.pass", Password);
            ClickButtonLink("login.button.submit", "login.button.submit");
        }
    }

    @Step("Popup Message Confirmation")
    public static void PopMessege(String ExpectedMessage) throws Exception {
        try {
            Reporter.log("Validation Message");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Alert alt = GlobalDriver.driver.switchTo().alert();
            String ActualMessage = alt.getText();
            Assert.assertEquals(ExpectedMessage, ActualMessage);
            System.out.println("Expected " + "*" + ExpectedMessage + "* " + " Actual " + " *" + ActualMessage + "*");
            alt.accept();
            driverwait();
        }catch (Exception e) {
            e.getMessage();
        }
    }

    @Step("Switch to the Active Frame")
    public static void switchToFrame(String frameElement) {
        try {

            driver.switchTo().frame(frameElement);
            System.out.println("Navigated to frame with element "+ frameElement);
        } catch (NoSuchFrameException e) {
            System.out.println("Unable to locate frame with element " + frameElement + e.getStackTrace());
        } catch (StaleElementReferenceException e) {
            System.out.println("Element with " + frameElement + "is not attached to the page document" + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to navigate to frame with element " + frameElement + e.getStackTrace());
        }
    }
    @Step("Capture Current Date Value")
    public static String CurrentDate(String FieldLabel,String FieldName) throws Exception
    {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
        SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM:SS");
        Calendar c = Calendar.getInstance();
        String TimeNow = (String)(formattedDate.format(c.getTime()));
        Reporter.log(DateNow + " " + TimeNow + " " + " Capturing the " + FieldLabel);
        System.out.println(DateNow +  " "+ TimeNow + " " + "Capturing the " + FieldLabel);
        FieldPopulate(FieldLabel,FieldName,DateNow);
        System.out.println(DateNow+" " + TimeNow + " " +FieldLabel + " is captured");
        Reporter.log(DateNow+ " "+ TimeNow + " "+ FieldLabel + " is captured");
        return null;
    }
    @Step("Capture Day After Tomorrow Date Value")
    public static String FutureDate(String FieldLabel,String FieldName) throws Exception
    {
        Date today = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 2);
        String dayaftertomorrow = (String)(formattedDate.format(c.getTime()));
        Reporter.log("Capturing the " + FieldLabel);
        System.out.println("Capturing the " + FieldLabel);
        FieldPopulate(FieldLabel,FieldName,dayaftertomorrow);
        Reporter.log(FieldLabel + " is captured");
        System.out.println(FieldLabel + " is captured");
        return null;
    }
    @Step("Capture Future Time Value")
    public static String FutureTime(String FieldLabel,String FieldName) throws Exception
    {
        Date today = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("HH:MM");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.HOUR, 2);
        String futuretime = (String)(formattedDate.format(c.getTime()));
        Reporter.log("Capturing the " + FieldLabel);
        System.out.println("Capturing the " + FieldLabel);
        FieldPopulate(FieldLabel,FieldName,futuretime);
        Reporter.log(FieldLabel + " is captured");
        System.out.println(FieldLabel + " is captured");
        return null;
    }
    public static void getFields() throws Exception {
        oFieldNamesDropdown();
        oFieldNames();
    }

    public static String MsgLog() throws Exception
    {
        LocalDate localDate = LocalDate.now();
        String DateNow = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
        System.out.println(DateNow);
        return null;
    }
    public static ArrayList oButtonsNames() {
        List<WebElement> elements = GlobalDriver.driver.findElements(By.xpath("//*[@type='button']"));
        for (WebElement e : elements)
            if (e.getAttribute("id") != "") {
                System.out.println("button." + e.getAttribute("value") + "=" + "xpath~" + "//*[@value='" + e.getAttribute("value") + "']");
            }
        return null;
    }
    public static ArrayList oFieldNamesDropdown() {
        List<WebElement> elements = GlobalDriver.driver.findElements(By.xpath("//select"));
        for (WebElement e : elements)
            if (e.getAttribute("id") != "") {
                System.out.println("dropdown." + e.getAttribute("id") + "=" + "xpath~" + "//select[@id='" + e.getAttribute("id") + "']");
            }
        return null;
    }
    public static ArrayList oFieldNames() {
        List<WebElement> elements = GlobalDriver.driver.findElements(By.xpath("//input"));
        for (WebElement e : elements)
            if (e.getAttribute("id") != "") {
                System.out.println("field." + e.getAttribute("id") + "=" + "xpath~" + "//input[@id='" + e.getAttribute("id") + "']");
            }

        return null;
    }
    public static void oFieldType() {
        List<WebElement> elements = GlobalDriver.driver.findElements(By.xpath("//input"));
        for (WebElement e : elements)
            System.out.println("Field Type "+e.getAttribute("id")+"']");
    }
}
