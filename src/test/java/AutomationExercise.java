import com.antonio.exercise.exceptions.InvalidBrowserType;
import com.antonio.exercise.page_objects.*;
import com.antonio.exercise.playwright_config.PlaywrightConfiguration;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AutomationExercise {

    private PlaywrightConfiguration playwrightConfiguration;
    private Common common;
    private Category category;
    private Navigate navigate;
    private WelcomeModal welcomeModal;
    private Jeans jeans;
    private ConfirmationModal confirmationModal;
    private HeaderPage headerPage;

    @BeforeSuite
    private void initialize() throws InvalidBrowserType {
        this.playwrightConfiguration = new PlaywrightConfiguration();
        this.playwrightConfiguration.initializePlaywrightConfiguration("chromium");

        this.common = new Common(this.playwrightConfiguration.getPage());
        this.navigate = new Navigate(this.common);
        this.category = new Category(this.common);
        this.welcomeModal = new WelcomeModal(this.common);
        this.jeans = new Jeans(this.common);
        this.confirmationModal = new ConfirmationModal(this.common);
        this.headerPage = new HeaderPage(this.common);
    }

    @Test
    public void automationExercise() {

        Reporter.log("Step 1 - Navigate to automation exercise page");
        this.navigate.navigateToAutomationExercise();

        Reporter.log("Step 2 - Navigate to men's jeans");
        this.welcomeModal.clickConsent();
        this.category.clickMen();
        this.category.clickJeans();

        Reporter.log("Step 3 - Add jeans");
        this.jeans.clickAddToCartGruntBlueSlimFitJeans();
        this.confirmationModal.clickContinueShopping();

        this.jeans.clickAddToCartRegularFitStraightJeans();
        this.confirmationModal.clickContinueShopping();

        this.jeans.clickAddToCartSoftStretchJeans();
        this.confirmationModal.clickContinueShopping();

        Reporter.log("Step 4 - Navigate to cart and validate that the jeans are there");
        this.headerPage.navigateToCart();

    }
}
