package Test;

import Pages.Elements;
import Utilities.MyLibrary;
import Utilities.TestBase;
import Utilities.credentials;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {

//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//      //  cannot use this main method run the code as TestNG
//    }


    /*
    when 1 class extends another 2 class, they have same before or another method , then
    2 class inside all method run first, and then run that all method in 1 class.
     */
    @BeforeMethod
    public void setUps(){

        Elements e = new Elements();
        e.loginprocess();


    }

    @Test(priority = 1)
    public void firstTest() {





    }



    @Test(priority = 5)
    public  void secondTest(){

    }

    @Test(priority = 6)
    public  void thirdTest(){

    }


}




