package steps;

import configuration.common.WebBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import pages.DeltaAirLinesHomePage;

public class DeltaAirLineSteps extends WebBase {

    DeltaAirLinesHomePage deltaAirLinesHomePage;
   @BeforeStep
    public void getInit(){
        deltaAirLinesHomePage= PageFactory.initElements(driver,DeltaAirLinesHomePage.class);
    }

    @Given("user on Delta Air Line home page")
    public void user_on_delta_air_line_home_page() {
    }

    @Given("user click on Travel info link")
    public void user_click_on_travel_info_link() {
        deltaAirLinesHomePage.travelInfoLink();
   }
    @Given("user click on safe travel link")
    public void user_click_on_safe_travel_link() {
       deltaAirLinesHomePage.clickOnStaySafeLink();

    }
    @Then("user see delta commitment to cleanliness air plan information")
    public void userSeeDeltaCommitmentToCleanlinessAirPlanInformation() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.verifyExpectStaySafe("Our Commitment to Cleanliness is Here to Stay");

   }
   //================================================================================================================
// //  Scenario: Delta air line home page Travel info link
    @And("user click on Travel planing center link")
    public void userClickOnTravelPlaningCenterLink() {
       deltaAirLinesHomePage.travelPlaningCenter();
    }

    @And("user click on know before you go link")
    public void userClickOnKnowBeforeYouGoLink() {
       deltaAirLinesHomePage.knowBeforeYouGo();
    }

    @When("user click on Testing Resources link")
    public void userClickOnTestingResourcesLink() {
       deltaAirLinesHomePage.testingResources();
    }

    @Then("user see testing resource is display")
    public void userSeeTestingResourceIsDisplay() {
       deltaAirLinesHomePage.verifyTestingResult("Testing Resources");
    }


    //==========================================================================================
    //   Scenario: Delta air line home Travel info for U.S. Entry Requirements

    @And("user click on U.S. Entry Requirements")
    public void userClickOnUSEntryRequirements() {
        deltaAirLinesHomePage.USEntryRequirements();
    }

    @Then("user see U.S. Entry Requirements resource is display")
    public void userSeeUSEntryRequirementsResourceIsDisplay() {
       deltaAirLinesHomePage.verifyUSEntryResult("U.S. Entry Requirements");
    }
//==================================================================================================================
//  Scenario: Delta air line home page Travel info for flight deals
    @And("user click on Flight Deals link")
    public void userClickOnFlightDealsLink() {
       deltaAirLinesHomePage.flightDealsLink();
    }

    @And("user click on FLIGHT DEALS FROM WITHIN THE U.S. link")
    public void userClickOnFLIGHTDEALSFROMWITHINTHEUSLink() {
       deltaAirLinesHomePage.withInUSLink();
    }

    @And("user choose from dropDown origin from Link")
    public void userChooseFromDropDownOriginFromLink() throws InterruptedException {
        Thread.sleep(5000);

        deltaAirLinesHomePage.chooseOriginLink();
    }

    @When("user Choose from dropDown Destination link")
    public void userChooseFromDropDownDestinationLink() throws InterruptedException {
       Thread.sleep(5000);
       deltaAirLinesHomePage.DestinationLink();
       Thread.sleep(3000);
    }
    @Then("user see the Flight Deals From Within The U.S.")
    public void userSeeTheFlightDealsFromWithinTheUS() throws InterruptedException {
            Thread.sleep(4000);
            deltaAirLinesHomePage.verifyRoundTripFare("Flight Deals From/Within The U.S.");

    }
//====================================================================================================
    @And("user click on Baggage link")
    public void userClickOnBaggageLink() {
       deltaAirLinesHomePage.baggageLink();
    }

    @And("user input origin in the text field")
    public void userInputOriginInTheTextField() throws InterruptedException {
       deltaAirLinesHomePage.InputOriginText();
       Thread.sleep(5000);
    }

    @And("user enter destination in the text field")
    public void userEnterDestinationInTheTextField() throws InterruptedException {
        deltaAirLinesHomePage.inputDestinationText();
        Thread.sleep(5000);

    }

    @And("user choose Main cabin from dropDown")
    public void userChooseMainCabinFromDropDown() throws InterruptedException {
       deltaAirLinesHomePage.ChooseMainCabinLink();
       Thread.sleep(3000);
    }

    @And("user click on select date link")
    public void userClickOnSelectDateLink() {
       deltaAirLinesHomePage.SelectDateFromCalender();
    }

    @And("user choose a date from calender")
    public void userChooseADateFromCalender() {
       deltaAirLinesHomePage.CalenderSelectDate();

    }

    @And("user click on calculate estimate button")
    public void userClickOnCalculateEstimateButton() throws InterruptedException {
       Thread.sleep(5000);
       deltaAirLinesHomePage.calculateEstimate();
       Thread.sleep(2000);

    }

    @Then("user see calculate baggage estimate cost is display")
    public void userSeeCalculateBaggageEstimateCostIsDisplay() throws InterruptedException {
       Thread.sleep(4000);
       deltaAirLinesHomePage.verifyBaggageEstimate("Calculate Baggage Estimate");
    }

    @And("user choose Traveling date")
    public void userChooseTravelingDate() {
       deltaAirLinesHomePage.selectTravelDate();
    }

    @And("user select travel date")
    public void userSelectTravelDate() throws InterruptedException {
       deltaAirLinesHomePage.travelDateLink();
       Thread.sleep(5000);
    }
