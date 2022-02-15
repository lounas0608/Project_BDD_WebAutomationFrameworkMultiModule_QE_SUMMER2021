package pages;

import configuration.common.WebBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.opentest4j.AssertionFailedError;
import org.testng.Assert;

import static PageElements.CIGNAMedicareWebElement.*;


public class CIGNAMedicarePage extends WebBase {


    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBoxWeb;
    @FindBy(xpath = clickOnSearchButtonWebElement)
    public WebElement clickOnSearchButtonWeb;

    @FindBy(xpath = verifyVisionExpectedResultWebElement)
    public WebElement verifyVisionExpectedResultWeb;


    public void CIGNASearchBox() {
        // inputValueInTextBoxByWebElement(searchBoxWeb,"vision plan");
        //searchBoxWeb.click();
        typeByXpath("//input[@id='search-desktop']", "vision plan");
    }

    public void clickOnSearchButton() {
        clickOnSearchButtonWeb.click();
    }

    public void verifyVisionExpectedResult(String expectedVisionPlan) {
        String actualResultVisionPlan = verifyVisionExpectedResultWeb.getText();
        Assert.assertEquals(actualResultVisionPlan, expectedVisionPlan, "vision plan didn't display");

    }


    //========================================================
//shop for medicare plan
    @FindBy(xpath = clickOnMedicareWebElement)
    public WebElement clickOnMedicareWeb;
    @FindBy(xpath = shopMedicareWebElement)
    public WebElement shopMedicareWeb;
    @FindBy(xpath = enterZipCodeWebElement)
    public WebElement enterZipCodeWeb;
    @FindBy(xpath = verifyAvailablePlanWebElement)
    public WebElement verifyAvailablePlanWeb;

    //======================================================================================
    //shop for prescription Drug plan
    @FindBy(xpath = PrescriptionDrugPlansWebElement)
    public WebElement PrescriptionDrugPlansWeb;

    @FindBy(xpath = enterZipCode2WebElement)
    public WebElement enterZipCode2Web;
    @FindBy(xpath = shopButtonWebElement)
    public WebElement shopButtonWeb;
    @FindBy(xpath = selectPlanButtonWebElement)
    public WebElement selectPlanButtonWeb;
    @FindBy(xpath = verifyExpectedResultDrugPlans)
    public WebElement verifyExpectedResultDrugPlansWeb;
    //===============================================================================================
    //  shop for supplement Insurance
    @FindBy(xpath = supplementMedicarePlanWebElement)
    public WebElement supplementMedicarePlanWe;

    @FindBy(xpath = getOnlineQuoteWebElement)
    public WebElement getOnlineQuoteWeb;
    @FindBy(xpath = enterZipCode3WebElement)
    public WebElement enterZipCode3Web;
    @FindBy(xpath = verifySupplementPlanWebElement)
    public WebElement verifySupplementPlanWeb;
    //====================================================================
    //Cigna find a dental form information
    @FindBy(xpath = clickOnFindAFormWebElement)
    public WebElement clickOnFindAFormWeb;
    @FindBy(xpath = clickOnDentalFormWebElement)
    public WebElement clickOnDentalFormWeb;
    @FindBy(xpath = clickOnDirectoryRequestWebElement)
    public WebElement clickOnDirectoryRequestWeb;
    @FindBy(xpath = verifyDentalFormWebElement)
    public WebElement verifyDentalFormWeb;
    //=======================================================================================
    // Cigna vision form information
    @FindBy(xpath = clickOnVisionFormWebElement)
    public WebElement clickOnVisionFormWeb;
    @FindBy(xpath = verifyVisionFormWebElement)
    public WebElement verifyVisionFormWeb;
//==========================================================================================
    //  Scenario: Cinga home page Health care providers link check behavior credentialing functionality

    @FindBy(xpath = clickOnHealthProvidersLinkWebElement)
    public WebElement clickOnHealthProvidersLinkWeb;
    @FindBy(xpath = clickOnBehavioralCredentialing)
    public WebElement clickOnBehavioralCredential;
    @FindBy(xpath = credentialingWebElement)
    public WebElement credentialingWeb;
    @FindBy(xpath = clickOnFirstTimeCredentialing)
    public WebElement clickOnFirstTimeCredential;
    @FindBy(xpath = verifyBehavioralResult)
    public WebElement verifyBehavioralResultLink;

    //=============================================================================================================
    // health insurance for individual and families
    @FindBy(xpath = healthInsuranceFamiliesWebElement)
    public WebElement healthInsuranceFamiliesWeb;
    @FindBy(xpath = browseHealthInsuranceWebElement)
    public WebElement browseHealthInsuranceWeb;

    @FindBy(xpath = zipCodeInputFieldWebElement)
    public WebElement zipCodeInputFieldWeb;

