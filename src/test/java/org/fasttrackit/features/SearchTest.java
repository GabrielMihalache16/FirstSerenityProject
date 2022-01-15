package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchTest(){
        searchSteps.executeSearch("necklace");
        searchSteps.compareSearchResultToResult("SILVER DESERT NECKLACE");
        searchSteps.findAndOpenProduct("SILVER DESERT NECKLACE");
    }

    @Test
    public void searchByPrice(){
        searchSteps.executeSearch("linen");
        searchSteps.filterByPrice();
        searchSteps.assertPriceAscending();
    }
}
