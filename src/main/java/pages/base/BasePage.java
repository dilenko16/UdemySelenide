package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

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
        element.sendKeys(value);
}

    /**
     * Check is auth frame is
     */
    public void checkIsDisplayedAuthWidget(){
    authWidgetP24New.shouldBe(Condition.visible);

    }
}
