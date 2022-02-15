package pages;

import configuration.common.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static PageElements.AmazonFireTV_Element.*;


public class AmazonFireTV_page extends WebBase {
    //check the Amazon  fire TV Support functionality
    @FindBy(xpath = clickOnAllLinkWebElement)
    public WebElement clickOnAllLinkWeb;
    @FindBy(xpath = fireTVWebElement)
    public WebElement fireTVLinkWeb;
    @FindBy(xpath = FireTvSupportLinkWebElement)
    public WebElement FireTvSupportLinkWeb;
    @FindBy(xpath = SupportInformationWebElement)
    public WebElement SupportInformationWeb;
    @FindBy(xpath = findMoreSolutionsTextFieldWebElement)
    public WebElement findMoreSolutionsTextFieldWeb;

    //check the Amazon  learn fire TV functionality
    @FindBy(xpath = LearnFireTVWebElement)
    public WebElement LearnFireTVWeb;
    @FindBy(xpath = fireTVInformationWebElement)
    public WebElement fireTVInformationWeb;

    //check the Amazon App and Games functionality

    @FindBy(xpath = appAndGameWebElement)
    public WebElement appAndGameWeb;
    @FindBy(xpath = checkboxFireGamesControllerWebElement)
    public WebElement checkboxFireGamesControllerWeb;
    //=================================================================
    // check the Amazon prime Video functionality

    @FindBy(xpath = amazonPrimeVideoWebElement)
    public WebElement amazonPrimeVideoWeb;

    @FindBy(xpath = clickOnCategoriesWebElement)
    public WebElement clickOnCategoriesWeb;

    @FindBy(xpath = lickOnKidsButtonWebElement)
    public WebElement lickOnKidsButtonWeb;
    @FindBy(xpath = verifyPrimeVideoWebElement)
    public WebElement verifyPrimeVideoWeb;
    //=======================================================================================================
    //check the Amazon Photos functionality
    @FindBy(xpath = userClickAmazonPhotosWebElement)
    public WebElement userClickAmazonPhotosWeb;
    @FindBy(xpath = clickOnStorageWebElement)
    public WebElement clickOnStorageWeb;

    @FindBy(xpath = enterYourEmailAddressWebElement)
    public WebElement enterYourEmailAddressWeb;
    @FindBy(xpath = enterYourPassWordWebElement)
    public WebElement enterYourPassWordWeb;
    @FindBy(xpath = clickOnTheSignInButtonWebElement)
    public WebElement clickOnTheSignInButtonWeb;

    //========================================================================================================
    @FindBy(xpath = shopForAllFireTvDeviceWEbElement)
    public WebElement shopForAllFireTvDeviceWEb;
    @FindBy(xpath = clickOnFireStickLiteWebElement)
    public WebElement clickOnFireStickLiteWeb;
    @FindBy(xpath = chooseQuantityWebElement)
    public WebElement chooseQuantityWeb;
    //=================================================================================================
    //   //check the Fire 7 tablets functionality
    @FindBy(xpath = clickOnFireTabletWebElement)
    public WebElement clickOnFireTabletWeb;
    @FindBy(xpath = clickOnFire7WebElement)
    public WebElement clickOnFire7Web;
    @FindBy(xpath = chooseColorForTabletWebElement)
    public WebElement chooseColorForTabletWeb;
    @FindBy(xpath = verifyColorIsSelectedWebElement)
    public WebElement verifyColorIsSelectedWeb;
//================================================================================================
//check the Fire Hd-10 kids tablets functionality

    @FindBy(xpath = fireHD10KidsTabletWebElement)
    public WebElement fireHD10KidsTabletWeb;
    @FindBy(xpath = selectWithKidsHeadSetWebElement)
    public WebElement selectWithKidsHeadSetWeb;
    @FindBy(xpath = verifyHeadSetIsSelectedWebElement)
    public WebElement verifyHeadSetIsSelectedWeb;
    //===============================================================================================
    //check the accessories functionality
    @FindBy(xpath = ClickAccessoriesLinkWebElement)
    public WebElement ClickAccessoriesLinkWeb;
    @FindBy(xpath = allNewMadeForAmazonKidsWireless)
    public WebElement allNewMadeForAmazonKidsWire;
    @FindBy(xpath = selectQuantityWebElement)
    public WebElement selectQuantityWeb;