    @FindBy(xpath = enterNameInputFieldWebElement)
    public WebElement enterNameInputFieldWeb;

    @FindBy(xpath = seeMyPlanButtonWebElement)
    public WebElement seeMyPlanButtonWeb;
    //===================================================================================================
    //medicare supplement for individuals and families

    @FindBy(xpath = medicareSupplementWebElement)
    public WebElement medicareSupplementWeb;
    @FindBy(xpath = enterZipCodeFieldWebElement)
    public WebElement enterZipCodeFieldWeb;
    @FindBy(xpath = quoteMedicareSupplementWebElement)
    public WebElement quoteMedicareSupplementWeb;
    //=================================================================================================
    @FindBy(xpath = findDoctorWebElement)
    public WebElement findDoctorWeb;
    @FindBy(xpath = employerOrSchoolWebElement)
    public WebElement employerOrSchoolWeb;

    @FindBy(xpath = enterZipCodeFindDoctorWebElement)
    public WebElement enterZipCodeFindDoctorWeb;
    @FindBy(xpath = clickOnFindADoctorLinkWebElement)
    public WebElement clickOnFindADoctorLinkWeb;

    @FindBy(xpath = enterTypeOfDoctorWEbElement)
    public WebElement enterTypeOfDoctorWEb;
    @FindBy(xpath = clickOnDoctorByNameWebElement)
    public WebElement clickOnDoctorByNameWeb;
    @FindBy(xpath = inputDoctorByNameWebElement)
    public WebElement inputDoctorByNameWeb;
//===========================================================================================================
    //individuals and families link

    @FindBy(xpath = individualsAndFamiliesWebElement)
    public WebElement individualsAndFamiliesWeb;
    @FindBy(xpath = dentalInsuranceWebElement)
    public WebElement dentalInsuranceWeb;
    @FindBy(xpath = getAQuoteButtonWebElement)
    public WebElement getAQuoteButtonWeb;
    @FindBy(xpath = enterHomeZipCodeWebElement)
    public WebElement enterHomeZipCodeWeb;
    @FindBy(xpath = selectEffectiveStartDateWebElement)
    public WebElement selectEffectiveStartDateWeb;
    @FindBy(xpath = enterFirstNameWebElement)
    public WebElement enterFirstNameWeb;
    //===============================================================================================================
//Cigna medica form information

    @FindBy(xpath = medicalFormWebElement)
    public WebElement medicalFormWeb;
    @FindBy(xpath = requestMedicalFormWebElement)
    public WebElement requestMedicalFormWeb;
    @FindBy(xpath = enterCignaHealthCareIDWebElement)
    public WebElement enterCignaHealthCareIDWeb;

//=====================================================================================================================
//Cigna search for dentist in the search box

    @FindBy(xpath = searchBoxInputDentistWebElement)
    public WebElement searchBoxInputDentistWeb;
    @FindBy(xpath = clickOnSearchBoxWebElement)
    public WebElement clickOnSearchBoxWeb;
    @FindBy(xpath = verifyActualDentalResultWebElement)
    public WebElement verifyActualDentalResultWeb;
    @FindBy(xpath = clickOnDentistryWebElement)
    public WebElement clickOnDentistryWeb;

//========================================================================================================================
    //Cigna search for vision plan in the search box

    @FindBy(xpath = searchBoxInputVisionPlanWebElement)
    public WebElement searchBoxInputVisionPlanWeb;
    @FindBy(css = verifyActualVisionPlanResultWebElement)
    public WebElement verifyActualVisionPlanResultWeb;
    @FindBy(xpath = groupVisionInsurancePlansWebElement)
    public WebElement groupVisionInsurancePlansWeb;
//========================================================================================
    //==============================================================================================
    //Cigna search for pediatrician in the search box

    @FindBy(xpath = searchBoxInputPediatricianWebElement)
    public WebElement searchBoxInputPediatricianWeb;
    @FindBy(css = verifyPediatricianWebElement)
    public WebElement verifyPediatricianWeb;
    @FindBy(xpath = clickOnMedicalLibraryWebElement)
    public WebElement clickOnMedicalLibraryWeb;
    @FindBy(xpath = clickOnIndividualsFamiliesWebElement)
    public WebElement clickOnIndividualsFamiliesWeb;
    @FindBy(xpath = clickOnConnectWithUsWebElement)
    public WebElement clickOnConnectWithUsWeb;

    //===========================================================
    // Cigna search with invalid information in the search box

    @FindBy(xpath = searchJewelryInputBoxWebElement)
    public WebElement searchJewelryInputBoxWeb;
    @FindBy(css = verifyInvalidResultWebElement)
    public WebElement verifyInvalidResultWeb;
    //===============================================================================================
    //Cigna home search in the search box with special characters
    @FindBy(xpath = specialCharactersWebElement)
    public WebElement specialCharactersWeb;
    @FindBy(css = verifySpecialChartResultWebElement)
    public WebElement verifySpecialChartResultWeb;

