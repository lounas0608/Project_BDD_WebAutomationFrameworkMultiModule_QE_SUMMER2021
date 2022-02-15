package steps;

import configuration.common.WebBase;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.PageFactory;
import pages.AmazonFireTV_page;

import java.net.MalformedURLException;

import static org.openqa.selenium.support.PageFactory.initElements;

public class AmazonFireTVSteps extends WebBase {

     AmazonFireTV_page amazonFire;
    @BeforeStep
    public void getInit(){
        amazonFire= PageFactory.initElements(driver, AmazonFireTV_page.class);

    }

    @Given("user on Amazon home page")
    public void userOnAmazonHomePage() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);

    }

    @Given("user click on bold All link on the left side of the application")
    public void user_click_on_bold_all_link_on_the_left_side_of_the_application() throws InterruptedException {
        amazonFire.clickOnAllLink();
        Thread.sleep(1000);
    }
    @Given("user click on fire Tv link")
    public void user_click_on_fire_tv_link() throws InterruptedException {
        amazonFire.fireTVLink();
        Thread.sleep(4000);
    }
    @Given("user click on Fire Tv Support link")
    public void user_click_on_Fire_Tv_Support_link() throws InterruptedException {
        amazonFire.FireTvSupportLink();
        Thread.sleep(5000);
    }
    //==================================================================================================
    @Then("user see Fire Tv Support information is displayed")
    public void user_see_fire_tv_support_information_is_displayed() throws InterruptedException {
        amazonFire.SupportInformation("Fire TV Support");
        Thread.sleep(2000);
    }
    @Then("user enter Text in the find more solutions")
    public void user_enter_text_in_the_find_more_solutions() throws InterruptedException {
        amazonFire.findMoreSolutionsTextField();
        Thread.sleep(2000);
    }
    //===============================================================================================================
    @And("user click on Learn Fire Tv link")
    public void clickOnLearnFireTvLink() throws InterruptedException {
        amazonFire.LearnFireTVLink();
        Thread.sleep(3000);

    }
    @Then("user see LearnFire Tv information is displayed")
    public void UserSeeLearnFireTvInformationIsDisplayed() throws InterruptedException {
        amazonFire.fireTVInformation("WHY FIRE TV?");
        Thread.sleep(3000);
    }

    @And("user click on App and Games")
    public void user_click_On_App_And_Games() throws InterruptedException {
        amazonFire.appAndGame();
        Thread.sleep(3000);
    }

    @And("checkbox Fire Games controller in the controller type field")
    public void checkboxFireGamesControllerInTheControllerTypeField() throws InterruptedException {
        amazonFire.checkboxFireGamesControllerWeb();
        Thread.sleep(2000);
    }

    @And("user click prime video link")
    public void userClickPrimeVideoLink() {
        amazonFire.amazonPrimeVideo();
    }

    @And("user click on categories")
    public void userClickOnCategories() {
        amazonFire.clickOnCategories();
    }

    @When("user click on Kids button")
    public void userClickOnKidsButton() {
        amazonFire.lickOnKidsButton();
    }

    @Then("user see the prime video is displayed")
    public void userSeeThePrimeVideoIsDisplayed() throws InterruptedException {
        amazonFire.verifyPrimeVideo("Prime Video");
        Thread.sleep(2000);
    }

    @And("user click Amazon Photos link")
    public void userClickAmazonPhotosLink() throws InterruptedException {
        amazonFire.ClickAmazonPhotosLink();
        Thread.sleep(2000);

    }

    @And("user click on Storage")
    public void userClickOnStorage() throws InterruptedException {
        amazonFire.clickOnStorageLink();
        Thread.sleep(2000);
    }

    @And("user enter {string} email in the text field")
    public void userEnterEmailInTheTextField(String name) {
        amazonFire.enterYourEmailAddress(name);
    }
    //  @And("user enter {string} email in the text field")
