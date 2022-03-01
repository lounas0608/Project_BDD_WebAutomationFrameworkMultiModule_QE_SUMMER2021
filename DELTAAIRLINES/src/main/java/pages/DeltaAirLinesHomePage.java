package pages;


import configuration.common.WebBase;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static PageElements.DeltaAirLinesHomePageElements.*;

public class DeltaAirLinesHomePage extends WebBase {


    @FindBy(xpath = travelInfoLinkWebElement)
    public WebElement travelInfoLinkWeb;

    @FindBy(xpath = clickOnStaySafeLinkWebElement)
    public WebElement clickOnStaySafeLinkWeb;
    @FindBy(xpath = verifyExpectStaySafeWebElement)
    public WebElement verifyExpectStaySafeWeb;
//=========================================================================================================================
    // Scenario: Delta air line home page Travel info for Rent a car functionality

    @FindBy(xpath = rentCarLinkWebElement)
    public WebElement rentCarLinkWeb;
    @FindBy(xpath = enterPickUpLocationWebElement)
    public WebElement enterPickUpLocationWeb;
    @FindBy(xpath = choosePickUpDateFromCalenderWebElement)
    public WebElement choosePickUpDateFromCalenderWeb;
    @FindBy(xpath = chooseDropOffDateFromCalenderWEbElement)
    public WebElement chooseDropOffDateFromCalenderWeb;
    @FindBy(xpath = selectPickUpTimeWebElement)
    public WebElement selectPickUpTimeWeb;
    @FindBy(xpath = selectDropOffTimeWebElement)
    public WebElement selectDropOffTimeWeb;
    @FindBy(xpath = clickOnBookACarWebElement)
    public WebElement clickOnBookACarWeb;
    //=======================================================================================================
    // Scenario: Delta air line home page Travel info for shop hotels link
    @FindBy(xpath = shopHotelsLinkWebElement)
    public WebElement shopHotelsLinkWeb;
    @FindBy(xpath = inputDestinationsWebElement)
    public WebElement inputDestinationsWeb;
    @FindBy(xpath = checkInDateWebElement)
    public WebElement checkInDateWeb;
    @FindBy(xpath = checkOutDateWebElement)
    public WebElement checkOutDateWeb;
    @FindBy(xpath = SearchButtonShopHotelsWebElement)
    public WebElement SearchButtonShopHotelsWeb;
    @FindBy(xpath = verifyShopResultWebElement)
    public WebElement verifyShopResultWeb;
    //====================================================================================================
    @FindBy(xpath = chooseSkyMilesNumberWebElement)
    public WebElement chooseSkyMilesNumberWeb;
    @FindBy(xpath = enterSkyMilesNumberWebElement)
    public WebElement enterSkyMilesNumberWeb;

    //===============================================================================================
    @FindBy(xpath = clickOnAirCraftWebElement)
    public WebElement clickOnAirCraftWeb;
    @FindBy(xpath = clickOnAirBusWebElement)
    public WebElement clickOnAirBusWeb;
    @FindBy(xpath = aircraftSpecificationWebElement)
    public WebElement aircraftSpecificationWeb;
    @FindBy(xpath = verifyAirCraftResultWebElement)
    public WebElement verifyAirCraftResultWEb;

