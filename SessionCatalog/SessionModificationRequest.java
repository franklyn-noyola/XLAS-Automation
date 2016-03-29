package AIRBUBS_XLAS_JENKINS.SessionCatalog;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.*;


public class SessionModificationRequest extends SessionCatalogTemplate{
		public static String StatR;

@Test		
public void SessionModificationRequestCreation() throws Exception{
		Thread.sleep(500);
		MainTask = "Course Catalog";
		SessionChoice = "SMR";
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
    	Thread.sleep(1500);
    	AIRBUBS_XLAS_JENKINS.CourseCatalog.CourseCatalogTemplate.CourseExecution();
    	Thread.sleep(3000);		    	
    	SessionCatalogExecution();	
    	Thread.sleep(1000);
    	SessionModificationRequestExecution();
    	Thread.sleep(2000);
    	RequesTask = driver.findElement(By.id("key-val")).getText();
    	Thread.sleep(1500);
    	System.out.println(RequesTask + " Session Modification Request has been created and sent to Completed, Pending for Synchronization");
    	driver.quit();
	}   
	
	public static void SessionModificationRequestExecution() throws Exception{	
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("span.icon.drop-menu")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("clone-issue-custom2-plus")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("issue-create-submit")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("summary")).sendKeys("SMR created via Automation Script");
				Thread.sleep(1000);
				driver.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				StatR = driver.findElement(By.id("status-val")).getText();
				switch(StatR){											
				case "DATA ENTRY":										Thread.sleep(2000);
																		driver.findElement(By.id("action_id_11")).click();
																		Thread.sleep(3000);
				case "PENDING QUALITY CHECK":							Thread.sleep(3000);
																			Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
																			if (!Assignee.equals("TEST USER: XLAS Full Access")){
																				driver.findElement(By.id("assign-to-me")).click();
																				Thread.sleep(4000);
																			}						
																	Thread.sleep(2000);
																	driver.findElement(By.id("action_id_21")).click();
				case "QUALITY CHECK IN PROGRESS":					Thread.sleep(4000);
																	driver.findElement(By.id("action_id_101")).click();
				case "WAITING FOR LMS UPDATE":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_81")).click();												
				case "LMS UPDATE IN PROGRESS":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_91")).click();
																	Thread.sleep(1000);	
																	break;
				}
	}		
				
		}

