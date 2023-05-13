import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Meotxe {
    @Test
    public void meotxe(){
        open("https://ee.ge/:");
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"),0).click();
        $(by("src","/images/cart.png")).click();
        $(byClassName("save-icon")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("ყიდვა")).shouldBe(Condition.visible);
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byClassName("fa-times")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);




    }
}
