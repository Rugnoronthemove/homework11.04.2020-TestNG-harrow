package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class LoginPage extends Utility {

    //list of elements and their locations
    By welcomeText = By.xpath("//li[@class='navbar-text myprofile_salutation']");

    //methods performing actions on elements
    public void verifyTextWelcomeGuest(String str) {
        verifyTextAssertMethod(welcomeText, str);
    }

}
