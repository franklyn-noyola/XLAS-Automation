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


public class SessionCatalogCancellation extends SessionCatalogTemplate {
	
@Test		
	public  void SessionCatalogCancellationExecution() throws Exception{	
				Thread.sleep(500);
				MainTask = "Course Catalog";
				SessionChoice = "Cancellation";
				TaskRequest = "Session";
				Thread.sleep(1000);								
				CourseCatalog.StandardCourseCatalogCreation.CourseStandard();				
				Thread.sleep(3000);		  						  					  		
		    	SessionCatalogExecution();	    	
		    	Thread.sleep(4000);
		    	System.out.println(SessionId + " Session Catalog has been created and has been Cancelled");
		    	driver.quit();		
	}	

}