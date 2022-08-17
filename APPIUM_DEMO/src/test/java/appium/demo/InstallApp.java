package appium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp {
	@Test
	public void installApp() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.UDID, "x4soukivqw59pnjr");
		//capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\gajes\\AppData\\Local\\Android\\Sdk\\build-tools\\30.0.3\\ApiDemos-debug.apk");

		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, capabilities);
		driver.installApp("C:\\Users\\gajes\\AppData\\Local\\Android\\Sdk\\build-tools\\30.0.3\\ApiDemos-debug.apk");
		//driver.launchApp();
		boolean value = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(value);

	}
}
