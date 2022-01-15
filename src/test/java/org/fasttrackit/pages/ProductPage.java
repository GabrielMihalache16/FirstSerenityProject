package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".is-media:first-child")
    private WebElementFacade selectFirstRowFirstOption;

    @FindBy(css = ".is-media:nth-child(2)")
    private WebElementFacade selectFirstRowSecondOption;

    @FindBy(css = ".is-media:nth-child(3)")
    private WebElementFacade selectFirstRowThirdOption;

    @FindBy(css = "[id*=\"_size\"]>li:first-child")
    private WebElementFacade selectSecondRowFirstOption;

    @FindBy(css = "[id*=\"_size\"]>li:nth-child(2)")
    private WebElementFacade selectSecondRowSecondOption;

    @FindBy(css = "[id*=\"_size\"]>li:nth-child(3)")
    private WebElementFacade selectSecondRowThirdOption;

    @FindBy(css = "ul[id*=\"_size\"]")
    private List<WebElementFacade> secondRowOptionList;

    @FindBy(css = "#configurable_swatch_size>li:first-child.not-available")
    private WebElementFacade selectSecondRowFirstOptionNotAvailable;

    @FindBy(css = "#configurable_swatch_size>li:nth-child(2).not-available")
    private WebElementFacade selectSecondRowSecondOptionNotAvailable;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void clickSelectFirstRowOption(){
        clickOn(selectFirstRowFirstOption);
    }
    public void clickSelectFirstRowSecondOption(){
        clickOn(selectFirstRowSecondOption);
    }
    public void clickSelectFirstRowThirdOption(){
        clickOn(selectFirstRowThirdOption);
    }
    public void clickSelectSecondRowFirstOption(){
        clickOn(selectSecondRowFirstOption);
    }
    public void clickSelectSecondRowSecondOption(){
        clickOn(selectSecondRowSecondOption);
    }
    public void clickSelectSecondRowThirdOption(){
        clickOn(selectSecondRowThirdOption);
    }

    public void selectSecondRowOption(){
        for(WebElementFacade element : secondRowOptionList){
//            if(selectSecondRowFirstOptionNotAvailable.isPresent() && selectSecondRowSecondOptionNotAvailable.isPresent()){
//                clickSelectSecondRowThirdOption();
//            }
            if (selectSecondRowFirstOptionNotAvailable.isPresent()){
                clickSelectSecondRowSecondOption();
            }
            else clickSelectSecondRowFirstOption();
        }
    }




}
