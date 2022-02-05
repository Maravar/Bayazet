package com.web365base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MsamterqBaseTest {
	
	protected WebDriver driver;

	@BeforeClass
	public void openMsamterq() {
	 driver=new ChromeDriver();
	 driver.get("https://www.bayazet.am");
	 driver.manage().window().maximize();
	 
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