    //==========================================================================================================
    //Cigna home search in the search box with mix of Letter, number and special characters
    @FindBy(xpath = LetterAndNumAndSpecialCharactersWebElement)
    public WebElement LetterAndNumAndSpecialCharactersWeb;
    @FindBy(css = verifyLetterNumberSpecialChartResultWebElement)
    public WebElement verifyLetterNumberSpecialChartResultWeb;

    //============================================================================================
    // Scenario: Cigna home page glossary link functionality
    @FindBy(xpath = clickOnGlossaryWebElement)
    public WebElement clickOnGlossaryWeb;
    @FindBy(xpath = clickOnCategoryTabWebElement)
    public WebElement clickOnCategoryTabWeb;

    @FindBy(xpath = checkBoxClaimsPaymentsWebElement)
    public WebElement checkBoxClaimsPaymentsWeb;
    @FindBy(xpath = adjudicateAdjudicationLinkWebElement)
    public WebElement adjudicateAdjudicationLinkWeb;
    @FindBy(xpath = verifyGlossaryExpectedWebElement)
    public WebElement verifyGlossaryExpectedWeb;


    //================================================================================================================
    @FindBy(xpath = clickOnLetterTabWebElement)
    public WebElement clickOnLetterTabWeb;
    @FindBy(xpath = clickOnLetterHWebElement)
    public WebElement clickOnLetterHWeb;
    @FindBy(xpath = HealthCareFacilityLinkWebElement)
    public WebElement HealthCareFacilityLinkWeb;
    @FindBy(xpath = verifyHealthCareExpect)
    public WebElement verifyHealthCareWeb;

    //========================================================================================
    //  Scenario: Cigna home page resource link check eating well

    @FindBy(xpath = clickOnEatingWellWebElement)
    public WebElement clickOnEatingWellWeb;
    @FindBy(xpath = verifyExpectedEatWellDisplayWebElement)
    public WebElement verifyExpectedEatWellDisplayWeb;
    @FindBy(xpath = eatingDisorderWebElement)
    public WebElement eatingDisorderWeb;

    //===========================================================================================
    //  //  Scenario: Cigna home page resource link check Health and Wellness
    @FindBy(xpath = HealthAndWellnessLinkWebElement)
    public WebElement HealthAndWellnessLinkWeb;

    @FindBy(xpath = clickOnAutismLinkWebElement)
    public WebElement clickOnAutismLinkWeb;

    @FindBy(xpath = AutismProgramWebElement)
    public WebElement AutismProgramWeb;

    @FindBy(xpath = verifyAutismExpectedWebElement)
    public WebElement verifyAutismExpectedWeb;
    //================================================================================================
//Scenario: Cigna Third Party Administrators site check Your ACA Roadmap link
    @FindBy(xpath = ACARoadmapLinkWebElement)
    public WebElement ACARoadmapLinkWeb;
    @FindBy(xpath = selectSelfFundedWebElement)
    public WebElement selectSelfFundedWeb;
    @FindBy(xpath = selectAprilMonthWebElement)
    public WebElement selectAprilMonthWeb;
    @FindBy(xpath = selectGroupSizeWebElement)
    public WebElement selectGroupSizeWeb;
    @FindBy(xpath = openEnrollmentStartWebElement)
    public WebElement openEnrollmentStartWeb;
    @FindBy(xpath = generateTimelineWebElement)
    public WebElement generateTimelineWeb;
    @FindBy(xpath = enrollmentStartWebElement)
    public WebElement enrollmentStartWeb;

    //===========================================================================================================
// Cigna Third Party Administrators site
    @FindBy(xpath = AdministratorsLinkWebElement)
    public WebElement AdministratorsLinkWeb;
    @FindBy(xpath = toolFlyersLinkWebElement)
    public WebElement toolFlyersLinkWeb;
    @FindBy(css = userEnterFirstNameWebElement)
    public WebElement userEnterFirstNameWeb;
    //===============================================================================================================
    //Scenario: Cigna Employee plan and service on home delivery
    @FindBy(xpath = employeeLinkWebElement)
    public WebElement employeeLinkWeb;
    @FindBy(xpath = pharmacyLinkWebElement)
    public WebElement pharmacyLinkWeb;
    @FindBy(xpath = homeDeliveryLinkWebElement)
    public WebElement homeDeliveryLinkWeb;
    @FindBy(xpath = verifyServiceInformation)
    public WebElement verifyServiceInformationWeb;
    @FindBy(xpath = switchToHomeDeliveryWebElement)
    public WebElement switchToHomeDeliveryWeb;

    // Cigna vision form information
    public void clickOnVisionForm() {
        clickOnVisionFormWeb.click();
    }

