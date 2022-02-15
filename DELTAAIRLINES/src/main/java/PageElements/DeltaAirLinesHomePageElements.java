package PageElements;


import org.openqa.selenium.support.PageFactory;

public class DeltaAirLinesHomePageElements {
    //  Scenario: Delta air line home page Travel info in stay safe link

    public static final String travelInfoLinkWebElement = "//a[@id='headSectab1']";
    public static final String clickOnStaySafeLinkWebElement = "//*[@id=\"secondary-static-link-1\"]";
    public static final String verifyExpectStaySafeWebElement = "//b[normalize-space()='Our Commitment to Cleanliness is Here to Stay']";

    //==================================================================================================================
    //  Scenario: Delta air line home page Travel info link
    public static final String travelPlaningCenterElement = "//div[@class='col-lg-6 col-md-12 col-secondary-links']//li[1]";
    public static final String knowBeforeYouGoWebElement = "//a[@href=\"#infocollapseInner2\"]";
    public static final String testingResourcesWebElement = "//li[contains(@class,'additional-nav-item')]//a[normalize-space()='Testing Resources']";
    public static final String verifyTestingResultWebElement = "//span[@class=\"h1\"] [normalize-space()='Testing Resources']";
//==========================================================================================================
    //   Scenario: Delta air line home Travel info for U.S. Entry Requirements
    public static final String USEntryRequirementsWebElement="//a[@href=\"/us/en/travel-planning-center/know-before-you-go/us-entry-requirements\"]";
    public static final String verifyUSEntryResultWebElement="//h2[normalize-space()='U.S. Entry Requirements']";

  //============================================================================================================
   // Scenario: Delta air line home page Travel info for flight deals

    public static final String flightDealsWebElement="//a[@id='secondary-static-link-7']";
     public static final String withInUSLinkWebElement="//h3[normalize-space()='Flight Deals From/Within The U.S.']";
    public static final String chooseOriginWebElement="//div[@class=\"col-md-4 col-6 xcheckDropDown fromAirportCode-align\"]";
    public static final String DestinationLinkWebElement="//div[@class='col-md-4 col-6 xcheckDropDown toAirportCode-align']//span[@role='combobox']";
    public static final String verifyRoundTripFareWebElement="/html/body/div[3]/div[2]/div[1]/div/div/div/div/div";

 //===============================================================================================================

    public static final String baggageLinkWebElement="//*[@id=\"secondary-static-link-3\"]";
    public static final String InputOriginTextWebElement="//input[@aria-label='Origin']";
    public static final String inputDestinationTextWebElement="//*[@id=\"input_destination-container\"]/idp-input/div/div/input";
    public static final String ChooseMainCabinWebElement="//div[@id='idp-input_onboard_experience__selected']";

    public static final String SelectDateFromCalenderWebElement ="//div[@id='idp-input_date_purchase__selected']";
    public static final String CalenderSelectDateWebElement="//idp-molecule-calendar-dropdown[@id='input_date_purchase']//div[@aria-label='27 February 2022, Sunday']";
    public static final String  calculateEstimateWebElement ="//button[normalize-space()='Calculate Estimate']";
    public static final String verifyBaggageEstimateWebElement="//h3[normalize-space()='Calculate Baggage Estimate']";

    public static final String selectTravelDateWebElement="//idp-molecule-calendar-dropdown[@id='input_date_travel']//div[@aria-label='28 February 2022, Monday']//div[@class='calendar-table__item']";
    public static final String travelDateWebElement="//div[@id='idp-input_date_travel__selected']";

  //===========================================================================================================
  //  Scenario: Delta air line home page Travel info for Explore Top Destinations
    public static final String findYourDestinationWebElement="//a[normalize-space()='Find Your Destination']";
    public static final String exploreTopDestinationsWebElement="//a[normalize-space()='Explore Top Destinations']";
    public static final String oneWayRadioButtonWebElement="//label[normalize-space()='One Way']";
    public static final String originFromDropDownWebElement="//input[@id='smt-combobox-labeledby-origin']";
    public static final String destinationFromDropDownWebElement="//input[@id='smt-combobox-labeledby-destination']";
    public static final String selectNationalityDropDownWebElement="//input[@id='smt-combobox-labeledby-nationality']";
    public static final String selectResidencyDropDownWebElement="//input[@id='smt-combobox-labeledby-residence']";
    //public static final String selectResidencyDropDownWebElement="//button[@id='smt-combobox-labeledby-list-residence']";
    public static final String selectVaccinationDropDownWebElement="//input[@id='smt-combobox-labeledby-vaccinated']";
    public static final String searchButtonToExploreWebElement="//button[@id='smt-covwidget-filters_search']";
    public static final String verifyExploreDestinationWebElement="//*[@id=\"smt-covwidget-map-title\"] ";

   //===============================================================================================================

