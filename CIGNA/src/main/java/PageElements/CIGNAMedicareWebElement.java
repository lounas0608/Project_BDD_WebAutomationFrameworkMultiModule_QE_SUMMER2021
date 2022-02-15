package PageElements;

public class CIGNAMedicareWebElement {
    public static final String clickOnMedicareWebElement = "//a[@id='medicare-level-one-link']";
    public static final String shopMedicareWebElement = "//ul[@class='menu-item link-lists']//a[normalize-space()='Shop Medicare Advantage Plans']";
    public static final String enterZipCodeWebElement = "//input[@id='zip-314']";
    public static final String verifyAvailablePlanWebElement = "//span[normalize-space()='Medicare Advantage Prescription Drug Plans']";
    //==============================================================================================================
    //shop for prescription Drug plan
    public static final String PrescriptionDrugPlansWebElement = "//ul[@class='menu-item link-lists']//a[normalize-space()='Shop Part D Prescription Drug Plans']";
    public static final String enterZipCode2WebElement = "//input[@id='zip-314']";
    public static final String shopButtonWebElement = "//form[@id='planfinder-314']//button[@type='submit'][normalize-space()='Shop for a plan']";
    public static final String selectPlanButtonWebElement = "//div[@id='PlanCard_KTMKPZNWJD']//vnext-shopping-cart-button[@class='col-4 d-none d-sm-block']";

    public static final String verifyExpectedResultDrugPlans = "//h3[normalize-space()='Prescription Drug Plan']";
//=================================================================================================================


    //shop for supplement Insurance
    public static final String supplementMedicarePlanWebElement = "//ul[@class='menu-item link-lists']//a[normalize-space()='Shop Medicare Supplement Insurance']";
    public static final String getOnlineQuoteWebElement = "//a[@class=\"btn btn-primary\"][@href=\"https://cignasupplemental.com/equotes/startInterview.action?campaign_ID=CSBORG&cid=s030\"]";
    //public static final String verifySupplementPlanWebElement="//h1[normalize-space()='Medicare Supplement Insurance Quote']";
    public static final String verifySupplementPlanWebElement = "//div[@class='col-sm-9']";
    public static final String enterZipCode3WebElement = "//input[@id='element-EE_ZIP_CODE']";
    //==============================================================================================================
    //individuals and families link
    public static final String individualsAndFamiliesWebElement = "//a[@id='individuals-families-level-one-link']";
    public static final String dentalInsuranceWebElement = "//a[normalize-space()='Dental Insurance']";
    public static final String getAQuoteButtonWebElement = "//a[normalize-space()='Get a quote']";
    public static final String enterHomeZipCodeWebElement = "//*[@id=\"uxFieldZipCode\"]";
    public static final String selectEffectiveStartDateWebElement = "//select[@name=\"ctl00$cph$uxFieldEffectiveDate\"][@id='uxFieldEffectiveDate']";
    public static final String enterFirstNameWebElement = "//input[@id='uxFieldFirstName']";
    //public static final String
    //public static final String
    //public static final String

    //====================================================================================================
    //medicare supplement for individuals and families
    public static final String medicareSupplementWebElement = "//a[normalize-space()='Medicare Supplement']";
    //public static final String quoteMedicareSupplementWebElement="//a[@class='btn btn-primary'][@aria-label=\"Get an online quote\"]";
    public static final String quoteMedicareSupplementWebElement = "//a[@class=\"btn btn-primary\"][@href=\"https://cignasupplemental.com/equotes/startInterview.action?campaign_ID=CSBORG&cid=s030\"]";

    public static final String enterZipCodeFieldWebElement = "//input[@id='element-EE_ZIP_CODE']";
    //public static final String
    //public static final String
    //public static final String
    //=======================================================================================================================================
    // health insurance for individual and families

    public static final String healthInsuranceFamiliesWebElement = "//a[normalize-space()='Health Insurance for Individuals and Families']";
    public static final String browseHealthInsuranceWebElement = "//p[12]//a[1]";
     public static final String zipCodeInputFieldWebElement="//input[@id=\"zip_code\"][@name=\"zip_code\"]";
    //public static final String zipCodeInputFieldWebElement = "//div[@class='flex-item plans-form']//div[1]";

    public static final String enterNameInputFieldWebElement = "//input[@id='name']";
    public static final String seeMyPlanButtonWebElement = "//form[@id='contact-form']//button[@type='submit'][normalize-space()='See plans and prices']";
    //public static final String
    //public static final String


