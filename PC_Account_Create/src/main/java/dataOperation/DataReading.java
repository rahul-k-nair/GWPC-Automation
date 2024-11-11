package dataOperation;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class DataReading {


    public static HashMap<String,String> getData() throws IOException {
        FileInputStream file = new FileInputStream("D:\\GWPC automation\\PC_Account_Create\\src\\main\\java\\excelFile\\PolicyAccount.xlsx");

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet("sheet1");
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {

            map.put(sheet.getRow(0).getCell(i).toString(),sheet.getRow(2).getCell(i).toString());

        }

        return map;
    }


//    @Test
//
//    public  void print() throws IOException {
//        System.out.println(getData());
//    }
//
}
