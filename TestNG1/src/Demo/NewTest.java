package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest extends DriverClass {
	ObjectRepository or;
	Methods M=new Methods();
  @Test
  public void f() throws Exception {
	  
	 M.TripType();
	 M.screenshot(1);
	 M.From();
	/*M.Calendar();
	 M.DatePicker();
	  M.picktime();
	  M.SelCar();
	 M.screenshot(2);*/
	 //M.To();
  }
  @BeforeMethod
  public void beforeMethod() {
  driver=Chrome();
  }

  @AfterMethod
  public void afterMethod() {
 driver.close();
  }

}
