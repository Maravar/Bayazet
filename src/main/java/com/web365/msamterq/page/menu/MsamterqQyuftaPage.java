package com.web365.msamterq.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.msamterq.page.home.MsamterqHomePage;

public class MsamterqQyuftaPage extends MsamterqHomePage {

	

	public MsamterqQyuftaPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

//	public static final String QYUFTA_DETAILS_XPATH="//a[@href='/Shop/Product#065111']";
	public static final String QYUFTA_DETAILS_XPATH="//img[@src='/prodimg/3767_43735_1623056541_s.jpg']";
	
	@FindBy(xpath=QYUFTA_DETAILS_XPATH)
	public WebElement qyuftaDetails;
}
