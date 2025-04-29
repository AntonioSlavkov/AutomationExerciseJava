package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.HeaderLocators;
import lombok.AllArgsConstructor;
import org.testng.Reporter;

@AllArgsConstructor
public class HeaderPage {

    private Common common;

    public void navigateToCart() {
        String cartLocator = HeaderLocators.CART;
        Reporter.log("Cart: " + cartLocator, true);
        this.common.clickElement(cartLocator);
    }
}
