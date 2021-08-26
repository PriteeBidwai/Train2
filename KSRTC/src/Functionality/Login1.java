package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.Locators;

public class Login1 {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver w;
		w= new ChromeDriver();

		w.get("https://ksrtc.in/oprs-web/login/show.do");
		
		PageFactory.initElements(w, Locators.class);
		
		Locators.email.sendKeys("pritsbidwai@gmail.com");
		Locators.Pass.sendKeys("Pritee@123");
		Locators.submit.click();
		
		
		
	//Locators.email(w).sendKeys("pritsbidwai@gmail.com");
	//	Locators.Pass(w).sendKeys("Pritee@123");
		
		//Locators.submit(w).click();
		
	}

}
