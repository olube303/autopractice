package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverHelpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks extends WebDriverHelpers {

    private WebDriverHelpers webDriverHelpers;
    private Properties prop;

    public Hooks(WebDriverHelpers driverHelpers){
        this.webDriverHelpers = driverHelpers;
    }

    public void initialisation() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:/AutomationTest//src//main//resources//configuration//dev_env_Config.Properties");

        prop.load(fis);

        String path = System.getProperty("user.dir");
        System.setProperty("webDriver.chrome.driver", path+ "Tools/Chromedriver.exe" );
        webDriverHelpers.driver = new ChromeDriver();
        webDriverHelpers.driver.get(  prop.getProperty("url"));
        webDriverHelpers.driver.manage().window().maximize();
        webDriverHelpers.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void tearDown(){
        webDriverHelpers.driver.quit();
    }
}
