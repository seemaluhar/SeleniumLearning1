package SeleniumHomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class WebDriver3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\software\\Driver\\geckodriver.exe");
        WebDriver driver=  new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");




 }
}