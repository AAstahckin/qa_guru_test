package tests.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class NameLoginForGithub {
    @Test
    void TestForSelenideAuthor() {
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$$("h2").filterBy(text("Contributors")).
                first().sibling(0).$$("li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        $(".Truncate-text").click();
        $(".vcard-names").shouldHave(text("Andrei Solntsev"));

    }
}
