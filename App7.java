import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.WebDiverManager;
public class App7 {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromeDriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parenthandle=driver.getWindowHandle();
        System.out.println("parenthandle:"+parenthandle);
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> handles=driver.getWindowHandles();
        for(String handle:handles){
            System.out.println(handle);
            if(!handle.equals(parenthandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.id("firstName")).sendKeys("Ankitha");
                Thread.sleep(5000);
                driver.close();
            }  
        }
        driver.switchTo().window(parenthandle);
        driver.findElement(By.id("name")).sendKeys("hii");
        Thread.sleep(2000);
       driver.quit();
    }
}