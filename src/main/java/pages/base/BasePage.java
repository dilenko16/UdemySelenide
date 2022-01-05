package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class BasePage {

    public final SelenideElement authWidgetP24New = $x("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     *
     * The method for navigating to a specific URL
     */
    public void gotoUrl(String url){
        open(url);
    }


    protected void clearAndType(SelenideElement element, String value){
        while( !element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
}

    /**
     * Check is auth frame is displayed
     */
    public void checkIsDisplayedAuthWidget(){
    authWidgetP24New.shouldBe(Condition.visible);
    }

    public void checkMessage (String message){

        $(byText(message)).shouldBe(Condition.visible);

    }
}
