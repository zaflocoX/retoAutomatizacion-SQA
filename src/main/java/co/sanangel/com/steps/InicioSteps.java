package co.sanangel.com.steps;

import co.sanangel.com.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import utils.Seleccion;

import java.util.List;

public class InicioSteps {

    InicioPage inicioPage = new InicioPage();

    @Step("Inicializar el navegador")
    public void OpenBrowser(String vinculo){
        inicioPage.openUrl(vinculo);
    }

    @Step("Seleccionar el producto 1")
    public void SeleccionarProducto1(){
        List<WebElement> buscarProducto = inicioPage.getDriver().findElements(inicioPage.getLiProducts());
        buscarProducto.get(Seleccion.numeroAleatorioEnRango(0,buscarProducto.size())).click();
    }
}
