import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getnet {
	
	@Test
	public void teste() {
	    
		System.setProperty("webdriver.chrome.driver", "D:/Eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920, 1040));
	    driver.get("https://site.getnet.com.br/");	
        driver.quit();
	}

}
