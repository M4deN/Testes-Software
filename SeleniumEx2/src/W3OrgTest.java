import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class W3OrgTest {

private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
    @BeforeEach
    public void beforeEach() {
    	driver.get("https://www.w3.org/");
    }
	@Test
	void testClickAbout() {
		driver.findElement(By.xpath("//*[@id=\"w3c_main\"]/div[3]/div[2]/div[2]/h2[1]/a")).click();
	}
	@Test
	void testClickDonations() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/h2[2]/a")).click();
	}
	@Test
	void testClickW3cBlog() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/h2/a")).click();
	}
	@Test
	void testClickDevelopers() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul[4]/li[1]/a")).click();
	}
}
