package tests.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenideOne {

    @Test
    void case1() {
        open("file:///test_java_qa_guru/qa_guru_test/src/test/resources/task_2_create_HTML.html");
        SelenideElement str1 = $("h1 div");
        SelenideElement str2 = $("h1").$("div");
        System.out.println("$(\"h1 div\") " + str1);
        System.out.println("$(\"h1\").$(\"div\")" + str2);
    }

    @Test
    void case2() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[data-filterable-for=wiki-pages-filter]").shouldNotBe(hidden).$(byText("SoftAssertions")).click();
        $(".markdown-body h4").shouldHave(text("1. Using TestNG just register listener bypass annotation for test class:"));
    }

    @Test
    void case3() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
    }
}
