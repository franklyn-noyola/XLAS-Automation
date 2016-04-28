/*******************************************************************************
 * Copyright (c) 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package CourseCatalog;



import org.junit.Test;

import static org.junit.Assert.fail;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class StandardCourseCatalogCreation extends CourseCatalogTemplate{

@Test
public void CourseStandardExecution () throws Exception  {
		MainTask = "Course Catalog";
		TaskRequest = "Course";
		CourseStandard();
}
 public static void CourseStandard() throws Exception  {
	 				Thread.sleep(2000);
					Login();
			try{		
					Thread.sleep(2000);				  					  		
			  		GeneralTab();
			  		if (CourseType.equals("DeliveryDataOnly")){
			  				Thread.sleep(1000);
			  				new Select (driver.findElement(By.id("customfield_10832"))).selectByVisibleText("Classroom training");
			  				new Select(driver.findElement(By.id("customfield_11400"))).selectByVisibleText("Yes");
			  		}
			  		if (CourseType.equals("UrgentOnly")){
			  			Thread.sleep(1000);
			  			new Select(driver.findElement(By.id("customfield_11500"))).selectByVisibleText("Yes");
			  		}
			  		if (CourseType.equals("UrgentAndDelivery")){
		  				Thread.sleep(1000);
		  				new Select (driver.findElement(By.id("customfield_10832"))).selectByVisibleText("Classroom training");
		  				new Select(driver.findElement(By.id("customfield_11400"))).selectByVisibleText("Yes");
		  				new Select(driver.findElement(By.id("customfield_11500"))).selectByVisibleText("Yes");
			  		}
			  		if (CourseType.equals("Validation")){
			  			Thread.sleep(1000);
			  			driver.findElement(By.id("customfield_10004")).clear();
			  			driver.findElement(By.id("customfield_10004")).sendKeys("31/Dec/2017");//Validity End Date
			  			new Select (driver.findElement(By.id("customfield_10832"))).selectByVisibleText("Classroom training");
			  		}	
			  		UKTab();
			  		SPTab();
			  		FRTab();
			  		GETab();
			  		ScheduleTab();
			  		AccessibilityTab();
			  		ResourcesTab();
			  		if (CourseType.equals("DeliveryDataOnly") || CourseType.equals("UrgentAndDelivery")){
			  			NonDeliveryDataTab();
			  		}else{
			  			DeliveryDataTab();
			  		}	
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
			    		if (TaskRequest.equals("Session") || CRM.equals("Course Modification Request") || !CourseType.equals("StandardCourse")) {
			    				return;
		    		}
		    				Thread.sleep(1500);
		    				System.out.println(RequesTask + " Course Catalog has been created and sent to Active");
		    				driver.quit();
			} catch (NoSuchElementException e){
				e.printStackTrace();
			}
	
	    				
		    		  }
	
		
}