//====================================================================================================
    //  Scenario: Delta air line home page Travel info for Explore Top Destinations
    @And("user click on find your destination link")
    public void userClickOnFindYourDestinationLink() {
       deltaAirLinesHomePage.findYourDestination();
    }

    @And("user click on Explore Top Destinations")
    public void userClickOnExploreTopDestinations() {
       deltaAirLinesHomePage.exploreTopDestinations();
    }

    @And("user choose one way radio button")
    public void userChooseOneWayRadioButton() throws InterruptedException {
       Thread.sleep(5000);
       deltaAirLinesHomePage.oneWayRadioButton();

    }

    @And("user select origin from the dropDown")
    public void userSelectOriginFromTheDropDown() throws InterruptedException {
        Thread.sleep(5000);
        deltaAirLinesHomePage.originFromDropDown();
    }

    @And("user select Destination from the dropDown")
    public void userSelectDestinationFromTheDropDown() throws InterruptedException {
        Thread.sleep(5000);
        deltaAirLinesHomePage.destinationFromDropDown();
    }

    @And("user select nationality form the dropDown")
    public void userSelectNationalityFormTheDropDown() throws InterruptedException {
        Thread.sleep(5000);
       deltaAirLinesHomePage.selectNationalityDropDown();
    }

    @And("user select residency form the dropDown")
    public void userSelectResidencyFormTheDropDown() throws InterruptedException {
        Thread.sleep(5000);
        deltaAirLinesHomePage.selectResidencyDropDown();
    }

    @And("user select Vaccination status from the dropDown")
    public void userSelectVaccinationStatusFromTheDropDown() throws InterruptedException {
        Thread.sleep(3000);
        deltaAirLinesHomePage.selectVaccinationDropDown();
        Thread.sleep(2000);
    }

    @And("user click on search button")
    public void userClickOnSearchButton() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.searchButtonToExplore();

    }
    @Then("user see Explore Top Destinations is display")
    public void userSeeExploreTopDestinationsIsDisplay() throws InterruptedException {
       Thread.sleep(5000);
       deltaAirLinesHomePage.verifyExploreDestination("Here's where you can travel from United States of America (USA)");
    }
//==========================================================================================

    @And("user click on CHANGE OR CANCEL YOUR TRIP link")
    public void userClickOnCHANGEORCANCELYOURTRIPLink() {
       deltaAirLinesHomePage.changeOrCancelTRIPLink();
    }

    @And("user click on How To Cancel or Change Your Flight link")
    public void userClickOnHowToCancelOrChangeYourFlightLink() {
       deltaAirLinesHomePage.howToCancelOrChangeFlight();
    }

    @When("user click on Change or Cancel link")
    public void userClickOnChangeOrCancelLink() {
       deltaAirLinesHomePage.changeOrCancelLink();
    }

    @Then("user see Change or Cancel information is display")
    public void userSeeChangeOrCancelInformationIsDisplay() throws InterruptedException {
        Thread.sleep(5000);
       deltaAirLinesHomePage.verifyCancelInformationExpected("Step 4: Begin the Flight Change or Cancellation Process");
    }

