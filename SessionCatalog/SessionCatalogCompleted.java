package AIRBUBS_XLAS_JENKINS.SessionCatalog;



import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.*;



public class SessionCatalogCompleted extends SessionCatalogTemplate {
	
@Test		
	public  void SessionCatalog() throws Exception{	
				Thread.sleep(500);
				MainTask = "Course Catalog";
				SessionChoice = "Completed";
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.Login();				
				Thread.sleep(1000);		  						  					  		
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.GeneralTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.UKTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.SPTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.FRTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.GETab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.ScheduleTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.AccessibilityTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.ResourcesTab();
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.DeliveryDataTab();
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
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.PricesInternationalTab();
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.PricesUKTab();
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.PricesFRTab();
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.PricesGETab();
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.PricesSPTab();
		    	driver.findElement(By.id(CancelBoxButton)).click();
		    	Thread.sleep(5000);			    	
		    	RequesTask = driver.findElement(By.id("key-val")).getText();
		    	Thread.sleep(1500);
		    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.CourseExecution();
		    	Thread.sleep(3000);		    	
		    	SessionCatalogExecution();		    	
		    	Thread.sleep(400);
		    	System.out.println(RequesSTask + " Session Catalog has been created and sent to Completed");
		    	driver.quit();		
	}	

}