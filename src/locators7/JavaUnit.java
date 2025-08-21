package locators7;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JavaUnit {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test1() {
		driver.get("https://www.Zomato.com");

	}
	@Test
	void test2() throws InterruptedException {
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
	}
	@Test
	void test3() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}
	@Test
	void test4() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}
	@Test
	void test5() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
	}
	@Test
	void test6() throws InterruptedException {
		driver.get("https://www.X.com");
		Thread.sleep(2000);
	}

}


