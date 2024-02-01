import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.WebDiverManager;

public class App4 {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromeDriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("facebook");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://facebook.com");
        driver.findElement(By.name("email")).sendKeys("ankithakantli@gmail.com");
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
    }
}