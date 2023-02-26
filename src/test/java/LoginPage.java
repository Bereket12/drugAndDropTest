import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(id="email")
    private WebElement loginTextBox;
    @FindBy(id="pass")
    private WebElement passwordTextBox;
    @FindBy(xpath = ".//input[@data-testid='royal_login_button']")
    private WebElement loginBtn;
      public void enterUserName(String userName){

          if(loginTextBox.isDisplayed()){
              loginTextBox.clear();
              userName="bkimesfin12@gmail.com";
              loginTextBox.sendKeys(userName);
          }else{
              System.out.println("Element is not loaded");
          }
      }
      public void enterPassword(String password) {

          if (passwordTextBox.isDisplayed()) {
             passwordTextBox.clear();
              password="Bereket@home312";
              passwordTextBox.sendKeys(password);
          } else {
              System.out.println("Element is not loaded");
          }
      }
          public  HomePage clickLogin(){
              if (loginBtn.isDisplayed()){
                  loginBtn.click();
              }
              return new HomePage(driver);
          }

}
