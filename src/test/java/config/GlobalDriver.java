package config;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by GregDev on 2017/05/16.
 */
public class GlobalDriver {
    public static WebDriver driver;
    static String nodeURL;
    @Parameters({"browser"})
    public static WebDriver StartRemoteWebDriverBrowser(String browser) throws MalformedURLException {
        if (browser.equals("ie")) {
            DesiredCapabilities ieCapabilities = new DesiredCapabilities();
            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "ignore");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);
            ieCapabilities.setCapability("ignoreZoomSetting", true);
            ieCapabilities.setCapability("requireWindowFocus", true);
            ieCapabilities.setBrowserName("internet explorer");
            driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ieCapabilities);
            return driver;
        }else if (browser.equals("IE")) {
            DesiredCapabilities ieCapabilities = new DesiredCapabilities();
            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "ignore");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);
            ieCapabilities.setCapability("ignoreZoomSetting", true);
            ieCapabilities.setCapability("requireWindowFocus", true);
            ieCapabilities.setBrowserName("internet explorer");
            driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ieCapabilities);
            return driver;
        }else if (browser.equals("Ie")) {
            DesiredCapabilities ieCapabilities = new DesiredCapabilities();
            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "ignore");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);
            ieCapabilities.setCapability("ignoreZoomSetting", true);
            ieCapabilities.setCapability("requireWindowFocus", true);
            ieCapabilities.setBrowserName("internet explorer");
            driver = new RemoteWebDriver(new URL("http://10.0.0.4:4444/wd/hub"), ieCapabilities);
            return driver;
        }
        return null;

    }

    public static WebDriver StartWebDriverBrowser(String browser) {
        if (browser.equals("firefox") || browser.equals("FIREFOX") || browser.equals("Firefox")) {
            GlobalDriverProperties.FirefoxProperties();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        } else if (browser.equals("chrome") || browser.equals("CHROME") || browser.equals("Chrome")) {
            GlobalDriverProperties.ChromeProperties();
            driver = new ChromeDriver();
            return driver;
        } else if (browser.equals("ie") || browser.equals("IE") || browser.equals("Ie")) {
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "ignore");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);
            ieCapabilities.setCapability("ignoreZoomSetting", true);
            ieCapabilities.setCapability("requireWindowFocus", true);
            GlobalDriverProperties.InternetExplorerProperties();
            driver = new InternetExplorerDriver(ieCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;

        }
        return null;
    }

    @Parameters({"portNo"})
    public static void StartGridWebDriverBrowser(String portNo,String browser)throws  MalformedURLException{
        if(portNo.equalsIgnoreCase("4545")) {
            browser="ie";
            nodeURL = "http://localhost:4545/wd/hub";
            DesiredCapabilities capabilities1 = DesiredCapabilities.internetExplorer();
            capabilities1.setBrowserName("internet explorer");
            capabilities1.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities1.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities1);
        }else
        if(portNo.equalsIgnoreCase("4546"))
        {
            browser="ie";
            nodeURL = "http://localhost:4546/wd/hub";
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setBrowserName("internet explorer");
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
        }else
        if(portNo.equalsIgnoreCase("4547"))
        {
            browser="ie";
            nodeURL = "http://localhost:4547/wd/hub";
            DesiredCapabilities capabilities2 = DesiredCapabilities.internetExplorer();
            capabilities2.setBrowserName("internet explorer");
            capabilities2.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities2.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL),capabilities2);
        }

    }

    public static void driverwait() throws InterruptedException {
        Reporter.log("waiting for 2 seconds...");
        Thread.sleep(2000);
    }

    public static void driverwaitmenu() throws InterruptedException {
        Reporter.log("waiting for 1 second...");
        Thread.sleep(1000);
    }

    public void implicitewait(int timeInsec) {
        Reporter.log("waiting for the page to load...");
        try {
            driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
            Reporter.log("Page is loaded");
        } catch (Throwable error) {
            Reporter.log("Timeout for Page to load request to complete after " + timeInsec + " seconds");
//            Assert.assertTrue(false, "Timeout for page load request after " + timeInsec + " Second");
        }
    }
}
