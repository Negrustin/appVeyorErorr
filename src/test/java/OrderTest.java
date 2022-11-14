import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class OrderTest {
//    private WebDriver driver;
//    @BeforeAll
//    static void setupAll() {
//   WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\task2-2\\chromedriver.exe");
//    }

//   @BeforeEach
//    void createBrowser() {
//        driver = new ChromeDriver();
//    }

    @Test
    void orderTest() {
        open("http://localhost:9999/");
        $("[data-test-id=\"name\"] input").sendKeys("Лапенко Антон");
        $("[data-test-id=\"phone\"] input").sendKeys("+79998887766");
        $("[data-test-id=\"agreement\"] span").click();
        $(By.className("button")).click();
        $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

  //  @AfterEach
    //void tearDown() {
      //  driver.quit();
        //driver = null;

    //}
}
