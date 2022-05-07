package com.sgtest.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		private static WebDriver oBrowser=null;
		public static void main(String[] args)
		{
			lanchbrowser();
			navigate();
			login();
			minimize();
			createuser();
			deleteUser();
			logout();
			closeapp();
		}
		private static void lanchbrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","D:\\praveen\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try {
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		} 
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void minimize()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void createuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user");
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("demo");
                oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demouser@gmail.com");				
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Demouser1");
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
				Thread.sleep(2000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//td[@class='userNameCell first']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);

				Alert oAlert=oBrowser.switchTo().alert();
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeapp()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}




