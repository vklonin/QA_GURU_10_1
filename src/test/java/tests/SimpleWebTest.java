package tests;

import com.codeborne.selenide.Condition;
import configuration.SimpleConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleWebTest {

    final SimpleConfig config = ConfigFactory.create(SimpleConfig.class);

    @Test
    @Tag("web")
    void googleSearchWorking(){

        System.out.println(System.getProperty("baseURL"));
        open(config.getBaseURL());
        //open("https://google.com");
        //$(byName("q")).setValue(config.getValueSearched()).pressEnter();
        //$(byText(config.getValueToCheck())).shouldBe(Condition.visible);

    }


}
