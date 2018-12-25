package soft.test.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import soft.test.GroupData;

public class FirsTest {
  WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  @Test
  public void testUntitledTestCase() throws Exception {

    goToGroupMenu();
    initGroupCreation();
    fillGroupForm(new GroupData("Tester", "Tester softwere", "Softwere"));
    submitGroupCreation();
    returnGroupPage();
  }

  private void returnGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  private void initGroupCreation() {
    driver.findElement(By.linkText("groups")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void goToGroupMenu() {
    driver.get("http://localhost/addressbook/group.php");
  }

  private void login(String username, String password) { //авторизация под админом
    driver.get("http://localhost/addressbook/index.php");
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  }
