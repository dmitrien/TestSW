package soft.test.tests;

import org.testng.annotations.*;
import soft.test.model.GroupData;

public class FirsTest extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception { //создания группы

    app.goToGroupMenu();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Tester", "Tester softwere", "Softwere"));
    app.submitGroupCreation();
    app.returnGroupPage();
  }

}
