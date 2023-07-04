package com.sgtesting.webAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTask {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		CreateCustomer();
		createProject();
		createTask() ;
		deleteProject();
		deleteCustomer();
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
	private static void CreateCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Shreeya");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(" Welcome shreeya");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn\']/div/span")).click();					  
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createProject(){
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			//to select project name
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys(" SG_Automation");

			Thread.sleep(2000);
			//select customer
			//oBrowser.findElement(By.xpath("//*[@id='ext-gen29']/td[2]/em")).click();Thread.sleep(5000);
			//oBrowser.findElement(By.xpath("//*[@id='ext-gen106']")).click();
			Thread.sleep(5000);
			//description project
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectDescriptionField']")).click();
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectDescriptionField']")).sendKeys("Hi project description");

			//commit button
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();

			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[2]/a")).click();//*[@id="topnav"]/tbody/tr[1]/td[2]/a
			oBrowser.findElement(By.xpath("//*[@id='enterTTMainContent']/table[1]/tbody/tr[3]/td[1]/table/tbody/tr/td[7]/nobr/span")).click();
			Thread.sleep(2000);
			//select customer dropdownlist
			oBrowser.findElement(By.xpath("//*[@id='ext-gen32']")).click();
			Thread.sleep(2000);
			//select customer name 
			oBrowser.findElement(By.xpath("//*[@id='ext-gen126']")).click();
			//select project dropdownlist
			oBrowser.findElement(By.xpath("//*[@id='ext-gen138']")).click();
			//select project name 
			oBrowser.findElement(By.xpath("//*[@id='ext-gen168']")).click();
			Thread.sleep(2000);
			//select the task text box
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).click();
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys(" Task1: Advance Scenarios");
		
			//select deadline button //popoups present date
			oBrowser.findElement(By.xpath("//*[@id='ext-gen51']")).click();
			Thread.sleep(2000);
			//clic ok button
			oBrowser.findElement(By.xpath("//*[@id='ext-gen227']")).click();
			Thread.sleep(2000);
			//select billable /Notbillable drop down 
			oBrowser.findElement(By.xpath("//*[@id=\'ext-gen67\']/td[2]/em")).click();
			oBrowser.findElement(By.xpath("//*[@id='ext-gen276']")).click();
			//create task button
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			//to supress new task creation popwindow 
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_cancelBtn']")).click();//*[@id="createTasksPopup_cancelBtn"]
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	private static void deleteProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			//Actions
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]")).click();;
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			//Permanent Confirm
			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();


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
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

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
