package SessionCatalog;



import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.*;



public class SessionCatalogCompleted extends SessionCatalogTemplate {
	
@Test		
	public  void SessionCatalog() throws Exception{	
				Thread.sleep(500);
				MainTask = "Course Catalog";
				SessionChoice = "Completed";
				CourseCatalog.CourseCatalogTemplate.Login();				
				Thread.sleep(1000);		  						  					  		
		  		CourseCatalog.CourseCatalogTemplate.GeneralTab();
		  		CourseCatalog.CourseCatalogTemplate.UKTab();
		  		CourseCatalog.CourseCatalogTemplate.SPTab();
		  		CourseCatalog.CourseCatalogTemplate.FRTab();
		  		CourseCatalog.CourseCatalogTemplate.GETab();
		  		CourseCatalog.CourseCatalogTemplate.ScheduleTab();
		  		CourseCatalog.CourseCatalogTemplate.AccessibilityTab();
		  		CourseCatalog.CourseCatalogTemplate.ResourcesTab();
		  		CourseCatalog.CourseCatalogTemplate.DeliveryDataTab();
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
		    	CourseCatalog.CourseCatalogTemplate.PricesInternationalTab();
		    	CourseCatalog.CourseCatalogTemplate.PricesUKTab();
		    	CourseCatalog.CourseCatalogTemplate.PricesFRTab();
		    	CourseCatalog.CourseCatalogTemplate.PricesGETab();
		    	CourseCatalog.CourseCatalogTemplate.PricesSPTab();
		    	driver.findElement(By.id(CancelBoxButton)).click();
		    	Thread.sleep(5000);			    	
		    	RequesTask = driver.findElement(By.id("key-val")).getText();
		    	Thread.sleep(1500);
		    	CourseCatalog.CourseCatalogTemplate.CourseExecution();
		    	Thread.sleep(3000);		    	
		    	SessionCatalogExecution();		    	
		    	Thread.sleep(400);
		    	System.out.println(RequesSTask + " Session Catalog has been created and sent to Completed");
		    	driver.quit();		
	}	

}