package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing{
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	// <-- Change this path
       WebDriver driver = new ChromeDriver();
       String baseUrl = "https://www.thecloudtrain.com";
       String expectedTitle = "DevOps Workshop | Cloudtrain";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Website Title Expected: "+ expectedTitle);
           System.out.println("Website Title Actual: "+ actualTitle);
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("Website Title Expected: "+ expectedTitle);
           System.out.println("Website Title Actual: "+ actualTitle);
           System.out.println("TEST FAILED");
       }
       driver.close();
   }
}