import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverHandler {
    public static WebDriver driver=null;

    public void initiatDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\zkadouri\\Desktop\\chromedriver1.exe");
        driver = new ChromeDriver();
        driver.get("https://nfr_staffbaugmentation.everis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void closeDriver()
    {
        driver.close();
    }

    public void openUrl(String url)
    {
        driver.get(url);
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public Object switchTo() {
        // TODO Auto-generated method stub
        return null;
    }
}

