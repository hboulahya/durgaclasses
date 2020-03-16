package com.launch;

import java.io.IOException;

import org.openqa.selenium.By;

public class TC_001 extends BaseTest {

	public static void main(String[] args) throws IOException {

		init();
		launch("chromebrowser");
		navigateUrl("HdFCUrl");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);*/
		driver.findElement(By.cssSelector("body.page-homepage.user-logged-out.path-frontpage.navbar-is-fixed-top.has-glyphicons.chrome.chrome80.win.desktop.english.www:nth-child(2) div.mm-page.mm-slideout:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(2) header.navbar.navbar-default.navbar-fixed-top div.container div.col-lg-9.col-md-9.col-sm-6.col-xs-6 div.region.region-navigation-collapsible section.block.block-hdfc-menu.block-hdfc-menu-block.clearfix div:nth-child(1) div.wrapper.hdfc-menu-links ul:nth-child(3) li.nav-item:nth-child(3) > a:nth-child(1)")).click();
		//driver.close();
		//driver.quit();
	}

	
		
	

}
