package noCRM_testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Team1_TCs
{
    WebDriver driver;

    @BeforeEach
    public void setup()
    {


        String mySo = System.getProperty("os.name");

        if(mySo.equals("Windows 10"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://todo.ly/");
        }else
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://todo.ly/");
        }
    }

    @AfterEach
    public void cleanup()
    {
        driver.quit();
    }

    @Test
    public void test()
    {
        System.out.println("no rompe");
    }
}
