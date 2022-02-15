package steps;

import configuration.common.WebBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.CIGNAMedicarePage;

import java.net.MalformedURLException;

public class CIGNAMedicare extends WebBase {

    CIGNAMedicarePage medicarePlan;
    @BeforeStep
    public void getInit(){
        medicarePlan= PageFactory.initElements(driver, CIGNAMedicarePage.class);

    }

    //shop for medicare plan
    @Given("user on CIGNA home page")
    public void userOnCIGNAHomePage() throws InterruptedException {
        Thread.sleep(2000);
    }
    @And("user click on medicare")
    public void userClickOnMedicare() throws InterruptedException {
        medicarePlan.clickOnMedicare();
        Thread.sleep(2000);
    }

    @And("user click on shop medicare advantage plans")
    public void userClickOnShopMedicareAdvantagePlans() {
     medicarePlan.shopMedicare();
    }
//===========================================================================================


    @And("user enter vision plan in the search field")
    public void userEnterVisionPlanInTheSearchField() throws InterruptedException {
        medicarePlan.CIGNASearchBox();
        wait(6);
    }


    @And("user click on search box")
    public void userClickOnSearchBox() throws InterruptedException {
        medicarePlan.clickOnSearchButton();
        wait(8);
    }

    @Then("user see the vision plan related information is display")
    public void userSeeTheVisionPlanRelatedInformationIsDisplay() throws InterruptedException {
        waitFor(8);
        medicarePlan.verifyVisionExpectedResult("vision plan");

    }


    @And("user enter zip code in the text field")
    public void userEnterZipCodeInTheTextField() throws InterruptedException {
        medicarePlan.enterZipCode();
        Thread.sleep(3000);
    }

    @Then("user see available plan display")
    public void userSeeAvailablePlanDisplay() throws InterruptedException {
        medicarePlan.verifyAvailablePlan("Medicare Advantage Prescription Drug Plans");
        Thread.sleep(2000);
    }
//============================================================================================================
    //shop for prescription Drug plan
    @And("user click on Shop Part D Prescription Drug Plans")
    public void userClickOnShopPartDPrescriptionDrugPlans() {
        medicarePlan.PrescriptionDrugPlans();
    }

    @And("user enter zip code in the text filed")
    public void userEnterZipCodeInTheTextFiled() {
        medicarePlan.enterZipCode2();
    }

    @Then("user see the drug plan display")
    public void userSeeTheDrugPlanDisplay() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.verifyExpectedResultDrugPlan("Prescription Drug Plan");
    }
    @And("user click on select plan button")
    public void userClickOnSelectPlanButton() {
        medicarePlan.selectPlanButton();
    }
    @And("user click on supplement insurance")
    public void userClickOnSupplementInsurance() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.supplementMedicarePlan();
    }

    @And("user click on get a online quote button")
    public void userClickOnGetAOnlineQuoteButton() throws InterruptedException {
        medicarePlan.getOnlineQuote();
        Thread.sleep(2000);
    }

    @Then("user see the supplement insurance information display")
    public void userSeeTheSupplementInsuranceInformationDisplay() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.verifySupplementPlan("Medicare Supplement Insurance Quote");
    }

    @And("user enter zip code in text field")
    public void userEnterZipCodeInTextField() {
        medicarePlan.enterZipCode3();
    }
//================================================================================================
    //individuals and families link
    @And("user click on individuals and families link")
    public void userClickOnIndividualsAndFamiliesLink() {
        medicarePlan.individualsAndFamiliesWeb();
    }

    @And("user click on dental insurance link")
    public void userClickOnDentalInsuranceLink() {
        medicarePlan.dentalInsurance();
    }

    @And("user click on get a quote")
    public void userClickOnGetAQuote() {
        medicarePlan.getAQuoteButton();
    }

    @And("user enter home zip code text field")
    public void userEnterHomeZipCodeTextField() throws InterruptedException {
        Thread.sleep(5000);
        medicarePlan.enterHomeZipCode();
    }

    @And("user select start effective date")
    public void userSelectStartEffectiveDate() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.selectEffectiveStartDate();
    }

    @And("user enter first name in text field")
    public void userEnterFirstNameInTextField() {
        medicarePlan.enterFirstName();
    }