    //==========================================================================================================
    //  Scenario: Delta air line home page Booking functionality
    @FindBy(xpath = clickOnBookingLinkWebElement)
    public WebElement clickOnBookingLinkWeb;
    @FindBy(xpath = clickOnDestinationWebElement)
    public WebElement clickOnDestinationWeb;
    @FindBy(xpath = inputDestinationWebElement)
    public WebElement inputDestinationWeb;
    @FindBy(xpath = clickOnRoundWayWebElement)
    public WebElement clickOnRoundWayWeb;
    @FindBy(xpath = clickOnOneWayLinkWebElement)
    public WebElement clickOnOneWayLinkWeb;
    @FindBy(xpath = clickOnDepartLinkWebElement)
    public WebElement clickOnDepartLinkWeb;
    @FindBy(xpath = chooseCalenderDateWebElement)
    public WebElement chooseCalenderDateWeb;
    @FindBy(xpath = clickOnArrowSignWebElement)
    public WebElement clickOnArrowSignWeb;
    @FindBy(xpath = verifyOneWayBookingWebElement)
    public WebElement verifyOneWayBookingWeb;
    //=============================================================================================================
    @FindBy(xpath = roundTripTravelDateWebElement)
    public WebElement roundTripTravelDateWeb;
    @FindBy(xpath = arrivingDateTravelDateWebElement)
    public WebElement arrivingDateTravelDateWeb;
    @FindBy(xpath = verifyRoundTripWebElement)
    public WebElement verifyRoundTripWeb;
    //=====================================================================================
    @FindBy(xpath = clickOnMultiCityWebElement)
    public WebElement clickOnMultiCityWeb;
    @FindBy(xpath = flightOneDestinationWebElement)
    public WebElement flightOneDestinationWeb;
    @FindBy(xpath = flightTwoDestinationWebElement)
    public WebElement flightTwoDestinationWeb;
    @FindBy(xpath = clickFirstCalenderWebElement)
    public WebElement clickFirstCalenderWeb;
    @FindBy(xpath = clickSecondCalenderWebElement)
    public WebElement clickSecondCalenderWeb;
    @FindBy(xpath = verifyMultiTripResultWebElement)
    public WebElement verifyMultiTripResultWeb;
    //=========================================================================================================
    @FindBy(xpath = CheckInLinkWebElement)
    public WebElement CheckInLinkWeb;
    @FindBy(xpath = chooseCreditCardWebElement)
    public WebElement chooseCreditCardWeb;
    @FindBy(xpath = enterCreditCardNumberWebElement)
    public WebElement enterCreditCardNumberWeb;
    @FindBy(xpath = enterLastNameWebElement)
    public WebElement enterLastNameWeb;
    @FindBy(xpath = clickOnFormAirPortWebElement)
    public WebElement clickOnFormAirPortWeb;

    //===============================================================================================================

    @FindBy(xpath = chooseTicketNumberWebElement)
    public WebElement chooseTicketNumberWeb;
    @FindBy(xpath = enterTicketNumberWebElement)
    public WebElement enterTicketNumberWeb;
    @FindBy(xpath = clickOnAirPortWebElement)
    public WebElement clickOnAirPortWeb;
    @FindBy(xpath = enterAirPortNameWebElement)
    public WebElement enterAirPortNameWeb;
    //===================================================================================================================
    //  Scenario: Delta air line home page Travel info link

    @FindBy(xpath = travelPlaningCenterElement)
    public WebElement travelPlaningCenterWeb;
    @FindBy(xpath = knowBeforeYouGoWebElement)
    public WebElement knowBeforeYouGoWeb;
    @FindBy(xpath = testingResourcesWebElement)
    public WebElement testingResourcesWeb;
    @FindBy(xpath = verifyTestingResultWebElement)
    public WebElement verifyTestingResultWeb;
    //=======================================================================================================
    // Scenario: Delta air line home page Travel info for flight deals
    @FindBy(xpath = flightDealsWebElement)
    public WebElement flightDealsWeb;
    @FindBy(xpath = withInUSLinkWebElement)
    public WebElement withInUSLinkWeb;
    @FindBy(xpath = chooseOriginWebElement)
    public WebElement chooseOriginWeb;
    @FindBy(xpath = DestinationLinkWebElement)
    public WebElement DestinationLinkWeb;
    @FindBy(xpath = verifyRoundTripFareWebElement)
    public WebElement verifyRoundTripFareWeb;
    //=================================================================================================================
    //   Scenario: Delta air line home Travel info for U.S. Entry Requirements
    @FindBy(xpath = USEntryRequirementsWebElement)
    public WebElement USEntryRequirementsWeb;
    @FindBy(xpath = verifyUSEntryResultWebElement)
    public WebElement verifyUSEntryResultWeb;
    //============================================================================================================
    @FindBy(xpath = baggageLinkWebElement)
    public WebElement baggageLinkWeb;

    @FindBy(xpath = InputOriginTextWebElement)
    public WebElement InputOriginTextWeb;

    @FindBy(xpath = inputDestinationTextWebElement)
    public WebElement inputDestinationTextWeb;

    @FindBy(xpath = ChooseMainCabinWebElement)
    public WebElement ChooseMainCabinWeb;

