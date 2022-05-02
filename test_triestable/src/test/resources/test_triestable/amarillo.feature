#Author: Nerea Martin Serrano

@test_amarillo
Feature: Test Amarillo

  @test_abrir
  Scenario: abrirAmarilloOk
    Given el triestable en estado Amarillo
    When invoco al metodo abrir
    Then se modifica el estado a Verde
    
  @test_cerrar
  Scenario: cerrarVerdeOk
    Given el triestable esta en Amarillo
    When invoco al metodo cerrar
    Then se modifica el estado a Rojo
    