    //==============================================================================================================
    public static final String searchBoxWebElement = "//input[@id='search-desktop']";
    public static final String clickOnSearchButtonWebElement = "//div[@class='input-group input-group-search rounded-0']//button[@aria-label='Search...']";
    public static final String verifyVisionExpectedResultWebElement = "//div[@class='search-results__keyword']//strong[contains(text(),'vision plan')]";
    //public static final String
    //public static final String
    //public static final String


//====================================================================================================================
//##################################################################################################################
//find a doctor need you

    public static final String findDoctorWebElement = "//a[normalize-space()='Find a Doctor, Dentist or Facility']";
    public static final String employerOrSchoolWebElement = "//span[normalize-space()='Employer or School']";
    public static final String enterZipCodeFindDoctorWebElement = "//input[@aria-label='Geolocation search']";
    public static final String clickOnFindADoctorLinkWebElement="//div[@role='tablist']//div[1]//div[1]//cigna-search-category-card[1]//div[1]//button[1]";
    public static final String enterTypeOfDoctorWEbElement="//input[@placeholder='Enter a specialty or type of doctor']";
//public static final String
//public static final String
    //========================================================================================

    public static final String clickOnDoctorByNameWebElement="//div[@class='search']//div[2]//div[1]//cigna-search-category-card[1]//div[1]//button[1]";
    public static final String inputDoctorByNameWebElement="//input[@placeholder=\"Enter a doctor's name\"]";

    //===================================================================================================
//  Cigna find a dental form information

    public static final String clickOnFindAFormWebElement="//a[normalize-space()='Find a Form']";
   public static final String clickOnDentalFormWebElement="//a[normalize-space()='Dental Forms']";
    public static final String verifyDentalFormWebElement="//strong[normalize-space()='Dental Claim Form']";
   public static final String clickOnDirectoryRequestWebElement="//a[normalize-space()='Dentist Directory Request']";
//========================================================================================================================
// Cigna vision form information

   public static final String clickOnVisionFormWebElement="//a[normalize-space()='Vision Forms']";
    public static final String verifyVisionFormWebElement="//strong[normalize-space()='Cigna Vision Claim Forms:']";

//=====================================================================
 //Cigna medica form information

    public static final String medicalFormWebElement="//a[normalize-space()='Medical Forms']";
    public static final String requestMedicalFormWebElement="//a[normalize-space()='Request a Medical ID card']";
    public static final String enterCignaHealthCareIDWebElement="//input[@id='Member_ID']";

//=======================================================================================================
   //Cigna search for dentist in the search box
    public static final String searchBoxInputDentistWebElement="//input[@id='search-desktop']";
    public static final String clickOnSearchBoxWebElement="//div[@class='input-group input-group-search rounded-0']//button[@aria-label='Search...']";
    public static final String verifyActualDentalResultWebElement="//strong[normalize-space()='DENTIST']";
    public static final String clickOnDentistryWebElement="//a[contains(text(),'Preventive Dentistry: What is Preventive Dental Ca')]";


    //===============================================================================
    //Cigna search for vision plan in the search box
    public static final String searchBoxInputVisionPlanWebElement="//input[@id='search-desktop']";
    //public static final String clickOnSearchBoxWebElement="//div[@class='input-group input-group-search rounded-0']//button[@aria-label='Search...']";
    //public static final String verifyActualVisionPlanResultWebElement="//strong[normalize-space()='VISION plan']";
    public static final String verifyActualVisionPlanResultWebElement="div[class='search-results__keyword'] strong";
    public static final String groupVisionInsurancePlansWebElement="//a[@href=\"https://www.cigna.com/employers-brokers/dental-and-vision/vision\"][@class=\"search-results__link\"]";
    public static final String clickOnConnectWithUsWebElement="//button[normalize-space()='Connect with Us']";
 //============================================================================================================

  //Cigna search for pediatrician in the search box

    public static final String searchBoxInputPediatricianWebElement="//input[@id='search-desktop']";
    //public static final String clickOnSearchBoxWebElement="//div[@class='input-group input-group-search rounded-0']//button[@aria-label='Search...']";
   public static final String verifyPediatricianWebElement="div[class='search-results__keyword'] strong";

    public static final String clickOnMedicalLibraryWebElement="//a[@id='cignahealthwise-tab']";
    public static final String clickOnIndividualsFamiliesWebElement="//a[@href=\"https://www.cigna.com/individuals-families/health-wellness/hw/pediatrician-ps2086\"][@class=\"search-results__link\"]";
 //=========================================================================================================
// Cigna search with invalid information in the search box

