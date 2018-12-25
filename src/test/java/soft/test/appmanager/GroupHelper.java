package soft.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import soft.test.model.GroupData;

public class GroupHelper extends HelperBase {
    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnGroupPage() { //возвращение к списку групп
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() { //подтверждения создания группы
        click(By.name("submit"));
    }

    public void initGroupCreation() { //открытие меню создания группы
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {  //создание группы
        type(By.name("group_name"), groupData.getName());
      type(By.name("group_header"), groupData.getHeader());
      type(By.name("group_footer"), groupData.getFooter());
    }

    public void selectDeleteGroup() { //удаление групп
        click(By.name("delete"));
    }

    public void selectGroup() { //отметить чек-бокс группы
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
