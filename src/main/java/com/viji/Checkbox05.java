package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox05 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//li[@class='ui-menu-item'] /a
//		click the Family and Friends Check Box
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//		List<WebElement> checkBoxCategories=driver.findElements(By.cssSelector("div[id='discount-checkbox'] div"));
		List<WebElement> checkBoxCategories = driver.findElements(By.cssSelector("div[id='discount-checkbox'] div"));
		Assert.assertEquals(checkBoxCategories.size(),6);
//		System.out.println(checkBoxCategories.size());
				
	}

}
