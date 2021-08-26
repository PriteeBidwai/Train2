package Script0;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
		WebDriver r;
		r = new ChromeDriver();

		// r.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		r.get("https://ksrtc.in/oprs-web/user/add.do");

		r.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pritsbidwai@gmail.com");

		r.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("PriteeB");

		r.findElement(By.id("mobileNo")).sendKeys("7020963797");
		r.findElement(By.xpath("//*[@id=\"userProfileForm\"]/div/div/div/div/div/div[4]/input")).click();

	}

}
