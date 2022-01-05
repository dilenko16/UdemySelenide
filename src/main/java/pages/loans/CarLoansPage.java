package pages.loans;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CarLoansPage extends BasePage {

    private final SelenideElement tabAgreements = $x("//*[@id=\"app\"]/div[2]/section/div[2]/a[2]/div");
    private final SelenideElement amountFieldCarCost = $x("//input[@data-qa-node='amount']");
    private final SelenideElement amountFieldPrepaidExpense = $x("//input[@data-qa-node='prepaid']");
    private final SelenideElement phoneCodeButton = $x("//button[@data-qa-node='phone-code']");
    private final SelenideElement searchPhoneCodeField = $x("//*[@id=\"app\"]/div[2]/section/div[3]/div[2]/div/div[6]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[1]/div/div/div/div[2]/div[1]/input");
    private final SelenideElement phoneNumberField = $x("//input[@data-qa-node ='phone-number' and @placeholder = '000000000']");
    private final SelenideElement applyOrderButton = $x("//button[@type='button' and contains(text(), 'Submit an application')]");
    private final SelenideElement selectedUsedAutoTab = $x("//div[@data-qa-node = 'type' and contains (text(), 'With mileage')]");
    private final SelenideElement confirmForm = $x("//div[contains(text(), 'One-time password has been forwarded to your phone')]");
    private final SelenideElement buttonCountryRussia = $x("//div[@name='Russia']");


    /**
     * Selecting a tab agreements
     * **/

    public CarLoansPage selectAgreementsTab(){
       tabAgreements.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Test display of the form confirmation of transaction
     * **/

    public CarLoansPage checkIsDispalyedConfirm(){
        confirmForm.shouldBe(Condition.visible);
        return this;
    }


    /**
     * Enter the amount of the car value
     * @param amount the full cost of a car
     *
     */

    public CarLoansPage enterAmountFieldCarCost(String amount){
        clearAndType(amountFieldCarCost, amount);
        return this;
    }


    /**
     * Enter the advance amount for the loan
     * @param amount the amount of the advance payment
     */
    public CarLoansPage enterAmountFieldPrepaidExpense(String amount){
        clearAndType(amountFieldPrepaidExpense, amount);
        return this;
    }

    /**
     * Filing in the mobile number to apply
     * @param phoneNumber mobile number to apply
     * **/

    public CarLoansPage enterPhoneNumber(String phoneNumber){
        clearAndType(phoneNumberField, phoneNumber);
        return this;
    }
    /**
     * Search country code for mobile communications
     * @param phoneNumber mobile number to apply
     * **/

    public CarLoansPage searchPhoneCountryCodeField(String phoneNumber){
        clearAndType(searchPhoneCodeField, phoneNumber);
        return this;
    }

    /**
     * Selection of drop down list of codes of countries, mobile communications
     **/

    public CarLoansPage selectPhoneCodeButton (){
        phoneCodeButton.shouldBe(Condition.visible).click();
        return this;
    }


    /**
     * Confirmation of application for credit
     **/

    public CarLoansPage submitOrderButton(){
        applyOrderButton.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check that the selected tab is "With mileage"
     **/

    public CarLoansPage checkSelectedTabWithMileageAuto (){
        selectedUsedAutoTab.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Select the country code from the drop-down list
    **/

    public CarLoansPage selectCountryRussiaFromList (){
        buttonCountryRussia.shouldBe(Condition.visible).click();
        return this;
    }


}
