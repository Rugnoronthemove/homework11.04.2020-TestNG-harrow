package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.loadproperty.LoadProperty;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    String loginPageText = loadProperty.getProperty("loginPageText");

    //TestCases
    @Test (groups = {"Regression","Sanity"})
    public void verifyClickOnLoginOrRegisterLink() {
        //click on login or register link
        homePage.clickOnLoginOrRegisterLink();
        //verify text on Login Page
        loginPage.verifyTextWelcomeGuest(loginPageText);
    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyClickOnServicesBtn() {
        //click on services button
        homePage.clickOnServicesBtn();
    }

    @Test (groups = {"Regression"})
    public void verifyElementsOnHarrowWebsiteHomePageAreDisplayed() {
        //verify service button is displayed
         homePage.isDisplayedServicesBtn();
    }

}
