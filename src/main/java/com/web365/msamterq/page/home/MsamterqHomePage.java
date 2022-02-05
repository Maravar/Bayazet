package com.web365.msamterq.page.home;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.msamterq.page.base.MsamterqBasePage;
import com.web365.msamterq.page.facebook.MsamterqFacebookPage;
import com.web365.msamterq.page.facebook.MsamterqInstagramPage;
import com.web365.msamterq.page.facebook.MsamterqYoutubePage;
import com.web365.msamterq.page.menu.MsamterqAboutUsPage;
import com.web365.msamterq.page.menu.MsamterqContactsPage;
import com.web365.msamterq.page.menu.MsamterqQyuftaPage;

import static com.web365.msamterq.page.home.MsamterqHomePageConstants.*;

public class MsamterqHomePage extends MsamterqBasePage  {
	
	public MsamterqHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	@FindBy(xpath=LOGO_XPATH)
	public WebElement logo;
	
	@FindBy(xpath=SHOP_CART_XPATH)
	public WebElement ShopCart;
	
	
	
	@FindBy(xpath=ABOUT_US_LINK_XPATH)
	public WebElement aboutUsLink;
	
	@FindBy(xpath=PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath=CONTACTS_XPATH)
	public WebElement contactslink;
	
	
	@FindBy(xpath=FACEBOOK_LINK_XPATH)
	public WebElement facebook;
	
	@FindBy(xpath=INSTAGRAM_LINK_XPATH)
	public WebElement instagram;
	
	@FindBy(xpath=YOUTUBE_LINK_XPATH)
	public WebElement youtube;
	
	@FindBy(xpath=QYUFTA_XPATH)
	public WebElement qyufta;



	
	public MsamterqQyuftaPage qyuftaClick() throws InterruptedException {
		qyufta.click();
		Thread.sleep(2000);
		return new MsamterqQyuftaPage(this.driver);
		
	}
	public MsamterqHomePage YoutubeClick() {
		youtube.click();
		return new MsamterqYoutubePage (this.driver);
	}
	
	public MsamterqHomePage FacebookClick() {
		facebook.click();
		return new MsamterqFacebookPage(this.driver);
}
	
	public MsamterqHomePage InstagramClick() {
		instagram.click();
		return new MsamterqInstagramPage(this.driver);
	}
	
	public MsamterqContactsPage goToContacts() {
		contactslink.click();
		return new MsamterqContactsPage(this.driver);
	}
	
    public MsamterqHomePage logoClick() {
    	logo.click();
    	return new MsamterqHomePage (this.driver);
    	
    }
    
    public MsamterqAboutUsPage goToAboutus() {
    	aboutUsLink.click();
    	return new MsamterqAboutUsPage (this.driver);
    }
	
	


}
