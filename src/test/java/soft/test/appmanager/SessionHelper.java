package soft.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver driver) {

        super(driver);
    }
    public void login(String username, String password) { //авторизация под админом
        type(By.name("user"), username);
        type(By.name("pass"), password);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }
}
