import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankitha A Kantli\\Desktop\\aec\\software\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();

    }
}