    //Scenario: Delta air line home page Travel info for CHANGE OR CANCEL YOUR TRIP
    public static final String changeOrCancelTRIPLinkWebElement="//a[normalize-space()='Change or Cancel Your Trip']";
    public static final String howToCancelOrChangeFlightWebElement="//*[@id=\"infocollapseInner3\"]/div/ul/li[3]/a";
    public static final String changeOrCancelLinkWebElement="//div[@class='info-content-container']//li[4]//a[1]";
    public static final String verifyCancelInformationResult="//span[contains(text(),'Step 4: Begin the Flight Change or Cancellation Pr')]";

//===================================================================================================================================
//  Scenario: Delta air line home page Travel info for Rent a car functionality
    public static final String rentCarLinkWebElement="//*[@id=\"secondary-static-link-14\"]";
    public static final String enterPickUpLocationWebElement="//input[@id=\"carPickUpLocation\"]";
    public static final String choosePickUpDateFromCalenderWebElement="//input[@id='carPickUpDate']";
    public static final String chooseDropOffDateFromCalenderWEbElement="//input[@id=\"carDropOffDate\"]";
    public static final String selectPickUpTimeWebElement="//span[@id='carPickUpTime-button']";
    public static final String selectDropOffTimeWebElement="//span[@id='carDropOffTime-button']";
    public static final String clickOnBookACarWebElement="//input[@id='btnSubmit']";
//=================================================================================================
    // Scenario: Delta air line home page Travel info for shop hotels link
    public static final String shopHotelsLinkWebElement="//*[@id=\"secondary-static-link-15\"]";
    public static final String inputDestinationsWebElement="//input[@id='qf-0q-destination']";
    public static final String checkInDateWebElement="//input[@id='qf-0q-localised-check-in']";
    public static final String checkOutDateWebElement="//input[@id='qf-0q-localised-check-out']";
    public static final String SearchButtonShopHotelsWebElement="//input[@id='qf-0q-localised-check-in']";
    public static final String verifyShopResultWebElement="//h1[normalize-space()='Santa Fe, New Mexico, United States of America']";
  //====================================================================================================================
  //  Scenario: Delta air line home page Travel info for airCraft Link
    public static final String clickOnAirCraftWebElement="//*[@id=\"secondary-static-link-12\"]";
    public static final String clickOnAirBusWebElement="//span[normalize-space()='Airbus A350']";
    public static final String  aircraftSpecificationWebElement ="//a[@href='#aircraftSpec']";
    public static final String verifyAirCraftResultWebElement="//h2[normalize-space()='Aircraft Specifications']";
    //public static final String
    //public static final String

//================================================================================================================
//  Scenario: Delta air line home page Booking functionality

    public static final String clickOnBookingLinkWebElement="";
    public static final String clickOnDestinationWebElement="//span[normalize-space()='To']";
    public static final String inputDestinationWebElement="//input[@id='search_input']";
    public static final String clickOnRoundWayWebElement="//span[@aria-labelledby=\"selectTripType-label\"]";

    public static final String clickOnOneWayLinkWebElement="//li[@id='ui-list-selectTripType1']";
    public static final String clickOnDepartLinkWebElement="//div[@id='input_departureDate_1']";
    public static final String chooseCalenderDateWebElement="//a[@aria-label='28 February 2022, Monday']";
    public static final String clickOnArrowSignWebElement="//button[@id='btn-book-submit']";
    public static final String verifyOneWayBookingWebElement="//span[@class='destinationairportcode']";



    public static final String roundTripTravelDateWebElement="//a[normalize-space()='2']";
    public static final String arrivingDateTravelDateWebElement="//a[@aria-label='30 March 2022, Wednesday']";
    public static final String verifyRoundTripWebElement="//span[@class='destinationairportcode']";
//=============================================================================================================================
//  Scenario: Delta air line home page Booking Multi city way flight functionality
 public static final String clickOnMultiCityWebElement="//li[@id='ui-list-selectTripType2']";
 public static final String flightOneDestinationWebElement="//a[@id='fromAirportLink2']";
 public static final String flightTwoDestinationWebElement="//a[@id='toAirportLink2']";
  public static final String clickFirstCalenderWebElement="//div[@id='input_departureDate_1']";
  public static final String clickSecondCalenderWebElement="//div[@id='input_departureDate_2']";

 public static final String verifyMultiTripResultWebElement="//h1[@class=\"advanced-search-heading\"]";
 //==========================================================================================================


 public static final String CheckInLinkWebElement="//nav[@aria-label='main']//li[3]";
 public static final String chooseCreditCardWebElement="//span[@role='combobox']";
 public static final String enterCreditCardNumberWebElement="//input[@id='creditcardNumber']";
 public static final String enterLastNameWebElement="//input[@id='lastName']";
 public static final String  clickOnFormAirPortWebElement="//a[@id='departureAirportLink']";
 //===================================================================================================



 public static final String chooseTicketNumberWebElement="//span[@role='combobox']";
 public static final String enterTicketNumberWebElement="//input[@id='eticketNumber']";
 public static final String clickOnAirPortWebElement="//a[@id='departureAirportLink']";
 public static final String enterAirPortNameWebElement="//input[@id='search_input']";
 //============================================================================================================

    public static final String chooseSkyMilesNumberWebElement="//span[@role='combobox']";
    public static final String enterSkyMilesNumberWebElement="//input[@id='skymilesNumber']";
// public static final String






}
