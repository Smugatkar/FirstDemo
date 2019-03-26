package Guru99_p1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompareTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					System.out.print("Hello WOrld");
					WebDriver driver; 
					System.setProperty("webdriver.firefox.marionette","C:\\ccc\\seleniumsetup\\geckodriver.exe");
					driver = new FirefoxDriver();
					//driver.get("http://demo.guru99.com/selenium/deprecated.html");
					driver.get("http://demo.guru99.com/test/newtours/");
					
					String actualTitle  = driver.getTitle();
					String expectedTitle = "Welcome: Mercury Tours";
					
					if(expectedTitle.contentEquals(actualTitle))
					{
						System.out.println("Test Success");
					}
					else
					{
						System.out.println("Test Fail");
					}
					
					WebElement myelement =  driver.findElement(By.linkText("SIGN-ON"));
					myelement.click();
					driver.findElement(By.name("userName")).sendKeys("Shailesh");
					driver.findElement(By.name("password")).sendKeys("12345");
					driver.findElement(By.name("submit")).click();
					//driver.close();
					//String psource  = driver.getPageSource();
					//System.out.println(psource);
					driver.navigate().back();
					
	}

}
