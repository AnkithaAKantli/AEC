import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.WebDiverManager;
import org.openqa.selenium.support.ui.Select;

public class App6 {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromeDriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        // driver.findElement(By.name("fname")).sendKeys("Ankitha");
        // driver.findElement(By.name("lname")).sendKeys("Kantli");
        // driver.findElement(By.className("city")).sendKeys("Bangalore");
        WebElement sElement=driver.findElement(By.id("course"));
        Select select=new Select(sElement);
        select.selectByValue("java");
        WebElement sElement1=driver.findElement(By.id("ide"));
        Select select1=new Select(sElement1);
        select1.selectByValue("ec");
        select1.selectByValue("ij");
        List<WebElement> selected=select1.getAllSelectedOptions();
        for(WebElement webelement:selected){
            System.out.println(webelement.getText());
        }
        Thread.sleep(2000);
        driver.quit();
        // driver.navigate().back();
        // driver.navigate().forward();
    }
}