    public static final String searchJewelryInputBoxWebElement="//input[@id='search-desktop']";
    public static final String verifyInvalidResultWebElement="div[id='ls-gen30786245-ls-lqr'] p:nth-child(1)";
    //public static final String
//=====================================================================================
    //Cigna home search in the search box with special characters
    public static final String specialCharactersWebElement="//input[@id='search-desktop']";
    public static final String verifySpecialChartResultWebElement="div[id='ls-gen30786245-ls-lqr'] p:nth-child(1)";

    //===================================================================================================================
    //Cigna home search in the search box with mix of Letter, number and special characters
    public static final String LetterAndNumAndSpecialCharactersWebElement="//input[@id='search-desktop']";
    public static final String verifyLetterNumberSpecialChartResultWebElement="div[id='ls-gen30786245-ls-lqr'] p:nth-child(1)";


//=========================================================================================================
   //   Scenario: Cigna home page glossary link functionality
    public static final String clickOnGlossaryWebElement="//a[normalize-space()='Glossary']";
    public static final String clickOnCategoryTabWebElement="//a[@id='category-tab']";
    public static final String checkBoxClaimsPaymentsWebElement="//label[normalize-space()='Claims and Payments']";
    public static final String adjudicateAdjudicationLinkWebElement="//*[@id=\"category_5-content\"]/dl/dt[1]/a";
    public static final String verifyGlossaryExpectedWebElement="//h1[@class=\"display\"]";

  //=====================================================================================================

    public static final String clickOnLetterTabWebElement="//a[@id='letter-tab']";
    public static final String clickOnLetterHWebElement="//a[@id='letter_H-tab']";
    public static final String HealthCareFacilityLinkWebElement="//*[@id=\"letter_H-content\"]/dl/dt[3]/a";
    public static final String verifyHealthCareExpect="//dt[@class='healthcarefacility']//a[@href='#healthcarefacility'][normalize-space()='Health Care Facility']";

  //====================================================================================================
  //  Scenario: Cigna home page resource link check Health and Wellness


    public static final String HealthAndWellnessLinkWebElement="//a[@class='footer-text top-footer-nav-link'][normalize-space()='Health and Wellness']";
    public static final String clickOnAutismLinkWebElement="//a[@href='/individuals-families/health-wellness/topic-autism/index.html']";
    public static final String AutismProgramWebElement="//a[@href=\"/individuals-families/health-wellness/all-in-with-autism\"]";
    public static final String verifyAutismExpectedWebElement="//h1[normalize-space()='All In with Autism']";

   //=========================================================================
  //  Scenario: Cigna home page resource link check eating well

    public static final String clickOnEatingWellWebElement="//h4[normalize-space()='Eating Well']";
    public static final String verifyExpectedEatWellDisplayWebElement="//h1[normalize-space()='Eating Well']";
    public static final String eatingDisorderWebElement="//a[normalize-space()='Eating Disorders']";


  //=========================================================================================================
// Cigna Third Party Administrators site
    public static final String AdministratorsLinkWebElement="//a[@class='footer-text top-footer-nav-link'][normalize-space()='Third Party Administrators']";
    public static final String toolFlyersLinkWebElement="//p[contains(text(),'Together with the TPA, our goal is to educate memb')]//a[@class='link-external']";
    public static final String userEnterFirstNameWebElement="#fname";

 //===========================================================================================
//Scenario: Cigna Third Party Administrators site check Your ACA Roadmap link

    public static final String ACARoadmapLinkWebElement="//a[normalize-space()='Your ACA Roadmap']";
    public static final String selectSelfFundedWebElement="//select[@id='fundingType']";
    public static final String selectAprilMonthWebElement="//select[@id='renewDate']";
    public static final String selectGroupSizeWebElement="//select[@id='groupSize']";
    public static final String openEnrollmentStartWebElement="//select[@id='enrollDate']";
    public static final String generateTimelineWebElement="//button[@id='genNext']";
    public static final String enrollmentStartWebElement="//strong[normalize-space()='January 03 2022']";


  //================================================================================================
 //   Scenario: Cigna Employee plan and service on home delivery

