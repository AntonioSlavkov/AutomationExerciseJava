package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.JeansLocators;
import lombok.AllArgsConstructor;
import org.testng.Reporter;

@AllArgsConstructor
public class Jeans {

    private Common common;

    public void clickAddToCartSoftStretchJeans() {
        String softStretchJeansLocator = JeansLocators.SOFT_STRETCH_JEANS;
        Reporter.log("Soft Stretch Jeans locator: " + softStretchJeansLocator, true);
        this.common.clickElement(softStretchJeansLocator);
    }

    public void clickAddToCartRegularFitStraightJeans() {
        String regularFitStraightJeansLocator =  JeansLocators.REGULAR_FIT_STRAIGHT_JEANS;
        Reporter.log("Regular fit straight Jeans locator: " + regularFitStraightJeansLocator, true);
        this.common.clickElement(regularFitStraightJeansLocator);
    }

    public void clickAddToCartGruntBlueSlimFitJeans() {
        String blueSlimFitJeansLocator = JeansLocators.GRUNT_BLUE_SLIM_FIT_JEANS;
        Reporter.log("Slim fit jeans locator: " + blueSlimFitJeansLocator, true);
        this.common.clickElement(blueSlimFitJeansLocator);
    }

}
