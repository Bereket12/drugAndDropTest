import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = ".//a[@beta-testid='blue_bar_profile_link']/span")
    private WebElement username;
    public String getUserName(){
        if (username.isDisplayed()){
            return username.getText();
        }else {
            return "Username is not present";
        }
    }
}
