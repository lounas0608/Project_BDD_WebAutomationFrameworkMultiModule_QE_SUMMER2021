package steps;

import configuration.common.WebBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import static org.openqa.selenium.support.PageFactory.initElements;


public class SignInPageSteps extends WebBase {

     SignInPage signInPage;

    @BeforeStep
    public void getInit() {
        signInPage = initElements(driver, SignInPage.class);
    }
    @Given("user on amazon Sign-In page")
    public void user_on_amazon_sign_in_page() throws MalformedURLException, InterruptedException {
        signInPage.clickOnHelloSignIn();
        Thread.sleep(2000);
    }

    @Given("user enter valid {string} email address or phone number in username field")
    public void user_enter_valid_email_address_or_phone_number_in_username_field(String name) {
        signInPage.enterEmailAndPhoneNumber(name);
    }

    @Given("user click on continue button")
    public void user_click_on_continue_button() {
        signInPage.clickOnContinueButtonFromSignInPage();
    }

    @Given("user enter valid {string} password in password Field")
    public void user_enter_valid_password_in_password_field(String pass) throws InterruptedException {
        signInPage.enterPasswordFromSignInPage(pass);
        waitFor(4);
    }

    @When("user click on Sign-In button")
    public void user_click_on_sign_in_button() throws InterruptedException {
        signInPage.clickOnSignInButtonFromSignInPage();
        waitFor(2);
    }


    @When("user should be able to see the valid {string} user name")
    public void user_should_be_able_to_see_the_valid_user_name(String name) {
        signInPage.verifyUserNameAfterSignIn(name);
    }

//    @And("user should be able to see the valid {string} user name")
//    public void userShouldBeAbleToSeeTheValidUserName(String name) {
//
//    }

    @Then("user should be able to log in their account")
    public void user_should_be_able_to_log_in_their_account() {

    }

    @Then("user should be able to see welcome message on top of Account & list")
    public void user_should_be_able_to_see_welcome_message_on_top_of_account_list() {

    }

    // Data Table with List<List<E>>
//    @Given("user enter valid email address or phone number in username field")
//    public void user_enter_valid_email_address_or_phone_number_in_username_field(DataTable dataTable) {
//        List<List<String>> data = dataTable.asLists(String.class);
//        String email = data.get(1).get(0);
//        signInPage.enterEmailAndPhoneNumber(email);
//        //signInPage.enterEmailAndPhoneNumber(data.get(1).get(0));
//
//    }


    @Given("user enter valid email address or phone number in username field")
    public void user_enter_valid_email_address_or_phone_number_in_username_field(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> rows:data){
            String email = rows.get("email");
            signInPage.enterEmailAndPhoneNumber(email);
           // signInPage.enterEmailAndPhoneNumber(rows.get("email"));
        }



    }

    @Given("user enter valid password in password Field")
    public void user_enter_valid_password_in_password_field(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();

        List<List<String>> data = dataTable.asLists(String.class);
        String pass = data.get(0).get(0);
        signInPage.enterPasswordFromSignInPage(pass);

    }

    @Given("I enter valid information")
    public void i_enter_valid_information(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

        String userName = data.get(1).get(0);
        String emailAddress = data.get(1).get(1);
        String password = data.get(1).get(2);
        String rePassword = data.get(1).get(3);

        signInPage.enterPasswordFromSignInPage(userName);
        signInPage.enterPasswordFromSignInPage(emailAddress);
        signInPage.enterPasswordFromSignInPage(password);
        signInPage.enterPasswordFromSignInPage(rePassword);

    }

}