//  public void userEnterEmailInTheTextField(String arg0) {
//  }



    @And("user enter {string} password in password field")
    public void userEnterPasswordInPasswordField(String password) {
        amazonFire.enterYourPassWord(password);
    }

    @When("user click on Sign-in button")
    public void userClickOnSignInButton() {
        amazonFire.clickOnTheSignInButton();
    }

    @And("user choose the quantity from the drop down")
    public void userChooseTheQuantityFromTheDropDown() {
        amazonFire.shopForAllFireTvDevice();
    }

    @And("user click shop all fire TV devices")
    public void userClickShopAllFireTVDevices() {
    }

    @And("user click on Fire Tv stick Lite")
    public void userClickOnFireTvStickLite() {
    }

    @And("user click on Fire Tablets link")
    public void userClickOnFireTabletsLink() {
        amazonFire.clickOnFireTablet();
    }

    @And("user click Fire 7 link")
    public void user_Click_Fire_7_Link() {
        amazonFire.clickOnFire7Link();

    }
    @When("user choose a color from the box")
    public void userChooseAColorFromTheBox() {
        amazonFire.chooseColorForTablet();
    }

    @Then("user see there color is picked")
    public void userSeeThereColorIsPicked() {
        amazonFire.verifyColorIsSelected("Plum");
    }

    @And("user click Fire HD 10 Kids link")
    public void user_Click_Fire_HD_10_Kids_Link() {
        amazonFire.fireHD10KidsTablet();
    }

    @When("user click on with head set")
    public void userClickOnWithHeadSet() {
        amazonFire.selectWithKidsHeadSet();
    }

    @Then("user see  head set is selected")
    public void user_See_head_set_Is_Display() {
        amazonFire.verifyHeadSetIsSelected("with Kids Headset");
    }

    @And("user click accessories link")
    public void userClickAccessoriesLink() {
        amazonFire.ClickAccessoriesLink();
    }

    @And("user click all new keyboard")
    public void userClickAllNewKeyboard() {
        amazonFire.allNewMadeForAmazonKidsWireItem();
    }

    @And("user select quantity")
    public void userSelectQuantity() throws InterruptedException {
        amazonFire.selectQuantityLink();
        Thread.sleep(3000);
    }

    @Then("user see all new keyboard item is display")
    public void userSeeAllNewKeyboardItemIsDisplay() throws InterruptedException {
        amazonFire.verifyAllNewItemDisplay("All New, Made For Amazon Kids Wireless Bluetooth Keyboard in Black, for 10” Fire Kids Pro and 10” Fire Kids Tablets.");
        Thread.sleep(2000);
    }

   //====================================================================================================================
//=========================================================================================
    //Amazon search box feature
   @Given("user enter product name in the search field")
   public void user_enter_product_name_in_the_search_field() throws MalformedURLException {
       amazonFire.enterSearchKeyword("kids toys");
   }
    @Given("user click on the search button")
    public void user_click_on_the_search_button() throws MalformedURLException {
        amazonFire.clickOnSearchBox();
    }
    @Then("user should see search product is displayed")
    public void user_Should_See_Search_Product_Is_Displayed() {
        amazonFire.verifySearchKeywordProduct("\"kids toys\"");
    }
//======================================================================================================================


    @Given("user enter product name in the search Box")
    public void user_enter_product_name_in_the_search_Box() throws MalformedURLException {
        amazonFire.enterSearchKeyword("face mask");
    }

    @And("user checkbox WECARE brand")
    public void userCheckboxWECAREBrand() {
        amazonFire.WECAREBrandCheckBox();
    }
    @Then("user should see WECARE brand product is displayed")
    public void userShouldSeeWECAREBrandProductIsDisplayed() {
        amazonFire.WECAREBrandProductResult("WeCare 4 Ply Disposable Face Masks For Kids, 50 Black Face Masks, Individually Wrapped");
    }
    //#################################################################################################################
    //======================================================================================================
    @Given("user click on Best Seller link")
    public void user_click_on_best_seller_link() {
        amazonFire.bestSellersLink();
    }
    @Given("user click on  Books link")
    public void user_click_on_books_link() {
        amazonFire.booksLink();
    }
    @When("user click on  Children’s Books")
    public void user_click_on_children_s_books() {
        amazonFire.childrenBooks();
    }
    @Then("user should see Children’s Books is displayed")
    public void user_should_see_children_s_books_is_displayed() {
        amazonFire.booksResultVerify("Best Sellers in Children's Books");

    }

//=============================================================================================

//amazon home feature
@Given("user click on Amazon Home")
public void user_click_on_amazon_home() {
    amazonFire.amazonHomeLink();
}
    @Given("user click on decor")
    public void user_click_on_decor() {
        amazonFire.decorLink();
    }
    @Given("user click on Wall Art")
    public void user_click_on_wall_art() {
        amazonFire.wallArtLink();
    }
    @When("user check on the checkBox Original")
    public void user_check_on_the_check_box_original() {
        amazonFire.originalCheckBox();

    }
    @Then("user should see Original wall art results is displayed")
    public void user_should_see_original_wall_art_results_is_displayed() {

    }

