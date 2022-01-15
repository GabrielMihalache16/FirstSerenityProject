package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.features.BaseTest;
import org.fasttrackit.pages.BasePage;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private BaseTest baseTest;
    private CartPage cartPage;
    private CartSteps cartSteps;

    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void findAndOpenProduct(String productName){
        Assert.assertTrue(searchResultsPage.compareSearchResultToResult(productName));
        searchResultsPage.clickOnProduct();
    }

    @Step
    public void searchAndSelectProduct(String productName){
        executeSearch(productName);
        findAndOpenProduct(productName);

    }

    @Step
    public void addProductToCart(){
        searchResultsPage.clickOnFirstViewDetails();
        productPage.clickSelectFirstRowOption();
        productPage.selectSecondRowOption();
        productPage.clickAddToCartButton();
    }

    @Step
    public void addSecondProductToCart(){
        searchResultsPage.clickOnSecondViewDetails();
        productPage.clickSelectFirstRowOption();
        productPage.selectSecondRowOption();
        productPage.clickAddToCartButton();
    }

    @Step
    public void addThirdProductToCart(){
        searchResultsPage.clickOnThirdViewDetails();
        productPage.clickSelectFirstRowOption();
        productPage.selectSecondRowOption();
        productPage.clickAddToCartButton();
    }


    @Step
    public void compareSearchResultToResult(String name){
        searchResultsPage.compareSearchResultToResult(name);
    }

    @Step
    public void filterByPrice(){
        searchResultsPage.filterByPrice();
    }

    @Step
    public void assertPriceAscending(){
        searchResultsPage.priceIsAscending();
    }

}
