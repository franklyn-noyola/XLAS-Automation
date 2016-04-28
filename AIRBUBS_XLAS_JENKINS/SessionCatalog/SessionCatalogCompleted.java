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



public class SessionCatalogCompleted extends SessionCatalogTemplate {
			
@Test
	public void ExecutionSession() throws Exception{
				SessionChoice = "Completed";
				SessionCatalogCompletedExecution();
}
	public static void SessionCatalogCompletedExecution() throws Exception{
				MainTask = "Course Catalog";
				TaskRequest = "Session";
				Thread.sleep(1000);				
				CourseCatalog.StandardCourseCatalogCreation.CourseStandard();				
				Thread.sleep(2000);		  						  					  		
		    	SessionCatalogExecution();
		    	if (SessionChoice.equals("SubTaskCreation") || SessionChoice.equals("SubtaskWorkflow") || SessionChoice.equals("SMR")){
		    		return;
		    	}
		    	Thread.sleep(400);
		    	System.out.println(SessionId + " Session Catalog has been created and sent to Completed");
		    	driver.quit();		
	}	

}