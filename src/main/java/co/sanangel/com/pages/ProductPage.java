package co.sanangel.com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

     By inputCantidad = By.xpath("//input[@type='number']");
     By btnSubmit = By.xpath("//*[@name='add-to-cart']");
    public By getInputCantidad() {
        return inputCantidad;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }
}
