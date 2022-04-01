import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintro {
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\tools\\msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\selenium 3.5.0\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
	}
}
