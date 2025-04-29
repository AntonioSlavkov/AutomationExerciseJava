package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.ConfirmationModalLocators;
import lombok.AllArgsConstructor;
import org.testng.Reporter;

@AllArgsConstructor
public class ConfirmationModal {

    private Common common;

    public void clickContinueShopping() {
        String continueShoppingButtonLocator = ConfirmationModalLocators.CONTINUE_SHOPPING;
        Reporter.log("Continue Shopping button locator: " + continueShoppingButtonLocator, true);
        this.common.clickElement(continueShoppingButtonLocator);
    }
}
