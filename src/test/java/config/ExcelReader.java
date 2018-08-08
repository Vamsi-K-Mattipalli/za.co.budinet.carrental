package config;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import static org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA;

/**
 * Created by GregDev on 2017/05/16.
 */
public class ExcelReader {
    public String filePath;
    public FileInputStream fis = null;
    public FileOutputStream fileOut = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;

    public ExcelReader(String filePath) {
        this.filePath = filePath;
        try {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRowCount(String SheetName) {
        int index = workbook.getSheetIndex(SheetName);
        if (index == -1)
            return 0;
        else {
            sheet = workbook.getSheetAt(index);
            int number = sheet.getLastRowNum() + 1;
            return number;
        }
    }

    public int getColumnCount(String SheetName) {
        if (!isSheetExist(SheetName))
            return -1;
        sheet = workbook.getSheet(SheetName);
        row = sheet.getRow(0);
        if (row == null)
            return -1;

        return row.getLastCellNum();
    }

    public boolean isSheetExist(String SheetName) {
        int index = workbook.getSheetIndex(SheetName);
        if (index == -1) {
            index = workbook.getSheetIndex(SheetName.toUpperCase());
            return index != -1;
        } else
            return true;
    }

    public String getCellData(String SheetName, int colNum, int rowNum) {
        try {
            if (rowNum <= 0)
                return "";
            int index = workbook.getSheetIndex(SheetName);
            if (index == -1)
                return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(colNum);
            if (cell == null)
                return "";

            if (cell.getCellType() == Cell.CELL_TYPE_STRING)
                return cell.getStringCellValue();
            else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC
                    || cell.getCellType() == CELL_TYPE_FORMULA) {
                String cellText = String.valueOf(cell.getNumericCellValue());
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    double d = cell.getNumericCellValue();

                    Calendar cal = Calendar.getInstance();
                    cal.setTime(HSSFDateUtil.getJavaDate(d));
                    cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
                    cellText = cal.get(Calendar.MONTH) + 1 + "/"
                            + cal.get(Calendar.DAY_OF_MONTH) + "/" + cellText;
                }
                return cellText;
            } else if (cell.getCellType() == Cell.CELL_TYPE_BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row" + rowNum + "or column" + colNum + " does not exist in xls";
        }

    }
}
