package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.print("Hello WOrld");
			WebDriver driver; 
			System.setProperty("webdriver.firefox.marionette","C:\\ccc\\seleniumsetup\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("http://demo.guru99.com/selenium/deprecated.html");
			driver.get("https://freecrm.co.in/");
			Thread.sleep(5000);
			driver.findElement(By.xpath(("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']"))).click();
	}

}