//====================================================================================================
    // health insurance for individual and families

    @And("user click on health insurance for individuals families link")
    public void userClickOnHealthInsuranceForIndividualsFamiliesLink() {
        medicarePlan.healthInsuranceFamilies();
    }

    @And("user click on browser health insurance plan")
    public void userClickOnBrowserHealthInsurancePlan() {
        medicarePlan.browseHealthInsurance();
    }

    @And("user enter zip code in the input filed")
    public void userEnterZipCodeInTheInputFiled() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.zipCodeInputField();

    }

    @And("user enter name in the input field")
    public void userEnterNameInTheInputField() {
        medicarePlan.enterNameInputField();
    }

    @And("user click on see my plan link")
    public void userClickOnSeeMyPlanLink() {
        medicarePlan.seeMyPlanButton();
    }
//================================================================================================================
   //    //medicare supplement for individuals and families



    @And("user click on medicare supplement link")
    public void userClickOnMedicareSupplementLink(){

        medicarePlan.medicareSupplement();
    }
    @And("user click on get quote medicare supplement")
    public void userClickOnGetQuoteMedicareSupplement() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.quoteMedicareSupplement();
    }


    @And("user enter zip code where you live")
    public void userEnterZipCodeWhereYouLive() {
        medicarePlan.enterZipCodeField();
    }
//=================================================================================================
 //#####################################################################################



    @And("user click on find a doctor and dentist or facility")
    public void userClickOnFindADoctorAndDentistOrFacility() {
        medicarePlan.findDoctorLink();
    }

    @And("user click on employer or school")
    public void userClickOnEmployerOrSchool() {
        medicarePlan.employerOrSchool();
    }

    @And("user enter zip code to find doctor near")
    public void userEnterZipCodeToFindDoctorNear() throws InterruptedException {
        medicarePlan.enterZipCodeFindDoctor();
        Thread.sleep(3000);
    }


    @And("user click on doctor by type")
    public void userClickOnDoctorByType() throws InterruptedException {
        medicarePlan.clickOnFindADoctorLink();
        Thread.sleep(5000);
    }

    @And("user enter type of doctor in text field")
    public void userEnterTypeOfDoctorInTextField() {
        medicarePlan.enterTypeOfDoctor();
    }

    @And("user click on doctor by name link")
    public void userClickOnDoctorByNameLink() {
        medicarePlan.clickOnDoctorByName();
    }
    @And("user enter doctor name in the input field")
    public void userEnterDoctorNameInTheInputField() throws InterruptedException {
        medicarePlan.inputDoctorByName();
        Thread.sleep(4000);
    }
    @And("user click on find a form link")
    public void userClickOnFindAFormLink() {
        medicarePlan.clickOnFindAForm();
    }

    @And("user click on dental forms")
    public void userClickOnDentalForms() {
        medicarePlan.clickOnDentalForm();
    }

    @Then("user see dental information is display")
    public void userSeeDentalInformationIsDisplay() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.verifyDentalForm("Dental Claim Form");
    }
    @And("user click on dentist directory request")
    public void userClickOnDentistDirectoryRequest() {
        medicarePlan.clickOnDirectoryRequest();
    }

    @And("user click on vision form")
    public void userClickOnVisionForm() {
        medicarePlan.clickOnVisionForm();
    }

    @Then("user see vision form information is display")
    public void userSeeVisionFormInformationIsDisplay() {
        medicarePlan.verifyVisionForm("Cigna Vision Claim Forms:");
    }
    @And("user click on medical form link")
    public void userClickOnMedicalFormLink() {
        medicarePlan.medicalFormLink();
    }
    @And("user click on request a medical ID card")
    public void userClickOnRequestAMedicalIDCard() {
        medicarePlan.requestMedicalForm();
    }
    @And("enter CIGNA healthCare ID number")
    public void enterCIGNAHealthCareIDNumber() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.enterCignaHealthCareID();
    }

