package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.CartLocators;
import lombok.AllArgsConstructor;
import org.testng.Assert;
import org.testng.Reporter;

@AllArgsConstructor
public class Cart {
    private Common common;

    public void validateDescription(String index, String expectedDescription) {
        String descriptionLocator = CartLocators.DESCRIPTION + "[" + index + "]";
        Reporter.log("Description locator: " + descriptionLocator, true);

        String actualDescription = this.common.getTextFromLocator(descriptionLocator).trim();
        Reporter.log("Description: " + actualDescription, true);

        Assert.assertEquals(actualDescription, expectedDescription, "Actual description: " + actualDescription + "\nExpected: " + expectedDescription);
    }

    public void validatePrice(String index, String expectedPrice) {
        String priceLocator = CartLocators.PRICE + "[" + index + "]";
        Reporter.log("Price locator: " + priceLocator, true);

        String actualPrice = this.common.getTextFromLocator(priceLocator).trim();
        Reporter.log("Price: " + actualPrice, true);

        Assert.assertEquals(actualPrice, expectedPrice, "Actual price: " + actualPrice + "\nExpected: " + expectedPrice);
    }

    public void validateQuantity(String index, String expectedQuantity) {
        String quantityLocator = CartLocators.QUANTITY + "[" + index + "]";
        Reporter.log("Quantity locator: " + quantityLocator, true);

        String actualQuantity = this.common.getTextFromLocator(quantityLocator).trim();
        Reporter.log("Quantity: " + actualQuantity, true);

        Assert.assertEquals(actualQuantity, expectedQuantity, "Actual quantity: " + actualQuantity + "\nExpected: " + expectedQuantity);
    }

    public void validateTotal(String index, String expectedTotal) {
        String totalLocator = CartLocators.TOTAL + "[" + index + "]";
        Reporter.log("Total locator: " + totalLocator, true);

        String actualTotal = this.common.getTextFromLocator(totalLocator).trim();
        Reporter.log("Total: " + actualTotal, true);

        Assert.assertEquals(actualTotal, expectedTotal, "Actual total: " + actualTotal + "\nExpected: " + expectedTotal);
    }


    public void validateJeans(String index, String expectedDescription, String expectedPrice, String expectedQuantity, String expectedTotal) {
        validateDescription(index, expectedDescription);
        validatePrice(index, expectedPrice);
        validateQuantity(index, expectedQuantity);
        validateTotal(index, expectedTotal);
    }
}
