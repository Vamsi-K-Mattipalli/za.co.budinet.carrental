package config;

import org.testng.annotations.DataProvider;

public class DataProviders {
    private static DataConfig config = new DataConfig(System.getProperty("user.dir") + "/src/test/resources/testData/InputData.xlsx");
    @DataProvider(name = "login")
    public static Object[][] userLoginData() {
        int rows = config.getRowCount(0);
        Object[][] data = new Object[rows][2];
        for (int i = 0; i < rows; i++) {
            data[i][0] = config.getData(0, i, 0);
            data[i][1] = config.getData(0, i, 1);
        }
        return data;
    }
}