//==============================================================================================================================
 //   Scenario: Delta air line home page Travel info for Rent a car functionality

    @And("user click on rent a car link")
    public void userClickOnRentACarLink() {
       deltaAirLinesHomePage.rentCarLink();
    }


    @And("user enter pick up location in the location field")
    public void userEnterPickUpLocationInTheLocationField() throws InterruptedException {
       waitFor(7);
       deltaAirLinesHomePage.enterPickUpLocation();
    }

    @And("user choose pick up date from calender")
    public void userChoosePickUpDateFromCalender() throws InterruptedException {
       waitFor(8);
       deltaAirLinesHomePage.choosePickUpDateFromCalender();
       waitFor(5);
    }

    @And("user choose drop off date from calender")
    public void userChooseDropOffDateFromCalender() {
       deltaAirLinesHomePage.chooseDropOffDateFromCalender();
    }

    @And("user select pickUp time from the dropDown")
    public void userSelectPickUpTimeFromTheDropDown() throws InterruptedException {
       waitFor(5);
       deltaAirLinesHomePage.selectPickUpTime();
    }


    @And("user select dropOff time from the dropDown")
    public void userSelectDropOffTimeFromTheDropDown() throws InterruptedException {
       waitFor(6);
       deltaAirLinesHomePage.setSelectDropOffTime();
    }

    @And("user click on Book A Click")
    public void userClickOnBookAClick() throws InterruptedException {
       deltaAirLinesHomePage.clickOnBookACar();
       waitFor(5);
    }
//======================================================================================================


    @And("user click on shop hotels link")
    public void userClickOnShopHotelsLink() {
       deltaAirLinesHomePage.shopHotelsLink();
    }

    @And("user enter Destinations where to go in the text field")
    public void userEnterDestinationsWhereToGoInTheTextField() {
       deltaAirLinesHomePage.inputDestinations();

    }

    @And("user enter checkIn Date")
    public void userEnterCheckInDate() {
       deltaAirLinesHomePage.checkInDateLink();
    }

    @And("user enter checkOut Date")
    public void userEnterCheckOutDate() {
       deltaAirLinesHomePage.checkOutDateLink();

    }

    @And("user click on search button for shop hotel")
    public void userClickOnSearchButtonForShopHotel() {
       deltaAirLinesHomePage.SearchButtonShopHotels();
    }

    @Then("user see New Mexico United States of America search result display")
    public void userSeeNewMexicoUnitedStatesOfAmericaSearchResultDisplay() throws InterruptedException {
       Thread.sleep(5000);
       deltaAirLinesHomePage.verifyShopResult("Santa Fe, New Mexico, United States of America");
   }
//==============================================================================================================
    @And("user click on airCraft link")
    public void userClickOnAirCraftLink() {
       deltaAirLinesHomePage.clickOnAirCraftLink();
    }

    @And("user click on Airbus link")
    public void userClickOnAirbusLink() {
       deltaAirLinesHomePage.clickOnAirBusLink();
    }

    @And("user click on Aircraft Specification")
    public void userClickOnAircraftSpecification() {
       deltaAirLinesHomePage.aircraftSpecificationLink();
    }

    @Then("user see Aircraft Specifications information is display")
    public void userSeeAircraftSpecificationsInformationIsDisplay() throws InterruptedException {
       Thread.sleep(4000);
       deltaAirLinesHomePage.verifyAirCraftResult("Aircraft Specifications");
    }
//===========================================================================================
    //Scenario: Delta air line home page Booking functionality
    @And("user click on Booking link")
    public void userClickOnBookingLink() {
       deltaAirLinesHomePage.clickOnBookingLink();
    }

    @And("user click on Destination")
    public void userClickOnDestination() {
       deltaAirLinesHomePage.clickOnDestination();
    }

    @And("user enter destination airPort name")
    public void userEnterDestinationAirPortName() throws InterruptedException {
       deltaAirLinesHomePage.inputDestination();
       Thread.sleep(4000);
    }

    @And("user click on round trip link")
    public void userClickOnRoundTripLink() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.clickOnRoundWay();

    }

    @And("user choose on one way trip from the dropDown")
    public void userChooseOnOneWayTripFromTheDropDown() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.clickOnOneWayLink();
       Thread.sleep(4000);
    }

    @And("user click on Depart link")
    public void userClickOnDepartLink() throws InterruptedException {
       Thread.sleep(2000);
       deltaAirLinesHomePage.clickOnDepartLink();
    }

    @And("user choose date from calender")
    public void userChooseDateFromCalender() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.chooseCalenderDate();
    }

    @And("user click on red arrow sign on the right side")
    public void userClickOnRedArrowSignOnTheRightSide() throws InterruptedException {
       deltaAirLinesHomePage.clickOnArrowSign();
       Thread.sleep(5000);
    }

    @Then("user see One Way flight JFK to BOS is display")
    public void userSeeOneWayFlightJFKToBOSIsDisplay() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.verifyOneWayBooking("BOS");
    }

    @And("user click on round trip")
    public void userClickOnRoundTrip() {
        deltaAirLinesHomePage.clickOnRoundWay();

    }
