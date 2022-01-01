package comfb.utilits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
     WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	public void maxi() {
		driver.manage().window().maximize();
	}
	
	public void iwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	public void type(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void tap(WebElement element) {
		element.click();
	}
	public void close() {
		
		driver.close();
		
		
	}
	public String elementText(WebElement element) {
		String text = element.getText();
		return text;
	}
}
