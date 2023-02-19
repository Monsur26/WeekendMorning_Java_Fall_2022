package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) {
        final String fileSource="C:\\Users\\Monsu\\IdeaProjects\\WeekendMorningBatch_JAVA_FALL_2022\\Documents\\S.xlsx";
        new ReadExcel().readExcelFile(fileSource);
    }

    public  void readExcelFile(String fileSource){
        try {
            // Open the Excel file
            File file = new File(fileSource);
            FileInputStream inputStream = new FileInputStream(file);
            Workbook workbook=WorkbookFactory.create(inputStream);

            // Get the first sheet of the Excel file

            Sheet sheet=workbook.getSheetAt(0);

            // Iterate through the rows of the sheet
            for (Row row:sheet
                 ) {
                for (Cell cell:row
                     ) {
                    if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue()+ "\t ");
                    } else if (cell.getCellType() == CellType.NUMERIC){
                        System.out.print(cell.getNumericCellValue()+ "\t");
                    }
                }
                System.out.println();
            }

            //  Close the input stream and workbook
            workbook.close();
            inputStream.close();

            System.out.println("Operation Completed");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