    @FindBy(xpath = verifyAllNewItemDisplayWebElement)
    public WebElement verifyAllNewItemDisplayWeb;

    //================================================================================================


    ////check the Fire Hd-10 kids tablets functionality
    public void fireHD10KidsTablet() {
        fireHD10KidsTabletWeb.click();
    }

    public void selectWithKidsHeadSet() {
        selectWithKidsHeadSetWeb.click();
    }

    public void verifyHeadSetIsSelected(String expectResultHeadSet) {
        String actualResultHeadSet = verifyHeadSetIsSelectedWeb.getText();
        System.out.println("the headSet did get selected");
        Assert.assertEquals(actualResultHeadSet, expectResultHeadSet, "the head set didn't get selected");

    }


    //=============================================================================================================
    //   //check the Fire 7 tablets functionality
    public void clickOnFireTablet() {
        clickOnFireTabletWeb.click();
    }

    public void clickOnFire7Link() {
        clickOnFire7Web.click();
    }

    public void chooseColorForTablet() {
        chooseColorForTabletWeb.click();
    }

    public void verifyColorIsSelected(String expectedResultColor) {
        String actualResultColor = verifyColorIsSelectedWeb.getText();
        System.out.println("the color did get selected");
        Assert.assertEquals(actualResultColor, expectedResultColor, "the color didn't get selected");

    }


    public void shopForAllFireTvDevice() {
        shopForAllFireTvDeviceWEb.click();
    }

    public void clickOnFireStickLite() {
        clickOnFireStickLiteWeb.click();
    }

    public void chooseQuantity() {
        inputValueInTextBoxByWebElement(chooseQuantityWeb, "3");

    }


    public void enterYourEmailAddress(String name) {
        enterYourEmailAddressWeb.sendKeys(name);
        // inputValueInTextBoxByWebElement(enterYourEmailAddressWeb, "jack2020@gamil.com");
    }

    public void enterYourPassWord(String password) {
        enterYourPassWordWeb.sendKeys(password);
        //inputValueInTextBoxByWebElement(enterYourPassWordWeb, "hdshdjsa@23333");
    }

    public void clickOnTheSignInButton() {
        clickOnTheSignInButtonWeb.click();
    }

    public void ClickAmazonPhotosLink() {
        userClickAmazonPhotosWeb.click();
    }

    public void clickOnStorageLink() {
        clickOnStorageWeb.click();
    }


//=========================================================================================================
    //check the Amazon prime Video functionality

    public void amazonPrimeVideo() {
        amazonPrimeVideoWeb.click();
    }

    public void clickOnCategories() {
        clickOnCategoriesWeb.click();
    }

    public void lickOnKidsButton() {
        lickOnKidsButtonWeb.click();
    }

    public void verifyPrimeVideo(String expectResultPrimeVideo) {
        String actualResultPrimeVideo = verifyPrimeVideoWeb.getText();
        System.out.println("the expected result match: " + actualResultPrimeVideo);
        Assert.assertEquals(actualResultPrimeVideo, expectResultPrimeVideo, "the expected result didn't match");

    }

    //============================================================================================
    public void appAndGame() {
        appAndGameWeb.click();
    }

    public void checkboxFireGamesControllerWeb() {
        checkboxFireGamesControllerWeb.click();
    }


    public void clickOnAllLink() {
        clickOnAllLinkWeb.click();
    }

    public void fireTVLink() {
        fireTVLinkWeb.click();
    }

    public void FireTvSupportLink() {
        FireTvSupportLinkWeb.click();
    }

    public void SupportInformation(String expectSupportResult) {
        String actualSupportResult = SupportInformationWeb.getText();
        System.out.println("the support information: " + actualSupportResult);
        Assert.assertEquals(actualSupportResult, expectSupportResult, "the support didn't displayed");
        SupportInformationWeb.click();
    }

    public void findMoreSolutionsTextField() {
        inputValueInTextBoxByWebElement(findMoreSolutionsTextFieldWeb, "fire tv is not working");
    }

    //==============================================================================================================
//check the Amazon  learn fire TV functionality
    public void LearnFireTVLink() {
        LearnFireTVWeb.click();

    }

