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
package SessionCatalog;

import org.junit.Test;
import org.openqa.selenium.*;


public class SessionModificationRequest extends SessionCatalogTemplate{
		public static String StatR;

@Test		
public void SessionModificationRequestCreation() throws Exception{
	try{
		Thread.sleep(500);
		MainTask = "Course Catalog";
		TaskRequest = "Session";
		SessionChoice = "SMR";
		CourseCatalog.StandardCourseCatalogCreation.CourseStandard();	    	
    	SessionCatalogExecution();	
    	Thread.sleep(1000);
    	SessionModificationRequestExecution();
    	Thread.sleep(2000);
    	RequesTask = driver.findElement(By.id("key-val")).getText();
    	Thread.sleep(1500);
    	System.out.println(RequesTask + " Session Modification Request has been created and sent to Completed, Pending for Synchronization");
    	driver.quit();
	} catch (NoSuchElementException e){
		e.printStackTrace();
	}
}   
	
	public static void SessionModificationRequestExecution() throws Exception{	
		try{
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
		} catch (NoSuchElementException e){
			e.printStackTrace();
		}	
	}		
				
		}

