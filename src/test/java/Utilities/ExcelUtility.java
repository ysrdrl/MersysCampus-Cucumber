package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getListData(String path, String sheetName, int columnCount) {

        ArrayList<ArrayList<String>> excelList = new ArrayList<>();

        Workbook workbook;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet(sheetName);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> satirData = new ArrayList<>();

            for (int j = 0; j < columnCount; j++) {

                satirData.add(sheet.getRow(i).getCell(j).toString());

            }
            excelList.add(satirData);
        }
        return excelList;
    }

    public static void writeExcel(String path, Scenario scenario, String browserType, String time) throws IOException {

        File dosya = new File(path);
        if (!dosya.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");
            Row newRow = sheet.createRow(0);

            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserType);

            newCell = newRow.createCell(3);
            newCell.setCellValue(time);

            try {

                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            FileInputStream inputStream=null;
            Workbook workbook;
            try {
                inputStream=new FileInputStream(path);
                workbook=WorkbookFactory.create(inputStream);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            Sheet sheet= workbook.getSheetAt(0);

            int rowCount=sheet.getPhysicalNumberOfRows();
            Row newRow= sheet.createRow(rowCount);

            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserType);

            newCell = newRow.createCell(3);
            newCell.setCellValue(time);

            try {
                inputStream.close();
                FileOutputStream outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }

        }




    }


}