    public void fireTVInformation(String expectLearnFireTV) {
        String actualLearnFireTVResult = fireTVInformationWeb.getText();
        System.out.println("the learn fire tv information: " + actualLearnFireTVResult);
        Assert.assertEquals(actualLearnFireTVResult, expectLearnFireTV, "the support didn't displayed");

    }

    //check the accessories functionality

    public void verifyAllNewItemDisplay(String expectedResultItemDisplay) {
        String actualResultItemDisplay = verifyAllNewItemDisplayWeb.getText();
        System.out.println("the item is displayed " + actualResultItemDisplay);
        Assert.assertEquals(actualResultItemDisplay, expectedResultItemDisplay, "the item didn't display");
    }

    public void ClickAccessoriesLink() {
        ClickAccessoriesLinkWeb.click();
    }

    public void allNewMadeForAmazonKidsWireItem() {
        allNewMadeForAmazonKidsWire.click();
    }

    public void selectQuantityLink() {
        selectOptionByValue(selectQuantityWeb, "4");
    }


//====================================================================================================

    //check Amazon Registry functionality  using Registrant name

    @FindBy(xpath = registryLinkWebElement)
    public WebElement registryLinkWeb;
    @FindBy(xpath = registrantNameWebElement)
    public WebElement registrantNameWeb;
    @FindBy(xpath = selectGiftListTypeWebElement)
    public WebElement selectGiftListTypeWeb;
    @FindBy(xpath = searchButtonLinkWebElement)
    public WebElement searchButtonLinkWeb;
    @FindBy(xpath = verifyRegistrantNameWebElement)
    public WebElement verifyRegistrantNameWeb;


//===================================================================================================
    //amazon search box feature


    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(xpath = searchResultWebElement)
    public WebElement searchResult;

    @FindBy(xpath = WECAREBrandCheckBoxWebElement)
    public WebElement WECAREBrandCheckBoxWeb;
    @FindBy(xpath = WECAREBrandProductResultWebElement)
    public WebElement WECAREBrandProductResultWeb;
    //==============================================================================================================

    @FindBy(xpath = bestSellersLinkWebElement)
    public WebElement bestSellersLinkWeb;
    @FindBy(xpath = booksLinkWebElement)
    public WebElement booksLinkWeb;
    @FindBy(xpath = childrenBooksWebElement)
    public WebElement childrenBooksWeb;
    @FindBy(xpath = booksResultVerifyWebElement)
    public WebElement booksResultVerifyWeb;


    //==================================================================================================
    //check Amazon Registry functionality  using Registrant name

    public void registryLink() {
        registryLinkWeb.click();
    }

    public void registrantName() {
        inputValueInTextBoxByWebElement(registrantNameWeb, "rupy");
        //registrantNameWeb.click();
    }

    public void selectGiftListType() {
        selectOptionByVisibleText(selectGiftListTypeWeb, "Birthday Gift List");
        //selectGiftListTypeWeb.click();
    }

    public void searchButtonLink() {
        searchButtonLinkWeb.click();
    }

    public void verifyRegistrantName(String ExpectRegistrant) {
        String actualRegistrantName = verifyRegistrantNameWeb.getText();
        System.out.println("The registrant name is: " + actualRegistrantName);
        Assert.assertEquals(actualRegistrantName, ExpectRegistrant, "the registrant name didn't display");
    }


    public void enterSearchKeyword(String productName) {
        // driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys("Hand Sanitizer");
        // driver.findElement(By.xpath(HomePageElements.searchBoxWebElement)).sendKeys(productName);
        searchBox.clear();
        searchBox.sendKeys(productName);
    }


    public void clickOnSearchBox() {
        //driver.findElement(By.xpath(HomePageElements.searchButtonWebElement)).click();
        searchButton.click();
    }

    public void verifySearchKeywordProduct(String expectedKeyWord) {
        //String actualSearchKeyword = driver.findElement(By.xpath(HomePageElements.searchResultWebElement)).getText();
        String actualSearchKeyword = searchResult.getText();
        System.out.println("Actual Text: " + actualSearchKeyword);
        Assert.assertEquals(actualSearchKeyword, expectedKeyWord, "Search keyword not match");
    }


    public void WECAREBrandCheckBox() {
        WECAREBrandCheckBoxWeb.click();
    }

