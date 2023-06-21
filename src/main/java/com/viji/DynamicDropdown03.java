package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Tools\\chromedriver_win32_113\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//		//a[@value='MAA'] for Chennai
//		//a[@value='BLR'] for Bangalore

//		Clicking the arrival box
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		selecting the arrival destination
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(1000);

//		Selecting the departure location
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']\r\n"
				+ "")).click();
//		Clicking the calendar box
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
//		Selecting the departure date
		
		
		
	}

}
