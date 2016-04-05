package AIRBUBS_XLAS_JENKINS.SubTasks;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SubTasksCreation extends AIRBUBS_XLAS_JENKINS.SessionCatalog.SessionCatalogTemplate{
	public static String TimeHappening = "customfield_10118";
	public static String Comments = "customfield_10113";
	public static String Subpath = "issuetype-field";
	public static String TimeDays = "customfield_10117";
	public static String CreateSub = "create-issue-submit";		

@Test
public void SubtasksCreationExecution() throws Exception{
			SessionChoice = "SubTaskCreation";
			AIRBUBS_XLAS_JENKINS.SessionCatalog.SessionCatalogCompleted.SessionCatalogCompletedExecution();
			Thread.sleep(1000);
			SubtasksCreation();
}

public static void SubtasksCreation() throws Exception{
		Thread.sleep(1000);
		CateringOrder();
		Thread.sleep(1000);
		Communication();
		Thread.sleep(1000);
		Registration();
		Thread.sleep(1000);
		CustomSubTask();
		Thread.sleep(1000);
		CourseMaterial();
		Thread.sleep(1000);
		InstructorBooking();
		Thread.sleep(1000);
		JoiningInstructions();
		Thread.sleep(1000);
		SignIn();
		Thread.sleep(1000);
		VendorManagement();
		Thread.sleep(1000);
		VenueBooking();
		Thread.sleep(1000);
		AGSessionOverview();
		Thread.sleep(1000);
		XeroxSessionOverview();
		Thread.sleep(1000);	
		if (SessionChoice.equals("SubtaskWorkflow")){
    		return;
    	}
		System.out.println(SessionId +" with all SubTasks has been created correctly");
		driver.quit();
		return;				
}
	public static void CateringOrder() throws Exception{
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Catering Order");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		driver.findElement(By.id(TimeDays)).sendKeys("20");
	  new Select (driver.findElement(By.id(TimeHappening))).selectByIndex(2);
	  new Select (driver.findElement(By.id("customfield_10847"))).selectByVisibleText("Yes");
	  driver.findElement(By.id("customfield_10849")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
	  driver.findElement(By.id("customfield_11102")).clear();
	  driver.findElement(By.id("customfield_11102")).sendKeys("10");
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[@href='#tab-1']")).click();
	  Thread.sleep(1000);
	  new Select (driver.findElement(By.id("customfield_10169"))).selectByVisibleText("Internal");
	  driver.findElement(By.id("customfield_10170")).sendKeys("10");
	  driver.findElement(By.id("customfield_10168")).sendKeys("Franklyn Noyola");
	  driver.findElement(By.id("customfield_10120")).sendKeys("654211");
	  driver.findElement(By.id("customfield_10173")).sendKeys("1023");
	  new Select (driver.findElement(By.id("customfield_10172"))).selectByVisibleText("EURO"); 
	  driver.findElement(By.id(CreateSub)).click();
	  Thread.sleep(3000);
	}

	public static void Communication() throws Exception{	
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Communication");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
	    driver.findElement(By.id(TimeDays)).sendKeys("16");
	    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);    
	    new Select(driver.findElement(By.id("customfield_10122"))).selectByIndex(5);;
	    new Select(driver.findElement(By.id("customfield_10123"))).selectByVisibleText("Individual");
	    driver.findElement(By.id(CreateSub)).click();
	    Thread.sleep(3000);
	
	}

	public static void Registration() throws Exception{
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Registration Monitoring");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
	    driver.findElement(By.id(TimeDays)).sendKeys("16");
	    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);        
	    driver.findElement(By.id(CreateSub)).click();
	    Thread.sleep(3000);		
	}


	//Custom Task Subtask
	public static void CustomSubTask() throws Exception{	
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Custom Subtask");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("16");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(2);
		    driver.findElement(By.id("customfield_11102")).clear();
		    driver.findElement(By.id("customfield_11102")).sendKeys("10");
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(3000);		
	}

	//Course Material
	public static void CourseMaterial() throws Exception{
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Course Material");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("18");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);
		    driver.findElement(By.id("customfield_10960")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Who is responsible for content and storage of the course material?
		    new Select(driver.findElement(By.id("customfield_10958"))).selectByVisibleText("Yes"); //Any Training Course material delivered?
		    new Select(driver.findElement(By.id("customfield_10959"))).selectByVisibleText("Trainer brings material"); //Any Training Course material delivered?
		    driver.findElement(By.id("customfield_10835")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Listing of training material & Printing specification (if any)
		    driver.findElement(By.id("customfield_10158")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Comments: Course Material
		    driver.findElement(By.id("customfield_11102")).clear();
		    driver.findElement(By.id("customfield_11102")).sendKeys("10");
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(5000);
		 
	}  

	//Instructor Booking
		public static void InstructorBooking() throws Exception{
			Thread.sleep(3000);			
	  		driver.findElement(By.id("opsbar-operations_more")).click();
	  		driver.findElement(By.id("create-subtask")).click();
	  		Thread.sleep(2000);
			driver.findElement(By.id(Subpath)).click();	
			Thread.sleep(1000);
			driver.findElement(By.id(Subpath)).clear();			
		    driver.findElement(By.id(Subpath)).sendKeys("Instructor Booking");
		    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("16");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);
		    driver.findElement(By.id("customfield_10115")).sendKeys("Franklyn Noyola");
		    new Select(driver.findElement(By.id("customfield_10116"))).selectByVisibleText("Yes");
		    driver.findElement(By.id("customfield_11102")).clear();
		    driver.findElement(By.id("customfield_11102")).sendKeys("10");
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(3000);		    
	}

	//Joining Instructions
		public static void JoiningInstructions() throws Exception{
			Thread.sleep(3000);			
	  		driver.findElement(By.id("opsbar-operations_more")).click();
	  		driver.findElement(By.id("create-subtask")).click();
	  		Thread.sleep(3000);
			driver.findElement(By.id(Subpath)).click();	
			Thread.sleep(1000);
			driver.findElement(By.id(Subpath)).clear();			
		    driver.findElement(By.id(Subpath)).sendKeys("Joining Instructions");
		    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("16");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);
		    new Select(driver.findElement(By.id("customfield_10837"))).selectByVisibleText("No");
		    driver.findElement(By.id("customfield_10141")).sendKeys("This has been selected by Joining Instructions");
		    driver.findElement(By.id("customfield_10836")).sendKeys("This has been selected by Joining Instructions");
		    driver.findElement(By.id("customfield_10967")).sendKeys("This has been selected by Joining Instructions");
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(3000);
		    
	}

	//Attendance Sheet Delivery
	public static void SignIn() throws Exception{
		Thread.sleep(3000);		
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Attendance Sheet and Evaluation Forms Delivery");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("18");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(2); 
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(3000);		    
	}

	//Vendor Management
	public static void VendorManagement() throws Exception{
		Thread.sleep(3000);
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Vendor Management");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(2000); 
	    	new Select(driver.findElement(By.id("customfield_12545"))).selectByIndex(2); 
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");	   
		    driver.findElement(By.id(TimeDays)).sendKeys("18");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(2); 
		    driver.findElement(By.id(CreateSub)).click(); 
		    Thread.sleep(3000);
		   
	}

	//Session Overview Form
			public static void AGSessionOverview() throws Exception{								
				Thread.sleep(3000);				
		  		driver.findElement(By.id("opsbar-operations_more")).click();
		  		driver.findElement(By.id("create-subtask")).click();
		  		Thread.sleep(2000);
				driver.findElement(By.id(Subpath)).click();	
				Thread.sleep(1000);
				driver.findElement(By.id(Subpath)).clear();			
			    driver.findElement(By.id(Subpath)).sendKeys("AG Session Overview Form");
			    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
			    Thread.sleep(1000);
				driver.findElement(By.id("customfield_12371")).sendKeys("No. 150");
				driver.findElement(By.id("customfield_12372")).sendKeys("Franklyn Noyola and Fernando Taribo");
				driver.findElement(By.id("customfield_12373")).sendKeys("Franklyn Noyola and Fernando Taribo");
				new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(4);
				driver.findElement(By.id(TimeDays)).sendKeys("21");
				Thread.sleep(500);
				driver.findElement(By.xpath("//a[@href='#tab-1']")).click();
				Thread.sleep(200);
				driver.findElement(By.id("customfield_12381")).sendKeys("Main Room Layout special requirements");
				new Select(driver.findElement(By.id("customfield_12382"))).selectByIndex(1);
						driver.findElement(By.id("customfield_12383")).sendKeys("150");
						driver.findElement(By.id("customfield_12386")).sendKeys("Break-out Room Layout special requirements");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-2']")).click();
						Thread.sleep(200);
						driver.findElement(By.id("customfield_12387")).sendKeys("Equipment and ConsumablesRequired");
						new Select(driver.findElement(By.id("customfield_12388"))).selectByIndex(2);
						driver.findElement(By.id("customfield_12389")).sendKeys("Session materials: Special Requirements");
						driver.findElement(By.id("customfield_12392")).sendKeys("IT: Special Requirements");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-3']")).click();
						Thread.sleep(200);
						new Select(driver.findElement(By.id("customfield_12393"))).selectByIndex(1);
						driver.findElement(By.id("customfield_12394")).sendKeys("Catering details");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-4']")).click();
						Thread.sleep(200);
						new Select(driver.findElement(By.id("customfield_12395"))).selectByIndex(2);
						driver.findElement(By.id("customfield_12396")).sendKeys("Site access details");
						driver.findElement(By.id("customfield_11036")).sendKeys("Other requirements");
						driver.findElement(By.id(CreateSub)).click();
						Thread.sleep(3500);
						
			}

			public static void XeroxSessionOverview() throws Exception{								
				Thread.sleep(3000);				
		  		driver.findElement(By.id("opsbar-operations_more")).click();
		  		driver.findElement(By.id("create-subtask")).click();
		  		Thread.sleep(2000);
				driver.findElement(By.id(Subpath)).click();	
				Thread.sleep(1000);
				driver.findElement(By.id(Subpath)).clear();			
			    driver.findElement(By.id(Subpath)).sendKeys("Xerox Session Overview Form");
			    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
			    Thread.sleep(1000);
				driver.findElement(By.id("customfield_12371")).sendKeys("No. 150");
				driver.findElement(By.id("customfield_12372")).sendKeys("Franklyn Noyola and Fernando Taribo");
				driver.findElement(By.id("customfield_12373")).sendKeys("Franklyn Noyola and Fernando Taribo");
				new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(4);
				driver.findElement(By.id(TimeDays)).sendKeys("21");
				Thread.sleep(500);
				driver.findElement(By.xpath("//a[@href='#tab-1']")).click();
				Thread.sleep(200);
				driver.findElement(By.id("customfield_12381")).sendKeys("Main Room Layout special requirements");
				new Select(driver.findElement(By.id("customfield_12382"))).selectByIndex(1);
						driver.findElement(By.id("customfield_12383")).sendKeys("150");
						driver.findElement(By.id("customfield_12386")).sendKeys("Break-out Room Layout special requirements");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-2']")).click();
						Thread.sleep(200);
						driver.findElement(By.id("customfield_12387")).sendKeys("Equipment and ConsumablesRequired");
						new Select(driver.findElement(By.id("customfield_12388"))).selectByIndex(2);
						driver.findElement(By.id("customfield_12389")).sendKeys("Session materials: Special Requirements");
						driver.findElement(By.id("customfield_12392")).sendKeys("IT: Special Requirements");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-3']")).click();
						Thread.sleep(200);
						new Select(driver.findElement(By.id("customfield_12393"))).selectByIndex(1);
						driver.findElement(By.id("customfield_12394")).sendKeys("Catering details");
						Thread.sleep(500);
						driver.findElement(By.xpath("//a[@href='#tab-4']")).click();
						Thread.sleep(200);
						new Select(driver.findElement(By.id("customfield_12395"))).selectByIndex(2);
						driver.findElement(By.id("customfield_12396")).sendKeys("Site access details");
						driver.findElement(By.id("customfield_11036")).sendKeys("Other requirements");
						driver.findElement(By.id(CreateSub)).click();
						Thread.sleep(3500);
						
			}			
			
	//VenueBooking
	public static void VenueBooking() throws Exception{
		Thread.sleep(3000);
  		driver.findElement(By.id("opsbar-operations_more")).click();
  		driver.findElement(By.id("create-subtask")).click();
  		Thread.sleep(2000);
		driver.findElement(By.id(Subpath)).click();	
		Thread.sleep(1000);
		driver.findElement(By.id(Subpath)).clear();			
	    driver.findElement(By.id(Subpath)).sendKeys("Venue Booking");
	    driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
	    Thread.sleep(1000);
		    driver.findElement(By.id(Comments)).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ...");
		    driver.findElement(By.id(TimeDays)).sendKeys("15");
		    new Select(driver.findElement(By.id(TimeHappening))).selectByIndex(1);
		    driver.findElement(By.id("customfield_10964")).sendKeys("12"); //Room Settings for the Main Room (Capacity)
		    new Select(driver.findElement(By.id("customfield_10961"))).selectByVisibleText("Empty"); //Room Settings for the Main Room (Configuration)
		    driver.findElement(By.id("customfield_10962")).sendKeys("10"); //Room Settings for the Main Room 1 (Capacity)
		    new Select(driver.findElement(By.id("customfield_10963"))).selectByVisibleText("Theater"); //Room Settings for the Main Room 1 (Configuration)
		    new Select(driver.findElement(By.id("customfield_10965"))).selectByVisibleText("Yes"); //Are there needed equipment(s) for the main room?
		    driver.findElement(By.id("customfield_10966")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //If yes, then what are these needed equipments
		    driver.findElement(By.id("customfield_10150")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Comments: Room
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#tab-1']")).click();
		    Thread.sleep(1000);
		    new Select(driver.findElement(By.id("customfield_10850"))).selectByVisibleText("Yes"); //Hardware - IT equipped room needed?
		    new Select(driver.findElement(By.id("customfield_10851"))).selectByVisibleText("Yes"); //Hardware - Trainer brings his own PC?
		    driver.findElement(By.id("customfield_10152")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Comments: Hardware
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#tab-2']")).click();
		    Thread.sleep(1000);
		    new Select(driver.findElement(By.id("customfield_10853"))).selectByVisibleText("Yes"); //Software - If PC are provided, adhere to Airbus Group master?
		    new Select(driver.findElement(By.id("customfield_10854"))).selectByVisibleText("Yes"); //Software - Is there any specific software needed?
		    driver.findElement(By.id("customfield_10855")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Software - IT Contacts
		    driver.findElement(By.id("customfield_10154")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Coments:Software.
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#tab-3']")).click();
		    Thread.sleep(1000);
		    new Select(driver.findElement(By.id("customfield_10857"))).selectByVisibleText("Yes"); //Network needed?
		    Thread.sleep(200);
		    driver.findElement(By.id("customfield_10155")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Comments: Network
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='#tab-4']")).click();
		    Thread.sleep(1000);
		    new Select(driver.findElement(By.id("customfield_10802"))).selectByVisibleText("Yes"); //Booked Room/s
		    new Select(driver.findElement(By.id("customfield_10803"))).selectByVisibleText("10"); //Number of Rooms Required
		    driver.findElement(By.id("customfield_11002")).sendKeys("With Blank Details"); //Additional rooms details
		    driver.findElement(By.id("customfield_11003")).sendKeys("Official site provides the SDK, Developer's Guide, Reference, and Android Market for the open source project. Includes announcements, videos, blog and ..."); //Alternate Location
		    new Select(driver.findElement(By.id("customfield_11004"))).selectByVisibleText("Classroom"); //Room Type
		    new Select(driver.findElement(By.id("customfield_11005"))).selectByVisibleText("Main"); //Purpose
		    driver.findElement(By.id("customfield_11006")).sendKeys("Franklyn Noyola"); //Host Name
		    driver.findElement(By.id("customfield_11007")).sendKeys("15"); //Seating Capacity
		    new Select(driver.findElement(By.id("customfield_11008"))).selectByVisibleText("U-Shaped"); //Desired Room Layout
		    driver.findElement(By.id("customfield_11009")).sendKeys("17"); //Room Required Before Start Time
		    driver.findElement(By.id("customfield_11010")).sendKeys("18"); //Room Required After End Time
		    driver.findElement(By.id("customfield_11011")).sendKeys("LG"); //Flip Chart
		    driver.findElement(By.id("customfield_11012")).sendKeys("Panasonic"); //Pin Boards (All Colors)
		    new Select(driver.findElement(By.id("customfield_11013"))).selectByVisibleText("Yes"); //Markers
		    new Select(driver.findElement(By.id("customfield_11014"))).selectByVisibleText("Name badges for instructor(s) and participants"); //Name Badges
		    driver.findElement(By.id("customfield_11015")).sendKeys("Franklyn Noyola"); //Instructor Cases
		    driver.findElement(By.id("customfield_11016")).sendKeys("Samsung"); //Instructor Cases
		    driver.findElement(By.id("customfield_11017-2")).click();
		    driver.findElement(By.id("customfield_11017-4")).click();
		    driver.findElement(By.id("customfield_11017-6")).click();
		    driver.findElement(By.id("customfield_11018")).sendKeys("Samsung"); //Other Learner Items
		    driver.findElement(By.id("customfield_11019")).sendKeys("Sony"); //Other Learner Items
		    driver.findElement(By.id("customfield_11020")).sendKeys("Phillips"); //TV
		    driver.findElement(By.id("customfield_11021")).sendKeys("HP"); //CD Player
		    driver.findElement(By.id("customfield_11022")).sendKeys("LG"); //DVD Player
		    driver.findElement(By.id("customfield_11023")).sendKeys("Kodak"); //Video Camera
		    driver.findElement(By.id("customfield_11024")).sendKeys("Kodak"); //Video Tapes for Camera
		    driver.findElement(By.id("customfield_11025")).sendKeys("Kodak"); //Tripod for Camera
		    driver.findElement(By.id("customfield_11026")).sendKeys("Novell and Windows 2013"); //LAN Connctions and Cables	    
		    driver.findElement(By.id("customfield_11027")).sendKeys("Lenovo"); //Laptop Computer
		    driver.findElement(By.id("customfield_11028")).sendKeys("Novell and Windows 2013"); //LAN Connctions and Cables
		    driver.findElement(By.id("customfield_11029")).sendKeys("Ruby on Rails"); //Special Software
		    new Select(driver.findElement(By.id("customfield_11030"))).selectByVisibleText("Yes"); //Conference Call Phone
		    new Select(driver.findElement(By.id("customfield_11031"))).selectByVisibleText("No"); //Video Audio Conference
		    new Select(driver.findElement(By.id("customfield_11032"))).selectByVisibleText("Yes"); //Webex Viewer
		    new Select(driver.findElement(By.id("customfield_11033"))).selectByVisibleText("No"); //Webex Presenter Package
		    new Select(driver.findElement(By.id("customfield_11034"))).selectByVisibleText("Yes"); //Webex Session Setup
		    new Select(driver.findElement(By.id("customfield_11035"))).selectByVisibleText("No"); //Record Session
		    driver.findElement(By.id("customfield_11036")).sendKeys("To be all the requierements done"); //Other Requirements
		    driver.findElement(By.id("customfield_11037")).sendKeys("No Details"); //Final Details
		    driver.findElement(By.id("customfield_11038")).sendKeys("Franklyn Noyola"); //Venue Contact Person
		    driver.findElement(By.id("customfield_11040")).sendKeys("1500"); //Prince
		    new Select(driver.findElement(By.id("customfield_11039"))).selectByVisibleText("EURO"); //Price Currency
		    driver.findElement(By.id("customfield_10120")).sendKeys("6521142"); //PO/Invoice Number
		    driver.findElement(By.id(CreateSub)).click();
		    Thread.sleep(3000);		
		  	} 
		    
		    
	}
	

