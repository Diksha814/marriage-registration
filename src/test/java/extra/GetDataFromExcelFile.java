package extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");
	
		Workbook wb = WorkbookFactory.create(fis);

		String husName = wb.getSheet("matrimony").getRow(1).getCell(2).getStringCellValue();

		System.out.println(husName);
		
		wb.getSheet("matrimony").getRow(1).getCell(2).setCellValue("Dingi");;
		wb.getSheet("matrimony").getRow(1).getCell(3).setCellValue("Dinga");;
	
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\testData.xlsx");
		wb.write(fos);
		System.out.println("couple added successfully!!!");
	}
}