    public void WECAREBrandProductResult(String expectedResultWECARE) {
        String actualProduct = WECAREBrandProductResultWeb.getText();
        System.out.println("Actual Text: " + actualProduct);
        Assert.assertEquals(actualProduct, expectedResultWECARE, "Search keyword not match");
//===============================================================================================================
    }

    public void bestSellersLink() {
        bestSellersLinkWeb.click();
    }

    public void booksLink() {
        booksLinkWeb.click();
    }

    public void childrenBooks() {
        childrenBooksWeb.click();
    }

    public void booksResultVerify(String booksExpectedResult) {
        String actualResultBook = booksResultVerifyWeb.getText();
        System.out.println("Actual result for Book link");
        Assert.assertEquals(actualResultBook, booksExpectedResult, "the book link did not work");

    }


//==================================================================================================================
    //amazon home feature

    @FindBy(xpath = amazonHomeLinkWebElement)
    public WebElement amazonHomeLinkWeb;
    @FindBy(xpath = decorLinkWebElement)
    public WebElement decorLinkWeb;
    @FindBy(xpath = wallArtWebElement)
    public WebElement wallArtWeb;
    @FindBy(xpath = originalCheckBoxWebElement)
    public WebElement originalCheckBoxWeb;

//Amazon shop by room link functionality


    @FindBy(xpath = clickOnAmazonHomeLinkWebElement)
    public WebElement clickOnAmazonHomeLinkWeb;
    @FindBy(xpath = clickOnShopByRoomWebElement)
    public WebElement clickOnShopByRoomWeb;
    @FindBy(xpath = clickOnBedRoomLinkWebElement)
    public WebElement clickOnBedRoomLinkWeb;
    @FindBy(xpath = clickOnBedFrameWebElement)
    public WebElement clickOnBedFrameWeb;
    @FindBy(xpath = verifyBedFrameSsDisplayWebElement)
    public WebElement verifyBedFrameSsDisplayWeb;
    @FindBy(xpath = inputMinimumValueWebElement)
    public WebElement inputMinimumValueWeb;
    @FindBy(xpath = inputMaximumValueWebElement)
    public WebElement inputMaximumValueWeb;
    //================================================================================
    //Amazon kitchen and Dining functionality

    @FindBy(xpath = clickOnKitchenAndDiningWebElement)
    public WebElement clickOnKitchenAndDiningWeb;
    @FindBy(xpath = clickOnCookWareLinkWebElement)
    public WebElement clickOnCookWareLinkWeb;
    @FindBy(xpath = clickOnAllPansWebElement)
    public WebElement clickOnAllPansWeb;
    @FindBy(xpath = clickOnLodgeFeaturedBrandWebElement)
    public WebElement clickOnLodgeFeaturedBrandWeb;
    @FindBy(xpath = clickOnCastIronMaterialWebElement)
    public WebElement clickOnCastIronMaterialWeb;
    @FindBy(xpath = verifyCookWareWebElement)
    public WebElement verifyCookWareWeb;

    //=====================================================================================================
    ////Amazon Appliance functionality


    @FindBy(xpath = clickOnApplianceLinkWebElement)
    public WebElement clickOnApplianceLinkWeb;
    @FindBy(xpath = verifyApplianceIsDisplayWebElement)
    public WebElement verifyApplianceIsDisplayWeb;
    @FindBy(xpath = clickOnBlenderLinkWebElement)
    public WebElement clickOnBlenderLinkWeb;
    @FindBy(xpath = checkBoxMetalBlendingContainerMaterialWebElement)
    public WebElement checkBoxMetalBlendingContainerMaterial;

  //===================================================================================================
  //Amazon search box auto suggest keyword when typing in the search box field

    @FindBy(xpath = autoSuggestWebElement)
    public WebElement autoSuggestWeb;
    @FindBy(xpath = verifyAutoSuggestWebElement)
    public WebElement verifyAutoSuggestWeb;


    public void ProductNameInSearchBox(){
        inputValueInTextByWebElement(searchBox,"home decor");
    }
    public void autoSuggestChoose(){

        //  inputValueInTextBoxByWebElement(autoSuggestWeb,"home decor clearance");
        autoSuggestWeb.click();
    }
    public void verifyAutoSuggestProduct(String verifyHomeDecorProduct){
        String actualResultAutoSuggestProduct=verifyAutoSuggestWeb.getText();
        System.out.println("the product is display: "+actualResultAutoSuggestProduct);
        Assert.assertEquals(actualResultAutoSuggestProduct,verifyHomeDecorProduct,"the expect product didn't display");

    }

//==========================================================================================================

