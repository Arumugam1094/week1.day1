package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to enter from station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		
		//to enter To Station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("NMKL");
		Thread.sleep(1000);
		toStation.sendKeys(Keys.ENTER);
		
		//to click on Sort On Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//to wait for the result table to load
		Thread.sleep(1000);
		
		//to find the number of rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowSize = rows.size();
		
		//Declare List to save the trainNames
		List<String> trianNames = new ArrayList<String>();
		
		for (int i = 1; i <= rowSize; i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			trianNames.add(text);
			//System.out.println(text);
			
		}
		
		//Copy all the data from list to set
		Set<String> setTrains = new LinkedHashSet<String>(trianNames);
		
		if(trianNames.size() == setTrains.size()) {
			System.out.println("No duplicates");
		}
		else {
			System.out.println("Contains duplicate train names");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}