    public void verifyVisionForm(String expectedResultVision) {
        String actualResultVision = verifyVisionFormWeb.getText();
        Assert.assertEquals(actualResultVision, expectedResultVision, "the actualResult didn't match");
        //verifyVisionFormWeb.click();

    }


    //===============================================================================================

    public void clickOnFindAForm() {
        clickOnFindAFormWeb.click();
    }

    public void clickOnDentalForm() {
        clickOnDentalFormWeb.click();
    }

    public void clickOnDirectoryRequest() {
        clickOnDirectoryRequestWeb.click();
    }

    public void verifyDentalForm(String expectResultDentalForm) {
        String actualResultDentalForm = verifyDentalFormWeb.getText();
        Assert.assertEquals(actualResultDentalForm, expectResultDentalForm, "the actual result didn't match");

    }

    //=============================================================================================


    public void healthInsuranceFamilies() {
        healthInsuranceFamiliesWeb.click();
    }

    public void browseHealthInsurance() {
        browseHealthInsuranceWeb.click();

    }

    public void zipCodeInputField() {
        waitUntilVisible(By.xpath("//input[@id=\"zip_code\"][@name=\"zip_code\"]"));
        zipCodeInputFieldWeb.sendKeys("10009");

        // waitTimeUsingFluent1(zipCodeInputFieldWeb);
        //inputValueInTextBoxByWebElement(zipCodeInputFieldWeb, "10009");
        // zipCodeInputFieldWeb.click();
    }

    public void enterNameInputField() {
        inputValueInTextBoxByWebElement(enterNameInputFieldWeb, "kim");
        // enterNameInputFieldWeb.click();
    }

    public void seeMyPlanButton() {
        seeMyPlanButtonWeb.click();
    }


    //====================================================================================

    //medicare supplement for individuals and families

    public void medicareSupplement() {
        medicareSupplementWeb.click();
    }

    public void quoteMedicareSupplement() {
        // mouseHoverByXpath1("//a[@class='btn btn-primary'][@aria-label=\"Get an online quote\"]");
        //  waitUntilClickAble1(quoteMedicareSupplementWeb);
        quoteMedicareSupplementWeb.click();
    }

    public void enterZipCodeField() {
        inputValueInTextBoxByWebElement(enterZipCodeFieldWeb, "10009");
        // enterZipCodeFieldWeb.click();
    }


    //====================================================================================================
    //find a doctor need you


    public void clickOnDoctorByName() {


        //typeByXpath("//input[@placeholder=\"Enter a doctor's name\"]","Hanna");
        //waitUntilClickAble(By.xpath("//button[@class='search-button active']"));
        clickOnDoctorByNameWeb.click();
        // takeEnterKeysValue("//input[@placeholder=\"Enter a doctor's name\"]","Hanna");

    }

    public void inputDoctorByName() {
        inputValueInTextBoxByWebElement(inputDoctorByNameWeb, "Hanna");
    }

    public void findDoctorLink() {
        findDoctorWeb.click();
    }

    public void employerOrSchool() {
        employerOrSchoolWeb.click();
    }

    public void enterZipCodeFindDoctor() {
        // mouseHoverByXpath1("//div[@role='tablist']//div[1]//div[1]//cigna-search-category-card[1]//div[1]//button[1]");
        waitUntilClickAble(By.xpath("//input[@aria-label='Geolocation search']"));
        inputValueInTextBoxByWebElement(enterZipCodeFindDoctorWeb, "11433");
        clickByXpath1("//span[@class='suggestion ng-star-inserted']");


        // mouseHoverByXpath1("//button[@class=\"dropdown-item active ng-star-inserted\"]");
    }

    public void clickOnFindADoctorLink() {
        clickOnFindADoctorLinkWeb.click();
    }

    public void enterTypeOfDoctor() {
        inputValueInTextBoxByWebElement(enterTypeOfDoctorWEb, "PCP");

    }
    //=========================================================================================================

    //individuals and families link

    public void individualsAndFamiliesWeb() {
        mouseHoverByXpath1("//a[@id='individuals-families-level-one-link']");
    }

    public void dentalInsurance() {
        dentalInsuranceWeb.click();
    }

    public void getAQuoteButton() {
        getAQuoteButtonWeb.click();

    }

    public void enterHomeZipCode() {
        mouseHoverByXpath1("//*[@id=\"uxFieldZipCode\"]");
        typeOnElement1(enterHomeZipCodeWeb, "10009");
        enterHomeZipCodeWeb.click();
//        enterHomeZipCodeWeb.clear();
//       enterHomeZipCodeWeb.sendKeys("10009");

    }

    public void selectEffectiveStartDate() {
        selectOptionByValue(selectEffectiveStartDateWeb, "5/1/2022");
    }

    public void enterFirstName() {
        inputValueInTextByWebElement(enterFirstNameWeb, "kim");
    }


