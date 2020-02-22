package Demo;

import java.io.File;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


//ghghdff
public class Methods extends DriverClass {
ObjectRepository or;
public void TripType() throws InterruptedException
{
	WebElement trip=driver.findElement(By.xpath(or.TripXpath1));
	trip.click();
	Thread.sleep(3000);
}
public void From() throws InterruptedException
{
//	Excel.ExcelRead(0, 0, 1);
	WebElement From=driver.findElement(By.xpath(or.From));
	Thread.sleep(3000);
	
	From.sendKeys(Excel.ExcelRead(0, 0,0));
	WebElement from1=driver.findElement(By.xpath(or.DropDownXpathFrom));
	from1.click();
	//From.sendKeys(Keys.ARROW_DOWN);
	/*Select s=new Select(driver.findElement(By.xpath(or.DropDownXpathFrom)));
	
	
	Thread.sleep(3000);
}*/
}
public void Calendar()
{
	WebElement date=driver.findElement(By.xpath(or.Calendarpickerxpath));
	date.click();
	
}
public void DatePicker() throws InterruptedException
{
	/*String Date="5-12-2019";
	String[] Sdate=Date.split("-");
	/*SDate[0]=13
			SDate[1]=December
			SDate[2]=2019;*/
	/*while(true)
	{
		if(driver.findElement(By.className(or.DatePickerMonthClass)).getText().equals(Sdate[0]))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath(or.DateChooseNext)).click();
			Thread.sleep(3000);
		}
	}*/
	WebElement date=driver.findElement(By.linkText(or.Datechooselinktext));
	date.click();
}
public void picktime()
{
	WebElement time=driver.findElement(By.xpath(or.pickuptimeselectxpath));
	time.click();
}
public void SelCar()
{
	WebElement car=driver.findElement(By.xpath(or.SelectCarxpathbutton));
	car.click();
	System.out.println("CarName: "+driver.findElement(By.xpath(or.PrintFirstName)).getText());
	//Excel.ExcelWrite(2, 0, 1,driver.findElement(By.xpath(or.PrintFirstName)).getText() );
	
}
public void To() throws InterruptedException 
{
	//Excel.ExcelRead(0,0,2);
	WebElement To=driver.findElement(By.xpath(or.To));
	To.sendKeys("Pune");
	Thread.sleep(3000);
}

public void screenshot(int i) throws Exception
{
	TakesScreenshot SS=((TakesScreenshot)driver);
	File srcfile=SS.getScreenshotAs(OutputType.FILE);
	File destfile=new File("G:\\Selenium_Project\\TestNG1\\Screenshot\\test"+i+ ".png");
	FileUtils.copyFile(srcfile,destfile);
}
}
