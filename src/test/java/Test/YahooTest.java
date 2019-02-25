package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest {

//public static void main(String[]args){

   // WebDriverManager.chromedriver().setup();
   // WebDriver driver=new ChromeDriver();
    //cannot use this main method run the code as TestNG.

//}

@Test(priority = 1)
    public void firstTest(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.com/");


    }
    @Test(priority = 3)
    public void secondTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");


    }

    @Test(priority = 2)
    public void thirdTest(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();

    driver.navigate().to("https://www.amazon.com/");


    //if you dont put priority keyword it will run first .





    }

    }



