package locators7;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Practise_Loc {
	WebDriver driver;
	@Test
	public void locat() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("chandrika");
		//driver.findElement(By.name("input password-input")).sendKeys("vinod");
		driver.findElement(By.id("rememberme")).click();
		//driver.findElement(By.className("button button-primary button-large")).click();
		//driver.findElement(By.cssSelector("wp-login-lost-password")).click();
	}
	@Test
	public void id() {
		driver.get("https://www.amazon.com");
		//driver.findElement(By.linkText("Enter your mobile number or email address")).sendKeys("8501019696");
		//driver.findElement(By.partialLinkText("continue")).click();

	}
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();  
	}

}
