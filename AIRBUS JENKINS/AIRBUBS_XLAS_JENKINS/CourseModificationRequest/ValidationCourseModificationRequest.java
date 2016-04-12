package AIRBUBS_XLAS_JENKINS.CourseModificationRequest;



import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.*;



public class ValidationCourseModificationRequest extends CourseModificationRequestTemplate {
	
@Test		
	public  void ValidateCourseModificationRequest() throws Exception{
				MainTask = "Course Catalog";
				ValidationData = "ValidationOnly";
				AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.Login();				
				Thread.sleep(1000);		  		
		  		driver.findElement(By.id("create_link")).click();
		  		Thread.sleep(1000);	  			
		  		driver.findElement(By.id(CreateButton)).click();				  					  		
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
		    	CourseModificationRequestExecution();
		    	Thread.sleep(1500);
		    	System.out.println(RequesTask + " Course Modification Request has been created and sent to Completed, Pending for Synchronization");
		    	driver.quit();		
	}	



}