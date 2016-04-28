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


public class ValidationCourseCatalog extends CourseCatalogTemplate{

@Test
public void ValidationCourse() throws Exception  {
			MainTask = "Course Catalog";
			CourseType = "Validation";
			StandardCourseCatalogCreation.CourseStandard();		
			System.out.println(RequesTask + " Validation Course Catalog has been created and sent to Active");
			driver.quit();
			    			  					  		
		  }
	
			
		
}


