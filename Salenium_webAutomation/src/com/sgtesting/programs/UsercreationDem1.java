package com.sgtesting.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsercreationDem1 {
	public static WebDriver ob=null;

	public static void main(String[] args) {

		launchbroser();
		navigate();
		login();
		logout();
		closeapplication();

	}

	private static void launchbroser() {
		try {
			ob=new ChromeDriver();
		}catch(Exception  e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

	private static void navigate() {
		try {
			ob.get("http://localhost/login.do");
		}catch(Exception  e)
		{
			e.printStackTrace();
			System.out.println(e);
		}

	}

	private static void login() {


	}

	private static void logout() {
		

	}

	private static void closeapplication() {
	

	}

}
