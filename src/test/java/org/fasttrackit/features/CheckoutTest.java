package org.fasttrackit.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckout(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }
}
