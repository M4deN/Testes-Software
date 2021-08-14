import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class TesteSelenium {

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		var driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.google.com.br/");
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("teste de software");
		searchInput.submit();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(d -> {
			return d.getTitle().toLowerCase().startsWith("teste");
		});

		assertTrue(driver.getTitle().startsWith("teste de software"));
		driver.close();
	}
}