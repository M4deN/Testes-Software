import static org.junit.jupiter.api.Assertions.*;

import java.awt.Checkbox;
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
import org.junit.jupiter.api.Test;

class ComprasTest {

private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    @BeforeEach
    public void beforeEach() {
    	driver.get("https://andreendo.github.io/sample-ui-compras/example.html");
    }
    @AfterAll
    public static void afterAll() {
    	driver.close();
    }
   @Test
    void testUmProduto() {
    	driver.findElement(By.name("produto")).sendKeys("Arroz");
		driver.findElement(By.name("quantidade")).sendKeys("5");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
		assertEquals("Lista de compras",driver.findElement(By.xpath("//*[@id=\"root\"]/div/h1")).getText());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/button")).click();
		assertEquals("Criar uma lista de compras",driver.findElement(By.xpath("//*[@id=\"root\"]/div/h1")).getText());
		
    }
	@Test
	void testGerarListaApagarLista() {
		driver.findElement(By.name("produto")).sendKeys("Arroz");
		driver.findElement(By.name("quantidade")).sendKeys("5");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("Feijão");
		driver.findElement(By.name("quantidade")).sendKeys("3");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("Sal");
		driver.findElement(By.name("quantidade")).sendKeys("2");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("óleo");
		driver.findElement(By.name("quantidade")).sendKeys("6");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("óleo");
		driver.findElement(By.name("quantidade")).sendKeys("6");
		driver.findElement(By.id("prod3")).click();
		
		driver.findElement(By.name("produto")).sendKeys("Arroz");
		driver.findElement(By.name("quantidade")).sendKeys("5");
		driver.findElement(By.id("prod0")).click();
		
		assertEquals("removerFeijão - 3",driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/ul/li[1]")).getText());
		assertEquals("removerSal - 2",driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/ul/li[2]")).getText());
	}
	
	@Test
	void test3Produtos() {
		driver.findElement(By.name("produto")).sendKeys("Arroz");
		driver.findElement(By.name("quantidade")).sendKeys("5");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("Feijão");
		driver.findElement(By.name("quantidade")).sendKeys("3");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		
		driver.findElement(By.name("produto")).sendKeys("Sal");
		driver.findElement(By.name("quantidade")).sendKeys("2");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
	
		assertEquals("3 itens a comprar",driver.findElement(By.xpath("//*[@id=\"root\"]/div/h2")).getText());
		driver.findElement(By.id("Feijão:3")).click();
		
		assertEquals("Feijão -- 3",driver.findElement(By.xpath("//*[@id=\"root\"]/div/ol/li[2]")).getText());
		
	}

}