    @FindBy(xpath = SelectDateFromCalenderWebElement)
    public WebElement SelectDateFromCalenderWeb;
    @FindBy(xpath = CalenderSelectDateWebElement)
    public WebElement CalenderSelectDateWeb;
    @FindBy(xpath = calculateEstimateWebElement)
    public WebElement calculateEstimateWeb;
    @FindBy(xpath = verifyBaggageEstimateWebElement)
    public WebElement verifyBaggageEstimateWeb;
    @FindBy(xpath = selectTravelDateWebElement)
    public WebElement selectTravelDateWeb;
    @FindBy(xpath = travelDateWebElement)
    public WebElement travelDateWeb;
//====================================================================================================================
//  Scenario: Delta air line home page Travel info for Explore Top Destinations
//
    @FindBy(xpath = findYourDestinationWebElement)
    public WebElement findYourDestinationWeb;
    @FindBy(xpath = exploreTopDestinationsWebElement)
    public WebElement exploreTopDestinationsWeb;
    @FindBy(xpath = oneWayRadioButtonWebElement)
    public WebElement oneWayRadioButtonWeb;
    @FindBy(xpath = originFromDropDownWebElement)
    public WebElement originFromDropDownWeb;
    @FindBy(xpath = destinationFromDropDownWebElement)
    public WebElement destinationFromDropDownWeb;
    @FindBy(xpath = selectNationalityDropDownWebElement)

    public WebElement selectNationalityDropDownWeb;
    @FindBy(xpath = selectResidencyDropDownWebElement)
    public WebElement selectResidencyDropDownWeb;
    @FindBy(xpath = selectVaccinationDropDownWebElement)
    public WebElement selectVaccinationDropDownWeb;
    @FindBy(xpath = searchButtonToExploreWebElement)
    public WebElement searchButtonToExploreWeb;
    @FindBy(xpath = verifyExploreDestinationWebElement)
    public WebElement verifyExploreDestinationWeb;
    //===========================================================================================
    //     //Scenario: Delta air line home page Travel info for CHANGE OR CANCEL YOUR TRIP
    @FindBy(xpath = changeOrCancelTRIPLinkWebElement)
    public WebElement changeOrCancelTRIPLinkWeb;
    @FindBy(xpath = howToCancelOrChangeFlightWebElement)
    public WebElement howToCancelOrChangeFlightWeb;
    @FindBy(xpath = changeOrCancelLinkWebElement)
    public WebElement changeOrCancelLinkWeb;
    @FindBy(xpath = verifyCancelInformationResult)
    public WebElement verifyCancelInformation;



    public void travelInfoLink() {

        mouseHoverByXpath1("//a[@id='headSectab1']");
    }

    public void clickOnStaySafeLink() {
        clickOnStaySafeLinkWeb.click();
    }

    public void verifyExpectStaySafe(String expectStaySafeResult) {
        String actualStaySafeResult = verifyExpectStaySafeWeb.getText();
        Assert.assertEquals(actualStaySafeResult, expectStaySafeResult, "the actual result");

    }
//==================================================================================================


    public void travelPlaningCenter() {
        travelPlaningCenterWeb.click();
    }

    public void knowBeforeYouGo() {
        knowBeforeYouGoWeb.click();
    }

    public void testingResources() {
        testingResourcesWeb.click();
    }

    public void verifyTestingResult(String expectedTestingResult) {
        String actualTestingResult = verifyTestingResultWeb.getText();
        Assert.assertEquals(actualTestingResult, expectedTestingResult, "Teh actual result didn't match ");
    }
//==================================================================================================================
    //   Scenario: Delta air line home Travel info for U.S. Entry Requirements
    public void USEntryRequirements() {
        USEntryRequirementsWeb.click();
    }

    public void verifyUSEntryResult(String expectedUSEntryResult) {
        String actualUSEntryResult = verifyUSEntryResultWeb.getText();
        Assert.assertEquals(actualUSEntryResult, expectedUSEntryResult, "The actual result didn't match");
    }

    //================================================================================================
    // Scenario: Delta air line home page Travel info for flight deals



    public void flightDealsLink() {
        flightDealsWeb.click();
    }

    public void withInUSLink() {
        withInUSLinkWeb.click();
    }

    public void chooseOriginLink() {
        inputValueInTextWebElement(chooseOriginWeb, "NYC");

    }

