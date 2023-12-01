package co.sanangel.com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

    By liProducts = By.xpath("(//ul[@class='products columns-3'])[1]//li//img//ancestor::a");

    public By getLiProducts() {
        return liProducts;
    }
}
