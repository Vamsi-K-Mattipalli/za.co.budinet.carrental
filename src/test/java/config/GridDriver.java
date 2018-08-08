package config;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridDriver {
    public static WebDriver driver;
     Platform WIN10;
     static String nodeURL;

     @Parameters({"portNo","appURL"})
     @BeforeMethod()
    public static void nodes(String portNo, String appURL)throws InterruptedException, NullPointerException, MalformedURLException{
         if(portNo.equalsIgnoreCase("4545")) {
             nodeURL = "http://localhost:4545/wd/hub";
             DesiredCapabilities capabilities1 = DesiredCapabilities.internetExplorer();
             capabilities1.setBrowserName("internet explorer");
             capabilities1.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
             capabilities1.setPlatform(Platform.WINDOWS);
             driver = new RemoteWebDriver(new URL(nodeURL), capabilities1);
             driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
             driver.navigate().to(appURL);
             System.out.println("Title is " + driver.getTitle());
             System.out.println("URL is" + driver.getCurrentUrl());
         }else
             if(portNo.equalsIgnoreCase("4546"))
             {
                 nodeURL = "http://localhost:4546/wd/hub";
                 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                 capabilities.setBrowserName("internet explorer");
                 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                 capabilities.setPlatform(Platform.WINDOWS);
                 driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
                 driver.navigate().to(appURL);
                 System.out.println("Title is " +driver.getTitle());
                 System.out.println("URL is" + driver.getCurrentUrl());
                 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
             }else
                 if(portNo.equalsIgnoreCase("4547"))
                 {
                     nodeURL = "http://localhost:4547/wd/hub";
                     DesiredCapabilities capabilities2 = DesiredCapabilities.internetExplorer();
                     capabilities2.setBrowserName("internet explorer");
                     capabilities2.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                     capabilities2.setPlatform(Platform.WINDOWS);
                     driver = new RemoteWebDriver(new URL(nodeURL),capabilities2);
                     driver.navigate().to(appURL);
                     System.out.println("Title is " +driver.getTitle());
                     System.out.println("URL is" + driver.getCurrentUrl());
                     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
                 }

    }
    @Test(dataProvider = "Authentication")
    public void Google(String username, String password) throws InterruptedException
    {
        System.out.println("Username is " +username);
        System.out.println("Password is " +password);

    }
    @DataProvider(name="Authentication")
    public Object[][] credentials()
    {
        Object[][] obj = new Object[3][2];
        obj[0][0]="Admin";
        obj[0][1]="Admin";

        obj[1][0]="Tester";
        obj[1][1]="Tester";

        obj[2][0]="Developerr";
        obj[2][1]="Developer";

        return obj;
    }
}
