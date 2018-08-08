package controlers;

import config.GlobalDriver;
import config.TestCore;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by GregDev on 2017/05/16.
 */
public class GlobalUtility extends TestCore{
    public static void ElementCompare(String ExpectedMessage, String ActualMessageLocator) throws Exception {
        try {
            WebElement element = getWebElement(ActualMessageLocator);
            String ActualMessageTxt = element.getText();
            driverwait();
            Assert.assertEquals(ActualMessageTxt, ExpectedMessage);
            System.out.println("Expected " + ExpectedMessage + " Actual " +ActualMessageTxt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void SnapShot(String ClassName, String ScreenName) throws IOException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        TakesScreenshot ts = (TakesScreenshot) GlobalDriver.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("c:/Bidvest/Screenshots/" + reportDate + "/" + ClassName + "/" + ScreenName + ".png"));
    }

    public static void ElementHighliter(WebDriver webDriver, WebElement element) {
        for (int i = 0; i < 2; i++) {
            JavascriptExecutor js = (JavascriptExecutor) GlobalDriver.driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 3px solid red;");
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
        }
    }
}
