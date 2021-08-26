package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class TVPage extends PageObject {



        private final static By SamsungSwitch = By.xpath("//span[@class=\"schema-filter__checkbox-text\" and contains(text(),'Samsung')]/parent::label[@class=\"schema-filter__checkbox-item\"]");

        public TVPage clickSamsungSwitch(){
            find(SamsungSwitch).click();
            return this;
        }

        public boolean checkSamsungSwitch(){
            return  find(SamsungSwitch).isEnabled();
        }



}
