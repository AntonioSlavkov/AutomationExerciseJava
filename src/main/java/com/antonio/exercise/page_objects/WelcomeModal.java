package com.antonio.exercise.page_objects;

import com.antonio.exercise.locators.WelcomeModalLocators;
import lombok.AllArgsConstructor;
import org.testng.Reporter;

@AllArgsConstructor
public class WelcomeModal {

    private Common common;

    public void clickConsent() {
        String consentLocator = WelcomeModalLocators.CONSENT;
        Reporter.log("Consent button locator: " + consentLocator, true);
        this.common.clickElement(consentLocator);
    }
}
