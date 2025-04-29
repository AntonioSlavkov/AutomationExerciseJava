package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.CategoryLocators;
import lombok.AllArgsConstructor;
import org.testng.Reporter;

@AllArgsConstructor
public class Category {

    private Common common;

    public void clickMen() {
        String menLocator = CategoryLocators.MEN;
        Reporter.log("Men locator: " + menLocator, true);
        this.common.clickElement(menLocator);
    }

    public void clickJeans() {
        String jeansLocator = CategoryLocators.JEANS;
        Reporter.log("Jeans locator: " + jeansLocator, true);
        this.common.clickElement(jeansLocator);
    }
}
