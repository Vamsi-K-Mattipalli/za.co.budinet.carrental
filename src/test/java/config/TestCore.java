package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestCore extends GlobalDriver{

    public static Properties Repository = new Properties();
    public File f;
    public FileInputStream FI;
    public static ExcelReader Data;

    public static WebElement getLocator(String locator) throws Exception {
        String locatorType = locator.split("~")[0];
        String locatorValue = locator.split("~")[1];

        if (locatorType.toLowerCase().equals("id"))
            return driver.findElement(By.id(locatorValue));
        else if (locatorType.toLowerCase().equals("name"))
            return driver.findElement(By.name(locatorValue));
        else if ((locatorType.toLowerCase().equals("classname"))
                || (locatorType.toLowerCase().equals("class")))
            return driver.findElement(By.className(locatorValue));
        else if ((locatorType.toLowerCase().equals("tagname"))
                || (locatorType.toLowerCase().equals("tag")))
            return driver.findElement(By.className(locatorValue));
        else if ((locatorType.toLowerCase().equals("linktext"))
                || (locatorType.toLowerCase().equals("link")))
            return driver.findElement(By.linkText(locatorValue));
        else if (locatorType.toLowerCase().equals("partiallinktext"))
            return driver.findElement(By.partialLinkText(locatorValue));
        else if ((locatorType.toLowerCase().equals("cssselector"))
                || (locatorType.toLowerCase().equals("css")))
            return driver.findElement(By.cssSelector(locatorValue));
        else if (locatorType.toLowerCase().equals("xpath"))
            return driver.findElement(By.xpath(locatorValue));
        else
            throw new Exception("Unknown locator type '" + locatorType + "'");
    }


    public static WebElement getWebElement(String locator) throws Exception {
        return getLocator(Repository.getProperty(locator));
    }

    public static Object[][] getData(String ExcelSheetName, String TestCaseName) {
        Data = new ExcelReader(System.getProperty("user.dir") + "/za.co.budinet.carrental/src/test/resources/testData/" + ExcelSheetName);
        int rowNum = Data.getRowCount(TestCaseName);
        int colNum = Data.getColumnCount(TestCaseName);
        Object testData[][] = new Object[rowNum - 1][colNum];
        for (int i = 2; i <= rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                testData[i - 2][j] = Data.getCellData(TestCaseName, j, i);
            }
        }
        return testData;
    }

    public void init() throws IOException {
        loadPropertiesFile();
        System.out.println("Loading Properties");
        /* to run in local */
        StartWebDriverBrowser(Repository.getProperty("browser"));
        /* to run in remote(VM's/Grid)*/
        //StartRemoteWebDriverBrowser(Repository.getProperty("browser"));
        implicitewait(15000);
        driver.get(Repository.getProperty("url"));
    }


    public void loadPropertiesFile() throws IOException {
        f = new File(System.getProperty("user.dir") + "/src/test/java/config/config.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/menu.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);


        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/debtors.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/fleet.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/operations.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/salesmarketing.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

        f = new File(System.getProperty("user.dir") + "/src/test/java/pageLocator/utilities.properties");
        FI = new FileInputStream(f);
        Repository.load(FI);

    }
}
