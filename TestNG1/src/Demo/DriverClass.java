package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//dsdgvfgh

public class DriverClass {
//gdhfdgd
	public static WebDriver driver;
	public static String url="https://www.savaari.com";
	public WebDriver Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\JAR\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
