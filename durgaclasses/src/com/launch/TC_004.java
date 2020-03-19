package com.launch;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TC_004 extends BaseTest {

	private static final Logger log=Logger.getLogger(TC_004.class);
	
	public static void main(String[] args) throws Exception {
		
		BasicConfigurator.configure();
		
		init();
		log.info("Initializing properties files");
		launch("chromebrowser");
		log.info("Launched the browser "+ p.getProperty("chromebrowser"));
		navigateUrl("AmazonUrl");
		log.info("Navigated to url "+ p.getProperty("AmazonUrl"));
		driver.manage().window().maximize();
		log.info("Maximized the Window");
		selectOption("amazonsearchdrop_id","amazondropvalue");
		log.info("Selected the option "+ or.getProperty("amazondropvalue ")+ "By using the locator "+or.getProperty("amazonsearchdrop_id"));
		typeValue("amazonsearchtext_id","amazontextvalue");
		log.info("Entered the value "+ or.getProperty("amazontextvalue ")+"By using the locator"+or.getProperty("amazonsearchtext_id"));
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on search button by using locator"+or.getProperty("amazonsearchtext_id"));
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/
		

	}

	

	

}
