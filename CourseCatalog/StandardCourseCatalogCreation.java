package CourseCatalog;



import org.junit.Test;

import static org.junit.Assert.fail;

import org.openqa.selenium.*;


public class StandardCourseCatalogCreation extends CourseCatalogTemplate{

@Test
 public void CourseStandard() throws Exception  {
					MainTask = "Course Catalog";
					Login();
					Thread.sleep(2000);				  					  		
			  		GeneralTab();
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
			    
			    	driver.findElement(By.cssSelector("#action_id_181 > span.trigger-label")).click();
			    	PricesInternationalTab();
			    	PricesUKTab();
			    	PricesFRTab();
			    	PricesGETab();
			    	PricesSPTab();
			    	driver.findElement(By.id(CancelBoxButton)).click();
			    	Thread.sleep(5000);			    	
			    	RequesTask = driver.findElement(By.id("key-val")).getText();
			    	Thread.sleep(1500);
			    	CourseExecution();
			    	Thread.sleep(1500);
			    	System.out.println(RequesTask + " Course Catalog has been created and sent to Active");
			    	driver.quit();			  					  		
		  }
	
		
}


