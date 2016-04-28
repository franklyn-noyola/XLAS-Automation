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
package CustomTask;



import org.junit.Test;



import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class CustomTask extends CourseCatalog.CourseCatalogTemplate{

@Test
 public void CustomTaskCreation() throws Exception  {
					MainTask = "Custom Requests";
					RequestType = "Custom Task";
					Login();
					driver.findElement(By.id("summary")).sendKeys("Custom Task created via Automation Script");
					driver.findElement(By.id("customfield_10113")).sendKeys("In search engine optimization, on-page optimization refers to factors that have an effect on your Web site or Web page listing in natural search results. These factors are controlled by you or by coding on your page. Examples of on-page optimization include actual HTML code, meta tags, keyword placement and keyword density.");
					driver.findElement(By.id("duedate")).sendKeys("1/Jan/2016");
					new Select(driver.findElement(By.id("customfield_12541"))).selectByVisibleText("One-Off");
					driver.findElement(By.id("customfield_12542")).sendKeys("In search engine optimization, on-page optimization refers to factors that have an effect on your Web site or Web page listing in natural search results. These factors are controlled by you or by coding on your page. Examples of on-page optimization include actual HTML code, meta tags, keyword placement and keyword density.");
					driver.findElement(By.id("customfield_12543")).sendKeys("In search engine optimization, on-page optimization refers to factors that have an effect on your Web site or Web page listing in natural search results. These factors are controlled by you or by coding on your page. Examples of on-page optimization include actual HTML code, meta tags, keyword placement and keyword density.");
					driver.findElement(By.id("customfield_12544")).sendKeys("In search engine optimization, on-page optimization refers to factors that have an effect on your Web site or Web page listing in natural search results. These factors are controlled by you or by coding on your page. Examples of on-page optimization include actual HTML code, meta tags, keyword placement and keyword density.");
					driver.findElement(By.id(CreateButton)).click();
					Thread.sleep(2000);
					RequesTask = driver.findElement(By.id("key-val")).getText();
					Thread.sleep(1000);
					CustomTaskWorkflow();
					System.out.println(RequesTask + " Custom Task has been created and sent to Completed");
			    	driver.quit();			  					  		
		  }
	
public static void CustomTaskWorkflow() throws Exception{
					Thread.sleep(1000);
					  Stat = driver.findElement(By.id("status-val")).getText();
					  Assignee = driver.findElement(By.id("assignee-val")).getText();
						if (!Assignee.equals("TEST AUTOMATION USER: XLAS Full Access")){
							driver.findElement(By.id("assign-to-me")).click();
								Thread.sleep(5000);
								}
						
					switch (Stat){
						case "OPEN / UPDATE"			:	driver.findElement(By.id("action_id_11")).click();
															Thread.sleep(3000);
								
						case "PENDING EXECUTION"		:	driver.findElement(By.id("action_id_21")).click();
															Thread.sleep(3000);
															
						case "IN PROGRESS"				:	driver.findElement(By.id("action_id_41")).click();
															Thread.sleep(3000);	
															break;
					
					}
					  
				  }
	
	
}