   @FindBy(xpath = searchBoxTwoWebElement)
   public WebElement searchBoxTwoWeb;



    public void searchBoxTwo(){
        typeByXpath("//*[@id=\"twotabsearchtextbox\"]","toddler party dress");
    }
    public void clearTheSearchField(){
        clearInputFieldXpath("//*[@id=\"twotabsearchtextbox\"]");
    }
    public void searchBoxEnter(){
        inputValueInTextBoxByWebElement(searchBoxTwoWeb,"Water Bottle");
    }





//======================================================================================================





    ////Amazon Appliance functionality
    public void clickOnApplianceLink() {
        clickOnApplianceLinkWeb.click();
    }

    public void verifyApplianceIsDisplay(String expectedResultAppliance) {
        String actualExpectedAppliance = verifyApplianceIsDisplayWeb.getText();
        Assert.assertEquals(actualExpectedAppliance, expectedResultAppliance, "the expected result didn't match");

    }

    public void clickOnBlenderLink() {
        clickOnBlenderLinkWeb.click();
    }

    public void checkBoxMetalBlendingContainer() {
        checkBoxMetalBlendingContainerMaterial.click();
    }

    //=============================================================================================================


    //Amazon shop by room link functionality
    public void clickOnAmazonHomeLink() {
        clickOnAmazonHomeLinkWeb.click();
    }

    public void clickOnShopByRoom() {
        clickOnShopByRoomWeb.click();
    }

    public void clickOnBedRoomLink() {
        clickOnBedRoomLinkWeb.click();
    }

    public void clickOnBedFrame() {
        clickOnBedFrameWeb.click();
    }

    public void verifyBedFrameSsDisplay(String expectResultBedRoomSet) {

        String actualResultBedRoomSet = verifyBedFrameSsDisplayWeb.getText();
        Assert.assertEquals(actualResultBedRoomSet, expectResultBedRoomSet, "the actual result didn't match");
    }

    public void inputMinimumValue() {
        inputValueInTextBoxByWebElement(inputMinimumValueWeb, "5");
    }

    public void inputMaximumValue() {
        inputValueInTextBoxByWebElement(inputMaximumValueWeb, "25");
    }


    //===============================================================================================
    public void amazonHomeLink() {
        amazonHomeLinkWeb.click();
    }

    public void decorLink() {
        decorLinkWeb.click();
    }

    public void wallArtLink() {
        wallArtWeb.click();
    }

    public void originalCheckBox() {
        originalCheckBoxWeb.click();
    }

    //==================================================================================================
//Amazon kitchen and Dining functionality
    public void clickOnKitchenAndDining() {
        clickOnKitchenAndDiningWeb.click();
    }

    public void clickOnCookWareLink() {
        clickOnCookWareLinkWeb.click();
    }

    public void clickOnAllPans() {
        clickOnAllPansWeb.click();
    }

    public void clickOnLodgeFeaturedBrand() {
        clickOnLodgeFeaturedBrandWeb.click();
    }

    public void clickOnCastIronMaterial() {
        clickOnCastIronMaterialWeb.click();
    }

    public void verifyCookWare(String expectedResultCookWare) {
        String actualResultCookWare = verifyCookWareWeb.getText();
        Assert.assertEquals(actualResultCookWare, expectedResultCookWare, "the expected result didn't match");
    }


//================================================================================================================
    //Amazon Storage & Organization functionality


    @FindBy(xpath = clickOnStorageAndOrganizationLinkWebElement)
    public WebElement clickOnStorageAndOrganizationLinkWeb;
    @FindBy(xpath = checkBoxClimatePledgeFriendlyWebElement)
    public WebElement checkBoxClimatePledgeFriendlyWeb;
    @FindBy(xpath = verifyFilterProductIsDisplayWebElement)
    public WebElement verifyFilterProductIsDisplayWeb;
    @FindBy(xpath = chooseSelectBlackColorWebElement)
    public WebElement chooseSelectBlackColorWeb;


