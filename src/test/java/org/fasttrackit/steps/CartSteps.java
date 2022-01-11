package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.ProductPage;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;

    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }
}
