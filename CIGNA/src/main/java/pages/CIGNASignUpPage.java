package pages;


import configuration.common.WebBase;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static PageElements.SignInPageElements.*;


public class CIGNASignUpPage extends WebBase {

    @FindBy(xpath =clickOnMemberResourceWebElement)
    public WebElement clickOnMemberResourceWeb;
    @FindBy(xpath = activateYourAccountWebElement)
    public WebElement activateYourAccountWeb;
    @FindBy(css = firstNameInputWebElement)
    public WebElement firstNameInputWeb;
    @FindBy(xpath = lastNameInputWebElement)
    public WebElement lastNameInputWeb;
    @FindBy(xpath = clickOnNextWebElement)
    public WebElement clickOnNextWeb;
    @FindBy(xpath = selectMonthDropDownWebElement)
    public WebElement selectMonthDropDownWeb;
    @FindBy(xpath = enterDayInputWebElement)
    public WebElement enterDayInputWeb;
    @FindBy(xpath =enterYearInputWebElement )
    public WebElement enterYearInputWeb;
    @FindBy(xpath = userClickNextButtonWebElement)
    public WebElement userClickNextButtonWeb;
    @FindBy(xpath = enterZipCodeInputWebElement)
    public WebElement enterZipCodeInputWeb;

     @FindBy(xpath = clickOnNextWebElement2)
    public WebElement clickOnNextWeb2;

     @FindBy(xpath = chooseRadioButtonWebElement)
    public WebElement chooseRadioButtonWeb;

     @FindBy(xpath = clickNextButtonWebElement3)
    public WebElement clickNextButtonWeb;
    @FindBy(xpath = enterCignaMedicareNumberWebElement)
    public WebElement enterCignaMedicareNumberWeb;

    @FindBy(xpath = clickNextButtonWebElement)
    public WebElement clickNextButtonWeb2;
    @FindBy(xpath =verifyErrorMessageWebElement )
    public WebElement verifyErrorMessageWeb;
//    @FindBy(xpath = )
//    public WebElement
//    @FindBy(xpath = )
//    public WebElement
//

    public void clickOnMemberResource(){
        clickOnMemberResourceWeb.click();
    }
    public void activateYourAccount(){
        activateYourAccountWeb.click();
    }
    public void firstNameInputWeb(){
        firstNameInputWeb.sendKeys("kim");
        firstNameInputWeb.click();
    }
    public void lastNameInput(){
        lastNameInputWeb.sendKeys("Lien");
    }
    public void clickOnNext(){
        clickOnNextWeb.click();
    }
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//    public void (){}
//
//













    @FindBy(xpath = logInMyCignaWebElement)
    public WebElement logInMyCignaWeb;

    @FindBy(xpath= inputNameWebElement)
    public WebElement inputNameWeb;
    @FindBy(xpath = inputPassWordWebElement)
    public WebElement inputPassWordWeb;
    @FindBy(xpath = clickOnSubmitButtonWebElement)
    public WebElement clickOnSubmitButtonWeb;

    public void logInMyCigna() {
        logInMyCignaWeb.click();
    }


    //2
    public void inputNameField() {
        takeEnterKeysValue("//input[@id='username']","Jack");
       // getTextFromWebElements("//input[@id='username']");
        //mouseHoverByXpath1("//*[@id=\"username\"]");
       // waitUntilVisible(By.xpath("//input[@name=\"username\"][@id=\"username\"]"));
       // inputNameWeb.sendKeys("Jack");
        //inputValueInTextBoxByWebElement(inputNameWeb,"Jack");
        //clickByXpath1("//input[@name=\"username\"][@id=\"username\"]");

    }

    public void inputPassWordField() {
        inputValueInTextBoxByWebElement(inputPassWordWeb,"test1234");
      //  inputPassWordWeb.sendKeys(passWord);
    }


    public void inputNameField1(String userName) {
        waitUntilVisible(By.xpath("//input[@id='username']"));
        // inputNameWeb.sendKeys(userName);
    }

    public void inputPassWordField1( String passWord) {
        inputPassWordWeb.sendKeys(passWord);
    }

    public void clickOnSubmitButton() {
        clickOnSubmitButtonWeb.click();

    //    // Scenario: Cigna member resource Registration using invalid information







    }

























}