    //=================================================================================================================
    //    //Amazon BakeWare functionality

    @FindBy(xpath = amazonBakeWareFunctionalityWebElement)
    public WebElement amazonBakeWareFunctionalityWeb;
    @FindBy(xpath = clickOnCakePansWebElement)
    public WebElement clickOnCakePansWeb;
    @FindBy(xpath = verifyCakePansIsDisplayedWebElement)
    public WebElement verifyCakePansIsDisplayedWeb;
    @FindBy(xpath = clickOnUSAPANFeaturedBrandsWebElement)
    public WebElement clickOnUSAPANFeaturedBrandsWeb;

    //Amazon BakeWare functionality
    public void amazonBakeWareFunctionality() {
        amazonBakeWareFunctionalityWeb.click();
    }

    public void clickOnCakePans() {
        clickOnCakePansWeb.click();
    }

    public void verifyCakePansIsDisplayed(String expectedResultCakePan) {
        String actualResultCakePan = verifyCakePansIsDisplayedWeb.getText();
        Assert.assertEquals(actualResultCakePan, expectedResultCakePan, "the cake pan didn't display");

    }

    public void clickOnUSAPANFeaturedBrands() {
        clickOnUSAPANFeaturedBrandsWeb.click();
    }

//===================================================================================================
    //    //Amazon Utensils & Gadgets functionality

    @FindBy(xpath = clickOnUtensilsLinkWebElement)
    public WebElement clickOnUtensilsLinkWeb;
    @FindBy(xpath = clickOnCookingUtensilsLinkWebElement)
    public WebElement clickOnCookingUtensilsLinkWeb;
    @FindBy(xpath = checkBoxRachaelRayFeaturedBrandWebElement)
    public WebElement checkBoxRachaelRayFeaturedBrandWeb;
    @FindBy(xpath = verifyCookingUtensilsIsDisplayedWebElement)
    public WebElement verifyCookingUtensilsIsDisplayedWeb;

 //===========================================================================
    //Amazon Become a Delivery driver functionality
    @FindBy(xpath =clickOnBecomeDeliveryDriverWebElement)
    public WebElement clickOnBecomeDeliveryDriverWeb;

    @FindBy(xpath =cityZipCodeInputFieldWebElement)
    public WebElement cityZipCodeInputFieldWeb;

    public void clickOnBecomeDeliveryDriver(){
        clickOnBecomeDeliveryDriverWeb.click();
    }
    public void cityZipCodeInputField(){
        cityZipCodeInputFieldWeb.click();




    }








    //==========================================================================================
    //Amazon Utensils & Gadgets functionality
    public void clickOnUtensilsLink() {
        clickOnUtensilsLinkWeb.click();
    }

    public void clickOnCookingUtensilsLink() {
        clickOnCookingUtensilsLinkWeb.click();
    }

    public void checkBoxRachaelRayFeature() {
        checkBoxRachaelRayFeaturedBrandWeb.click();
    }

    public void verifyCookingUtensilsIsDisplayed(String expectedResultUtensils) {
        String actualExpectUtensils = verifyCookingUtensilsIsDisplayedWeb.getText();
        Assert.assertEquals(actualExpectUtensils, expectedResultUtensils, "the expected result didn't display");

    }


//===============================================================================================
//Amazon Dining and Entertaining functionality

    @FindBy(xpath = clickOnDiningAndEntertainingLinkWebElement)
    public WebElement clickOnDiningAndEntertainingLinkWeb;
    @FindBy(xpath = checkBoxCeramicMaterialWebElement)
    public WebElement checkBoxCeramicMaterialWeb;
    @FindBy(xpath = clickOnPriceRangesWebElement)
    public WebElement clickOnPriceRangesWeb;
    @FindBy(xpath = verifyDiningEntertainingResultWebElement)
    public WebElement verifyDiningEntertainingResultWeb;


    //Amazon Dining and Entertaining functionality

    public void clickOnDiningAndEntertainingLink() {
        clickOnDiningAndEntertainingLinkWeb.click();
    }

    public void checkBoxCeramicMaterial() {
        checkBoxCeramicMaterialWeb.click();
    }

    public void clickOnPriceRanges() {
        clickOnPriceRangesWeb.click();
    }

