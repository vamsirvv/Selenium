import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URL;
public class Appium {
	public static void main(String[] args) throws MalformedURLException{
     AppiumDriver<MobileElement> driver;
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "9.0");
       //dc.setCapability("app", "C:/Users/Vamsi Mohan/IdeaProjects/FirstAutomationTest/src/test/DemoApp.apk");
        dc.setCapability("deviceName", "Redmi Y3");
        dc.setCapability("udid", "acf0dda5");
        dc.setCapability("appPackage","com.miui.calculator");
        dc.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
        dc.setCapability("automationName", "UiAutomator2");
        driver = new AppiumDriver<MobileElement>(url,dc);
    }
	
}