    public void DestinationLink() {
        //selectByVisibleTextFromSelect(DestinationLinkWeb,"AMS");
        inputValueInTextWebElement(DestinationLinkWeb, "BOS");
        DestinationLinkWeb.click();

    }

    public void verifyRoundTripFare(String expectRoundTripResult) {
        String actualRoundTripResult = verifyRoundTripFareWeb.getText();
        Assert.assertEquals(actualRoundTripResult, expectRoundTripResult, "the actual result didn't match");
    }

    //============================================================================================================


    //===========================================================================================================
    //  Scenario: Delta air line home page Travel info for Explore Top Destinations
    public void findYourDestination() {
        findYourDestinationWeb.click();
    }

    public void exploreTopDestinations() {
        exploreTopDestinationsWeb.click();
    }

    public void oneWayRadioButton() {
        oneWayRadioButtonWeb.click();
    }

    public void originFromDropDown() {
        originFromDropDownWeb.sendKeys("New York (EWR), United States of America (USA)");
    }

    public void destinationFromDropDown() {
        destinationFromDropDownWeb.sendKeys("Aberdeen (ABZ), United Kingdom");
        destinationFromDropDownWeb.click();
    }

    public void selectNationalityDropDown() {
        selectNationalityDropDownWeb.sendKeys("Bangladesh");
        selectNationalityDropDownWeb.click();
    }

    public void selectResidencyDropDown() {
        selectResidencyDropDownWeb.click();
        selectResidencyDropDownWeb.sendKeys("United States of America (USA)");
        //mouseHoverByXpath1("//*[@id=\"smt-combobox-result-229\"][@data-text=\"United States of America (USA)\"]");


    }

    public void selectVaccinationDropDown() {
        selectVaccinationDropDownWeb.sendKeys("Fully vaccinated");
        selectVaccinationDropDownWeb.click();
    }

    public void searchButtonToExplore() {
        searchButtonToExploreWeb.click();
    }

    public void verifyExploreDestination(String expectExploreDestinationResult) {
        String actualExploreDestinationResult = verifyExploreDestinationWeb.getText();
        Assert.assertEquals(actualExploreDestinationResult, expectExploreDestinationResult, "the actual result didn't match");
    }


//==================================================================================================================
    //     //Scenario: Delta air line home page Travel info for CHANGE OR CANCEL YOUR TRIP

    //=====================================================================================
    //Scenario: Delta air line home page Travel info for CHANGE OR CANCEL YOUR TRIP

    public void changeOrCancelTRIPLink() {
        changeOrCancelTRIPLinkWeb.click();
    }

    public void howToCancelOrChangeFlight() {
        howToCancelOrChangeFlightWeb.click();
    }

    public void changeOrCancelLink() {
        changeOrCancelLinkWeb.click();
    }

    public void verifyCancelInformationExpected(String expectCancelInformationResult) {
        String actualCancelInformationResult = verifyCancelInformation.getText();
        Assert.assertEquals(actualCancelInformationResult, expectCancelInformationResult, "the actual result didn't match");
    }


// @FindBy(xpath = changeOrCancelTRIPLinkWebElement)
//    public WebElement changeOrCancelTRIPLinkWeb;
//
//


    public void baggageLink() {
        baggageLinkWeb.click();
    }

    public void InputOriginText() {
        InputOriginTextWeb.sendKeys("JFK");
        typeByXpath("//li[@id='input_origin_option-1']", "New York-Kennedy, NY (JFK)");
        InputOriginTextWeb.click();

    }

    public void inputDestinationText() {
        inputDestinationTextWeb.click();

        inputDestinationTextWeb.sendKeys("BOS");
    }

    public void ChooseMainCabinLink() {
        ChooseMainCabinWeb.click();

    }

    public void SelectDateFromCalender() {
        SelectDateFromCalenderWeb.click();
    }

    public void CalenderSelectDate() {
        CalenderSelectDateWeb.click();

    }

    public void calculateEstimate() {
        calculateEstimateWeb.click();
    }

    public void verifyBaggageEstimate(String expectedBaggageResult) {
        String actualBaggageResul = verifyBaggageEstimateWeb.getText();
        Assert.assertEquals(actualBaggageResul, expectedBaggageResult, "the actual result didn't match");

    }

    public void selectTravelDate() {
        selectTravelDateWeb.click();
        clickByXpath("//*[@id=\"input_date_travel\"]/div/div/idp-calendar-single/section/div[2]/div[2]/button[2]");
    }

