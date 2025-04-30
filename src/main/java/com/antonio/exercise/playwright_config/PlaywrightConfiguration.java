package com.antonio.exercise.playwright_config;

import com.antonio.exercise.exceptions.InvalidBrowserType;
import com.microsoft.playwright.*;
import lombok.Getter;

public class PlaywrightConfiguration {

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    @Getter
    Page page;

    public void initializePlaywrightConfiguration(String browser) throws InvalidBrowserType {
        boolean headless = false;

        this.playwright = Playwright.create();

        switch (browser) {
            case "chromium":
                this.browser = playwright.chromium().launch(new BrowserType
                        .LaunchOptions()
                        .setSlowMo(500)
                        .setHeadless(headless));
                break;
            case "firefox":
                this.browser = playwright.firefox().launch(new BrowserType
                        .LaunchOptions()
                        .setSlowMo(500)
                        .setHeadless(headless));
                break;
            case "chrome":
                this.browser = playwright.chromium().launch(new BrowserType
                        .LaunchOptions()
                        .setChannel("chrome") // use actual Chrome
                        .setSlowMo(500)
                        .setHeadless(headless));
                break;
            default:
                throw new InvalidBrowserType("Invalid browser type");
        }

        this.browserContext = this.browser.newContext();
        this.page = browserContext.newPage();
    }

}
