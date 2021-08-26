package Script0;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	@Test
	public void test() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/login/show.do");
	driver.findElement(By.id("userName")).sendKeys("pritsbidwai@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Pritee@123");
	driver.findElement(By.id("submitBtn")).click();
	File file1=new File("C:\\Users\\priteeshrikri.bidwa\\OneDrive - HCL Technologies Ltd\\Desktop\\Reports\\cookies4.data");
	try {
	file1.createNewFile();
	FileWriter fw=new FileWriter(file1);
	BufferedWriter bw=new BufferedWriter(fw);
	
	for(Cookie ck:driver.manage().getCookies()) {
	bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
	driver.manage().addCookie(ck);
	
	bw.newLine();

	}
	bw.close();
	fw.close();
	}
	catch(Exception e) {
	System.out.println(e);
	}}}

