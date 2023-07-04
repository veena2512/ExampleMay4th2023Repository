package com.sgtesting.webprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		logout();
		closeApllication();
	
	}
	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
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
		}catch (Exception e)
		{
		e.printStackTrace();	
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
			Thread.sleep(8000);
			
			
		}catch (Exception e)
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
