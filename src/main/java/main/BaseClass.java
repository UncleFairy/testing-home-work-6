package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public Properties properties;

    public WebDriver initializeDriver() throws IOException {
        properties = new Properties();
        FileInputStream file = new FileInputStream("src" + File.separator + "main" + File.separator + "resources" + File.separator + "data.properties");

        properties.load(file);

        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:" + File.separator + "drivers" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("WebDriver.gecko.driver", "C:" + File.separator + "drivers" + File.separator + "geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("opera")) {
            System.setProperty("webdriver.opera.driver", "C:" + File.separator + "drivers" + File.separator + "operadriver.exe");
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