    //==========================================================================================================
//  shop for supplement Insurance
    public void supplementMedicarePlan() {
        supplementMedicarePlanWe.click();
    }

    public void getOnlineQuote() {
        getOnlineQuoteWeb.click();
    }

    public void enterZipCode3() {
        inputValueInTextBoxByWebElement(enterZipCode3Web, "10009");
    }

    public void verifySupplementPlan(String expectedResultSupplement) {
        String actualResultSupplementPlan = verifySupplementPlanWeb.getText();
        Assert.assertEquals(actualResultSupplementPlan, expectedResultSupplement, "the actual result didn't match");

    }


    //=====================================================================================================
//shop for prescription Drug plan
    public void PrescriptionDrugPlans() {
        mouseHoverByXpath1("//ul[@class='menu-item link-lists']//a[normalize-space()='Shop Part D Prescription Drug Plans']");
        PrescriptionDrugPlansWeb.click();
    }

    public void enterZipCode2() {
        typeByXpath("//input[@id='zip-314']", "10009");
        waitUntilClickAble(By.xpath("//form[@id='planfinder-314']//button[@type='submit'][normalize-space()='Shop for a plan']"));
        shopButtonWeb.click();
    }

    public void selectPlanButton() {
        waitUntilVisible(By.xpath("//div[@id='PlanCard_KTMKPZNWJD']//vnext-shopping-cart-button[@class='col-4 d-none d-sm-block']"));
        selectPlanButtonWeb.click();
    }

    public void verifyExpectedResultDrugPlan(String expectResultDrugPlan) {
        String actualResultDrugPlan = verifyExpectedResultDrugPlansWeb.getText();
        Assert.assertEquals(actualResultDrugPlan, expectResultDrugPlan, "the expect result for drug plan didn't display");

    }

    //==========================================================================================
//shop for medicare plan
    public void clickOnMedicare() {
        //clickOnMedicareWeb.click();
        mouseHoverByXpath1("//a[@id='medicare-level-one-link']");
    }

    //
//    public void shopMedicare(){
//        shopMedicareWeb.click();
//    }
    public void shopMedicare() {

        mouseHoverByXpath1("//a[@href=\"/medicare/medicare-advantage/index.html\"][@tabindex=\"-1\"]");
        shopMedicareWeb.click();
    }

    public void enterZipCode() {
        inputValueInTextBoxByWebElement(enterZipCodeWeb, "10009");
    }


    public void verifyAvailablePlan(String expectResultPlan) {
        String actualResultPlan = verifyAvailablePlanWeb.getText();
        Assert.assertEquals(actualResultPlan, expectResultPlan, "the medicare plan didn't display");

    }

    //====================================================================================================

//Cigna medica form information

    public void medicalFormLink() {
        medicalFormWeb.click();
    }

    public void requestMedicalForm() {
        requestMedicalFormWeb.click();
    }

    public void enterCignaHealthCareID() {
        typeByXpath("//input[@id='Member_ID']", "RE1234562");
        // waitUntilClickAble(By.xpath("//input[@id='Member_ID']"));
        waitUntilVisible(By.xpath("//input[@id='Member_ID']"));
        //inputValueInTextBoxByWebElement(enterCignaHealthCareIDWeb,"RE1234562");
        enterCignaHealthCareIDWeb.click();


//       typeByXpath("//input[@id='zip-314']", "10009");
//      // waitUntilClickAble(By.xpath("//form[@id='planfinder-314']//button[@type='submit'][normalize-space()='Shop for a plan']"));
//       shopButtonWeb.click();


    }


//====================================================================================================

    public void searchBoxInputDentist() {
        searchBoxInputDentistWeb.sendKeys("DENTIST");
    }

    public void clickOnSearchBox() {
        clickOnSearchBoxWeb.click();
    }

    public void verifyActualDentalResult(String expectResultDentist) {
        String actualResultDentist = verifyActualDentalResultWeb.getText();
        Assert.assertEquals(actualResultDentist, expectResultDentist, "The actual result didn't match");
    }

    public void clickOnDentistry() {
        clickOnDentistryWeb.click();
    }
//    public void (){
//    }
//    public void (){
//    }
    //=====================================================================

    //Cigna search for vision plan in the search box

    public void searchBoxInputVisionPlan() {
        searchBoxInputVisionPlanWeb.sendKeys("vision plan");
    }

    public void verifyActualVisionPlanResult(String expectResultVisionPlant) {
        String actualExpectVision = verifyActualVisionPlanResultWeb.getText();
        Assert.assertEquals(actualExpectVision, expectResultVisionPlant, "The actual didn't match");

    }

    public void groupVisionInsurancePlans() {
        groupVisionInsurancePlansWeb.click();

    }

//=====================================================================================================================
    //Cigna search for pediatrician in the search box

