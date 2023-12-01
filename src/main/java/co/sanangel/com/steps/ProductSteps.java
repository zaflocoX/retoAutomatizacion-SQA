package co.sanangel.com.steps;

import co.sanangel.com.pages.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

    ProductPage productPage = new ProductPage();
    public final String cantidad1 = "2";
    @Step("Seleccionar cantidad")
    public void seleccionarCantidad(){
        productPage.getDriver().findElement(productPage.getInputCantidad()).click();
        productPage.getDriver().findElement(productPage.getInputCantidad()).clear();
        productPage.getDriver().findElement(productPage.getInputCantidad()).sendKeys(cantidad1);
    }

    @Step("Agregar al carro de compras")
    public void agregarCarroCompras(){
        productPage.getDriver().findElement(productPage.getBtnSubmit()).click();
    }
    @Step("Volver al inicio")
    public void vistaPrincipal(){
        productPage.getDriver().findElement(productPage.getBtnLogo()).click();
    }
}
