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
package CourseModificationRequest;





import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;




public class CourseModificationRequestDeliveryData extends CourseModificationRequestTemplate {
	
@Test		
	public  void CourseModificationRequest() throws Exception{
				MainTask = "Course Catalog";
				CRM = "Course Modification Request";
				ValidationData = "DeliveryData";
				try{
				CourseCatalog.DeliveryDataCourseCatalog.DeliveryData();									
		    	Thread.sleep(3000);		    			    	
		    	CourseModificationRequestExecution();
		    	Thread.sleep(1500);
		    	System.out.println(RequesTask + " Course Modification Request has been created and sent to Completed, Pending for Synchronization");
		    	driver.quit();	
				} catch (NoSuchElementException e){
					e.printStackTrace();
				}
	}	



}