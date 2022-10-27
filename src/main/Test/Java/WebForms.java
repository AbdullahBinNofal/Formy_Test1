import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForms extends PageObject{
    private final String First_Name = "First Name";
    private final String Last_Name = "Last Name";

    private final String Date_Picker = "50/3/2030";

    private final String Value = "10";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "datepicker")
    private WebElement date_picker;

    @FindBy(id = "select-menu")
    private WebElement select_Menu;

    @FindBy(xpath = "//a[contains(text(), 'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForms(WebDriver driver){
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(First_Name);
    }

    public void enterLastName(){
        this.last_name.sendKeys(Last_Name);
    }

    public void enterDate(){
        this.date_picker.sendKeys(Date_Picker);
    }

    public void chooseOption(){
        this.select_Menu.sendKeys(Value);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void verifyTestPlan(){
        this.alertSuccess.isDisplayed();
    }
}