    public void verifyDiningEntertainingResult(String expectResultDining) {
        String actualResultDining = verifyDiningEntertainingResultWeb.getText();
        Assert.assertEquals(actualResultDining, expectResultDining, "the expect result didn't display");
    }


//====================================================================================================
    //Amazon Kitchen & Table Linens functionality

    @FindBy(xpath = clickOnKitchenAndTableLinensWebElement)
    public WebElement clickOnKitchenAndTableLinensWeb;
    @FindBy(xpath = checkBoxCottonMaterialWebElement)
    public WebElement checkBoxCottonMaterialWeb;
    @FindBy(xpath = clickOnNumberOfItemsInSetWebElement)
    public WebElement clickOnNumberOfItemsInSetWeb;
    @FindBy(xpath = clickOnRedColorWebElement)
    public WebElement clickOnRedColorWeb;
    @FindBy(xpath = verifyKitchenAndTableProductIsDisplayWebElement)
    public WebElement verifyKitchenAndTableProductIsDisplayWeb;


    public void clickOnKitchenAndTableLinens() {
        clickOnKitchenAndTableLinensWeb.click();
    }

    public void checkBoxCottonMaterial() {
        checkBoxCottonMaterialWeb.click();
    }

    public void clickOnNumberOfItemsInSet() {
        clickOnNumberOfItemsInSetWeb.click();
    }

    public void clickOnRedColor() {
        clickOnRedColorWeb.click();
    }

    public void verifyKitchenAndTableProductIsDisplay(String expectedResultKitchenProduct) {
        String actualResultKitchenProduct = verifyKitchenAndTableProductIsDisplayWeb.getText();
        Assert.assertEquals(actualResultKitchenProduct, expectedResultKitchenProduct, "the expected result didn't display");

    }

//============================================================================================================
// check Amazon select product from All from the header

    @FindBy(xpath = selectFromAllDropDownWebElement)
    public WebElement selectFromAllDropDownWeb;

    @FindBy(xpath = clickOnSearchButtonWebElement)
    public WebElement clickOnSearchButtonWeb;

    @FindBy(xpath = clickOnArtAndCraftWebElement)
    public WebElement clickOnArtAndCraftWeb;

    @FindBy(xpath = clickOnEligibleFreeShippingWebElement)
    public WebElement clickOnEligibleFreeShippingWeb;
    //==================================================================================================
    //Amazon select baby from All dropDown list
    @FindBy(xpath = selectBabyFromDropDownWebElement)
    public WebElement selectBabyFromDropDownWeb;

    @FindBy(xpath = clickOnBabyCareWebElement)
    public WebElement clickOnBabyCareWeb;

    @FindBy(xpath = verifyBabyProductDisplay)
    public WebElement verifyBabyProductWeb;

    @FindBy(xpath = checkBoxMunchkinBrandWebElement)
    public WebElement checkBoxMunchkinBrandWeb;
    @FindBy(xpath = clickOnMunchkinWipesWebElement)
    public WebElement clickOnMunchkinWipesWeb;
    //=======================================================================================================
    //Amazon select computer from all dropDown list

    @FindBy(xpath = selectComputerFromDropDownWebElement)
    public WebElement selectComputerFromDropDownWeb;
    @FindBy(xpath = clickOnLaptopLinkWebElement)
    public WebElement clickOnLaptopLinkWeb;

    @FindBy(xpath = clickOnHomeLaptopsWebElement)
    public WebElement clickOnHomeLaptopsWeb;
    @FindBy(xpath = homeLaptopsIsDisplayWebElement)
    public WebElement homeLaptopsIsDisplayWeb;

    @FindBy(xpath = clickOnSeeAllDetailsButtonWebElement)
    public WebElement clickOnSeeAllDetailsButtonWeb;

    //=========================================================================================
//Amazon select cellPhone and accessories from All dropDown list
    @FindBy(xpath = selectCellPhoneAndAccessoriesWebElement)
    public WebElement selectCellPhoneAndAccessoriesWeb;
    @FindBy(xpath = clickOnCellPhoneLinkWebElement)
    public WebElement clickOnCellPhoneLinkWeb;
    @FindBy(xpath = checkBoxUnlockedCarriesWebElement)
    public WebElement checkBoxUnlockedCarriesWeb;
    @FindBy(xpath = checkBoxAppleFeaturedBrandWebElement)
    public WebElement checkBoxAppleFeaturedBrandWeb;