//===================================================================================================================
    //Cigna search for dentist in the search box

    @And("user enter dentist in the search box")
    public void userEnterDentistInTheSearchBox() {
        medicarePlan.searchBoxInputDentist();
    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton() {
        medicarePlan.clickOnSearchBox();
    }

    @Then("user see dentist information is display")
    public void userSeeDentistInformationIsDisplay() {
        medicarePlan.verifyActualDentalResult("DENTIST");

    }

    @And("user click on what preventive dentistry link")
    public void userClickOnWhatPreventiveDentistryLink() {
        medicarePlan.clickOnDentistry();
    }
//==============================================================================================
    //Cigna search for vision plan in the search box

    @And("user enter vision plan in the search box")
    public void userEnterVisionPlanInTheSearchBox() {
        medicarePlan.searchBoxInputVisionPlan();
    }

    @Then("user see vision plan information is display")
    public void userSeeVisionPlanInformationIsDisplay() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.verifyActualVisionPlanResult("vision plan");
    }

    @And("user click on group vision insurance plans for employee")
    public void userClickOnGroupVisionInsurancePlansForEmployee() throws InterruptedException {
        medicarePlan.groupVisionInsurancePlans();
        Thread.sleep(4000);
    }
    @And("user click on connect with us link")
    public void userClickOnConnectWithUsLink() throws InterruptedException {
        medicarePlan.clickOnConnectWithUs();
        Thread.sleep(4000);
    }
//================================================================================================
    //Cigna search for pediatrician in the search box


    @And("user enter pediatrician in the search box")
    public void userEnterPediatricianInTheSearchBox() {
        medicarePlan.searchBoxInputPediatrician();
    }

    @Then("user see pediatrician information is display")
    public void userSeePediatricianInformationIsDisplay() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.verifyPediatricianWeb("Pediatrician");

    }

    @And("user click on medical library")
    public void userClickOnMedicalLibrary() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.clickOnMedicalLibrary();

    }

    @And("user click on individuals families link")
    public void userClickOnIndividualsFamiliesLink() throws InterruptedException {
        medicarePlan.clickOnIndividualsFamilies();
        Thread.sleep(4000);
    }
//======================================================================================================
    // Cigna search with invalid information in the search box

    @And("user enter Jewelry in the search box")
    public void userEnterJewelryInTheSearchBox() {
        medicarePlan.searchJewelryInputBox();
    }

    @Then("user see error message display")
    public void userSeeErrorMessageIsDisplay() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.verifyInvalidResult("Your search for \"jewelry\" did not match any pages or documents.");

    }
//=========================================================================================================
    //Cigna home search in the search box with special characters
    @And("user enter special characters in the search box")
    public void userEnterSpecialCharactersInTheSearchBox() {
        medicarePlan.specialCharacters();
    }


    @Then("user see error message Your search did not match any pages or documents")
    public void userSeeErrorMessageYourSearchDidNotMatchAnyPagesOrDocuments() throws InterruptedException {
        Thread.sleep(6000);
        medicarePlan.verifySpecialChartResult("Your search for \"!!!\" did not match any pages or documents.");

    }

    @And("user enter letter and number and special characters in the search box")
    public void userEnterLetterAndNumberAndSpecialCharactersInTheSearchBox() {
        medicarePlan.LetterAndNumAndSpecialCharacters();
    }

    @Then("user see Your search did not match any pages or documents error message")
    public void userSeeYourSearchDidNotMatchAnyPagesOrDocumentsErrorMessage() {
        medicarePlan.verifyLetterNumberSpecialChartResult("Your search for \"AAA12223!!!\" did not match any pages or documents.");
    }
//=================================================================================================================

   //   Scenario: Cigna home page glossary link functionality


    @And("user click on glossary link")
    public void userClickOnGlossaryLink() {
        medicarePlan.clickOnGlossary();
    }

    @And("user click on category tab")
    public void userClickOnCategoryTab() {
        medicarePlan.clickOnCategoryTab();
    }

    @And("user checkBox claims and payments")
    public void userCheckBoxClaimsAndPayments() {
        medicarePlan.checkBoxClaimsPayments();
    }

    @When("click on Adjudicate Adjudication link")
    public void clickOnAdjudicateAdjudicationLink() {
        medicarePlan.adjudicateAdjudicationLink();
    }

    @Then("user see glossary information is display")
    public void userSeeGlossaryInformationIsDisplay() {
        medicarePlan.verifyGlossaryExpected("Glossary");
    }
//=======================================================================================

    @And("user click on Letter tab")
    public void userClickOnLetterTab() {
        medicarePlan.clickOnLetterTab();
    }

    @And("user click on letter H")
    public void userClickOnLetterH() {
        medicarePlan.clickOnLetterH();
    }

    @And("click on Health Care Facility link")
    public void clickOnHealthCareFacilityLink() {
        medicarePlan.HealthCareFacilityLink();
    }

    @Then("user see Health Care Facility information is display")
    public void userSeeHealthCareFacilityInformationIsDisplay() throws InterruptedException {
        Thread.sleep(2000);
        medicarePlan.verifyHealthCare("Health Care Facility");
    }
