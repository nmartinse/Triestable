#Author: Nerea Martin Serrano

@test_verde
Feature: Test Verde

  @test_abrir
  Scenario: abrirVerdeOk
    Given el biestable en estado Verde
    When quiero seleccionar abrir
    Then no se modifica el estado
    
  @test_cerrar
  Scenario: cerrarVerdeOk
    Given el biestable esta en Verde
    When quiero seleccionar cerrar
    Then se modifica el estado a rojo
    