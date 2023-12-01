package co.sanangel.com.stepDefinitions;

import co.sanangel.com.steps.InicioSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgregarProductosStepDefinitions {

    @Steps
    InicioSteps inicioSteps;
    @Given("^que el usuario ingresa a la pagina \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPagina(String vinculo) {
        inicioSteps.OpenBrowser(vinculo);

    }


    @When("^Busque los productos de su preferencia$")
    public void busqueLosProductosDeSuPreferencia() {
        inicioSteps.SeleccionarProducto1();
    }

    @When("^agregue los prductos al carro de compras$")
    public void agregueLosPrductosAlCarroDeCompras() {

    }

    @Then("^puede seleccionar las cantidades que requiere$")
    public void puedeSeleccionarLasCantidadesQueRequiere() {

    }
}
