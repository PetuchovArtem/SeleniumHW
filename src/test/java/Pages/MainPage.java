package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class MainPage extends PageObject{

    private final static By TvButton = By.xpath("//span[@class=\"project-navigation__sign\" and contains(text(),'Телевизоры')]");

    public MainPage clickTvButton(){
        find(TvButton).click();
        return this;
    }

}
