package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void completeRegisterFieldsRandomly(){
        String firstName = randomAlphabetic(3, 10);
        String middleName = randomAlphabetic(3, 10);
        String lastName = randomAlphabetic(3, 10);
        String email = randomAlphabetic(3, 10);
        String pass = randomAlphabetic(6, 10);
        String confPass = pass;
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAddressField(email);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmPasswordField(confPass);
    }

    @Step
    public void checkUserRegitered(String mesaj){
        myAccountPage.checkUserRegitered(mesaj);
    }

    @Step
    public void clickNewsletterButton(){
        registerPage.clickNewsletterButton();
    }

    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void doRegister(String firstName, String middleName, String lastName, String email, String pass, String confPass){
        navigateToHomePage();
        navigateToRegisterPage();
        completeRegisterFieldsRandomly();
        clickRegisterButton();
    }
}
