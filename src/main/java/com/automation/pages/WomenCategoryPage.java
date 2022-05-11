package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//WOMEN text, TOPS and DRESSES links, SortBy drop down, ProductsList Locators
//and create appropriate methods for it.
public class WomenCategoryPage extends Utility {

    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Women']")
    WebElement verifyWomenWord;
    @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Tops']")
    WebElement topsLink;
    @FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Dresses']")
    WebElement dressesLink;
    @FindBy(id = "selectProductSort")
    WebElement selectProductSort;
    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement selectListView;
    @FindBy(id = "center_column")
    WebElement selectProduct;
    @FindBy(id = "group_1")
    WebElement selectSize;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addToCartButton;
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart'][1]")
    WebElement confirmationText;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindow;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qtyfield;

    public String verifyWomenText() {
        return getTextFromElement(verifyWomenWord);
    }


    public void setSelectProduct(String product) {
        clickOnElement(By.xpath("//a[normalize-space()='"+product+"']"));
    }

    public void enterQty(String quantity){
        qtyfield.clear();
        sendTextToElement(qtyfield,quantity);
    }

    public void setSelectSize(String size) {
        selectByVisibleTextFromDropDown(selectSize, size);
    }

    public void setSelectColour(String colour) {
        clickOnElement(By.xpath("//a[@title='" + colour + "']"));
    }
    public void setAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String setConfirmationText() throws InterruptedException {

        return getTextFromElement(confirmationText);
    }
    public void setCloseWindow(){
        clickOnElement(closeWindow);
    }



}
