package DataPickerPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DClass {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/datepicker/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  driver.findElement(By.id("datepicker")).click();
	  
	  String eYear = "2025";
	  String eMonth = "February";
	  String eDay = "26";
	  
	  while(true) {
	     String aYear =	driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
	     String aMonth =	driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
	     if(aYear.equals(eYear) && aMonth.equals(eMonth)) {
	    	 List<WebElement> ad = driver.findElements(By.xpath("//table/tbody/tr/td"));
	    	 for(int i=0; i<ad.size(); i++) {
	    		 if((ad.get(i).getText()).equals(eDay)) {
	    			 ad.get(i).click();
	    			 break;
	    		 }
	    	 }
	    	 break;    	 
	     }
	     else {
	    	 driver.findElement(By.xpath("//a[contains(@class,'next')]")).click();
	     }  
	  }
  }
}
