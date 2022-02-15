package steps;

import configuration.common.WebBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pages.CIGNAMedicarePage;
import pages.CIGNASignUpPage;

import static org.openqa.selenium.support.PageFactory.initElements;


public class SignInCIGNAPageSteps extends WebBase {

    CIGNASignUpPage signUp;

    @BeforeStep
    public void getInit() {
        signUp = PageFactory.initElements(driver, CIGNASignUpPage.class);
    }
    @Given("user on Cigna Home page")
    public void userOnCignaHomePage() throws InterruptedException {
        Thread.sleep(2000);

    }


    @And("user click on logIn to MyCigna")
    public void userClickOnLogInToMyCigna() {
        signUp.logInMyCigna();
    }

    @And("user enter valid UserName in the userName field")
    public void userEnterValidUserNameInTheUserNameField() throws InterruptedException {
        Thread.sleep(2000);
        signUp.inputNameField();

    }

    @And("user enter valid passWord in the passWord field")
    public void userEnterValidPasswordInThePassWordField() {
        signUp.inputPassWordField();
    }

    @And("user click on signIn button")
    public void userClickOnSignInButton() {
        signUp.clickOnSubmitButton();
    }
    //========================================================================================================================
    // Scenario: Cigna member resource Registration using invalid information

    @And("user click on member resource")
    public void userClickOnMemberResource() {
        signUp.clickOnMemberResource();
    }

    @And("user click on activate your account")
    public void userClickOnActivateYourAccount() throws InterruptedException {
        signUp.activateYourAccount();
        Thread.sleep(6000);
    }

    @And("user enter first name in the first input box")
    public void userEnterFirstNameInTheFirstInputBox() throws InterruptedException {
        Thread.sleep(2000);
        signUp.firstNameInputWeb();
    }

    @And("user enter last name in the second input box")
    public void userEnterLastNameInTheSecondInputBox() {
        signUp.lastNameInput();
    }

    @And("user click next button")
    public void userClickNextButton() {
        signUp.clickOnNext();
    }








}