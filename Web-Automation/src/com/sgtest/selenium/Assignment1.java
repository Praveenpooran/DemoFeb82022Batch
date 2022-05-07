package com.sgtest.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {
		private static WebDriver Browser = null;
		
		public static void main(String[] args) 
		{
			launch();
			navigate();
			login();
			closewindow();
			createuser();
			deleteuser();
			logout();
			closeapplication();
		}
		private static void launch()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","D:\\praveen\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
				Browser = new ChromeDriver(); 
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
		private static void navigate()
		{
			try
			{
				Browser.get("http://localhost:81/login.do");
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				Browser.findElement(By.name("username")).sendKeys("admin");
				Browser.findElement(By.name("pwd")).sendKeys("manager");
				Browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closewindow()
		{
			try
			{
				Browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createuser()
		{
			try
			{
				Browser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Browser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
				Browser.findElement(By.name("firstName")).sendKeys("Praveen");
				Browser.findElement(By.name("lastName")).sendKeys("Kumar");
				Browser.findElement(By.name("email")).sendKeys("praveen.kumar19@gmail.com");
				Browser.findElement(By.name("username")).sendKeys("Praveen Kumar");
				Browser.findElement(By.name("password")).sendKeys("1NC16CSE12");
				Browser.findElement(By.name("passwordCopy")).sendKeys("1NC16CSE12");
				Browser.findElement(By.id("userDataLightBox_commitBtn")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser()
		{
			try
			{
				Browser.findElement(By.className("userNameSpan")).click();
				Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Alert alert = Browser.switchTo().alert();
				alert.accept();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				Browser.findElement(By.id("logoutLink")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeapplication()
		{
			try
			{
				Browser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

