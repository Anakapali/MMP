package org.iit.mmp.mmmpproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    

   public static void main(String[] args) {
	   
	   WebDriverManager.chromedriver().setup();
	
	   WebDriver driver =new ChromeDriver();
	   driver.get("https://www.google.com");
	   System.out.println(driver.getTitle());
	 
}
    
}