//==================================================================================================

    @And("user enter destination AirPort")
    public void userEnterDestinationAirPort() {
        deltaAirLinesHomePage.setInputDestinationAirPort();
    }

    @And("user choose Travel date from calender")
    public void userChooseTravelDateFromCalender() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.roundTripTravelDate();
    }

    @And("user choose arriving date from calender")
    public void userChooseArrivingDateFromCalender() throws InterruptedException {
       deltaAirLinesHomePage.arrivingDateTravelDate();
       Thread.sleep(4000);
    }


    @Then("user see One Way flight JFK to DTW is display")
    public void userSeeOneWayFlightJFKToDTWIsDisplay() {
       deltaAirLinesHomePage.verifyRoundTripResult("DTW");
    }
//============================================================================================================


    @And("user click on multi city")
    public void userClickOnMultiCity() throws InterruptedException {
       Thread.sleep(4000);
       deltaAirLinesHomePage.clickOnMultiCity();
    }

    @And("user enter first flight Destination")
    public void userEnterFirstFlightDestination() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.flightOneDestination();
       Thread.sleep(2000);
    }

    @And("user enter second flight Destination")
    public void userEnterSecondFlightDestination() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.flightTwoDestination();
    }

    @And("user click on calender and choose first flight date")
    public void userClickOnCalenderAndChooseFirstFlightDate() {
       deltaAirLinesHomePage.clickFirstCalender();

    }

//    @And("user click on calender and choose a date for the second flight")
//    public void userClickOnCalenderAndChooseADateForTheSecondFlight() throws InterruptedException {
//        Thread.sleep(4000);
//        deltaAirLinesHomePage.();
//    }

    @And("user choose second date from the calender")
    public void userChooseSecondDateFromTheCalender() throws InterruptedException {
       Thread.sleep(5000);
        deltaAirLinesHomePage.clickSecondCalender();

    }

    @And("user click on red arrow")
    public void userClickOnRedArrow() {
       deltaAirLinesHomePage.clickOnArrow();
    }

    @Then("user see multi city fight is display")
    public void userSeeMultiCityFightIsDisplay() {
       deltaAirLinesHomePage.verifyMultiTripResult("BOOK A FLIGHT");
    }
//=================================================================================================================
    @And("user click on Check In link")
    public void userClickOnCheckInLink() {
       deltaAirLinesHomePage.CheckInLink();
    }

    @And("user choose credit card number")
    public void userChooseCreditCardNumber() throws InterruptedException {
       Thread.sleep(3000);
       deltaAirLinesHomePage.chooseCreditCard();
    }

    @And("user enter credit card number in the text field")
    public void userEnterCreditCardNumberInTheTextField() {
       deltaAirLinesHomePage.enterCreditCardNumber();
    }

    @And("user enter last name in the text field")
    public void userEnterLastNameInTheTextField() {
       deltaAirLinesHomePage.enterLastName();
    }

    @And("user enter on From AirPort")
    public void userEnterOnFromAirPort() {
       deltaAirLinesHomePage.clickOnFormAirPort();
    }

    @And("user click on arrow button")
    public void userClickOnArrowButton() throws InterruptedException {
       Thread.sleep(4000);
       deltaAirLinesHomePage.clickOnRedButton();
    }
//===========================================================================================================
    @And("user choose Ticket number")
    public void userChooseTicketNumber() throws InterruptedException {
       waitFor(5);
       deltaAirLinesHomePage.chooseTicketNumber();

    }

    @And("user enter Ticket number in the text field")
    public void userEnterTicketNumberInTheTextField() {
       deltaAirLinesHomePage.enterTicketNumber();
    }

    @And("user click on From AirPort")
    public void userClickOnFromAirPort() {
       deltaAirLinesHomePage.clickOnAirPort();
    }

    @And("user enter AirPort Name in the text field")
    public void userEnterAirPortNameInTheTextField() throws InterruptedException {
       deltaAirLinesHomePage.enterAirPortName();
        waitFor(6);
    }
//==================================================================================================================
    @And("user choose SkyMiles number")
    public void userChooseSkyMilesNumber() throws InterruptedException {
       Thread.sleep(4000);
       deltaAirLinesHomePage.chooseSkyMilesNumber();
    }

    @And("user enter SkyMiles number in the text field")
    public void userEnterSkyMilesNumberInTheTextField() {
       deltaAirLinesHomePage.enterSkyMilesNumber();
    }

    @And("user click on red arrow button")
    public void userClickOnRedArrowButton() {
       deltaAirLinesHomePage.clickRedArrow();
    }
}