//===========================================================================================
    //Amazon shop by room link functionality

    @And("user click on Amazon Home link")
    public void userClickOnAmazonHomeLink() {
        amazonFire.clickOnAmazonHomeLink();
    }

    @And("user click on shop by room")
    public void userClickOnShopByRoom() {
        amazonFire.clickOnShopByRoom();
    }

    @And("user click on BedRoom link")
    public void userClickOnBedRoomLink() {
        amazonFire.clickOnBedRoomLink();
    }

    @When("user click on Bed Frame")
    public void userClickOnBedFrame() {
        amazonFire.clickOnBedFrame();
    }

    @Then("user see Bed Frame is display")
    public void userSeeBedFrameIsDisplay() {
        amazonFire.verifyBedFrameSsDisplay("\"Bed Frames\"");
    }

    @And("user input minimum value")
    public void userInputMinimumValue() {
        amazonFire.inputMinimumValue();
    }

    @And("user input maximum value")
    public void userInputMaximumValue() {
        amazonFire.inputMaximumValue();
    }

//==============================================================================================================
//Amazon kitchen and Dining functionality
@And("user click on kitchen and dining")
public void userClickOnKitchenAndDining() {
    amazonFire.clickOnKitchenAndDining();
}

    @And("user click on CookWare link")
    public void userClickOnCookWareLink() {
        amazonFire.clickOnCookWareLink();
    }

    @And("user click on All Pans")
    public void userClickOnAllPans() {
        amazonFire.clickOnAllPans();
    }

    @And("user click on Lodge Featured Brand")
    public void userClickOnLodgeFeaturedBrand() {
        amazonFire.clickOnLodgeFeaturedBrand();

    }

    @When("user click on Cast Iron Material")
    public void userClickOnCastIronMaterial() {
        amazonFire.clickOnCastIronMaterial();
    }

    @Then("user see the cookWare is display")
    public void userSeeTheCookWareIsDisplay() {
        amazonFire.verifyCookWare("Pots & Pans");
    }
//===============================================================================================================
  //Amazon Appliance functionality
    @When("user click on Appliance link")
    public void userClickOnApplianceLink() {
        amazonFire.clickOnApplianceLink();
    }

    @Then("user see small Appliance is display")
    public void userSeeSmallApplianceIsDisplay() {
        amazonFire.verifyApplianceIsDisplay("Small Appliances");
    }

    @And("user click on blender link")
    public void userClickOnBlenderLink() {
        amazonFire.clickOnBlenderLink();
    }

    @And("user checkBox Metal Blending Container Material")
    public void userCheckBoxMetalBlendingContainerMaterial() {
        amazonFire.checkBoxMetalBlendingContainer();
    }
