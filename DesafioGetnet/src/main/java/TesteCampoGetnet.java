import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoGetnet {
  
	
	@Test
	public void testeDesafio() {
		

		System.setProperty("webdriver.chrome.driver", "D:/Eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920, 1040));
		driver.get("https://site.getnet.com.br/");	
        System.out.println(driver.getTitle());
        Assert.assertEquals("Getnet: Maquininhas de Cartão e Soluções para o seu Negócio", driver.getTitle());
        driver.findElement(By.id("search-trigger")).click();
        driver.findElement(By.id("global-search-input")).click();
        driver.findElement(By.id("global-search-input")).sendKeys("superget");
        driver.findElement(By.className("o-btn o-btn--cor-roxo-borda c-search-box__button")).click();
        Assert.assertEquals("Como faço a portabilidade da minha maquininha?", driver.findElement(By.className("c-search-page__title")));
        driver.quit();
        
	}
}
