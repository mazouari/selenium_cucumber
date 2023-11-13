@catalog
Feature: Je souhaite chercher un poduit
  En tant que utilisateur je souhaite chercher un poduit

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @catalog-valid
  Scenario: Je souhaite chercher un poduit
    When Je clique sur le menu Catalog
    And Je clique sur le menu Products
    And Je saisis le produit "lenovo"
    And je clique sur le bouton Search
    Then le resultat de recherche affiche est  "Lenovo IdeaCentre 600 All-in-One PC"
