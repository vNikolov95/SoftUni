import jxl.*;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.*;

public class Excel {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Map<String, Double> cities = new TreeMap<String, Double>();
		try {
			Workbook workbook = Workbook.getWorkbook(new File("src/Incomes-Report.xls"));
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			int i = 1;
			while(i < rows) {
				if(!cities.containsKey(sheet.getCell(0,i).getContents())) {
					cities.put(sheet.getCell(0,i).getContents(), Double.parseDouble(sheet.getCell(5,i).getContents()));
				} else {
					cities.put(sheet.getCell(0,i).getContents(), cities.get(sheet.getCell(0,i).getContents()).doubleValue() + Double.parseDouble(sheet.getCell(5,i).getContents()));
				}
				i++;
			}
			double total = 0;
			for (String str : cities.keySet()) {
			    System.out.println(str + " Total -> " + String.format("%.2f", cities.get(str).doubleValue()));
			    total += cities.get(str).doubleValue();
			}
			System.out.println("Grand total -> " + String.format("%.2f", total));
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
