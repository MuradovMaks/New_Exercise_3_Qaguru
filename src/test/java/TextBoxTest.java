import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest
{
    @BeforeEach
    void SetUp()
    {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void TextBoxTest()
    {
        open("/text-box");
        $("[id=userName]").setValue("Maxim").pressEnter();
        $("[id=userEmail]").setValue("koreantech620@mail.ru");
        $("[id=currentAddress]").setValue("Dybrovskaya 15");
        $("[id=permanentAddress]").setValue("Dvorcovaia 25");
        $("[id=submit]").click();
        $("[id=name]").shouldHave(Condition.text("Maxim"));
        $("[id=email]").shouldHave(Condition.text("koreantech620@mail.ru"));
        $("[id=output]").$("[id=currentAddress]").shouldHave(Condition.text("Dybrovskaya 15"));
        $("[id=output]").$("[id=permanentAddress]").shouldHave(Condition.text("Dvorcovaia 25"));
    }
}
