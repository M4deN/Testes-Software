import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
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

class UTFPR_LoginTest {

	private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    @BeforeEach
    public void beforeEach() {
    	driver.get("https://horde.utfpr.edu.br/login.php");
    }
    @AfterAll
    public static void afterAll() {
    	driver.close();
    }
	@Test
	void testLogin() {
		driver.findElement(By.name("horde_user")).sendKeys("Joaozinho");
		driver.findElement(By.name("horde_pass")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		
		assertEquals("A conexão falhou porque seu usuário ou senha estava incorreta.",driver.findElement(By.className("noticetext")).getText());
	}

}
