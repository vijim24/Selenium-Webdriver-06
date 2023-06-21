package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProtoCommerceWebsiteAssessment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		Name
		driver.findElement(By.name("name")).sendKeys("ABCD");
//		Email
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//		PWD
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
//		Checking the checkbox
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isEnabled());

//		Static Dropdown
		WebElement genderBox = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(genderBox);
		gender.selectByIndex(1);

//		Employment Status
		driver.findElement(By.cssSelector("div[class='form-check form-check-inline'] input[value='option1']")).click();
//		driver.close();

//		Checking if Entrepreneur is disabled
		System.out.println(driver.findElement(By.cssSelector("input[id='inlineRadio3']")).isEnabled());

//		Date
//		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("02/02/1995");

		driver.findElement(By.cssSelector("input[value='Submit']")).click();

		Assert.assertEquals(
				driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText(),
				"Success! The Form has been submitted successfully!.");

	}

}
