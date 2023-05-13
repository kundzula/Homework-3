import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Pirveli {
    @Test
    public void axali(){

        open("https://ee.ge/:");
        $(byText("რეგისტრაცია")).click();

        $(byClassName("registration-titles")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("maia").shouldBe(Condition.visible);
        $(byId("lastName")).setValue("iremadze").shouldBe(Condition.visible);
        $(byId("email")).setValue("maiairemadze2010@gmail.com").shouldBe(Condition.visible);
        $(byId("password")).setValue("qwerty");
        $(byId("confirmPassword")).setValue("qwerty");
        $(byId("singup")).shouldBe(Condition.enabled);









    }


}
