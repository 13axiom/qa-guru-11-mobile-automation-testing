package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
import static java.lang.Thread.sleep;

public class AndroidTestsHW extends TestBase {

    @Test
    @Tag("emulator_hw")
    @DisplayName("id: 1. Search test")
    void searchTest() {
        step("Skip introduction", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        });
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("Appium");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @Tag("emulator_hw")
    @DisplayName("id: 2. Validation of design of introduction 1st page")
    void validateIntroductionFirstPageDesign() {

        step("1st page of introduction: checking header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("1st page of introduction: checking that english has already been available in app", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(text("1. English"));
        });

        step("1st page of introduction: checking that page has button for adding new languages", () -> {

            $$(AppiumBy.id("android.widget.TextView")).findBy(text("ADD OR EDIT LANGUAGES")).
                    shouldHave(attribute("displayed", "true"));
            $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer")).closest("android.widget.TextView").
                    shouldHave(text("ADD OR EDIT LANGUAGES"));

        });

        step("1st page of introduction: having the button \"CONTINUE\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(attribute("enabled", "true"));
        });
    }

    @Test
    @Tag("emulator_hw")
    @DisplayName("id: 3. Validation of design of introduction 2nd page")
    void validateDIntroductionSecondPageDesign() {

        String secondaryText = "Dive down the Wikipedia rabbit hole with a constantly updating Explore feed. " +
                "Customize the feed to your interests – whether it’s learning about historical events On this day, " +
                "or rolling the dice with Random.";

        step("Preconditions", () -> {
            step("Fill introduction 1st page", () -> {
                step("Click \"Continue\"", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
            });
        });

        step("2nd page of introduction: having image in the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered"))
                    .shouldHave(attribute("enabled", "true"));
        });

        step("2nd page of introduction: having the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("New ways to explore"));
        });

        step("2nd page of introduction: having the text above the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text(secondaryText));
        });

        step("2nd page of introduction: having the button \"Skip\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).
                    shouldHave(attribute("enabled", "true"));
        });

        step("2nd page of introduction: having the button \"CONTINUE\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(attribute("enabled", "true"));
        });
    }

    @Test
    @Tag("emulator_hw")
    @DisplayName("id: 4. Validation of design of introduction 3rd page")
    void validateDIntroductionThirdPageDesign() {

        String secondaryText = "You can make reading lists from articles you want to read later, even when you’re offline. " +
                "Login to your Wikipedia account to sync your reading lists. Join Wikipedia";

        step("Preconditions", () -> {
            step("Fill introduction 1st and 2nd page", () -> {
                step("Click \"Continue\" at 1st page", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
                step("Click \"Continue\" at 2nd page", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
            });
        });

        step("3rd page of introduction: having image in the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered"))
                    .shouldHave(attribute("enabled", "true"));
        });

        step("3rd page of introduction: having the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Reading lists with syn"));
        });

        step("3rd page of introduction: having the text above the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text(secondaryText));
        });

        step("3rd page of introduction: having the button \"Skip\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).
                    shouldHave(attribute("enabled", "true"));
        });

        step("3rd page of introduction: having the button \"CONTINUE\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(attribute("enabled", "true"));
        });
    }

    @Test
    @Tag("emulator_hw")
    @DisplayName("id: 5. Validation of design of introduction 4th page")
    void validateDIntroductionFourthPageDesign() {

        String secondaryText = "Help make the app better by letting us know how you use it. " +
                "Data collected is anonymous. Learn more";

        step("Preconditions", () -> {
            step("Fill introduction previous pages", () -> {
                step("Click \"Continue\" at 1st page", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
                step("Click \"Continue\" at 2nd page", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
                step("Click \"Continue\" at 3rd page", () -> {
                    $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                            .click();
                });
            });
        });

        step("4th page of introduction: having image in the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered"))
                    .shouldHave(attribute("enabled", "true"));
        });

        step("4th page of introduction: having the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Send anonymous data"));
        });

        step("4th page of introduction: having the text above the header", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text(secondaryText));
        });

        step("4th page of introduction: having the switcher about using data", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/switchView")).
                    shouldHave(text("Send usage data")).
                    shouldHave(attribute("checkable", "true")).
                    shouldHave(attribute("checked", "true")).
                    shouldHave(attribute("checked", "true")).
                    shouldHave(attribute("enabled", "true")).
                    shouldHave(attribute("displayed", "true"));
        });

        step("4th page of introduction: checkin the switcher about using data", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/switchView")).
                    shouldHave(text("Send usage data"));
        });


        step("4th page of introduction: having the button \"GET STARTED\"", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).
                    shouldHave(attribute("enabled", "true"));
        });
    }

}