    public void travelDateLink() {
        travelDateWeb.click();
    }
    //===================================================================================================================


    //===================================================================================================================
    //   Scenario: Delta air line home page Travel info for Rent a car functionality
    public void rentCarLink() {
        rentCarLinkWeb.click();
    }

    public void enterPickUpLocation() {
        inputValueInTextWebElement(enterPickUpLocationWeb, "NEW YORK CITY");
    }

    public void choosePickUpDateFromCalender() {
        inputValueInTextWebElement(choosePickUpDateFromCalenderWeb, "03/15/2022");
        //choosePickUpDateFromCalenderWeb.click();
        //clickByXpath1("//td[@class=' ui-state-StartEnd ui-datepicker-current-day']");

    }

    public void chooseDropOffDateFromCalender() {
        inputValueInTextWebElement(chooseDropOffDateFromCalenderWeb, "03/20/2022");
//    chooseDropOffDateFromCalenderWeb.click();
//    clickByXpath1("//td[@class=' ']//a[@class='ui-state-default'][normalize-space()='16']");
    }

    public void selectPickUpTime() {
        // selectPickUpTimeWeb.click();
        // waitTimeExplicit("//li[@id='ui-id-57']");
        waitUntilSelectable(By.xpath("//li[@id='ui-id-57']"));
        //clickByXpath1("//li[@id='ui-id-57']");
        selectPickUpTimeWeb.click();

    }

    public void setSelectDropOffTime() {
        selectDropOffTimeWeb.click();
        clickByXpath1("//li[@id='ui-id-107']");
    }


    public void clickOnBookACar() {
        clickOnBookACarWeb.click();

    }
    //===============================================================================================

    public void shopHotelsLink() {
        shopHotelsLinkWeb.click();
    }

    public void inputDestinations() {
        inputValueInTextWebElement(inputDestinationsWeb, "Santa Fe, New Mexico, United States of America");
    }

    public void checkInDateLink() {
        inputValueInTextWebElement(checkInDateWeb, "03/12/2022");

    }

    public void checkOutDateLink() {
        inputValueInTextWebElement(checkOutDateWeb, "04/12/2022");
    }

    public void SearchButtonShopHotels() {
        SearchButtonShopHotelsWeb.click();

    }

    public void verifyShopResult(String expectShopHotelResult) {
        String actualShopHotelResult = verifyShopResultWeb.getText();
        Assert.assertEquals(actualShopHotelResult, expectShopHotelResult, "the actual result didn't match");

    }

    public void clickOnAirCraftLink() {
        clickOnAirCraftWeb.click();
    }

    public void clickOnAirBusLink() {
        clickOnAirBusWeb.click();
    }

    public void aircraftSpecificationLink() {
        aircraftSpecificationWeb.click();
    }

    public void verifyAirCraftResult(String expectAirCrateResult) {
        String actualAirCrateResult = verifyAirCraftResultWEb.getText();
        Assert.assertEquals(actualAirCrateResult, expectAirCrateResult, "the actual result didn't match");
    }

    //==========================================================================================
    //  Scenario: Delta air line home page Booking functionality


    public void clickOnBookingLink() {
        clickOnBookingLinkWeb.click();
    }

    public void clickOnDestination() {
        clickOnDestinationWeb.click();
    }

    public void inputDestination() {
        inputValueInTextWebElement(inputDestinationWeb, "BOS");
        clickByXpath1("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']");
        // inputDestinationWeb.sendKeys("BOS Boston, MA");
        // inputDestinationWeb.click();
    }

    public void clickOnRoundWay() {
        clickOnRoundWayWeb.click();
    }

    public void clickOnOneWayLink() {
        clickOnOneWayLinkWeb.click();
    }

    public void clickOnDepartLink() {
        clickOnDepartLinkWeb.click();
    }

    public void chooseCalenderDate() {
        chooseCalenderDateWeb.click();
        clickByXpath1("//button[normalize-space()='done']");
    }

    public void clickOnArrowSign() {
        clickOnArrowSignWeb.click();
    }

    public void verifyOneWayBooking(String expectOnwWayBookingResult) {
        String actualOnwWayBookingResult = verifyOneWayBookingWeb.getText();
        Assert.assertEquals(actualOnwWayBookingResult, expectOnwWayBookingResult, "the actual result didn't match");

    }

