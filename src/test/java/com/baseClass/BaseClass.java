package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static String value;
	public static WebDriver driver;
	public static void getDreiver() {
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
}
	public static void getMaximize() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void inserValue(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void dropDownByValue(WebElement ele,String selectValue) {
		Select s=new Select(ele);	
		s.selectByValue(selectValue);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static String getData(int row,int cell) throws IOException {
		File f=new File("src\\test\\resources\\datas\\data.xls.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.err.println(physicalNumberOfCells);
		Cell c = r.getCell(cell);
		int ct = c.getCellType();
		if(ct==1) {
			value = c.getStringCellValue();
		}
		else if(ct==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dt = c.getDateCellValue();
				SimpleDateFormat sm =new SimpleDateFormat("dd-MM-YYYY");
				value = sm.format(dt);
			}else {
				double nc = c.getNumericCellValue();
		Long l=(long) nc;
		value = String.valueOf(l);
			}
		}
		return value;
	}
public static void wait(int time) throws InterruptedException {
	Thread.sleep(time);
}
	
}




