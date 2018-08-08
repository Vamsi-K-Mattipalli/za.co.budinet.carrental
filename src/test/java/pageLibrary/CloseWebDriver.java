package pageLibrary;

import config.GlobalDriver;
import config.TestCore;

/**
 * Created by GregZwane on 2017/05/24.
 */
public class CloseWebDriver extends TestCore{
    public static void browser()
    {
        GlobalDriver.driver.quit();
        GlobalDriver.driver = null;
    }

}
