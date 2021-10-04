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


class CurriculumLattesTest {

	private static WebDriver driver;
	
    @BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    
    @BeforeEach
    public void beforeEach() {
    	driver.get("http://buscatextual.cnpq.br/buscatextual/busca.do?metodo=apresentar");
    }
    
    @AfterAll
    public static void afterAll() {
    	//driver.close(); COMENTEI PARA QUE A ULTIMA GUIA FOSSE ABERTA
    }
    
	@Test
	void testBuscaCurriculo() {
		driver.findElement(By.name("textoBusca")).sendKeys("André Takeshi Endo");
		driver.findElement(By.id("buscarDemais")).click();
		Select sele = new Select(driver.findElement(By.name("paisNascimento")));
		sele.selectByVisibleText("Todos");
		driver.findElement(By.id("buscarBrasileiros")).click();//CLICK ONDE EU DESMARCO A OPÇÃO DE BRASILEIROS
		driver.findElement(By.id("buscarBrasileiros")).click();//CLICK ONDE EU SELECIONO NOVAMENTE
		driver.findElement(By.id("botaoBuscaFiltros")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[4]/div/div/div/div[3]/div/div[3]/ol/li/b/a")).click();
		driver.findElement(By.id("idbtnabrircurriculo")).click();
	}
	
	@Test
	void testContato() {
		driver.findElement(By.name("textoBusca")).sendKeys("André Takeshi Endo");
		driver.findElement(By.id("buscarDemais")).click();
		Select sele = new Select(driver.findElement(By.name("paisNascimento")));
		driver.findElement(By.id("buscarBrasileiros")).click();//EU DESMARCO A OPÇÃO DE BRASILEIROS PARA VER SE FUNCIONA
		sele.selectByVisibleText("Argentina");//NÃO EXISTE A OPÇÃO BRASIL NO SELECT, POIS O MESMO JA VEM PRÉ SELECIONADO 
		//EM UM CHECKBOX SELECIONEI ARGENTINA, APENAS PARA TESTE.
		driver.findElement(By.id("botaoBuscaFiltros")).click();
		//AQUI CLICO PARA VOLTAR A UMA NOVA BUSCA
		driver.findElement(By.xpath("//*[@id=\"tit2_simples\"]/a")).click();
		driver.findElement(By.name("textoBusca")).sendKeys("André Takeshi Endo");
		driver.findElement(By.xpath("//*[@id=\"botaoBuscaFiltros\"]/span")).click();
		driver.findElement(By.xpath("/html/body/form/div/div[4]/div/div/div/div[3]/div/div[3]/ol/li/b/a")).click();
		driver.findElement(By.id("idbtnabrircurriculo")).click();
		
	}
	@Test
	void testOutrosFiltros() {
		
		driver.findElement(By.name("textoBusca")).sendKeys("André Takeshi Endo");
		driver.findElement(By.id("buscarDemais")).click();
		Select sele = new Select(driver.findElement(By.name("paisNascimento")));
		sele.selectByVisibleText("Todos");
		driver.findElement(By.id("filtro2")).click();
		Select selec = new Select(driver.findElement(By.id("nivelFormacao")));
		selec.selectByVisibleText("Graduação");
		Select sel = new Select(driver.findElement(By.id("paisFormacao")));
		sel.selectByVisibleText("Brasil");
		Select se = new Select(driver.findElement(By.id("regiaoFormacao")));
		se.selectByVisibleText("Sul");
		Select s = new Select(driver.findElement(By.id("ufFormacao")));
		s.selectByVisibleText("Paraná");
		driver.findElement(By.id("nomeInstFormacao")).sendKeys("UTFPR");
		driver.findElement(By.xpath("//a[@onClick='fecharFiltro(2)']")).click();
		
	}
}
