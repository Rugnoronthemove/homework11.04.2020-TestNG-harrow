package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {

    //list of elements and their locations
    By loginOrRegisterLink = By.xpath("//span[@class='icon-fallback']");
    By servicesBtn = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    //methods performing actions on elements
    public void clickOnLoginOrRegisterLink() {
        clickOnElement(loginOrRegisterLink);
    }


    public void clickOnServicesBtn() {
        clickOnElement(servicesBtn);
    }


    public boolean isDisplayedServicesBtn() {
        return elementIsDisplayed(servicesBtn);
    }

}
