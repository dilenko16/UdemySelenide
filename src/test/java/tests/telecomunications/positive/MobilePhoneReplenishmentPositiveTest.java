package tests.telecomunications.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PHONE_URL;

@Feature("Tests to check the operation of replenishment of the mobile phone number")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class MobilePhoneReplenishmentPositiveTest extends BaseTest {


    @Test
    @DisplayName("Public session, non-client, replenishment of mobile numbers for the minimum amount")

    public void checkMinimumReplenishmentAmount() {
        basePage.gotoUrl(MOBILE_PHONE_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("100")
                .enterCardNumber(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCVV(MOBILE_PAYMENT_CARD_CVV)
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .submitMobileReplenishment()
                .checkPaymentAmountAndComission("100", "2")
                .checkPaymentCurrency(CURRENCY_UAH, CURRENCY_UAH)
                .checkPaymentCardAndRecipient(MOBILE_PAYMENT_CARD_THE_LAST_FOUR_DIGITS, "Kyivstar Ukraine");


    }

    @Test
    @DisplayName("Public session, non-client, redirect checking for authorization, after selecting card from wallet")
    void checkRedirectOnAuthorization() {
        basePage.gotoUrl(MOBILE_PHONE_URL);
        mobilePhoneReplenishmentPage
                .selectCardFromWallet()
                .checkIsDisplayedAuthWidget();
    }

}
