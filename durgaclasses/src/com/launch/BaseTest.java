package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

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
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.close();
		}else if(p.getProperty(browser).equals("firefox")) {
			
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"d:\\firefoxlog.txt");//or "null instead of creating a txt file "
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
			
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile fxProfile = profile.getProfile("automationprofile");
			
			//notifications
			fxProfile.setPreference("dom.webnotifications.enabled", false);
			
			//proxy servers (data center ip address and port)
			fxProfile.setPreference("network.proxy.type", 1);
			fxProfile.setPreference("network.proxy.socks", "192.168.90.54");
			fxProfile.setPreference("network.proxy.socks_port", 1744);
			
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(fxProfile);
			
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			
		}
	}
	public static void navigateUrl(String url) {
		
		//driver.get(p.getProperty(url)); or
		driver.navigate().to(p.getProperty(url));
	}
	

}
