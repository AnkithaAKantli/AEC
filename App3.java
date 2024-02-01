import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ankitha A Kantli\\Desktop\\aaae\\software\\src\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement usernameBox = driver.findElement(By.name("username")); 
        usernameBox.sendKeys("1NT21CS035");
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("Amarjaya@17");
        WebElement searchButton=driver.findElement(By.id("loginbtn"));
        searchButton.submit();
        Thread.sleep(10000);
        driver.quit();
    }
}
