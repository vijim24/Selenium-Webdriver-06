package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown04 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);

		List<WebElement> suggestionOption = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
		for (WebElement options : suggestionOption) {
			if (options.getText().equalsIgnoreCase("India")) {
				options.click();
				break;
			}

		}
	}

}
