package Fangfa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by ZCP on 2018/9/6.
 */
public class TestFangFa {
    public static WebDriver driver;
    public static void Before(){
        System.setProperty("webdriver.chrome.driver","D:\\app\\chromedriver.exe");
        driver=new ChromeDriver();
    }
//    输入网址
    public static void GetUrl(String Url){
        driver.navigate().to(Url);
    }
    public  static void Afer(){
        driver.quit();
    }

}