    //=============================================================================================================


    public void setInputDestinationAirPort() {
        inputValueInTextWebElement(inputDestinationWeb, "DTW");
        clickByXpath1("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']");

    }

    public void roundTripTravelDate() {
        roundTripTravelDateWeb.click();
    }

    public void arrivingDateTravelDate() {
        arrivingDateTravelDateWeb.click();
        clickByXpath1("//button[normalize-space()='done']");

    }

    public void verifyRoundTripResult(String expectedRoundTripResult) {
        String actualRoundTripResult = verifyRoundTripWeb.getText();
        Assert.assertEquals(actualRoundTripResult, expectedRoundTripResult, "the actual result didn't match");
    }


    //=====================================================================================


    public void clickOnMultiCity() {
        clickOnMultiCityWeb.click();
    }

    public void flightOneDestination(String firstFlightDestination) {
        inputValueInTextWebElement(flightOneDestinationWeb, firstFlightDestination);
        clickByXpath1("//button[contains(@class,'search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose')]");
        //lightOneDestinationWeb.click();
    }

    public void flightTwoDestination(String secondFlight) {
        inputValueInTextWebElement(flightTwoDestinationWeb, secondFlight);
        clickByXpath1("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']");
        // flightTwoDestinationWeb.click();
    }

    public void clickFirstCalender() {
        clickFirstCalenderWeb.click();
        clickByXpath1("//a[contains(@aria-label,'28 February 2022, Monday')]");
        clickByXpath1("//a[@aria-label=\"31 March 2022, Thursday\"]");
        clickByXpath1("//button[normalize-space()='done']");


    }

    public void clickSecondCalender() {
        clickSecondCalenderWeb.click();
        clickByXpath1("//a[@aria-label=\"31 March 2022, Thursday\"]");
        clickByXpath1("//button[normalize-space()='done']");

    }

    public void clickOnArrow() {
        clickByXpath1("//button[@id='btn-book-submit']");
    }

    public void verifyMultiTripResult(String expectedMultiTripResult) {
        String actualMultiTripResult = verifyMultiTripResultWeb.getText();
        Assert.assertEquals(actualMultiTripResult, expectedMultiTripResult, "the actual result didn't match");

    }
    //=========================================================================================================

    public void CheckInLink() {
        CheckInLinkWeb.click();
    }

    public void chooseCreditCard() {
        chooseCreditCardWeb.click();
        clickByXpath1("//li[@id='ui-list-searchType1']");

    }

    public void enterCreditCardNumber(String Credit) {
        inputValueInTextWebElement(enterCreditCardNumberWeb, Credit);
    }

    public void enterLastName() {
        inputValueInTextWebElement(enterLastNameWeb, "Jack");
        //enterLastNameWeb.click();
    }

    public void clickOnFormAirPort() {
        clickOnFormAirPortWeb.click();
        takeEnterKeysValue("//input[@id='search_input']", "DTW");
        //("//input[@id='search_input']");
    }

    public void clickOnRedButton() {
        clickByXpath1("//button[@id='btn-checkin-submit']");

    }


    public void chooseTicketNumber() {
        chooseTicketNumberWeb.click();
        clickByXpath1("//li[@id='ui-list-searchType2']");
    }

    public void enterTicketNumber(String TicketNumber) {
        inputValueInTextWebElement(enterTicketNumberWeb, TicketNumber);
    }

    public void clickOnAirPort() {
        clickOnAirPortWeb.click();
    }

    public void enterAirPortName(String airPort) throws InterruptedException {
        inputValueInTextWebElement(enterAirPortNameWeb, airPort);
        Thread.sleep(4000);
        clickByXpath1("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']");
    }
    //===========================================================================================


    public void chooseSkyMilesNumber() {
        chooseSkyMilesNumberWeb.click();
        clickByXpath1("//li[@id='ui-list-searchType3']");
    }

    public void enterSkyMilesNumber() {
        inputValueInTextWebElement(enterSkyMilesNumberWeb, "1234567892");

    }

    public void clickRedArrow() {
        clickByXpath1("//button[@id='btn-checkin-submit']");

    }
//public void () { }
//public void () { }
//public void () { }
//public void () { }
//public void () { }
//public void () { }


}



