import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest
{
    private static int result;

    @BeforeEach
    void BeforeStarted()
    {
        System.out.println("BeforeEach");
        result = GetResult();
    }
    @AfterEach
    void AfterFinished()
    {
        System.out.println("AfterEach");
        result = 0;
    }
    @Test
    void FirstTest() {
        System.out.println("###        First Test");
        Assertions.assertTrue(result>2);
    }
    @Test
    void SecondTest() {
        System.out.println("###         Second Test");
        Assertions.assertTrue(result>2);
    }
    @Test
    void ThirdTest() {
        System.out.println("###          Third Test");
        Assertions.assertTrue(result>2);
    }
    int GetResult()
    {
        return 3;
    }


}