    @FindBy(xpath = verifyCellPhoneIsDisplayedWebElement)
    public WebElement verifyCellPhoneIsDisplayedWeb;
    @FindBy(xpath = ClickNewConditionWebElement)
    public WebElement ClickNewConditionWeb;
//===================================================================================================
    //Amazon Storage & Organization functionality

    public void clickOnStorageAndOrganizationLink() {
        clickOnStorageAndOrganizationLinkWeb.click();

    }

    public void checkBoxClimatePledgeFriendly() {
        checkBoxClimatePledgeFriendlyWeb.click();
    }

    public void verifyFilterProductIsDisplay(String expectResultHomeStorage) {
        String actualResultHomeStorage = verifyFilterProductIsDisplayWeb.getText();
        Assert.assertEquals(actualResultHomeStorage, expectResultHomeStorage, "the Home storage didn't play");

    }

    public void chooseSelectBlackColor() {
        chooseSelectBlackColorWeb.click();
    }

//==================================================================================================================


    //Amazon select cellPhone and accessories from All dropDown list
    public void selectCellPhoneAndAccessories() {
        selectOptionByVisibleText(selectCellPhoneAndAccessoriesWeb, "Cell Phones & Accessories");
    }

    public void clickOnCellPhoneLink() {
        clickOnCellPhoneLinkWeb.click();
    }

    public void checkBoxUnlockedCarries() {
        checkBoxUnlockedCarriesWeb.click();
    }

    public void checkBoxAppleFeaturedBrand() {
        checkBoxAppleFeaturedBrandWeb.click();
    }

    public void verifyCellPhoneIsDisplayed(String expectResultCellPhone) {
        String actualResultCellPhone = verifyCellPhoneIsDisplayedWeb.getText();
        System.out.println("the cell phone did display");
        Assert.assertEquals(actualResultCellPhone, expectResultCellPhone, "the cell phone didn't display");
    }

    public void ClickNewCondition() {
        ClickNewConditionWeb.click();
    }
//=================================================================================================================

    //Amazon select computer from all dropDown list
    public void selectComputerFromDropDown() {
        selectOptionByVisibleText(selectComputerFromDropDownWeb, "Computers");
    }

    public void clickOnLaptopLink() {
        clickOnLaptopLinkWeb.click();
    }

    public void clickOnHomeLaptops() {
        clickOnHomeLaptopsWeb.click();
    }

    public void homeLaptopsIsDisplay(String expectResultLapTop) {
        String actualResultLaptop = homeLaptopsIsDisplayWeb.getText();
        System.out.println("the laptop did display " + actualResultLaptop);
        Assert.assertEquals(actualResultLaptop, expectResultLapTop, "the laptop didn't display");
    }

    public void clickOnSeeAllDetailsButton() {
        clickOnSeeAllDetailsButtonWeb.click();
    }


// ====================================================================================================


    //Amazon select baby from All dropDown list
    public void selectBabyFromDropDown() {
        selectOptionByVisibleText(selectBabyFromDropDownWeb, "Baby");
    }

    public void clickOnBabyCare() {
        clickOnBabyCareWeb.click();
    }

    public void verifyBabyProduct(String expectResultBabyProduct) {
        String actualResultBabyProduct = verifyBabyProductWeb.getText();
        System.out.println("the baby product is display " + actualResultBabyProduct);
        Assert.assertEquals(actualResultBabyProduct, expectResultBabyProduct, "the baby product didn't display");
    }

    public void checkBoxMunchkinBrand() throws InterruptedException {
        checkBoxMunchkinBrandWeb.click();

    }

    public void clickOnMunchkinWipes() throws InterruptedException {
        clickOnMunchkinWipesWeb.click();

    }


//=====================================================================================================

    public void selectFromAllDropDown() {
        selectOptionByVisibleText(selectFromAllDropDownWeb, "Arts, Crafts & Sewing");
    }

    public void clickOnSearchButton() {
        clickOnSearchButtonWeb.click();

    }

    public void clickOnArtAndCraft() {
        clickOnArtAndCraftWeb.click();

    }

    public void clickOnEligibleFreeShipping() {
        clickOnEligibleFreeShippingWeb.click();

    }


}
