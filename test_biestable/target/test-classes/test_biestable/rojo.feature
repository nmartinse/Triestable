#Author: Nerea Martin Serrano

@test_rojo
Feature: Test Rojo

  @test_abrir
  Scenario: abrirRojoOk
    Given el biestable en estado rojo
    When selecciono abrir
    Then se modifica el estado a verde
    
  @test_cerrar
  Scenario: cerrarRojoOk
    Given el biestable esta en rojo
    When slecciono cerrar
    Then el estado no se modifica
    
    