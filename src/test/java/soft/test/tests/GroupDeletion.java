package soft.test.tests;

import org.testng.annotations.*;

public class GroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationHelper().goToGroupMenu();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().selectDeleteGroup();
    app.getGroupHelper().returnGroupPage();
  }


}