//================================================================================================================
  //  //  Scenario: Cigna home page resource link check Health and Wellness
    @And("user click on Health and Wellness link")
    public void userClickOnHealthAndWellnessLink() {
        medicarePlan.HealthAndWellnessLink();
    }

    @And("click on Autism link")
    public void clickOnAutismLink() {
        medicarePlan.clickOnAutismLink();
    }

    @And("click on Learn more about the All In with Autism program")
    public void clickOnLearnMoreAboutTheAllInWithAutismProgram() {
        medicarePlan.AutismProgramLink();
    }

    @Then("user see Autism related information is display")
    public void userSeeAutismRelatedInformationIsDisplay() {
        medicarePlan.verifyAutismExpected("All In with Autism");
    }
//=================================================================================================
    //    //  Scenario: Cigna home page resource link check eating well
    @When("user click on eating well")
    public void userClickOnEatingWell() {
        medicarePlan.clickOnEatingWell();
    }

    @Then("user see Eat well is display")
    public void userSeeEatWellIsDisplay() {
        medicarePlan.verifyExpectedEatWellDisplay("Eating Well");
    }

    @And("user click on eating disorder")
    public void userClickOnEatingDisorder() {
        medicarePlan.eatingDisorderLink();
    }
//=============================================================================================================
    // Cigna Third Party Administrators site
    @And("user click on Third Party Administrators under About Cigna")
    public void userClickOnThirdPartyAdministratorsUnderAboutCigna() {
        medicarePlan.AdministratorsLink();
    }

    @And("user click on Get tools and flyers to share with your clients link")
    public void userClickOnGetToolsAndFlyersToShareWithYourClientsLink() {
        medicarePlan.toolFlyersLink();
    }

    @And("user enter first name")
    public void userEnterFirstName() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.userEnterFirstName();
    }
//=========================================================================================
    //Scenario: Cigna Third Party Administrators site check Your ACA Roadmap link
    @And("user click on Your ACA Roadmap link")
    public void userClickOnYourACARoadmapLink() {
        medicarePlan.ACARoadmapLink();
    }

    @And("user select self funded from the dropDown Your funding type")
    public void userSelectSelfFundedFromTheDropDownYourFundingType() {
        medicarePlan.selectSelfFunded();
    }

    @And("user select April from the dropDown Renewal month")
    public void userSelectAprilFromTheDropDownRenewalMonth() {
        medicarePlan.selectAprilMonth();
    }

    @And("user select Group size from the dropdown")
    public void userSelectGroupSizeFromTheDropdown() {
        medicarePlan.selectGroupSize();
    }

    @And("user select Open Enrollment start from the dropDown")
    public void userSelectOpenEnrollmentStartFromTheDropDown() {
        medicarePlan.openEnrollmentStart();
    }

    @When("user click on Generate Timeline button")
    public void userClickOnGenerateTimelineButton() {
        medicarePlan.generateTimeline();
    }

    @Then("user see enrollment start date is display")
    public void userSeeEnrollmentStartDateIsDisplay() {
        medicarePlan.enrollmentStart("January 03 2022");
    }
//=============================================================================================

    @And("user click on employee link")
    public void userClickOnEmployeeLink() {
        medicarePlan.employeeLink();
    }

    @And("user click on pharmacy link")
    public void userClickOnPharmacyLink() {
        medicarePlan.pharmacyLink();
    }

    @And("click on home delivery link")
    public void clickOnHomeDeliveryLink() {
        medicarePlan.homeDeliveryLinkWeb();
    }

    @Then("user see home delivery service information is display")
    public void userSeeHomeDeliveryServiceInformationIsDisplay() {
        medicarePlan.verifyServiceInformation("Home Delivery Pharmacy");
    }

    @And("user click on switch to home delivery today")
    public void userClickOnSwitchToHomeDeliveryToday() {
        medicarePlan.switchToHomeDelivery();
    }
//======================================================================================================================

    @And("click on Health care providers link")
    public void clickOnHealthCareProvidersLink() {
        medicarePlan.clickOnHealthProvidersLink();
    }


    @And("user click on Behavioral Credentialing link")
    public void userClickOnBehavioralCredentialingLink() {
        medicarePlan.OnBehavioralCredential();
    }

    @And("user click on Re credentialing link")
    public void userClickOnReCredentialingLink() {
        medicarePlan.credentialingLink();
    }

    @And("user click on first time credentialing")
    public void userClickOnFirstTimeCredentialing() {
       medicarePlan.clickFirstTimeCredential();
    }

    @Then("user see Cigna Behavioral Health Network Credentialing")
    public void userSeeCignaBehavioralHealthNetworkCredentialing() {
        medicarePlan.verifyBehavioralResult("Cigna Behavioral Health Network Credentialing");
    }
