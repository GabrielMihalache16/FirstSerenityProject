package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".category-products > .toolbar .sorter select")
    private WebElementFacade priceFilter;

    @FindBy(id = "msrp-click-553XN1g37Zkbkr9i9suKz6g")
    private WebElementFacade clickForPrice;

    @FindBy (id = "product-collection-image-553")
    private WebElementFacade clickOnProduct;

    @FindBy (id = "product-price-421")
    private WebElementFacade knitTopPrice;

    @FindBy (id = "product-price-406")
    private WebElementFacade linenBlazer;

    @FindBy (css = ".products-grid > li:first-of-type [title=\"View Details\"]")
    private WebElementFacade firstItemViewDetails;

    @FindBy (css = ".products-grid > li:nth-child(2) [title=\"View Details\"]")
    private WebElementFacade secondItemViewDetails;

    @FindBy (css = ".products-grid > li:nth-child(3) [title=\"View Details\"]")
    private WebElementFacade thirdItemViewDetails;


    public void clickOnProduct(){
        clickOn(clickOnProduct);
    }

    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }

    public boolean compareSearchResultToResult(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    public void filterByPrice(){
        Select optiuni = new Select(priceFilter);
        optiuni.selectByVisibleText("Price");
    }


    public void priceIsAscending() {
        int a = getIntFromPrice(knitTopPrice.getText());
        int b = getIntFromPrice(linenBlazer.getText());
        Assert.assertTrue("Ascending price is correct.", a < b);
    }

    public void clickOnFirstViewDetails(){
        clickOn(firstItemViewDetails);
    }
    public void clickOnSecondViewDetails(){
        clickOn(secondItemViewDetails);
    }
    public void clickOnThirdViewDetails(){
        clickOn(thirdItemViewDetails);
    }
}
