import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Meore {
    @Test
    public void meore(){

        open("https://ee.ge/:");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldNotBe(Condition.disabled);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldNotBe(Condition.disabled);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).click();
        $(byClassName("text-danger"),3).shouldNotBe(Condition.disabled);
        $(byId("password")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).setValue("maiairemadze2010gmail");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("qwert");
        $(byClassName("text-danger"),3).shouldNotBe(Condition.disabled);
        $(byId("confirmPassword")).setValue("qwerty");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);



    }
}
