package com.sgtesting.webAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser1ModifyUser1Demo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		Createuser();
		Modify1();
		deleteuser();
		Logout();
		close();
	}
	public static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}



	}
	private static void  minimizeFlyoutWindow()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void Createuser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("shiva@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("demo user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();	
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modify1()
	{
		try {
			  oBrowser.findElement(By.xpath("//span[text()='User1,demo']")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("password")).sendKeys("uytrddds");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("passwordCopy")).sendKeys("uytrddds");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			  Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void deleteuser()
    {
   	 try {
   		 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
   		 Thread.sleep(2000);
   		 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
   		 Thread.sleep(2000);
   		 oBrowser.switchTo().alert().accept();
   		 Thread.sleep(2000);
   		 
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private static void Logout()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
    private static void close()
    {
   	 try {
   		 oBrowser.close();
   		 Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
