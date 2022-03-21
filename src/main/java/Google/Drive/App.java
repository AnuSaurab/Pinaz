package Google.Drive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 


{
	
	 ChromeDriver driver;
	 
    public static void main( String[] args )
    {
  
       
        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe" );
        
     
        
        WebDriver driver=new ChromeDriver();
     
        
                
        
        
        
        
        
        
    }

    public void login() {
    	
    	   driver.get("http://output.jsbin.com/usidix/1");
       
           driver.findElement(By.xpath("//input[@type='button']))".click();
           
           Alert xyz = driver.switchTo().alert();
           xyz.accept();
           
           driver.quit();
    	
}
		
    
    
	}
    
    
}
