package co.sanangel.com.stepDefinitions;

import co.sanangel.com.steps.InicioSteps;
import co.sanangel.com.steps.ProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgregarProductosStepDefinitions {

    @Steps
    InicioSteps inicioSteps;

    @Steps
    ProductSteps productSteps;

    @Given("^que el usuario ingresa a la pagina \"([^\"]*)\"$")
    public void que_el_usuario_ingresa_a_la_pagina(String vinculo) {
        inicioSteps.OpenBrowser(vinculo);
    }
    @When("^Busque los productos de su preferencia$")
    public void busque_los_productos_de_su_preferencia() {
        inicioSteps.SelectProduct();
    }

    @When("^selecciona las cantidades que requiere$")
    public void selecciona_las_cantidades_que_requiere() {
        productSteps.seleccionarCantidad();

    }

    @Then("^agrega los productos al carro de compras$")
    public void agrega_los_productos_al_carro_de_compras() {
        productSteps.agregarCarroCompras();
    }


}