    public void searchBoxInputPediatrician() {
        searchBoxInputPediatricianWeb.sendKeys("Pediatrician");
    }

    public void verifyPediatricianWeb(String expectResultPediatrician) {
        String actualResultPediatrician = verifyPediatricianWeb.getText();
        Assert.assertEquals(actualResultPediatrician, expectResultPediatrician, "the actual result didn't match");
    }

    public void clickOnMedicalLibrary() {
        clickOnMedicalLibraryWeb.click();
    }

    public void clickOnIndividualsFamilies() {
        clickOnIndividualsFamiliesWeb.click();
    }

    public void clickOnConnectWithUs() {
        clickOnConnectWithUsWeb.click();
    }


    // Cigna search with invalid information in the search box

    public void searchJewelryInputBox() {
        searchJewelryInputBoxWeb.sendKeys("jewelry");
    }

    public void verifyInvalidResult(String expectInvalidResult) {
        String actualInvalidResult = verifyInvalidResultWeb.getText();
        Assert.assertEquals(actualInvalidResult, expectInvalidResult, "the actual result didn't match");

    }

    //================================================================================================
    //Cigna home search in the search box with special characters

    public void specialCharacters() {
        specialCharactersWeb.sendKeys("!!!");
    }

    public void verifySpecialChartResult(String expectSpecialChartResult) {
        String actualSpecialResult = verifySpecialChartResultWeb.getText();
        Assert.assertEquals(actualSpecialResult, expectSpecialChartResult, "the actual result didn't match");
    }

    //=======================================================================================================================
    //Cigna home search in the search box with mix of Letter, number and special characters
    public void LetterAndNumAndSpecialCharacters() {
        LetterAndNumAndSpecialCharactersWeb.sendKeys("AAA12223!!!");
    }

    public void verifyLetterNumberSpecialChartResult(String expectedMixSearchResult) {
        String actualMixSearchResult = verifyLetterNumberSpecialChartResultWeb.getText();
        Assert.assertEquals(actualMixSearchResult, expectedMixSearchResult, "the actual result didn't match");
    }


    //========================================================================================================
    // Scenario: Cigna home page glossary link functionality


    public void clickOnGlossary() {
        clickOnGlossaryWeb.click();
    }

    public void clickOnCategoryTab() {
        clickOnCategoryTabWeb.click();
    }

    public void checkBoxClaimsPayments() {
        checkBoxClaimsPaymentsWeb.click();
    }

    public void adjudicateAdjudicationLink() {
        adjudicateAdjudicationLinkWeb.click();
    }

    public void verifyGlossaryExpected(String expectGlossaryResult) {
        String actualGlossaryResult = verifyGlossaryExpectedWeb.getText();
        Assert.assertEquals(actualGlossaryResult, expectGlossaryResult, "the expected result didn't match");
    }

    //=====================================================================================================================
    public void clickOnLetterTab() {
        clickOnLetterTabWeb.click();
    }

    public void clickOnLetterH() {
        clickOnLetterHWeb.click();
    }

    public void HealthCareFacilityLink() {
        HealthCareFacilityLinkWeb.click();
    }

    public void verifyHealthCare(String expectedResultHealthCare) {
        String actualResultHealthCare = verifyHealthCareWeb.getText();
        Assert.assertEquals(actualResultHealthCare, expectedResultHealthCare, "the actual didn't match");
    }


    //===========================================================================================
    //  //  Scenario: Cigna home page resource link check Health and Wellness
    public void HealthAndWellnessLink() {
        HealthAndWellnessLinkWeb.click();
    }

    public void clickOnAutismLink() {
        clickOnAutismLinkWeb.click();
    }

    public void AutismProgramLink() {
        AutismProgramWeb.click();
    }

    public void verifyAutismExpected(String expectedAutismResult) {
        String actualAutismResult = verifyAutismExpectedWeb.getText();
        Assert.assertEquals(actualAutismResult, expectedAutismResult, "the expect result didn't match");
    }


    //================================================================================================
//    //  Scenario: Cigna home page resource link check eating well
    public void clickOnEatingWell() {
        clickOnEatingWellWeb.click();
    }

    public void verifyExpectedEatWellDisplay(String expectedEatingWellResult) {
        String actualEatingWellResult = verifyExpectedEatWellDisplayWeb.getText();
        Assert.assertEquals(actualEatingWellResult, expectedEatingWellResult, "the actual result didn't match");
    }

    public void eatingDisorderLink() {
        eatingDisorderWeb.click();
    }
    //public void (){}
    //public void (){}


    //===========================================================================================================
// Cigna Third Party Administrators site

    public void AdministratorsLink() {
        AdministratorsLinkWeb.click();
    }

    public void toolFlyersLink() {
        toolFlyersLinkWeb.click();
    }

