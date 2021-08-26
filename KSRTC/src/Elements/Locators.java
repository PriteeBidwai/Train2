package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	
	
@FindBy(id="userName")
public static WebElement email;

 @FindBy(id="password")
public static WebElement Pass;
 
 
 @FindBy(id="submitBtn")
 public static WebElement submit;



	//public static WebElement email(WebDriver w) {
	//	return w.findElement(By.id("userName"));

	//}
	
	//public static WebElement Pass(WebDriver w) {
	//	return w.findElement(By.id("password"));
		
		
	//}
	
//public static WebElement submit(WebDriver w) {
//	return w.findElement(By.id("submitBtn"));
	
}
//}
