package pages.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePage {


    private final SelenideElement buttonWallet = $x("//div[@data-qa-node='debitSourceSource']");
    private final SelenideElement inputCardNumber = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement buttonSubmitPayment = $x("//button[@data-qa-node='submit']");
    private final SelenideElement cardNumberInTheCart = $x("//td[@data-qa-node='card']");
    private final SelenideElement recipientNameInTheCart = $x("//span[@data-qa-node='nameB']");
    private final SelenideElement amountInTheCart = $x("//span[@data-qa-node='amount']");
    private final SelenideElement commissionInTheCart = $x("//span[@data-qa-node='commision']");
    private final SelenideElement amountCurrencyInTheCard = $x("//small[@data-qa-node='currency']");
    private final SelenideElement commisionCurrencyInTheCard = $x("//small[@data-qa-node='commission-currency']");


    private final SelenideElement inputFirstName = $x("//input[@data-qa-node='firstNamedebitSource']");
    private final SelenideElement inputLastName = $x("//input[@data-qa-node='lastNamedebitSource']");


    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCVV = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement paymentDetails = $x("//div[@data-qa-node='details']");



    /**
     * Enter a phone number excluding country code
     * @param phone phone number
     */

    public MobilePhoneReplenishmentPage enterPhoneNumber(String phone) {
        clearAndType(inputPhoneNumber, phone);
        return this;
    }

    /**
     * Enter the amount of replenishment of the mobile phone number
     *
     * @param sum amount of replenishment
     */

    public MobilePhoneReplenishmentPage enterAmount(String sum) {
        clearAndType(inputAmount, sum);
        return this;
    }

    /**
     * Enter the card number for payment
     * @param number card number
     */

    public MobilePhoneReplenishmentPage enterCardNumber(String number) {
    clearAndType(inputCardNumber, number);
        return this;
    }

    /**
     * Enter the card expiry date for payment
     * @param expDate expire date
     */

    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
      clearAndType(inputCardExpDate, expDate);
        return this;
    }

    /**
     * Enter the card CVV code for payment
     * @param cvv the cvv code
     */
    public MobilePhoneReplenishmentPage enterCardCVV(String cvv) {
        clearAndType(inputCardCVV, cvv);
        return this;
    }

    /**
     * Acceptance of payment
     */

    public MobilePhoneReplenishmentPage submitMobileReplenishment(){

        buttonSubmitPayment.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Choose a card from the wallet
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check the card number with which the payment and the recipient
     * @param cardFrom the card number for payment
     * @param recipient mobile operator
     *
     */

    public MobilePhoneReplenishmentPage checkPaymentCardAndRecipient (String cardFrom, String recipient){
        checkMessage(cardFrom);
        checkMessage(recipient);
        return this;
    }

    /**
     * Check the amount and Commission amount
     * @param amount the amount will be credited to the mobile account
     * @param commision the commission in addition to mobile account
     *
     */

    public MobilePhoneReplenishmentPage checkPaymentAmountAndComission (String amount, String commision){
        checkMessage(amount);
        checkMessage(commision);
        return this;
    }

    /**
     * Check the card number with which the payment and the recipient
     * @param currencyAmount currency of the payment
     * @param commissionAmount currency of fee
     *
     */

    public MobilePhoneReplenishmentPage checkPaymentCurrency (String currencyAmount, String commissionAmount){

        checkMessage(currencyAmount);
        checkMessage(commissionAmount);
        return this;
    }

    public MobilePhoneReplenishmentPage enterFirstName(String firstName) {

        clearAndType(inputFirstName, firstName);
        return this;
    }

    public MobilePhoneReplenishmentPage enterLastName(String lastName) {
        clearAndType(inputLastName, lastName);
        return this;
    }


//
//    public MobilePhoneReplenishmentPage addWait() {
//        WebElement wait = driver.findElement(inputFirstName);
//        waitElementIsVisible(wait);
//        waitElementIsVisible(driver.findElement(inputFirstName));
//        return this;
//    }
//
//    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentCart(String text) {
//        waitElementIsVisible(driver.findElement(paymentDetails));
//        WebElement details = driver.findElement(paymentDetails);
//        checkMessage(paymentDetails, text);
//        Assertions.assertEquals(text, details.getText());
////        waitElementIsVisible(driver.findElement(paymentDetails));
//        return this;
//    }

}
