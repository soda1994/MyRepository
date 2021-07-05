import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest {

        WebDriver wd;
        @BeforeMethod
        public void precondition(){
            wd =new ChromeDriver();
            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");


        }
        @Test
        public void about(){
            List<WebElement> list = wd.findElements(By.tagName("a"));

            int about=list.size();
            about--;

            WebElement element=list.get(about);
            element.click();

        }
    @Test
    public void home(){
        List<WebElement> list = wd.findElements(By.tagName("a"));

        int home=list.size();
        home--;



        WebElement element=list.get(home);
        element.click();

    }

        @AfterMethod
        public void postcondition(){
            wd.quit();
        }
    }
