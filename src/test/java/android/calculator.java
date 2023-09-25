package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;



public class calculator {

	public static AndroidDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("PlatformName", "Android");
capabilities.setCapability("PlatformVersion", "12");
//capabilities.setCapability("udid", "57a72215");
capabilities.setCapability("deviceName", "V2029");
capabilities.setCapability("appPackage", "com.android.bbkcalculator");
capabilities.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
capabilities.setCapability("automationName", "Uiautomator2");

URL url = new URL("http://localhost:4723");

driver = new AndroidDriver(url,capabilities);
driver.activateApp("com.android.bbkcalculator");

WebElement el1 =  driver.findElement(AppiumBy.accessibilityId("7"));
el1.click();
WebElement el2 = driver.findElement(AppiumBy.accessibilityId("加"));
el2.click();
WebElement el3 = driver.findElement(AppiumBy.accessibilityId("1"));
el3.click();
WebElement el4 = driver.findElement(AppiumBy.accessibilityId("7"));
el4.click();
WebElement el5 = driver.findElement(AppiumBy.accessibilityId("等于"));
el5.click();

String Output = driver.findElement(By.id("com.android.bbkcalculator:id/input_edit")).getText();

System.out.println("Your answer is :"+ Output);

	}

}
