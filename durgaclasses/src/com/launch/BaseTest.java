package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties p;
	public static String projectPath = System.getProperty("user.dir");
	
	public static void init() throws IOException {
		
	//  FileInputStream fis = new FileInputStream("C:\\Users\\HISHAM\\eclipse-workspace\\durgaclasses\\data.properties");
		FileInputStream fis = new FileInputStream(projectPath+("\\data.properties"));
		p = new Properties();
		p.load(fis);
	}
	public static void launch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HISHAM\\Desktop\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.close();
		}else if(p.getProperty(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HISHAM\\Desktop\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	}
	public static void navigateUrl(String url) {
		
		//driver.get(p.getProperty(url)); or
		driver.navigate().to(p.getProperty(url));
	}
	

}
