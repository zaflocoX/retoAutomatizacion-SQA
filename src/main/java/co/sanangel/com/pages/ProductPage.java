package co.sanangel.com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

     By inputCantidad = By.xpath("//input[@type='number']");
     By btnSubmit = By.xpath("//*[@name='add-to-cart']");

     By btnLogo = By.xpath("//*[@class='navmenu__logo-link']");
    public By getInputCantidad() {
        return inputCantidad;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getBtnLogo() {
        return btnLogo;
    }
}