    public void userEnterFirstName() {
        getListOfWebElementsByCss("#fname");
        mouseHoverByCSSelector("#fname");
        userEnterFirstNameWeb.sendKeys("kim");
    }


    //================================================================================================
//Scenario: Cigna Third Party Administrators site check Your ACA Roadmap link
    public void ACARoadmapLink() {
        ACARoadmapLinkWeb.click();
    }

    public void selectSelfFunded() {
        selectOptionByVisibleText(selectSelfFundedWeb, "Self-funded");
    }

    public void selectAprilMonth() {
        selectOptionByVisibleText(selectAprilMonthWeb, "April");
    }

    public void selectGroupSize() {
        selectOptionByVisibleText(selectGroupSizeWeb, "1 – 50");
    }

    public void openEnrollmentStart() {
        selectOptionByVisibleText(openEnrollmentStartWeb, "March");
    }

    public void generateTimeline() {
        generateTimelineWeb.click();
    }

    public void enrollmentStart(String expectEnrollmentResult) {
        String actualResultEnrollmentStart = enrollmentStartWeb.getText();
        Assert.assertEquals(actualResultEnrollmentStart, expectEnrollmentResult, "the actual result didn't match");
    }


    //===============================================================================================================
    //Scenario: Cigna Employee plan and service on home delivery

    public void employeeLink() {
        mouseHoverByXpath1("//a[@id='employers-brokers-level-one-link']");
    }

    public void pharmacyLink() {
        pharmacyLinkWeb.click();
    }

    public void homeDeliveryLinkWeb() {
        homeDeliveryLinkWeb.click();
    }

    public void verifyServiceInformation(String expectedSerivceResult) {
        String actualServiceResult = verifyServiceInformationWeb.getText();
        Assert.assertEquals(actualServiceResult, expectedSerivceResult, "the result didn't match");

    }

    public void switchToHomeDelivery() {
        switchToHomeDeliveryWeb.click();
    }

//=============================================================================================================
    //   Scenario: Cinga home page Health care providers link check behavior credentialing functionality

    public void clickOnHealthProvidersLink() {
        mouseHoverByXpath1("//a[@href=\"/health-care-providers/index.html\"][@id=\"health-care-providers-level-one-link\"]");
        //clickOnHealthProvidersLinkWeb.click();
    }

    public void OnBehavioralCredential() {
        clickOnBehavioralCredential.click();
    }

    public void credentialingLink() {
        credentialingWeb.click();
    }

    public void clickFirstTimeCredential() {
        clickOnFirstTimeCredential.click();
    }

    public void verifyBehavioralResult(String expectBehavioralResult) {
        String actualBehavioralResult = verifyBehavioralResultLink.getText();
        Assert.assertEquals(actualBehavioralResult, expectBehavioralResult, "the actual didn't match");
    }

    //==================================================================================================
    //Cigna home page check Investors link
    @FindBy(xpath = clickOnInvestorsWebElement)
    public WebElement clickOnInvestorsWeb;
    @FindBy(css = clickOnGovernanceWebElement)
    public WebElement clickOnGovernanceWeb;
    @FindBy(xpath = corporateResponsibilityWebElement)
    public WebElement corporateResponsibilityWeb;
    @FindBy(xpath = verifyResultInvestorWebElement)
    public WebElement verifyResultInvestorWeb;


    @FindBy(xpath = secondQuarterWebElement)
    public WebElement secondQuarterWeb;
    @FindBy(xpath = selectHoursWebElement)
    public WebElement selectHoursWeb;
    @FindBy(xpath = inputEmailWebElement)
    public WebElement inputEmailWeb;
    @FindBy(xpath = clickOnSaveButtonWebElement)
    public WebElement clickOnSaveButtonWeb;


    //============================================================================================================
////Cigna home page check Investors link

    public void clickOnInvestors() {
        clickOnInvestorsWeb.click();


    }

    public void secondQuarterLink() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", secondQuarterWeb);
        waitUntilClickable("//a[@href=\"/events-and-presentations/event-details/2022/Second-Quarter-2022-Earnings-Release/default.aspx\"]");
        //This will scroll the page till the element is found
        //secondQuarterWeb.click();
    }

    public void selectHourLink() {
        selectOptionByVisibleText(selectHoursWeb, "24 Hours");
    }

    public void inputEmailTextField() {
        inputValueInTextWebElement(inputEmailWeb, "Test123@gmail.com");

    }

    public void clickOnSaveButton() {
        clickOnSaveButtonWeb.click();
    }

    public void clickOnGovernanceLink() {
        clickOnGovernanceWeb.click();
        mouseHoverByCSSelector("li[role='none'] button[aria-label='Governance']");
        //mouseHoverByXpath1("//li[@role='none']//button[@aria-label='Governance']");
        //  mouseHoverByXpath1("//*[@id=\"fmForm1\"]/div[2]/div/div[1]/div[1]/div[2]/div/span/span[2]/nav/ul/li[5]/button");
    }

    public void corporateResponsibilityLink() {
        corporateResponsibilityWeb.click();
    }

    public void verifyResultInvestor(String expectInvestorResult) {
        String actualInvestorResult = verifyResultInvestorWeb.getText();
        Assert.assertEquals(actualInvestorResult, expectInvestorResult, "the actual result didn't match");
    }

