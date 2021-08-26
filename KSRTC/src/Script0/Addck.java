package Script0;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addck {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try{
			File file = new File("C:\\Users\\priteeshrikri.bidwa\\OneDrive - HCL Technologies Ltd\\Desktop\\Reports\\Cookies4.data");							
			//file.createNewFile();
        FileReader fileReader = new FileReader(file);							
        BufferedReader Buffreader = new BufferedReader(fileReader);							
        String strline;			
        while((strline=Buffreader.readLine())!=null){									
        StringTokenizer token = new StringTokenizer(strline,";");									
        while(token.hasMoreTokens()){					
        String name = token.nextToken();					
        String value = token.nextToken();					
        String domain = token.nextToken();					
        String path = token.nextToken();					
        Date expiry = null;					
        		
        String val;			
        if(!(val=token.nextToken()).equals("null"))
		{		
        	expiry = new Date(val);					
        }		
        Boolean isSecure = new Boolean(token.nextToken()).								
        booleanValue();		
        
        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
        System.out.println(ck);
        driver.manage().deleteCookie(ck);
        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
        }}}		
          		
        catch(Exception ex){					
        ex.printStackTrace();			
        }		
        driver.get("https://ksrtc.in/oprs-web/login/show.do");
	}}
	


