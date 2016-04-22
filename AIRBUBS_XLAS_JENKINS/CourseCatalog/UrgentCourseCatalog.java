package CourseCatalog;

import org.junit.Test;



public class UrgentCourseCatalog extends CourseCatalogTemplate{
	

@Test
public void UrgentCourse() throws Exception  {
			MainTask = "Course Catalog";
			CourseType = "UrgentOnly";
			StandardCourseCatalogCreation.CourseStandard();
		    Thread.sleep(2000);
			System.out.println(RequesTask + " Urgent Course Catalog has been created and sent to Active");
			driver.quit();
			    			  					  		
		  }
	
			
		
}


