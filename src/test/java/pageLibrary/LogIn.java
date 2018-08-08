package pageLibrary;

import config.GlobalDriver;
import config.TestCore;
import controlers.Generics;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.testng.Reporter;

/**
 * Created by GregDev on 2017/05/16.
 */
public class LogIn extends TestCore {

    @Step("User Login")
    public static void SignIn(String UsernameValue, String PasswordValue) throws Exception {
        try {
            if(getWebElement("login.field.empoyeeno").isDisplayed()) {
                System.out.println("Testing on " + driver.getCurrentUrl());
                System.out.println("Session ID " + driver.getWindowHandles());
                Generics.FieldPopulate("Employee No", "login.field.empoyeeno", UsernameValue);
                Generics.FieldPopulate("Password", "login.field.password", PasswordValue);
                Generics.ClickButtonLink("login.button.login", "login.button.login");
            }
            Alert alert = GlobalDriver.driver.switchTo().alert();
            alert.dismiss();
            Object[] allWindows = GlobalDriver.driver.getWindowHandles().toArray();
            GlobalDriver.driver.switchTo().window(allWindows[1].toString());
            GlobalDriver.driver.switchTo().activeElement();
        } catch (Exception e) {
        }
    }
}
