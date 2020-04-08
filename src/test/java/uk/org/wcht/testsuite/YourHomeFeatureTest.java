package uk.org.wcht.testsuite;

import org.junit.Assert;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.YourHomeFeaturePage;
import uk.org.wcht.testbase.TestBase;

/**
 * Created by Pradip
 */
//your home feature test extends test base class
public class YourHomeFeatureTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToYourHomeFeature() {
        //below methods calling from pages package
        homePage.clickOnYourHomeFeature();


    }

}
