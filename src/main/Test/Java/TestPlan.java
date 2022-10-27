import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.Chrome_Driver_Location);
    }

    @Test(testName = "Submit a Web form")
    public static void submitForm(){
        driver.get(Utils.Base_URL);
        WebForms webForms = new WebForms(driver);
        webForms.enterFirstName();
        webForms.enterLastName();
        webForms.enterDate();
        webForms.chooseOption();
        webForms.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS);
        webForms.verifyTestPlan();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