    public static final String employeeLinkWebElement="//a[@id='employers-brokers-level-one-link']";
    public static final String pharmacyLinkWebElement="//a[@href='/employers-brokers/pharmacy/index.html']";
    public static final String homeDeliveryLinkWebElement="//a[normalize-space()='home delivery']";
    public static final String verifyServiceInformation="//h1[normalize-space()='Home Delivery Pharmacy']";
    public static final String switchToHomeDeliveryWebElement="//a[normalize-space()='Switch to Home Delivery Today']";
  //====================================================================================
  //  Scenario: Cinga home page Health care providers link check behavior credentialing functionality

    public static final String clickOnHealthProvidersLinkWebElement="//a[@href=\"/health-care-providers/index.html\"][@id=\"health-care-providers-level-one-link\"]";
    public static final String clickOnBehavioralCredentialing="//a[normalize-space()='Behavioral Credentialing']";
    public static final String credentialingWebElement="//a[@id='yvfie-2-tab']";
    public static final String clickOnFirstTimeCredentialing="//a[@id='yvfie-1-tab']";
    public static final String verifyBehavioralResult="//h1[normalize-space()='Cigna Behavioral Health Network Credentialing']";

//=======================================================================================================================
//Cigna home page check Investors link
    public static final String clickOnInvestorsWebElement="//a[@href=\"https://investors.cigna.com/home/default.aspx\"]";
    public static final String secondQuarterWebElement="//*[@id=\"_ctrl0_ctl69_divModuleContainer\"]/div/div/div/div/div[2]/div/div[1]";
    public static final String selectHoursWebElement="//select[@id='_ctrl0_ctl63_ddlReminderPeriod']";
    public static final String inputEmailWebElement="//input[@id='_ctrl0_ctl63_txtEmail']";
    public static final String clickOnSaveButtonWebElement="//input[@id='_ctrl0_ctl63_btnSaveReminder']";

   // public static final String clickOnGovernanceWebElement="//*[@id=\"fmForm1\"]/div[2]/div/div[1]/div[1]/div[2]/div/span/span[2]/nav/ul/li[5]/button";
    public static final String clickOnGovernanceWebElement="li[role='none'] button[aria-label='Governance']";

    public static final String corporateResponsibilityWebElement="//li[@role=\"none\"]//a[@href=\"https://www.cigna.com/about-us/corporate-responsibility/\"] [normalize-space()='Cigna Corporate Responsibility']";
    public static final String verifyResultInvestorWebElement="//h1[normalize-space()='Corporate Responsibility']";
 //=========================================================================================================================

    public static final String clickOnSuppliersLinkWebElement="//a[@href=\"/about-us/supplier-community/\"]";
    public static final String InformationSuppliersWebElement="//a[@href=\"/about-us/supplier-community/information-for-current-suppliers.html\"]";
    public static final String policyGuidelinesWebElement="//a[@href=\"/about-us/supplier-community/policy-guidelines.html\"]";
    public static final String supplierDiversityProgramWebElement="//ul[@class='link-lists list-no-indent']//a[normalize-space()='Supplier Diversity Program']";
    public static final String verifySuppliersExpectedResult="//h1[normalize-space()='Supplier Diversity Program']";
 //=================================================================================================================================

    public static final String prescriptionDrugListWebElement="//a[normalize-space()='See Prescription Drug List']";
    public static final String selectDrugListWebElement="//select[@id='cigna-input-1']";

    public static final String prescriptionDrugNameWebElement="//input[@id='gl-lookingForText']";
    public static final String verifyExpectDrugSearchWebElement="//b[normalize-space()='E-CREAM']";
 //========================================================================================================
    public static final String internationalLinkWebElement="//a[@class='footer-text top-footer-nav-link link-external']//span[@class='text-md-nowrap'][normalize-space()='International']";
    public static final String startIndividualQuoteWebElement="//a[@class='image-teaser__heading-link'][normalize-space()='Employers']";
    public static final String enterFirstNameInputWebElement="//*[@id=\"mainMemberFirstName\"]";
    //public static final String

 //===============================================================================================================================
    public static final String newsroomLinkWebElement="//a[@class=\"footer-text top-footer-nav-link\"][normalize-space()='Newsroom']";
    public static final String pressReleaseWebElement="//a[@class=\"wd_readmo\"][@href=\"https://newsroom.cigna.com/skills-and-traits-of-successful-leaders-in-2022\"]";
    public static final String selectPartnerShipWebElement="//select[@id='item_basic_search_2429_category']";
    public static final String clickOnGoButtonWebElement="//button[normalize-space()='Go']";

    //public static final String
    //public static final String















}









