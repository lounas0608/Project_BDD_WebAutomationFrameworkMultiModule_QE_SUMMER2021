package pages;

import configuration.common.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static PageElements.SignInPageElements.*;


public class SignInPage extends WebBase {

    @FindBy(xpath = helloSignInWebElement)
    public WebElement helloSignIn;
    @FindBy(xpath = emailAndPhoneNumberWebElement)
    public WebElement emailAndPhoneNumber;
    @FindBy(xpath = continueButtonFromSignInPageWebElement)
    public WebElement continueButtonFromSignInPage;
    @FindBy(xpath = passwordFromSignInPageWebElement)
    public WebElement passwordFromSignInPage;
    @FindBy(xpath = signInButtonFromSignInPageWebElement)
    public WebElement signInButtonFromSignInPage;
    @FindBy(xpath = welcomeUserNameWebElement)
    public WebElement welcomeUserName;
   //===================================================================================================================
    @FindBy(xpath = accountSignInWebElement)
    public WebElement accountSignInWeb;
    @FindBy(xpath = clickOnSignInHereWebElement)
    public WebElement clickOnSignInHereWeb;
    @FindBy(xpath = enterNameWebElement)
    public WebElement enterNameWeb;
    @FindBy(xpath = enterMobilOrEmailWebElement)
    public WebElement enterMobilOrEmailWeb;
    @FindBy(xpath = enterPassWordWebElement)
    public WebElement enterPassWordWeb;
    @FindBy(xpath = reEnterPassWordWebElement)
    public WebElement reEnterPassWordWeb;

    public void accountSignIn(){
        mouseHoverByXpath1("//span[normalize-space()='Account & Lists']");
    }
    public void clickOnSignInHere(){
        clickOnSignInHereWeb.click();
    }
    public void enterNameField( String enterName){
        enterNameWeb.sendKeys(enterName);
    }
    public void enterMobilOrEmail(String EnterEmail){
        enterMobilOrEmailWeb.sendKeys(EnterEmail);
    }
    public void enterPassWord( String enterPassWordField){
        enterPassWordWeb.sendKeys(enterPassWordField);
    }
    public void reEnterPassWord( String reEnterPassWordField){
        reEnterPassWordWeb.sendKeys(reEnterPassWordField);
    }











    public void clickOnHelloSignIn(){
        helloSignIn.click();
    }
    public void clickOnContinueButtonFromSignInPage(){
        continueButtonFromSignInPage.click();
    }
    public void clickOnSignInButtonFromSignInPage(){
        signInButtonFromSignInPage.click();
    }
    public void enterEmailAndPhoneNumber(String userName){
        emailAndPhoneNumber.sendKeys(userName);
    }
    public void enterPasswordFromSignInPage(String password){
        passwordFromSignInPage.sendKeys(password);
    }

    public void verifyUserNameAfterSignIn(String expectedName){
        String actualName=welcomeUserName.getText();
        Assert.assertEquals(actualName,expectedName,"Name not match");
    }




}
