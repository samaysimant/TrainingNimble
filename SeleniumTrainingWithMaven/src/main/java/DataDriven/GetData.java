package DataDriven;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GetData {

	public static HashMap<String, Object[]> readData(String infile)
			throws BiffException, IOException {
		
		HashMap<String, Object[]> map = new HashMap<String, Object[]>();

		Object[][] mydata = readExcel(infile);
		
		

		for (int i = 0; i < mydata.length; i++) {
			
			
			int rowlen = 0;
			for (int j = 0; j < mydata[i].length; j++) {
				if (!(mydata[i][j].toString().isEmpty()
						| mydata[i][j].toString() == null | mydata[i][j]
						.toString().equals(""))) {
					rowlen++;
				}
			}

			String[] testdata = new String[rowlen];

			for (int j = 0; j < mydata[i].length; j++) {
				if (!(mydata[i][j].toString().isEmpty()
						| mydata[i][j].toString() == null | mydata[i][j]
						.toString().equals(""))) {
					testdata[j] = (String) mydata[i][j];
				}
			}
			
			
			
			map.put(mydata[i][0].toString(), testdata);
		}

		return map;
	}

	private static Object[][] readExcel(String file) throws BiffException,
			IOException {
		Object[][] exceldata;

		Workbook wb = Workbook.getWorkbook(new File(file));

		Sheet S1 = wb.getSheet(0);

		int numrows = S1.getRows();
		int numCols =S1.getColumns();
		
		System.out.println("Number of rows "+ numrows);

		exceldata = new Object[numrows][numCols];
		
		for (int i = 0; i < numrows; i++) {

			for (int j = 0; j < S1.getColumns(); j++) {

				exceldata[i][j] = S1.getCell(j, i).getContents();

			}

		}

		// Validate excel
		// for (int k=0;k<exceldata.length;k++){
		//
		// for(int l=0;l<exceldata[0].length;l++){
		// System.out.println(exceldata[k][l]);
		// }
		//
		// }

		return exceldata;
	}

	// public static void main(String[] args) throws BiffException, IOException
	// {
	// GetData gd= new GetData();
	// gd.readExcel("./testdata/testdata1.xls");
	// }

}
