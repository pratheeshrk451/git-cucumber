package org.normalRun;

import java.io.IOException;

import org.openqa.selenium.By;
import org.pojo.NewAccountPojo;

import com.baseClass.BaseClass;

public class NormalJavaRunner extends BaseClass{
public static void main(String[] args) throws IOException, InterruptedException {
	getDreiver();
	getMaximize();
	getUrl("https://www.facebook.com/");
	NewAccountPojo na =new NewAccountPojo();
	click(na.getNewAccount());
	wait(3000);
	driver.findElement(By.xpath("//*[@id=\'u_2_b_lD\']")).sendKeys("india");
	/*inserValue(na.getFirstName(), getData(0, 0));
*/	
	
}
	
	
	
	
}
