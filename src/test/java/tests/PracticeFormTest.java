package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulTest() {

        String firstName = "Alex";
        String lastName = "Alexus";
        String email = "Alex@test.com";
        String mobileNumber = "9999999999";
        String subjects = "Physics";
        String address = "Montana";
        File file = new File("src/test/java/resources/Screenshot_1.png");

        open("/automation-practice-form");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(byText("Male")).click();
        $("#userNumber").setValue(mobileNumber);
        $(".react-datepicker-wrapper .form-control").click();
        $(".react-datepicker__day--029").click();
        $("#subjectsInput").sendKeys(subjects);
        $("#subjectsInput").pressEnter();
        $(byText("Sports")).click();
        $(".form-control-file").uploadFile(file);
        $("#currentAddress").setValue(address);
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Delhi")).click();
        $("#submit").click();
        $(".table-responsive").shouldHave(
                text(firstName),
                text(lastName),
                text(email),
                text("Male"),
                text(mobileNumber),
                text("29 May,2022"),
                text(subjects),
                text("Sports"),
                text("Screenshot_1.png"),
                text(address),
                text("NCR Delhi")
        );
        $("#closeLargeModal").click();
    }
}