package SubTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SubTasksCreation extends CourseCatalog.CourseCatalogTemplate{
	public static String TimeHappening = "customfield_10118";
	public static String Comments = "customfield_10113";
	public static String Subpath = "issuetype-field";
	public static String TimeDays = "customfield_10117";
	
  public static void SessionClosure() throws Exception{
	  		Thread.sleep(3000);
	  		driver.findElement(By.id("opsbar-operations_more")).click();
	  		driver.findElement(By.id("create-subtask")).click();
	  		Thread.sleep(2000);
			driver.findElement(By.id(Subpath)).click();	
			Thread.sleep(1000);
			driver.findElement(By.id(Subpath)).clear();			
		    driver.findElement(By.id(Subpath)).sendKeys("Session Closure");
		    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
		    Thread.sleep(1000);		    
		    driver.findElement(By.id(Comments)).click();
		    Thread.sleep(500);		    		
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("16");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);
		    new Select(driver.findElement(By.id("customfield_10119"))).selectByVisibleText("Yes");
		    driver.findElement(By.id("customfield_10120")).sendKeys("12501222"); //PO/Invoice Number
		    driver.findElement(By.id("customfield_10121")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Additional References
		    driver.findElement(By.id("create-issue-submit")).click();
		    Thread.sleep(3000);	    

	}
  
}