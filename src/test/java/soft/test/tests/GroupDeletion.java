package soft.test.tests;

import org.testng.annotations.*;
import soft.test.tests.TestBase;

public class GroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {

    app.goToGroupMenu();
    app.selectGroup();
    app.selectDeleteGroup();
    app.returnGroupPage();
  }


}
