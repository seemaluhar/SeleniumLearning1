package SeleniumHomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\software\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");

    }
}
