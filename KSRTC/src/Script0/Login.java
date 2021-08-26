package Script0;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
		WebDriver r2;
		r2 = new ChromeDriver();
		r2.manage().window().maximize();
		r2.get("https://ksrtc.in/oprs-web/login/show.do");
		
		//signin
		//r2.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/ul[1]/li[1]/a")).click();
		r2.findElement(By.id("userName")).sendKeys("pritsbidwai@gmail.com");
		r2.findElement(By.id("password")).sendKeys("Pritee@123");
		r2.findElement(By.id("submitBtn")).submit();
		
		
		//Destination
		//r2.findElement(By.linkText(" Ballari - Bengaluru")).click();		
		WebElement element1 = r2.findElement(By.id("fromPlaceName"));
		Thread.sleep(3000);
		WebElement element2 = r2.findElement(By.id("toPlaceName"));
		element1.sendKeys("Chikkamagaluru");
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);

		element2.sendKeys("ANEKAL");
		element2.sendKeys(Keys.ARROW_DOWN);
		element2.sendKeys(Keys.ENTER);
		
		
		//Selecting Destination Date
		r2.findElement(By.id("txtJourneyDate")).click();
		r2.findElement(By.linkText("26")).click();

		r2.findElement(By.id("txtReturnJourneyDate")).click();
		r2.findElement(By.linkText("27")).click();
		
				//selecting the check box.
		r2.findElement(By.id("corover-close-btn")).click();
		//driver.findElement(By.id("singleLady")).click();
		r2.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();


		

		

	}

}
