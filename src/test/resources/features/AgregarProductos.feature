#athor: zamir flores

  Feature: Agregar productos al carro de compras
    Yo como usuario quiero ingresar a la página de compras
    seleccionar productos de mi interes y agregarlos al carro de compras

  Scenario: Agregar productos al carro de compras
    Given que el usuario ingresa a la pagina "https://sanangel.com.co/"
    When Busque los productos de su preferencia
    And selecciona las cantidades que requiere
    Then agrega los productos al carro de compras