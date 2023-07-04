package com.sgtesting.advancedscenarios;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {

	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
	
		
		loginadmin();
		minimizeFlyoutwindow();
		CreateUsers();
		logout();
		loginuser1();
		loginuser2();
		loginuser3();
		//modifyUserPwd();
	
		//DeleteUser() ;
		//closeApllication();*/
	}
	private static void modifyUserPwd() {
		
		oBrowser.findElement(By.name("username")).sendKeys("User3");
		oBrowser.findElement(By.name("password")).sendKeys("shashi");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("shashi");
		
		
	}
	
	private static void loginuser1() {

		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("shashi");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginuser2() {

		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("shashi");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3() {

		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("shashi");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			logout();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
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
	private static void loginadmin()
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
	private static void CreateUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Ganavi");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("S");
			oBrowser.findElement(By.name("email")).sendKeys("ganavi@gnail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("shashi");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("shashi");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			/*in **************** out*/
			//oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();

			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("veena");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("N S");
			oBrowser.findElement(By.name("email")).sendKeys("venna@gnail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("shashi");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("shashi");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1600);
			/*in ****************************** out*/
			//oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("shashi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("MP");
			oBrowser.findElement(By.name("email")).sendKeys("shahsi@gnail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("shashi");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("shashi");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

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