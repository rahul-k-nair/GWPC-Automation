package dataOperation;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class DataReadForSubmission {

    public static HashMap<String,String> getSubmissionData() throws IOException {
        FileInputStream file = new FileInputStream("D:\\GWPC automation\\PC_Account_Create\\src\\main\\java\\excelFile\\PolicyAccount.xlsx");

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet("sheet4");
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {

            map.put(sheet.getRow(0).getCell(i).toString(),sheet.getRow(1).getCell(i).toString());

        }

        return map;
    }


//    @Test
//
//    public  void print() throws IOException {
//        System.out.println(getSubmissionData());
//    }

}


