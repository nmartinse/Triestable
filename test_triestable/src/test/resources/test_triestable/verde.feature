#Author: Nerea Martin Serrano

@test_verde
Feature: Test Verde

  @test_abrir
  Scenario: abrirVerdeOk
    Given el triestable en estado Verde
    When quiero seleccionar abrir
    Then no se modifica el estado
    
  @test_cerrar
  Scenario: cerrarVerdeOk
    Given el triestable esta en Verde
    When quiero seleccionar cerrar
    Then se modifica al estado amarillo
    