package tests.loans.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_LOANS_URL;

@Feature("Tests to check credit for cars")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)


public class CarLoansPositiveTest extends BaseTest {

    @Test
    @DisplayName("Public session, non-client, applying for a loan for a car with a mileage")
    void applyingForAnOldCarLoanPublicSession() {
        basePage.gotoUrl(CAR_LOANS_URL);
        carLoansPage
                .checkSelectedTabWithMileageAuto()
                .enterAmountFieldCarCost("1500000")
                .enterAmountFieldCarCost("900000")
                .selectPhoneCodeButton()
                .searchPhoneCountryCodeField("Russ")
                .selectCountryRussiaFromList()
                .enterPhoneNumber("00000000")
                .submitOrderButton()
                .checkIsDispalyedConfirm();
    }

    @Test
    @DisplayName("Public session, non-client, reviewing the contract")
    void selectAgreementTabPubSession() {
        basePage.gotoUrl(CAR_LOANS_URL);
        carLoansPage
                .selectAgreementsTab()
                .checkIsDisplayedAuthWidget();


    }
}