//===================================================================================================================
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @And("user select from dropDown")
    public void userSelectFromDropDown() {
        amazonFire.selectFromAllDropDown();
    }

    @And("user click on the search button Link")
    public void userClickOnTheSearchButtonLink() {
        amazonFire.clickOnSearchButton();
    }

    @And("user click on art supplies")
    public void userClickOnArtSupplies() {
        amazonFire.clickOnArtAndCraft();
    }

    @And("user checkBox on eligible for free shipping")
    public void userCheckBoxOnEligibleForFreeShipping() {
        amazonFire.clickOnEligibleFreeShipping();
    }
    @And("user select Baby from dropDown")
    public void userSelectBabyFromDropDown() {
        amazonFire.selectBabyFromDropDown();
    }
    @And("user click on baby care link")
    public void userClickOnBabyCareLink() {
        amazonFire.clickOnBabyCare();
    }
    @Then("user see baby product is display")
    public void userSeeBabyProductIsDisplay() throws InterruptedException {
        amazonFire.verifyBabyProduct("\"Baby Care Products\"");
        Thread.sleep(3000);

    }
    @And("user checkBox munchkin brand")
    public void userCheckBoxMunchkinBrand() throws InterruptedException {
        amazonFire.checkBoxMunchkinBrand();
        Thread.sleep(3000);

    }
    @And("click on munchkin baby wipes")
    public void clickOnMunchkinBabyWipes() throws InterruptedException {
        amazonFire.clickOnMunchkinWipes();
        Thread.sleep(3000);

    }

    @And("user select computer from dropDown")
    public void userSelectComputerFromDropDown() throws InterruptedException {
        amazonFire.selectComputerFromDropDown();
        Thread.sleep(2000);

    }

    @And("user click on laptop link")
    public void userClickOnLaptopLink() {
        amazonFire.clickOnLaptopLink();
    }

    @When("user click on Home laptops")
    public void userClickOnHomeLaptops() {
        amazonFire.clickOnHomeLaptops();
    }
    @Then("User see Home laptops is display")
    public void userSeeHomeLaptopsIsDisplay() throws InterruptedException {
        amazonFire.homeLaptopsIsDisplay("Home Laptops");
        Thread.sleep(3000);
    }
    @And("user click on see all details button")
    public void userClickOnSeeAllDetailsButton() {
        amazonFire.clickOnSeeAllDetailsButton();
    }

    @And("user select cellPhone and accessories from dropDown")
    public void userSelectCellPhoneAndAccessoriesFromDropDown() {
        amazonFire.selectCellPhoneAndAccessories();
    }

    @And("user click on cellPhone link")
    public void userClickOnCellPhoneLink() {
        amazonFire.clickOnCellPhoneLink();
    }

    @And("user checkBox Unlocked in the carries section")
    public void userCheckBoxUnlockedInTheCarriesSection() throws InterruptedException {
        amazonFire.checkBoxUnlockedCarries();
        Thread.sleep(2000);

    }

    @When("user checkBox Apple in the featured brand")
    public void userCheckBoxAppleInTheFeaturedBrand() throws InterruptedException {
        amazonFire.checkBoxAppleFeaturedBrand();
        Thread.sleep(2000);

    }

    @Then("user see cell phone is displayed")
    public void userSeeCellPhoneIsDisplayed() throws InterruptedException {
        amazonFire.verifyCellPhoneIsDisplayed("Cell Phones");
        Thread.sleep(3000);
    }

    @And("click on New condition")
    public void clickOnNewCondition() {
        amazonFire.ClickNewCondition();
    }
//===================================================================================
    //check Amazon Registry functionality  using Registrant name

    @Given("user click on registry")
    public void user_click_on_registry() {
        amazonFire.registryLink();
    }
    @Given("user type a name in the Registrant name field")
    public void user_type_a_name_in_the_registrant_name_field() throws InterruptedException {
        Thread.sleep(5000);
        amazonFire.registrantName();

    }
    //    @Given("user click on select a registry or gift list")
//    public void user_click_on_select_a_registry_or_gift_list() throws InterruptedException {
//        Thread.sleep(5000);
//        homePage.selectGiftListType();
//    }
    @Given("use  select Birthday Gift List from the drop down")
    public void use_select_birthday_gift_list_from_the_drop_down() {
        amazonFire.selectGiftListType();
    }
    @When("use click on search button")
    public void use_click_on_search_button() throws InterruptedException {
        Thread.sleep(5000);
        amazonFire.searchButtonLink();

    }
    @Then("user should see list of Registrant name displayed")
    public void user_should_see_list_of_registrant_name_displayed() throws InterruptedException {
        Thread.sleep(5000);
        amazonFire.verifyRegistrantName("rupy");

    }



    @And("user click on Storage and Organization link")
    public void userClickOnStorageAndOrganizationLink() {
        amazonFire.clickOnStorageAndOrganizationLink();
    }

    @And("user checkBox Climate Pledge Friendly")
    public void userCheckBoxClimatePledgeFriendly() {
        amazonFire.checkBoxClimatePledgeFriendly();
    }

    @Then("user see the filter product is display")
    public void userSeeTheFilterProductIsDisplay() {
        amazonFire.verifyFilterProductIsDisplay("Storage & Organization");
    }

    @And("user choose select black color")
    public void userChooseSelectBlackColor() {
        amazonFire.chooseSelectBlackColor();
    }

    @And("user click on BakeWare link")
    public void userClickOnBakeWareLink() {
        amazonFire.amazonBakeWareFunctionality();
    }

    @And("user click on cake pans")
    public void userClickOnCakePans() {
        amazonFire.clickOnCakePans();
    }

    @Then("user see cake pans is displayed")
    public void userSeeCakePansIsDisplayed() {
        amazonFire.verifyCakePansIsDisplayed("\"Cake Pans\"");
    }

    @And("user click on USA PAN Featured Brands")
    public void userClickOnUSAPANFeaturedBrands() {
        amazonFire.clickOnUSAPANFeaturedBrands();
    }
