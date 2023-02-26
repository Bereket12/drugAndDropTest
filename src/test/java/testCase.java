import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class testCase {
private static WebDriver driver;
HomePage homePage;
LoginPage loginPage;
@BeforeClass
public void DrugAndDrop() {

 driver = new ChromeDriver();
driver.get("https://www.facebook.com");
loginPage = new LoginPage(driver);
}
@Test
 public void loginToFb(){
loginPage.enterUserName("username");
loginPage.enterPassword("password");
}
}
