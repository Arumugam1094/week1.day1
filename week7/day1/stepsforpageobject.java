package week7.day1;

public class stepsforpageobject {
//	Steps to setup Page Object Model:
	//----------------------------------
/*	1. Create BaseClass for common code for all the testcases
	2. Create java classes for each page that we navigate in the application
	3. Create methods for each actions and verifications in each page
	4. extends BaseClass in all the java classes for pages
	5. Add return statement for all the methods respective to the landing page
	6. Create java class for testcases and extends with BaseClass
	7. Call the methods needed for the testcases
	
	
	Steps to setup for parallel execution:
	--------------------------------------
	1. Remove static for driver
	2. Create public constructor in all the pages with driver as argument
			this.driver = driver //constructor code
	3. Pass driver in all the constructor call in the pages and testcases
}*/

