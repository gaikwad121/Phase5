package Phase5.Lesson1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
//Register
driver.get("https://demo.wpjobmanager.com/my-account/");
driver.findElement(By.id("reg_email")).sendKeys("abishekabcd3@gmail.com");
driver.findElement(By.id("reg_password")).sendKeys("abishek1234");
driver.findElement(By.name("register")).click();
driver.findElement(By.xpath("//*[@id=\"post-65\"]/div/div/div/p[1]/a")).click();
//Login
driver.findElement(By.id("username")).sendKeys("abishekabcd2@gmail.com");
driver.findElement(By.id("password")).sendKeys("abishek123");
driver.findElement(By.name("login")).click();
}
}