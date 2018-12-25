package soft.test.tests;

import org.testng.annotations.*;
import soft.test.model.GroupData;

public class FirsTest extends TestBase {

  @Test
  public void testCreateGroup() throws Exception { //создания группы

    app.getNavigationHelper().goToGroupMenu();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Tester", "Tester softwere", "Softwere"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnGroupPage();
  }

}
