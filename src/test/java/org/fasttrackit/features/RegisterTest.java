package org.fasttrackit.features;

import org.junit.Test;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithRandomCredentials(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.completeRegisterFieldsRandomly();
        registerSteps.clickNewsletterButton();
        registerSteps.clickRegisterButton();
        registerSteps.checkUserRegitered("Thank you for registering with Madison Island.");
    }
}
