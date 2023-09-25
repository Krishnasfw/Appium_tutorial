package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class youtube {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, Throwable {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("PlatformName", "Android");
		capabilities.setCapability("PlatformVersion", "12");
		capabilities.setCapability("udid", "57a72215");
		capabilities.setCapability("deviceName", "V2029");
		capabilities.setCapability("appPackage", "com.google.android.youtube");
		capabilities.setCapability("appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
		capabilities.setCapability("automationName", "Uiautomator2");

		URL url = new URL("http://localhost:4723");

		
		driver = new AndroidDriver(url,capabilities);
		driver.activateApp("com.google.android.youtube");
		Thread.sleep(5000);
			

	}

}
