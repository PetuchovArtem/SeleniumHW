package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class TVPage extends PageObject {


    private final static By SamsungSwitch = By.xpath("//span[@class=\"schema-filter__checkbox-text\" and contains(text(),'Samsung')]/parent::label[@class=\"schema-filter__checkbox-item\"]");
    private final static By SonySwitch = By.xpath("//span[@class=\"schema-filter__checkbox-text\" and contains(text(),'Sony')]/parent::label[@class=\"schema-filter__checkbox-item\"]");
    private final static By SonyItem = By.xpath("//span[@data-bind=\"html: product.extended_name || product.full_name\"]");


    public TVPage clickSamsungSwitch() {
        find(SamsungSwitch).click();
        return this;
    }

    public TVPage clickSonySwitch() {
        find(SonySwitch).click();
        return this;
    }

    public String getItemName(){
        return find(SonyItem).getText();
    }

    public boolean checkSamsungSwitch() {
        return find(SamsungSwitch).isEnabled();
    }

    public boolean checkSonySwitch() {
        return find(SonySwitch).isEnabled();
    }


}
