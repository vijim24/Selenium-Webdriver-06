package com.viji;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert07 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Viji");
		driver.findElement(By.id("alertbtn")).click();

//		Grab the text from the alert window
		System.out.println(driver.switchTo().alert().getText());

//		Accept the alert
		driver.switchTo().alert().accept();

//		Confirm the alert
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		driver.close();

	}

}
