import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

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

class CalculadoraTest {
	
	private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
    @BeforeEach
    public void beforeEach() {
    	driver.get("https://andreendo.github.io/sample-ui-compras/index-2.html");
    }
	@Test
	void testLimparCampos() {
		
		driver.findElement(By.name("nome")).sendKeys("Alécio");
		driver.findElement(By.name("idade")).sendKeys("26");
		driver.findElement(By.name("salario")).sendKeys("10000");
		Select sele = new Select(driver.findElement(By.name("sexo")));
		sele.selectByVisibleText("masculino");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		
		assertEquals("",driver.findElement(By.name("nome")).getText());
	}
	@Test
	void testCalculoImpostoMenosQue5000() {

		driver.findElement(By.name("nome")).sendKeys("Alécio");
		driver.findElement(By.name("idade")).sendKeys("26");
		driver.findElement(By.name("salario")).sendKeys("3000");
		Select sele = new Select(driver.findElement(By.name("sexo")));
		sele.selectByVisibleText("masculino");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		
		assertEquals("Valor a pagar de imposto: 450",driver.findElement(By.id("divValorImposto")).getText());
	}
	@Test
	void testCalculoImpostoMaiorQue5000() {
	
		driver.findElement(By.name("nome")).sendKeys("Alécio");
		driver.findElement(By.name("idade")).sendKeys("26");
		driver.findElement(By.name("salario")).sendKeys("10000");
		Select sele = new Select(driver.findElement(By.name("sexo")));
		sele.selectByVisibleText("masculino");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		
		assertEquals("Valor a pagar de imposto: 2500",driver.findElement(By.id("divValorImposto")).getText());
	}

}
