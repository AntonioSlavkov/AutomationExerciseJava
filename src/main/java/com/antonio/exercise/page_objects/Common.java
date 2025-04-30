package com.antonio.exercise.page_objects;
import lombok.AllArgsConstructor;
import org.testng.Reporter;
import com.microsoft.playwright.Page;

@AllArgsConstructor
public class Common {

    private Page page;

    public void navigateTo(String url) {
        Reporter.log("Navigating to " + url);
        this.page.navigate(url);
    }

    public void clickElement(String locator) {
        this.page.click(locator);
    }

    public String getTextFromLocator (String locator) {
       return this.page.textContent(locator);
    }


}
