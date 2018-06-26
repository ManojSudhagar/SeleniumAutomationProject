package com.java.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsExample 
{
	@Test
	public void testngExample()
	{
		try{
			System.out.println("Welcome to Jenkins BIJILI");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.quit();
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
	}
	
}