//===================================================================================================================

    @FindBy(xpath = clickOnSuppliersLinkWebElement)
    public WebElement clickOnSuppliersLinkWeb;

    @FindBy(xpath = InformationSuppliersWebElement)
    public WebElement InformationSuppliersWeb;
    @FindBy(xpath = policyGuidelinesWebElement)
    public WebElement policyGuidelinesWeb;
    @FindBy(xpath = supplierDiversityProgramWebElement)
    public WebElement supplierDiversityProgramWeb;
    @FindBy(xpath = verifySuppliersExpectedResult)
    public WebElement verifySuppliersExpected;


    public void clickOnSuppliersLink() {
        clickOnSuppliersLinkWeb.click();
    }

    public void InformationSuppliers() {
        InformationSuppliersWeb.click();
    }


    public void policyGuidelines() {
        policyGuidelinesWeb.click();
    }

    public void supplierDiversityProgram() {
        supplierDiversityProgramWeb.click();
    }

    public void verifySuppliersExpected(String expectSupplierResult) {
        String actualSupplierResult = verifySuppliersExpected.getText();
        Assert.assertEquals(actualSupplierResult, expectSupplierResult, "the actual didn't match");
    }
    //=======================================================================================================

    @FindBy(xpath = prescriptionDrugListWebElement)
    public WebElement prescriptionDrugListWeb;
    @FindBy(xpath = selectDrugListWebElement)
    public WebElement selectDrugListWeb;
    @FindBy(xpath = prescriptionDrugNameWebElement)
    public WebElement prescriptionDrugNameWeb;
    @FindBy(xpath = verifyExpectDrugSearchWebElement)
    public WebElement verifyExpectDrugSearchWeb;

    public void prescriptionDrugListWeb() {
        prescriptionDrugListWeb.click();
    }

    public void selectDrugList() {
        selectByVisibleTextFromSelect(selectDrugListWeb, "Advantage 3 Tier");
        selectDrugListWeb.click();

    }

    public void prescriptionDrugName() {
        prescriptionDrugNameWeb.sendKeys("E-CREAM ");
        prescriptionDrugNameWeb.click();
    }

    public void verifyExpectDrugSearch(String expectedResultDrugSearch) {
        String actualResultDrugSearch = verifyExpectDrugSearchWeb.getText();
        Assert.assertEquals(actualResultDrugSearch, expectedResultDrugSearch, "the actual didn't match ");

    }

    //======================================================================================
    @FindBy(xpath = internationalLinkWebElement)
    public WebElement internationalLinkWeb;
    @FindBy(xpath = startIndividualQuoteWebElement)
    public WebElement startIndividualQuoteWeb;

    @FindBy(xpath = enterFirstNameInputWebElement)
    public WebElement enterFirstNameInputWeb;


    public void internationalLink() {
        internationalLinkWeb.click();
    }

    public void startIndividualQuote() {
        startIndividualQuoteWeb.click();
    }

    public void enterFirstNameInput() {
        enterFirstNameInputWeb.sendKeys("Kim");
    }

    //================================================================================================
    @FindBy(xpath = newsroomLinkWebElement)
    public WebElement newsroomLinkWeb;
    @FindBy(xpath = pressReleaseWebElement)
    public WebElement pressReleaseWeb;
    @FindBy(xpath = selectPartnerShipWebElement)
    public WebElement selectPartnerShipWeb;
    @FindBy(xpath = clickOnGoButtonWebElement)
    public WebElement clickOnGoButtonWeb;


    public void newsroomLink(){
        newsroomLinkWeb.click();
    }
    public void pressReleaseLink(){
        waitUntilClickAble(By.xpath("//a[@class=\"wd_readmo\"][@href=\"https://newsroom.cigna.com/skills-and-traits-of-successful-leaders-in-2022\"]"));
//        getTextFromWebElements(".nav-link[href='latest-press-releases']");
//        mouseHoverByCSSelector(".nav-link[href='latest-press-releases']");
        pressReleaseWeb.click();
    }
    public void selectPartnerShip(){
        selectByVisibleTextFromSelect(selectPartnerShipWeb,"Partnerships");
       // selectPartnerShipWeb.click();
    }
    public void clickOnGoButton(){
        clickOnGoButtonWeb.click();
    }




    //public void (){}
    //public void (){}


}

