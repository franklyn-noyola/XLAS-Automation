package AIRBUBS_XLAS_JENKINS.CourseCatalog;

import org.junit.Test;

import static org.junit.Assert.fail;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class UrgentCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void UrgentCourse() throws Exception  {
			MainTask = "Course Catalog";			
			Login();			
			GeneralTab();
			Thread.sleep(1000);
			new Select(driver.findElement(By.id("customfield_11500"))).selectByVisibleText("Yes");
			UKTab();
			SPTab();
			FRTab();
			GETab();
			ScheduleTab();
			AccessibilityTab();
			ResourcesTab();
			DeliveryDataTab();
			Thread.sleep(2000);
			driver.findElement(By.id(CreateButton)).click();
						
			Thread.sleep(5000);
				if (driver.getPageSource().contains("The duplicate key value is")){			  				
					System.out.println("Duplicate Key Has been detecteed. No Course created");
					driver.quit();
					fail("Duplicate Key Has been detecteed. No Course created");
					return;
			}
				Thread.sleep(1000);				
				driver.findElement(By.cssSelector("#action_id_181 > span.trigger-label")).click();
				PricesInternationalTab();
				PricesUKTab();
				PricesFRTab();
				PricesGETab();
				PricesSPTab();
				driver.findElement(By.id(CancelBoxButton)).click();
				Thread.sleep(3000);				
				RequesTask = driver.findElement(By.id("key-val")).getText();
		    	Thread.sleep(1500);
		    	CourseExecution();
				System.out.println(RequesTask + " Course Catalog has been created and sent to Active");
			    driver.quit();
			    			  					  		
		  }
	
			
		
}


