package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TravellersBookingWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		Country

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> listOfSuggestedCountries = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] /li"));
		for (WebElement country : listOfSuggestedCountries) {
			if (country.getText().equalsIgnoreCase("India"))
			{
				
				country.click();
				break;
			}
		}
//		Clicking the Round Trip- The return date wil be enabled
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
//		From
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Selecting MAA for From
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
//		To
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
//		Selecting the current Date
		
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.className("ui-state-highlight")).click();
		
// 		Select Date from specific month nd year
		
//		Select Number of passengers
		driver.findElement(By.id("divpaxinfo")).click();
//		Check if initially the passengers have 1 Adult only
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
		Thread.sleep(1000);
		int i =1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
//		selecting the Currency from the static dropdown
		WebElement currencyBox = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currentDropDownBox = new Select(currencyBox);
		currentDropDownBox.selectByIndex(2);
		
//		Checking if the Return date is disabled or not
//		When One way trip Radio button is enabled- Return Date is Disabled
//		Clicking the Round Trip
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		
		//		Clicking the Round Trip- The return date wil be enabled
		
//		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();	
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
//	Clicking the One WAY - The return date wil be disbled
		
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
//		Clicking the search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
//		driver.close();

	}

}
