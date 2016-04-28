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



public class DeliveryDataCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void DeliveryDataInit() throws Exception  {
		CourseType = "DeliveryDataOnly";
		MainTask = "Course Catalog";
		DeliveryData();
}
public static void DeliveryData() throws Exception  {
				StandardCourseCatalogCreation.CourseStandard();
		    	Thread.sleep(2000);		    	
		    	if (CRM.equals("Course Modification Request")){
		    			return;
		    	}else{
		    		System.out.println(RequesTask + " Delivery Data Course Catalog has been created and sent to Pending Delivery Data");
		    		driver.quit();
		    	}			  					  		
		  }
	
			
		
}


