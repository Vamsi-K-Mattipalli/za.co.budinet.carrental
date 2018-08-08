package controlers;


import config.TestCore;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.BaseTestMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by GregDev on 2017/05/02.
 */
public class GlobalListner extends TestCore implements ITestListener {
    @Step("Starting Testing")
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");
        Reporter.log("Starting testing " + iTestResult.getMethod().getMethodName());
        System.out.println("Starting testing " + iTestResult.getMethod().getMethodName());
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");

    }
    @Step("Test Cases PASS")
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");
        Reporter.log("Test Case No " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getStatus());
        System.out.println("Test Case No " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getStatus());
        System.out.println("Test Percentage " + iTestResult.getMethod().getSuccessPercentage());
        System.out.println("Test Date " + iTestResult.getMethod().getDate());
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");
    }


    @Attachment(value = "Screenshot on failure", type = "image/png")
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(""+getTestMethodName(iTestResult) + " FAILED");
        Object testClass = iTestResult.getInstance();
        //driver = ((TestCore) testClass).getDriver;
        if(driver instanceof WebDriver)
        {
            System.out.println("Screenshot captured for test case : " + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }
        saveTextLog(getTestMethodName(iTestResult)+" failed and screenshot taken");
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");



     /**   if (!iTestResult.isSuccess()) {
            System.out.println("***********************************************************************************************");
            Reporter.log("Test Case No " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getStatus());
            System.out.println("Test Case No " + iTestResult.getMethod().getMethodName() + " " + iTestResult.getStatus());
            String userDirectory1 = System.getProperty("user.dir");
            String customeLocation = "\\src\\test\\resources\\screenShot\\";
            String failureImageFileName = userDirectory1 + customeLocation +
                    new SimpleDateFormat("DD-MM-YYYY_HH-ss").format(new GregorianCalendar().getTime()) +
                    "-" + iTestResult.getMethod().getMethodName() + ".png";
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {

                FileUtils.copyFile(scrFile, new File(failureImageFileName));
            } catch (IOException e) {
                e.getMessage();
            }
            Reporter.log("<a href=\"" + failureImageFileName + "\"><img src=\"file:\\" + failureImageFileName +
                    "\" alt=\"\"" + "height='100' width='100'/> " + "<br />");
            Reporter.setCurrentTestResult(null);
        }
        System.out.println("Test Percentage " + iTestResult.getMethod().getSuccessPercentage());
        System.out.println("Test Date " + iTestResult.getMethod().getDate());
        System.out.println("Test Count " + iTestResult.getMethod().getInvocationCount());
**/
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");
        Reporter.log("Test Case No " + iTestResult.getMethod().getMethodName());
        System.out.println("Test Case No " + iTestResult.getMethod().getMethodName());
        System.out.println("***********************************************************************************************");
        System.out.println("-----------------------------------------------------------------------------------------------");

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    private static String getTestMethodName(ITestResult iTestResult)
    {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    //Text attachment forallure
    @Attachment(value="Page screenshot",type = "image.png")
    public byte[] saveScreenshotPNG(WebDriver driver)
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
    @Attachment(value = "[0]",type ="text/plain")
    public static String saveTextLog(String message)
    {
        return message;
    }
}
