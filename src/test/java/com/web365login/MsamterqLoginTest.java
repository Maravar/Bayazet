package com.web365login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.msamterq.page.facebook.MsamterqFacebookPage;
import com.web365.msamterq.page.facebook.MsamterqInstagramPage;
import com.web365.msamterq.page.facebook.MsamterqYoutubePage;
import com.web365.msamterq.page.home.MsamterqHomePage;
import com.web365.msamterq.page.menu.MsamterqAboutUsPage;
import com.web365.msamterq.page.menu.MsamterqQyuftaPage;
import com.web365base.MsamterqBaseTest;

public class MsamterqLoginTest extends MsamterqBaseTest {
	
	@Test
	public void testLoginWithCorrectCred() throws InterruptedException {
		//opens http://www.bayazet.am// based on Base test's BeforeTest method
		
	MsamterqHomePage home = new MsamterqHomePage(driver);
	home=home.logoClick();
	Assert.assertTrue(home.ShopCart.isDisplayed());
//	
//	Thread.sleep(2000);
//	
//	MsamterqFacebookPage facebook = (MsamterqFacebookPage) home.FacebookClick();
//	home=home.FacebookClick();
//	Assert.assertTrue(facebook.facebook.isDisplayed());
//	
//	MsamterqInstagramPage instagram = (MsamterqInstagramPage) home.InstagramClick();
//	home=home.InstagramClick();
//	Assert.assertTrue(instagram.instagram.isDisplayed());
//	
//	MsamterqYoutubePage youtube = (MsamterqYoutubePage) home.YoutubeClick();
//	home=home.YoutubeClick();
//	Assert.assertTrue(youtube.youtube.isDisplayed());
	
	MsamterqAboutUsPage about = home.goToAboutus();
	Assert.assertTrue(about.aboutTitle.isDisplayed());
	
	MsamterqQyuftaPage qyufta = home.qyuftaClick();
	
	Assert.assertTrue(qyufta.qyuftaDetails.isDisplayed());
	
		
		

}
}
	
