package com.web365.msamterq.page.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.msamterq.page.home.MsamterqHomePage;
import static com.web365.msamterq.page.menu.MsamterqAboutUsPageConstants.*;
public class MsamterqContactsPage extends MsamterqHomePage {

	public MsamterqContactsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	@FindBy(xpath=CONTACTS_DETAILS_XPATH)
	public WebElement contactsDetails;
}
