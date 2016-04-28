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

import java.util.Random;
import java.util.concurrent.TimeUnit;

import  static org.junit.Assert.fail;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CourseCatalogTemplate {
		
		public static WebDriver driver =  new FirefoxDriver();
		public static String CourseType = "StandardCourse";
		public static String ValidationData = "NoValidation";
		public static String TaskRequest="NoChoice";
		public static String CRM = "NoChoice";
		public static String EndD1 = "31/Dec/2017";
		public static String Project;
		public static String Main_Task = "COURSE CATALOG";
		public static String CreateButton 	= "issue-create-submit";
		public static boolean DupKey = false;
		public static boolean NoAvailable = false;
		public static String CancelBoxButton = "issue-workflow-transition-submit";
		public static String SubmitGrid = "sData";
		public static String CancelGrid = "cData";
		public static String baseUrl = "https://uatagxlas.xeroxlearning.co.uk/secure/Dashboard.jspa";
		public static String Submit = "login-form-submit";
		public static String RequesTask;
		public static String Search;
		public static String SearchLink;
		public static String Assignee;
		public static String Stat;
		public static String SAPID; 
		public static String [] Roles = new String[]{"TEST_AGLC_LEARNING_CATALOG","TEST_AGLC_LEARNING_DEVELOPMENT","TEST_TEAM_LEADER"};
		public static String DeliveryConfirmation;
		public static String UrgentConfirmation;
		public static String DateValidation;
		public static String Classroom;
		public static int DataValidation;
		public static String MainTask;
		public static String RequestType;
		

public static void setUp() throws Exception {		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	
		}


public static void Login() throws Exception{
			Thread.sleep(1000);
			setUp();
	try{
			driver.get(baseUrl);
			if (driver.getPageSource().contains("Service Unavailable") ||driver.getPageSource().contains("JIRA Startup Failed") || driver.getPageSource().contains("JIRA Access Constraints") || driver.getPageSource().contains("El Servidor Proxy")){
				System.out.println("XLAs is not available");
				driver.quit();
				fail("XLAS is not available");
				return;	
			}	
			Thread.sleep(2000);			
			driver.switchTo().frame("gadget-0"); 
			driver.findElement(By.id("login-form-username")).sendKeys("TEST_AUTOMATION");
			driver.findElement(By.id("login-form-password")).sendKeys("TEST_AUTOMATION");
			driver.findElement(By.id("login")).click();
			Thread.sleep(2000);			
	  		driver.findElement(By.id("create_link")).click();
	  		Thread.sleep(2000);	  		
	  		driver.findElement(By.id("project-field")).click();
	  		driver.findElement(By.id("project-field")).clear();
	  		driver.findElement(By.id("project-field")).sendKeys(MainTask);
	  		Thread.sleep(1000);
	  		driver.findElement(By.cssSelector("em")).click();
	  		Thread.sleep(2000);
	  		if (!MainTask.equals("Course Catalog")){
	  			driver.findElement(By.id("issuetype-field")).click();
	  			driver.findElement(By.id("issuetype-field")).clear();
	  			driver.findElement(By.id("issuetype-field")).sendKeys(RequestType);
	  			driver.findElement(By.xpath("//div[@id='issuetype-suggestions']/div/ul/li/a/em")).click();
		  		Thread.sleep(3000);
	  		}
	  		
	  		driver.findElement(By.id(CreateButton)).click();
		} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No found");
			}

}	


	public static void GeneralTab() throws Exception{
		try{
		Thread.sleep(1000);	
		driver.findElement(By.id("summary")).sendKeys("Course created via Automation Script");
		new Select (driver.findElement(By.id("customfield_10164"))).selectByVisibleText("E_ENGINEERING"); //Training Domain
		new Select (driver.findElement(By.id("customfield_10164:1"))).selectByValue("10164");//Training Subdomain
		new Select (driver.findElement(By.id("customfield_10859"))).selectByValue("11501");//ABR
		driver.findElement(By.id("customfield_10003")).clear();
		driver.findElement(By.id("customfield_10003")).sendKeys("1/Jan/2016");//Validity Start Date
		driver.findElement(By.id("customfield_10004")).clear();
		driver.findElement(By.id("customfield_10004")).sendKeys("31/Dec/2016");//Validity End Date
		new Select (driver.findElement(By.id("customfield_10832"))).selectByValue("10761");//Learning Method
		new Select (driver.findElement(By.id("customfield_10882"))).selectByVisibleText("Yes");//COTS
		new Select (driver.findElement(By.id("customfield_10804"))).selectByValue("10734");//Deployment Actor
		new Select (driver.findElement(By.id("customfield_10805"))).selectByVisibleText("CPF");//Training Type
		new Select (driver.findElement(By.id("customfield_10806"))).selectByVisibleText("INTER");//INTER/INTRA
		new Select (driver.findElement(By.id("customfield_10810"))).selectByValue("10751");//Seat Based
		driver.findElement(By.id("customfield_10071")).sendKeys("10"); //Number of Participants Minimum
		driver.findElement(By.id("customfield_10073")).sendKeys("10");//Number of Participants Optimum
		driver.findElement(By.id("customfield_10072")).sendKeys("10");//Number of Participants Maximum
		driver.findElement(By.id("customfield_10869")).sendKeys("Competences linked to this course");//Competences linked to this course
		driver.findElement(By.id("customfield_10870")).sendKeys("Competences priorities linked to this course (strategic axis");//Competences priorities linked to this course (strategic axis
		new Select (driver.findElement(By.id("customfield_10811"))).deselectAll();
		//new Select (driver.findElement(By.id("customfield_10811"))).selectByVisibleText("EN"); //Language
		//new Select (driver.findElement(By.id("customfield_10811"))).selectByVisibleText("FR"); //Language
		//new Select (driver.findElement(By.id("customfield_10811"))).selectByVisibleText("DE"); //Language
		new Select (driver.findElement(By.id("customfield_10811"))).selectByVisibleText("ES"); //Language
		//driver.findElement(By.id("customfield_11111-1")).click(); Selector (WorldWide)
		//driver.findElement(By.id("customfield_11112-1")).click(); //Selector Country-Germany
		driver.findElement(By.id("customfield_11112-2")).click(); //Selector Region-Niedersachen
		//driver.findElement(By.id("customfield_11112-3")).click(); //Selector Region-Wurtte4mberg
		//driver.findElement(By.id("customfield_11112-4")).click(); //Selector Region-Bayern
		//driver.findElement(By.id("customfield_11200-1")).click(); //Selector Country-France
		//driver.findElement(By.id("customfield_11200-2")).click(); //Selector Region-Garonne (Haute)
		//driver.findElement(By.id("customfield_11200-3")).click(); //Selector Region-Loire-Attantique
		//driver.findElement(By.id("customfield_11200-4")).click(); //Selector Region-Yvelines
		//driver.findElement(By.id("customfield_11201-1")).click(); //Selector  Country-Spain
		//driver.findElement(By.id("customfield_11202-1")).click(); //Selector  Country-United Kingdom
		//driver.findElement(By.id("customfield_11202-2")).click(); //Selector  Region - Flintshire
		//driver.findElement(By.id("customfield_11202-3")).click(); //Selector  Region - Gloucestershire
		//driver.findElement(By.id("customfield_11203-1")).click(); //Selector  Country - Finland
		driver.findElement(By.id("customfield_12300")).sendKeys("Dominican Republic");
		driver.findElement(By.id("customfield_11000")).sendKeys("Yes I have Academy"); //Has Academy
		//Start Cost Center Grid.
		driver.findElement(By.cssSelector("span.ui-icon.ui-icon-plus")).click();	
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("Division"))).selectByVisibleText("AI (Airbus)");
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("Country"))).selectByVisibleText("Spain");
		driver.findElement(By.id("CostCenter")).sendKeys("1245788");
		driver.findElement(By.id("ControllingArea")).sendKeys("65874545");
		driver.findElement(By.id(SubmitGrid)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(CancelGrid)).click();		
		//End Cost Center Grid
		Thread.sleep(3000);
		new Select (driver.findElement(By.id("customfield_10131"))).selectByVisibleText("Yes"); //Business Critical
		driver.findElement(By.id("customfield_10877")).sendKeys("Further Comments"); //Further Comments			
		} catch (NoSuchElementException e){
			e.printStackTrace();
			fail("Element No Found");
		}	
	}
	
		public static void ScheduleTab() throws Exception{
		try{	
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab6']")).click();
			driver.findElement(By.id("customfield_10061")).sendKeys("15"); //Duration/Days
			driver.findElement(By.id("customfield_10062")).sendKeys("10"); //Duration/Hours
			driver.findElement(By.id("customfield_10807")).sendKeys("10"); //Duration/Days (year N+1)
			driver.findElement(By.id("customfield_10808")).sendKeys("10"); //Duration/HOurs (year N+1)
			new Select(driver.findElement(By.id("customfield_10879"))).selectByVisibleText("Yes"); //Is schedule defined?
			driver.findElement(By.id("customfield_10880")).sendKeys("If schedule is defined then enter schedule (current year)"); //If schedule is defined then enter schedule (current year)
			driver.findElement(By.id("customfield_10881")).sendKeys("If schedule is defined then enter schedule (year N+1)"); //If schedule is defined then enter schedule (year N+1)
			driver.findElement(By.id("customfield_10864")).sendKeys("Training duration distribution"); //Training duration distribution
		} catch (NoSuchElementException e){
			e.printStackTrace();
			fail("Element No Found");
		}
		}
		
		public static void AccessibilityTab() throws Exception{
			try{
			Thread.sleep(1000);		
			driver.findElement(By.xpath("//a[@href='#tab7']")).click();
			Thread.sleep(2000);
			//Accessibility Grid starts
			driver.findElement(By.cssSelector("#add_customfield_10087_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
			Thread.sleep(2000);
			new Select(driver.findElement(By.id("Division"))).selectByVisibleText("AH (Airbus Helicopters)");	
			Thread.sleep(2000);
			new Select(driver.findElement(By.id("Country"))).selectByVisibleText("Finland");
			Thread.sleep(2000);
			driver.findElement(By.id("OrgUnit")).sendKeys("121212");
			driver.findElement(By.id("PersonalArea")).sendKeys("1212212");
			driver.findElement(By.id("PersonalSubarea")).sendKeys("121212");
			new Select(driver.findElement(By.id("BandLevel"))).selectByVisibleText("Executive");
			new Select(driver.findElement(By.id("WorkingTimeException"))).selectByVisibleText("86 %");
			new Select(driver.findElement(By.id("InternalExternal"))).selectByVisibleText("Internal");
			driver.findElement(By.id(SubmitGrid)).click();
			Thread.sleep(4000);
			driver.findElement(By.id(CancelGrid)).click();
			//Accessibility Grid ends
			Thread.sleep(3000);
			new Select(driver.findElement(By.id("customfield_10883"))).selectByVisibleText("Yes");//Accessiblity Offshore
			new Select(driver.findElement(By.id("customfield_10866"))).selectByVisibleText("No");//Visible in HR
			new Select(driver.findElement(By.id("customfield_10867"))).selectByVisibleText("Yes");//Visible External
			new Select(driver.findElement(By.id("customfield_10868"))).selectByVisibleText("No");//Visible OffShore
			Thread.sleep(2000);
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}

		public static void ResourcesTab() throws Exception{
			try{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='#tab8']")).click();
			driver.findElement(By.id("customfield_10889")).sendKeys("954111"); //Learning Development Specialist / SAP IDRequired
			driver.findElement(By.id("customfield_10890")).sendKeys("Franklyn"); //Learning Development Specialist / First NameRequired
			driver.findElement(By.id("customfield_10891")).sendKeys("Noyola"); //Learning Development Specialist / Last NameRequired
			driver.findElement(By.id("customfield_10892")).sendKeys("franklyn.noyola@gmail.com"); //Learning Development Specialist / E-mailRequired
			driver.findElement(By.id("customfield_10893")).sendKeys("93745854111"); //Learning Development Specialist / Phone
			//Training Provider Grid Starts
			driver.findElement(By.cssSelector("#add_customfield_10984_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(By.id("Division"))).selectByVisibleText("AD&S - (Airbus Defense & Space)");
			Thread.sleep(1000);
			new Select(driver.findElement(By.id("Country"))).selectByVisibleText("France");
			Thread.sleep(1000);
			driver.findElement(By.id("SapId")).sendKeys("6543223");
			driver.findElement(By.id("Name")).sendKeys("Franklyn Noyola");
			driver.findElement(By.id("Email")).sendKeys("franklyn.noyola@gmail.com");
			driver.findElement(By.id("Phone")).sendKeys("98665632332");
			Thread.sleep(3000);
			driver.findElement(By.id(SubmitGrid)).click();
			Thread.sleep(3000);
			driver.findElement(By.id(CancelGrid)).click();
			//Training Provider Grid Ends
			Thread.sleep(2000);
			driver.findElement(By.id("customfield_10873")).sendKeys("Training Provider additional comment"); //Training Provider additional comment
			//Trainer (Internal and External) grid starts
			driver.findElement(By.cssSelector("#add_customfield_10985_grid > div.ui-pg-div > span.ui-icon.ui-icon-plus")).click();
			Thread.sleep(1000);
			new Select(driver.findElement(By.id("InternalExternal"))).selectByVisibleText("Internal");
			Thread.sleep(2000);
			new Select(driver.findElement(By.id("Division"))).selectByVisibleText("HQ (Airbus Group corporate)");
			new Select(driver.findElement(By.id("Country"))).selectByVisibleText("Worldwide");
			driver.findElement(By.id("SapId")).sendKeys("5488787");
			driver.findElement(By.id("Name")).sendKeys("Franklyn Noyola");
			driver.findElement(By.id("Email")).sendKeys("franklyn.noyola@xerox.com");
			driver.findElement(By.id(SubmitGrid)).click();
			Thread.sleep(3000);
			driver.findElement(By.id(CancelGrid)).click();
			//Trainer (Internal and External) grid ends
			Thread.sleep(3000);
			driver.findElement(By.id("customfield_10874")).sendKeys("Trainer additional comment"); //Trainer additional comment
			Thread.sleep(2000);
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}

		public static void DeliveryDataTab() throws Exception{
			try{
			Thread.sleep(1000);
			if (ValidationData.equals("DeliveryData")){
				driver.findElement(By.xpath("//a[@href='#tab-8']")).click();
			}else{
				driver.findElement(By.xpath("//a[@href='#tab9']")).click();	
			}
			Thread.sleep(200);
			new Select(driver.findElement(By.id("customfield_10958"))).selectByVisibleText("Yes"); //Any training course material delivered?
			driver.findElement(By.id("customfield_10960")).sendKeys("Who is responsible for content and storage of the course material?"); //Who is responsible for content and storage of the course material?
			new Select(driver.findElement(By.id("customfield_10959"))).selectByVisibleText("Xerox prints and send material"); //Who delivers the course material?
			driver.findElement(By.id("customfield_10835")).sendKeys("Listing of training material & Printing specification (if any)Required"); //Listing of training material & Printing specification (if any)Required
			new Select(driver.findElement(By.id("customfield_10837"))).selectByVisibleText("No"); //Who delivers the course material?
			driver.findElement(By.id("customfield_10141")).sendKeys("If yes, specify the pre-course work detailsRequired"); //If yes, specify the pre-course work detailsRequired
			driver.findElement(By.id("customfield_10836")).sendKeys("Post-training material"); //Post-training material
			driver.findElement(By.id("customfield_10158")).sendKeys("Comments: Course Material"); //Comments: Course Material
			driver.findElement(By.id("customfield_10964")).sendKeys("10"); //Room settings for the Main Room (Capacity)
			new Select(driver.findElement(By.id("customfield_10961"))).selectByVisibleText("Empty"); //Room settings for the Main Room (Configuration)Required
			driver.findElement(By.id("customfield_10962")).sendKeys("15"); //Room settings for the Break-out Room 1 (Capacity)
			new Select(driver.findElement(By.id("customfield_10963"))).selectByVisibleText("Block"); //Room settings for the Break-out Room 1 (Configuration)Required
			new Select(driver.findElement(By.id("customfield_10965"))).selectByVisibleText("Yes"); //Are there needed equipment(s) for the main room?Required
			driver.findElement(By.id("customfield_10966")).sendKeys("If yes, then what are these needed equipments"); //If yes, then what are these needed equipments
			driver.findElement(By.id("customfield_10150")).sendKeys("Comments: Room"); //Comments: Room
			new Select(driver.findElement(By.id("customfield_10847"))).selectByVisibleText("Yes"); //Catering - Is there any specific catering request?
			driver.findElement(By.id("customfield_10849")).sendKeys("Comments: Catering"); //Comments: Catering
			new Select(driver.findElement(By.id("customfield_10850"))).selectByVisibleText("Yes"); //Hardware - IT equipped room needed?Required
			new Select(driver.findElement(By.id("customfield_10851"))).selectByVisibleText("Yes"); //Hardware - Trainer brings his own PC?Required
			driver.findElement(By.id("customfield_10152")).sendKeys("Comments: Hardware"); //Comments: Hardware
			new Select(driver.findElement(By.id("customfield_10853"))).selectByVisibleText("No"); //Software - If PC are provided, adhere to Airbus Group master?
			new Select(driver.findElement(By.id("customfield_10854"))).selectByVisibleText("Yes"); //Software - Is there any specific software needed?Required
			driver.findElement(By.id("customfield_10855")).sendKeys("Software - IT Contacts"); //Software - IT Contacts
			driver.findElement(By.id("customfield_10154")).sendKeys("Comments: Software"); //Comments: Software
			new Select(driver.findElement(By.id("customfield_10857"))).selectByVisibleText("Yes"); //Network needed?Required
			driver.findElement(By.id("customfield_10155")).sendKeys("Comments: Network"); //Comments: Network
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}	
		
		public static void NonDeliveryDataTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab9']")).click();			
			new Select(driver.findElement(By.id("customfield_10847"))).selectByVisibleText("None"); //Catering - Is there any specific catering request?
			new Select(driver.findElement(By.id("customfield_10850"))).selectByVisibleText("None"); //Hardware - IT equipped room needed?Required
			new Select(driver.findElement(By.id("customfield_10851"))).selectByVisibleText("None"); //Hardware - Trainer brings his own PC?Required
			new Select(driver.findElement(By.id("customfield_10853"))).selectByVisibleText("None"); //Software - If PC are provided, adhere to Airbus Group master?
			new Select(driver.findElement(By.id("customfield_10854"))).selectByVisibleText("None"); //Software - Is there any specific software needed?Required
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
			
		}	
		
		public static void UKTab() throws Exception{
			try{
			Thread.sleep(800);
			driver.findElement(By.xpath("//a[@href='#tab2']")).click();
			driver.findElement(By.id("customfield_10860")).sendKeys("Franklyn Noyola"); //Training Program Title UK
			driver.findElement(By.id("customfield_10007")).sendKeys("Full Training Title UK"); //Full Training Title UK
			driver.findElement(By.id("customfield_10006")).sendKeys("Detailed Content UK");//Detailed Content UK
			driver.findElement(By.id("customfield_10008")).sendKeys("Introduction UK");//Introduction UK
			driver.findElement(By.id("customfield_10009")).sendKeys("Objectives UK");//Objectives UK
			driver.findElement(By.id("customfield_10010")).sendKeys("Prerequisite UK (Notes)");//Prerequisite UK (Notes)
			driver.findElement(By.id("customfield_10978")).sendKeys("Franklyn Noyola");//Target Population UK
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
		
		public static void SPTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab3']")).click();
			driver.findElement(By.id("customfield_10863")).sendKeys("Franklyn Noyola"); //Training Program Title SP
			driver.findElement(By.id("customfield_10016")).sendKeys("Full Training Title SP"); //Full Training Title SP
			driver.findElement(By.id("customfield_10015")).sendKeys("Detailed Content SP");//Detailed Content SP
			driver.findElement(By.id("customfield_10017")).sendKeys("Introduction SP");//Introduction SP
			driver.findElement(By.id("customfield_10018")).sendKeys("Objectives SP");//Objectives SP
			driver.findElement(By.id("customfield_10019")).sendKeys("Prerequisite SP (Notes)");//Prerequisite SP (Notes)
			driver.findElement(By.id("customfield_10981")).sendKeys("Franklyn Noyola");//Target Population SP
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
		
		public static void FRTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab4']")).click();
			driver.findElement(By.id("customfield_10861")).sendKeys("Franklyn Noyola"); //Training Program Title FR
			driver.findElement(By.id("customfield_10025")).sendKeys("Full Training Title FR"); //Full Training Title FR 
			driver.findElement(By.id("customfield_10024")).sendKeys("Detailed Content FR");//Detailed Content FR
			driver.findElement(By.id("customfield_10026")).sendKeys("Introduction FR");//Introduction FR
			driver.findElement(By.id("customfield_10027")).sendKeys("Objectives FR");//Objectives FR
			driver.findElement(By.id("customfield_10028")).sendKeys("Prerequisite FR (Notes)");//Prerequisite FR (Notes)
			driver.findElement(By.id("customfield_10979")).sendKeys("Franklyn Noyola");//Target Population FR
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
			
		}
		
		public static void GETab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab5']")).click();
			driver.findElement(By.id("customfield_10862")).sendKeys("Franklyn Noyola"); //Training Program Title GE
			driver.findElement(By.id("customfield_10034")).sendKeys("Full Training Title GE"); //Full Training Title GE 
			driver.findElement(By.id("customfield_10033")).sendKeys("Detailed Content GE");//Detailed Content GE
			driver.findElement(By.id("customfield_10035")).sendKeys("Introduction GE");//Introduction GE
			driver.findElement(By.id("customfield_10036")).sendKeys("Objectives GE");//Objectives GE
			driver.findElement(By.id("customfield_10037")).sendKeys("Prerequisite GE (Notes)");//Prerequisite GE (Notes)
			driver.findElement(By.id("customfield_10980")).sendKeys("Franklyn Noyola");//Target Population GE
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
		
		public static void PricesInternationalTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.id("customfield_10952")).sendKeys("10");
			driver.findElement(By.id("customfield_11301")).sendKeys("10");
			driver.findElement(By.id("customfield_11306")).sendKeys("10");
			driver.findElement(By.id("customfield_11311")).sendKeys("10");
			driver.findElement(By.id("customfield_10941")).sendKeys("10");
			//driver.findElement(By.id("customfield_10812")).sendKeys("10");
			//driver.findElement(By.id("customfield_10813")).sendKeys("10");
			/*driver.findElement(By.id("customfield_10931")).sendKeys("10");
			driver.findElement(By.id("customfield_11306")).sendKeys("10");
			driver.findElement(By.id("customfield_10936")).sendKeys("10");
			driver.findElement(By.id("customfield_11311")).sendKeys("10");
			driver.findElement(By.id("customfield_10941")).sendKeys("10");
			driver.findElement(By.id("customfield_10946")).sendKeys("10");
			driver.findElement(By.id("customfield_10968")).sendKeys("10");
			driver.findElement(By.id("customfield_10973")).sendKeys("10");*/
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
		
		public static void PricesUKTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab2']")).click();
			driver.findElement(By.id("customfield_10953")).sendKeys("10");
			driver.findElement(By.id("customfield_11302")).sendKeys("10");									
			driver.findElement(By.id("customfield_11308")).sendKeys("10");			
			driver.findElement(By.id("customfield_11312")).sendKeys("10");	
			driver.findElement(By.id("customfield_10942")).sendKeys("10");			
			driver.findElement(By.id("customfield_10818")).sendKeys("10");
			driver.findElement(By.id("customfield_10819")).sendKeys("10");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
	
		public static void PricesSPTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab3']")).click();
			driver.findElement(By.id("customfield_10954")).sendKeys("10");			
			driver.findElement(By.id("customfield_11303")).sendKeys("10");									
			driver.findElement(By.id("customfield_11307")).sendKeys("10");									
			driver.findElement(By.id("customfield_11314")).sendKeys("10");			
			driver.findElement(By.id("customfield_10943")).sendKeys("10");			
			driver.findElement(By.id("customfield_10814")).sendKeys("10");			
			driver.findElement(By.id("customfield_10815")).sendKeys("10");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}

		}		
		public static void PricesFRTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab4']")).click();
			driver.findElement(By.id("customfield_10955")).sendKeys("10");
			driver.findElement(By.id("customfield_11305")).sendKeys("10");
			driver.findElement(By.id("customfield_11309")).sendKeys("10");
			driver.findElement(By.id("customfield_11315")).sendKeys("10");
			driver.findElement(By.id("customfield_10944")).sendKeys("10");
			driver.findElement(By.id("customfield_10816")).sendKeys("10");
			driver.findElement(By.id("customfield_10817")).sendKeys("10");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}	
		
		public static void PricesGETab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab5']")).click();
			driver.findElement(By.id("customfield_10956")).sendKeys("10");			
			driver.findElement(By.id("customfield_11304")).sendKeys("10");
			driver.findElement(By.id("customfield_11310")).sendKeys("10");
			driver.findElement(By.id("customfield_11316")).sendKeys("10");
			driver.findElement(By.id("customfield_10945")).sendKeys("10");
			driver.findElement(By.id("customfield_10820")).sendKeys("10");
			driver.findElement(By.id("customfield_10821")).sendKeys("10");	
			} catch (NoSuchElementException e){
				e.printStackTrace();
			}
		}
		
		public static void NextPricesInternationalTab() throws Exception{
			try{
			Thread.sleep(100);			
			driver.findElement(By.id("customfield_12582")).sendKeys("20");
			driver.findElement(By.id("customfield_12305")).sendKeys("25");
			driver.findElement(By.id("customfield_12310")).sendKeys("30");
			driver.findElement(By.id("customfield_12315")).sendKeys("35");
			driver.findElement(By.id("customfield_12320")).sendKeys("40");
			driver.findElement(By.id("customfield_12325")).sendKeys("50");
			driver.findElement(By.id("customfield_12330")).sendKeys("75");
			driver.findElement(By.id("customfield_12335")).sendKeys("90");
			driver.findElement(By.id("customfield_12340")).sendKeys("85");
			driver.findElement(By.id("customfield_12345")).sendKeys("100");
			driver.findElement(By.id("customfield_12350")).sendKeys("210");
			driver.findElement(By.id("customfield_12355")).sendKeys("140");
			driver.findElement(By.id("customfield_12360")).sendKeys("112");
			driver.findElement(By.id("customfield_12365")).sendKeys("141");
			driver.findElement(By.id("customfield_12366-1")).click();
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
		
		public static void NextPricesUKTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab2']")).click();
			driver.findElement(By.id("customfield_12301")).sendKeys("15");			
			driver.findElement(By.id("customfield_12306")).sendKeys("15");			
			driver.findElement(By.id("customfield_12311")).sendKeys("15");			
			driver.findElement(By.id("customfield_12316")).sendKeys("15");			
			driver.findElement(By.id("customfield_12321")).sendKeys("15");			
			driver.findElement(By.id("customfield_12326")).sendKeys("15");			
			driver.findElement(By.id("customfield_12331")).sendKeys("15");			
			driver.findElement(By.id("customfield_12336")).sendKeys("15");
			driver.findElement(By.id("customfield_12341")).sendKeys("15");	
			driver.findElement(By.id("customfield_12346")).sendKeys("15");			
			driver.findElement(By.id("customfield_12351")).sendKeys("15");
			driver.findElement(By.id("customfield_12356")).sendKeys("15");
			driver.findElement(By.id("customfield_12361")).sendKeys("15");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}
	
		public static void NextPricesSPTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab3']")).click();
			driver.findElement(By.id("customfield_12303")).sendKeys("14");			
			driver.findElement(By.id("customfield_12307")).sendKeys("18");			
			driver.findElement(By.id("customfield_12312")).sendKeys("21");			
			driver.findElement(By.id("customfield_12317")).sendKeys("25");			
			driver.findElement(By.id("customfield_12322")).sendKeys("35");			
			driver.findElement(By.id("customfield_12327")).sendKeys("54");			
			driver.findElement(By.id("customfield_12332")).sendKeys("65");			
			driver.findElement(By.id("customfield_12337")).sendKeys("68");			
			driver.findElement(By.id("customfield_12342")).sendKeys("99");			
			driver.findElement(By.id("customfield_12347")).sendKeys("84");			
			driver.findElement(By.id("customfield_12352")).sendKeys("47");			
			driver.findElement(By.id("customfield_12357")).sendKeys("41");			
			driver.findElement(By.id("customfield_12362")).sendKeys("73");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}

		}		
		public static void NextPricesFRTab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab4']")).click();
			driver.findElement(By.id("customfield_12302")).sendKeys("11");
			driver.findElement(By.id("customfield_12308")).sendKeys("13");
			driver.findElement(By.id("customfield_12313")).sendKeys("19");
			driver.findElement(By.id("customfield_12318")).sendKeys("24");
			driver.findElement(By.id("customfield_12323")).sendKeys("28");
			driver.findElement(By.id("customfield_12328")).sendKeys("65");
			driver.findElement(By.id("customfield_12333")).sendKeys("66");
			driver.findElement(By.id("customfield_12338")).sendKeys("69");
			driver.findElement(By.id("customfield_12343")).sendKeys("96");
			driver.findElement(By.id("customfield_12348")).sendKeys("98");
			driver.findElement(By.id("customfield_12353")).sendKeys("321");
			driver.findElement(By.id("customfield_12358")).sendKeys("121");
			driver.findElement(By.id("customfield_12363")).sendKeys("32");
			} catch (NoSuchElementException e){
				e.printStackTrace();
			}

		}	
		public static void NextPricesGETab() throws Exception{
			try{
			Thread.sleep(100);
			driver.findElement(By.xpath("//a[@href='#tab5']")).click();
			driver.findElement(By.id("customfield_12304")).sendKeys("55");
			driver.findElement(By.id("customfield_12309")).sendKeys("44");
			driver.findElement(By.id("customfield_12314")).sendKeys("33");
			driver.findElement(By.id("customfield_12319")).sendKeys("22");
			driver.findElement(By.id("customfield_12324")).sendKeys("11");
			driver.findElement(By.id("customfield_12329")).sendKeys("66");
			driver.findElement(By.id("customfield_12334")).sendKeys("77");
			driver.findElement(By.id("customfield_12339")).sendKeys("88");
			driver.findElement(By.id("customfield_12344")).sendKeys("99");
			driver.findElement(By.id("customfield_12349")).sendKeys("101");
			driver.findElement(By.id("customfield_12354")).sendKeys("111");
			driver.findElement(By.id("customfield_12359")).sendKeys("113");
			driver.findElement(By.id("customfield_12364")).sendKeys("115");
			} catch (NoSuchElementException e){
				e.printStackTrace();
				fail("Element No Found");
			}
		}


	public static void CourseExecution() throws Exception{
		try{
				Thread.sleep(5000);				
				UrgentConfirmation = driver.findElement(By.id("customfield_11500-val")).getText();
				DeliveryConfirmation = driver.findElement(By.id("customfield_11400-val")).getText();
				Thread.sleep(2000);
				Classroom = driver.findElement(By.id("customfield_10832-val")).getText();
				Thread.sleep(2000);
		  		DateValidation = driver.findElement(By.id("customfield_10004-val")).getText();
		  		DateValidation = DateValidation.substring(6, 10);
		  		DataValidation = Integer.parseInt(DateValidation);
		  		Thread.sleep(4000);	
				if (!UrgentConfirmation.equals("Yes")){
					if (DataValidation > 2016 && Classroom.equals("Classroom training")){
						driver.findElement(By.id("action_id_261")).click(); //Send to Pending Validation 
						Thread.sleep(5000);
						//Assignee = driver.findElement(By.id("assignee-val")).getText();	 					
						//if (!Assignee.equals("TEST USER: XLAS Full Access")){
							driver.findElement(By.id("assign-to-me")).click();
							Thread.sleep(4000);
						//}
						//Thread.sleep(2000);
						driver.findElement(By.id("action_id_271")).click();
						Thread.sleep(3000);			
					}else{
						driver.findElement(By.id("action_id_11")).click(); //Send to next status - PENDING QUALITY CHECK.
						Thread.sleep(4000);
					}		
	
				Thread.sleep(6000);
				Stat = driver.findElement(By.id("status-val")).getText();				
				Thread.sleep(4000);				
				Random rand = new Random();				
				switch(Stat){																								
				case "PENDING QUALITY CHECK":						Thread.sleep(4000);
																	driver.findElement(By.id("assign-to-me")).click();
																	Thread.sleep(3000);
																	driver.findElement(By.id("action_id_21")).click();
				case "QUALITY CHECK IN PROGRESS":					Thread.sleep(4000);
																	driver.findElement(By.id("action_id_31")).click();
				case "WAITING FOR LMS ENTRY":						Thread.sleep(4000);
																	driver.findElement(By.id("action_id_41")).click();												
				case "LMS ENTRY IN PROGRESS":						Thread.sleep(3000);
																	int SAP = rand.nextInt(60000000)+1;
																	SAPID = Integer.toString(SAP);
																	Thread.sleep(5000);
																	if(DeliveryConfirmation.equals("Yes")){
																		driver.findElement(By.id("action_id_291")).click();
																		Thread.sleep(1000);
																	}else{
																		driver.findElement(By.id("action_id_91")).click();
																		Thread.sleep(1000);																		
																	}
																	Thread.sleep(4000);
																	driver.findElement(By.id("customfield_10194")).sendKeys(SAPID);																	
																	driver.findElement(By.id("issue-workflow-transition-submit")).click();
																	Thread.sleep (8000);
																	String Title = driver.getTitle();
																	Thread.sleep (5000);																	
																	if (!Title.contains("LMS Entry Success")){
																		return;
																	}
																	if (Title.contains("LMS Entry Success")){
																	String ErrorSAP = driver.findElement(By.cssSelector("div.error")).getText();
																	if (ErrorSAP.equals("The provided 'Training Program SAP ID' already exists in the system.")){															
																		Random i = new Random();
																		do{ 
																			SAP = i.nextInt(60000000)+1;
																			SAPID = Integer.toString(SAP);
																			driver.findElement(By.id("customfield_10194")).clear();
																			driver.findElement(By.id("customfield_10194")).sendKeys(SAPID);
																			driver.findElement(By.id("issue-workflow-transition-submit")).click();															
																			Thread.sleep (3000);																	
																			Title = driver.getTitle(); 																	
																		}while (Title.contains("LMS Entry Success"));
																	}
																}
				}
		}else{
			Thread.sleep(4000);
			driver.findElement(By.id("action_id_351")).click();			
			Thread.sleep(7000);
			Random rand = new Random();
			int SAP = rand.nextInt(60000000)+1;
			SAPID = Integer.toString(SAP);
			Thread.sleep(4000);
			if(DeliveryConfirmation.equals("Yes")){
				driver.findElement(By.id("action_id_361")).click();
				Thread.sleep(4000);
			}
			if(DeliveryConfirmation.equals("No")){
				driver.findElement(By.id("action_id_371")).click();
				Thread.sleep(4000);
			}
			
			driver.findElement(By.id("customfield_10194")).sendKeys(SAPID);																	
			driver.findElement(By.id("issue-workflow-transition-submit")).click();
			Thread.sleep (11000);
			String Title = driver.getTitle();
			Thread.sleep (2000);																			
			if (!Title.contains("LMS Entry Success")){
				return;
			}
			if (Title.contains("LMS Entry Success")){
			String ErrorSAP = driver.findElement(By.cssSelector("div.error")).getText();
			if (ErrorSAP.equals("The provided 'Training Program SAP ID' already exists in the system.")){															
				Random i = new Random();
				do{ 
					SAP = i.nextInt(60000000)+1;
					SAPID = Integer.toString(SAP);
					driver.findElement(By.id("customfield_10194")).clear();
					driver.findElement(By.id("customfield_10194")).sendKeys(SAPID);
					driver.findElement(By.id("issue-workflow-transition-submit")).click();															
					Thread.sleep (3000);																	
					Title = driver.getTitle(); 																	
				}while (Title.contains("LMS Entry Success"));
			}
		}
	}
		} catch (NoSuchElementException e){
			e.printStackTrace();
			fail("Element No Found");
		}
		  	}
	}	