//=====================================================================================================================

    @And("user click on Utensils and Gadgets link")
    public void userClickOnUtensilsAndGadgetsLink() {
        amazonFire.clickOnUtensilsLink();
    }

    @And("user click on Cooking Utensils link")
    public void userClickOnCookingUtensilsLink() {
        amazonFire.clickOnCookingUtensilsLink();
    }

    @And("user check Box Rachael Ray Featured brand")
    public void userCheckBoxRachaelRayFeaturedBrand() {
        amazonFire.checkBoxRachaelRayFeature();
    }

    @Then("user see Cooking Utensils is displayed")
    public void userSeeCookingUtensilsIsDisplayed() {
        amazonFire.verifyCookingUtensilsIsDisplayed("\"Cooking Utensils\"");
    }

    @And("user click on Dining and Entertaining link")
    public void userClickOnDiningAndEntertainingLink() {
        amazonFire.clickOnDiningAndEntertainingLink();
    }

    @And("user check box ceramic material")
    public void userCheckBoxCeramicMaterial() {
        amazonFire.checkBoxCeramicMaterial();
    }

    @And("user click on Price")
    public void userClickOnPrice() {
       amazonFire.clickOnPriceRanges();
    }

    @Then("user see dining and Entertaining is display")
    public void userSeeDiningAndEntertainingIsDisplay() {
        amazonFire.verifyDiningEntertainingResult("Dining & Entertaining");
    }

    @And("user click on Kitchen and Table Linens link")
    public void userClickOnKitchenAndTableLinensLink() {
        amazonFire.clickOnKitchenAndTableLinens();
    }

    @And("user check box cotton Material")
    public void userCheckBoxCottonMaterial() {
        amazonFire.checkBoxCottonMaterial();
    }

    @And("user click on number of Set")
    public void userClickOnToNumberOfItemsInSet() {
        amazonFire.clickOnNumberOfItemsInSet();
    }

    @When("user click on red color")
    public void userClickOnRedColor() {
        amazonFire.clickOnRedColor();
    }

    @Then("user see kitchen and table product is display")
    public void userSeeKitchenAndTableProductIsDisplay() {
        amazonFire.verifyKitchenAndTableProductIsDisplay("\"Kitchen & Table Linens\"");
    }

   //===========================================================================================================
   //Amazon search box filed should get cleared to re-enter product name again

    @And("user enter product name in the search")
    public void userEnterProductNameInTheSearch() {
        amazonFire.searchBoxTwo();
    }
    @And("user clear search field")
   public void user_Clear_Search_Field() throws InterruptedException {

       amazonFire.clearTheSearchField();
        Thread.sleep(5000);
   }
    @And("enter product name in the search field")
    public void enter_product_name_in_the_search_field(){
        amazonFire.searchBoxEnter();

    }
    @Then("use go back to the amazon home page")
    public void use_Go_Back_To_The_Amazon_Home_Page() {
        amazonFire.navigateBack();
    }












 //==============================================================================================================
//Amazon search box auto suggest keyword when typing in the search box field
    @And("user enter product name in the search Box field")
    public void userEnterProductNameInTheSearchBoxField() throws InterruptedException {
        Thread.sleep(3000);
        amazonFire.ProductNameInSearchBox();

    }



    @And("user choose the auto suggest product name from the dropdown")
    public void userChooseTheAutoSuggestProductNameFromTheDropdown() throws InterruptedException {
        Thread.sleep(3000);
        amazonFire.autoSuggestChoose();
    }

    @Then("user should see auto suggest product is displayed")
    public void user_Should_See_Auto_Suggest_Product_Is_Displayed() {

        amazonFire.verifyAutoSuggestProduct("\"home decor clearance\"");



    }
//==================================================================================================================
//Amazon Become a Delivery driver functionality
    @And("user click on Become a Delivery driver")
    public void userClickOnBecomeADeliveryDriver() throws InterruptedException {
        Thread.sleep(2000);
        amazonFire.clickOnBecomeDeliveryDriver();
        amazonFire.cancelAlert();
    }

//    @And("user click cancel on popup window")
//    public void userClickCancelOnPopupWindow() {
//        amazonFire.cancelAlert();
//    }

    @And("user enter zipCode in the city input field")
    public void userEnterZipCodeInTheCityInputField() {
        amazonFire.cityZipCodeInputField();
    }
}
