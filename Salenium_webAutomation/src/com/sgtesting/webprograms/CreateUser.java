package com.sgtesting.webprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		CreateUser();
		DeleteUser() ;
		logout();
		closeApllication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("veena");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("N S");
			oBrowser.findElement(By.name("email")).sendKeys("venna@gnail.com");
			oBrowser.findElement(By.name("username")).sendKeys("veena");
			oBrowser.findElement(By.name("password")).sendKeys("shashi");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("shashi");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1600);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();

			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApllication()
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