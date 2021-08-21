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


class SeleniumSandoboxTest {
	
private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    
    @BeforeEach
    public void beforeEach() {
    	driver.get("https://saucelabs.com/test/guinea-pig");
    }
    
  @AfterAll
    public static void afterAll() {
	  
	  driver.close();
  }
    	
    @Test
    void testClickPrimeiroLink() {
		
		driver.findElement(By.id("i am a link")).click();
		assertEquals("I am another div",driver.findElement(By.id("i_am_an_id")).getText());
		
    }
    @Test
    void testInputs() {
    	
    	driver.findElement(By.id("unchecked_checkbox")).click();
    	driver.findElement(By.id("i_am_a_textbox")).clear();
    	driver.findElement(By.name("i_am_a_textbox")).sendKeys("Alécio Leandro");
    	driver.findElement(By.name("fbemail")).sendKeys("Alexdesaran@outlook.com");
    	driver.findElement(By.name("comments")).sendKeys("Essa é uma ótima pagina para testar!!");
    	
    	assertEquals(true,driver.findElement(By.id("unchecked_checkbox")).isSelected());
    	driver.findElement(By.id("checked_checkbox")).click();
    	driver.findElement(By.id("unchecked_checkbox")).click();
    	
    	
    }
    @Test
    void tesPreencherComments() {
    	
    	driver.findElement(By.id("unchecked_checkbox")).click();
    	driver.findElement(By.id("i_am_a_textbox")).clear();
    	driver.findElement(By.name("i_am_a_textbox")).sendKeys("Alécio Leandro");
    	driver.findElement(By.name("fbemail")).sendKeys("Alexdesaran@outlook.com");
    	driver.findElement(By.name("comments")).sendKeys("Essa é uma ótima pagina para testar!!");
    	
    	assertEquals(true,driver.findElement(By.id("unchecked_checkbox")).isSelected());

       	driver.findElement(By.id("submit")).click();
       	assertEquals("Your comments: Essa é uma ótima pagina para testar!!",driver.findElement(By.id("your_comments")).getText());
    }
}
