package com.antonio.exercise.locators;

public interface CartLocators {

    String DESCRIPTION = "(//td[contains(@class, 'cart_description')]//h4//a)";
    String PRICE = "(//td[contains(@class, 'cart_price')]//p)";
    String QUANTITY = "(//td[contains(@class, 'cart_quantity')]//button)";
    String TOTAL = "(//td[contains(@class, 'cart_total')]//p)";
}
