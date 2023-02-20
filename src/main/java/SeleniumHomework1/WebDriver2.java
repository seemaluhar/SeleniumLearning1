package SeleniumHomework1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\software\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://demo.nopcommerce.com/");
    }
}
