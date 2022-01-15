package org.fasttrackit.features;


import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.executeSearch("dress");
        searchSteps.addProductToCart();
        searchSteps.executeSearch("dress");
        searchSteps.addSecondProductToCart();
        searchSteps.executeSearch("dress");
        searchSteps.addThirdProductToCart();
        cartSteps.assertThreeItemsInCart();
        cartSteps.navigateToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }
}
