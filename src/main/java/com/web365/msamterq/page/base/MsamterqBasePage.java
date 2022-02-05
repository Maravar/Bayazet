package com.web365.msamterq.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MsamterqBasePage {
	
	protected WebDriver driver;
	
	public MsamterqBasePage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	

}
