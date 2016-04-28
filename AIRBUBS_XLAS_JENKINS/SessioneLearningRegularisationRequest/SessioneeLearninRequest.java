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
package SessioneLearningRegularisationRequest;



import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.*;


public class SessioneeLearninRequest extends CourseCatalog.CourseCatalogTemplate{

@Test
 public void SessioneLearningCreation() throws Exception  {
					MainTask = "Session Requests";
					RequestType = "Session E-Learning Request";
					Login();
			try{		
					Thread.sleep(2000);
					driver.findElement(By.id("summary")).sendKeys("Session eLearning creaed via Automation Script");
					driver.findElement(By.id("customfield_12000")).sendKeys("Additional Information");	
					driver.findElement(By.id("attachment_box")).click();
					Thread.sleep(3000);
					Runtime.getRuntime().exec("C:\\Program Files\\Jenkins\\workspace\\eLearningandRegularissation.exe");
					Thread.sleep(2000);
					driver.findElement(By.id("customfield_10086-4")).click();
					driver.findElement(By.id(CreateButton)).click();
					Thread.sleep(4000);
					RequesTask = driver.findElement(By.id("key-val")).getText();
					eLearningWorkflow();
					System.out.println(RequesTask + " Session E-Learning Request has been created and sent to Completed");
			    	driver.quit();
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail ("Test failed due to some elements are not found or Execution Tiemout ");
			}	
		  }
	
public static void eLearningWorkflow() throws Exception{
		try{
					Thread.sleep(1000);
					  Stat = driver.findElement(By.id("status-val")).getText();
					  Assignee = driver.findElement(By.id("assignee-val")).getText();
						if (!Assignee.equals("TEST AUTOMATION USER: XLAS Full Access")){
							driver.findElement(By.id("assign-to-me")).click();
								Thread.sleep(5000);
								}
						
					switch (Stat){
						case "DATA ENTRY"										:	driver.findElement(By.id("action_id_11")).click();
																					Thread.sleep(3000);
								
						case "PENDING QUALITY CHECK"							:	driver.findElement(By.id("action_id_21")).click();
																					Thread.sleep(3000);
															
						case "QUALITY CHECK IN PROGRESS"						:	driver.findElement(By.id("action_id_31")).click();
																					Thread.sleep(3000);
																					
						case "WAITING FOR MULTI-SESSION CREATION IN LMS"		:	driver.findElement(By.id("action_id_41")).click();
																					Thread.sleep(3000);
																					
						case "MULTI-SESSION CREATION IN LMS IN PROGRESS"		:	driver.findElement(By.id("action_id_91")).click();
																					Thread.sleep(3000);
																					break;															
					
					}

		} catch (NoSuchElementException e){
			e.printStackTrace();
		}			
				  }
	
	
}




