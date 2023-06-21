package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssessment01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		Check the first Checkbox
		driver.findElement(By.id("checkBoxOption1")).click();
//		Checking if the checkbox is checked
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		Uncheck the selected CheckBox
		driver.findElement(By.id("checkBoxOption1")).click();
//		Checking if the check box is unchecked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		Finding the count of the checkboxes totally available
		List<WebElement> totalCheckBox = driver.findElements(By.xpath("//div[@id='checkbox-example'] /fieldset /label"));
		System.out.println(totalCheckBox.size());
		
	}

}
