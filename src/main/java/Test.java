import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=null;
        String chromeDriver = "C:\\Users\\zkadouri\\Desktop\\chromedriver_win32\\chromedriver.exe";
        String fireFoxDriver = "C:\\Users\\zkadouri\\Desktop\\geckodriver-v0.31.0-win64\\geckodriver.exe" ;
        String url = "https://www.hyrtutorials.com/p/add-padding-to-containers.html" ;
        String message = "Site Web a été ouvert avec succès" ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser GC ou FF ou IE :");
        String browser = sc.next();



        driver.get(url);
        driver.manage().window().maximize();
        System.out.println(message);
        Thread.sleep(5000);
        driver.close();


    }
}
