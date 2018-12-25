package soft.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupMenu() {  //переход в меню группы
      click(By.linkText("groups"));
    }
}
