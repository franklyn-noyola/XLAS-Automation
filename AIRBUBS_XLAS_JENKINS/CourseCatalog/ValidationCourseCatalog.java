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


