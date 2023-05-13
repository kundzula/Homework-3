import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Mesame {
    @Test
    public void mesame(){
        open("https://ee.ge/:");
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"),0).click();
        $(by("src","/images/cart.png")).click();
        $(byText("სრული ღირებულება")).shouldBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);





    }
}
