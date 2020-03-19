package com.launch;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest{

	public static void main(String[] args) throws Exception {
		
		init();
		launch("chromebrowser");
		navigateUrl("AmazonUrl");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*WebElement loc = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		loc.sendKeys("Philips");
		Thread.sleep(2000);
		loc.clear();
		Thread.sleep(3000);
		driver.findElement(By.linkText("AmazonBasics")).click();*/
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size();i++) {
			if(!links.get(i).getText().isEmpty()) {
			System.out.println(links.get(i).getText());
		}
		}
	}

}