//=================================================================================================
    //Cigna home page check Investors link

    @And("user click on investors")
    public void userClickOnInvestors() {
        medicarePlan.clickOnInvestors();
    }

    @And("user click on Governance")
    public void userClickOnGovernance() throws InterruptedException {
        Thread.sleep(3000);
        medicarePlan.clickOnGovernanceLink();
    }

    @And("user click on Cigna Corporate Responsibility link")
    public void userClickOnCignaCorporateResponsibilityLink() {
        medicarePlan.corporateResponsibilityLink();
    }

    @Then("user see Corporate Responsibility for investor is display")
    public void userSeeCorporateResponsibilityForInvestorIsDisplay() {
        medicarePlan.verifyResultInvestor("Corporate Responsibility");
    }

    @And("user click on Second Quarter Earnings Release")
    public void userClickOnSecondQuarterEarningsRelease() {
        medicarePlan.secondQuarterLink();
    }

    @And("user select hour from dropDown")
    public void userSelectHourFromDropDown() {
        medicarePlan.selectHourLink();
    }

    @And("user enter email in the input text field")
    public void userEnterEmailInTheInputTextField() {
        medicarePlan.inputEmailTextField();
    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        medicarePlan.clickOnSaveButton();
    }
//========================================================================================================================

    @And("user click on Suppliers link")
    public void userClickOnSuppliersLink() {
        medicarePlan.clickOnSuppliersLink();

    }

    @And("user click on Information for Current Suppliers")
    public void userClickOnInformationForCurrentSuppliers() {
        medicarePlan.InformationSuppliers();
    }

    @And("user click on Policy Guidelines")
    public void userClickOnPolicyGuidelines() {
        medicarePlan.policyGuidelines();
    }

    @And("user click on Supplier Diversity Program")
    public void userClickOnSupplierDiversityProgram() {
        medicarePlan.supplierDiversityProgram();
    }

    @Then("user see Supplier Diversity Program")
    public void userSeeSupplierDiversityProgram() {
        medicarePlan.verifySuppliersExpected("Supplier Diversity Program");
    }
//===============================================================================================
    // Scenario: Cigna home page See Prescription Drug List link
    @And("user click on See Prescription Drug List link")
    public void userClickOnSeePrescriptionDrugListLink() {
        medicarePlan.prescriptionDrugListWeb();
    }

    @And("user select on Advantage Tier from the dropDown")
    public void userSelectOnAdvantageTierFromTheDropDown() {
        medicarePlan.selectDrugList();

    }

    @And("user enter Prescription Drug Name in the search field")
    public void userEnterPrescriptionDrugNameInTheSearchField() {
        medicarePlan.prescriptionDrugName();
    }

    @Then("user see the search prescription drug name display")
    public void userSeeTheSearchPrescriptionDrugNameDisplay() {
        medicarePlan.verifyExpectDrugSearch("E-CREAM");
    }
//=============================================================================================
    @And("user click on international")
    public void userClickOnInternational() {
        medicarePlan.internationalLink();
    }

    @And("user click on start individual quote link")
    public void userClickOnStartIndividualQuoteLink() {
        medicarePlan.startIndividualQuote();
    }

    @And("user enter first name in the input text field")
    public void userEnterFirstNameInTheInputTextField() {
        medicarePlan.enterFirstNameInput();
    }
//=========================================================================================================
    @And("user click on Newsroom link")
    public void userClickOnNewsroomLink() throws InterruptedException {
        Thread.sleep(4000);
        medicarePlan.newsroomLink();
    }

    @And("user click on Press Releases link")
    public void userClickOnPressReleasesLink() throws InterruptedException {
        Thread.sleep(4000);
        medicarePlan.pressReleaseLink();
    }

    @And("user select partnerShip from the dropDown")
    public void userSelectPartnerShipFromTheDropDown() {
        medicarePlan.selectPartnerShip();
    }

    @And("user click on Go button")
    public void userClickOnGoButton() {
        medicarePlan.clickOnGoButton();
    }


    //=========================================================================================================



















}


