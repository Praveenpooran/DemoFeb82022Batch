package com.sgtest.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	private static WebDriver wb=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createcustomer();
		deleteCustomer();
		logout();
		closeapp();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\praveen\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			wb=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			wb.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			wb.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			wb.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
		    Thread.sleep(2000);
		    wb.findElement(By.xpath("//div[@class='addNewButton']")).click();			
		    Thread.sleep(2000);
		    wb.findElement(By.xpath("//html/body/div[14]/div[1]")).click();
		    Thread.sleep(2000);
		    wb.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("DemoCustomer");
		    Thread.sleep(2000);
		    wb.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn]")).click();
		    Thread.sleep(2000);
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try {
			wb.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			wb.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeapp()
	{
		try
		{
			wb.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
