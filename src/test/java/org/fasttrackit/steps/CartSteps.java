package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    private ProductPage productPage;


    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void navigateToCart() {
        homePage.clickOnCartIcon();
        homePage.clickOnViewShoppingCartLink();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }

    @Step
    public void assertThreeItemsInCart(){
        Assert.assertTrue(cartPage.isThirdItemInCartDisplayed());
    }

}

