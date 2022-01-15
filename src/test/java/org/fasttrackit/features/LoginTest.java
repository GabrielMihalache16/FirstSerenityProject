package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("gabi.mihalache16@yahoo.com","test123");
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn("Cosmin Fast");
    }

    @Test
    public void loginWithInValidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("asd@asd.asd", EnvConstants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }


}
