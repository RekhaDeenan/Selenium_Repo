package week5.day2.assignment;

import java.io.IOException;

import org.apache.poi.hpsf.Array;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelRead(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		System.out.println("row count" + rowcount);
		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println("cell Count" + cellCount);
		String dataProviderArr[][] = new String[rowcount][cellCount];
		for (int i = 1; i <=rowcount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				dataProviderArr[i - 1][j] = text;
			}

		}
		return dataProviderArr;

	}

}
