package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

WebDriver driver;

By title = By.xpath("//h1");

By price = By.xpath("//span[contains(text(),'₹')]");

public ProductDetailsPage(WebDriver driver){

this.driver = driver;

}

public boolean verifyTitle(){

return driver.findElement(title).isDisplayed();

}

public boolean verifyPrice(){

return driver.findElement(price).isDisplayed();

}

}
