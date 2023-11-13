@addnewproduct
Feature: Je veux ajouter un nouveau produit
  ETQ vendeur Je veux ajouter un nouveau produit

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @addnewproduct-valid
  Scenario: Je veux ajouter un nouveau produit
    When Je clique sur menu Catalog
    And Je clique sur menu Products
    And Je clique sur bouton Add new
    And Je saisis nom du produit "alpha"
    And Je saisis a short description "this is a short description"
    And Je saisis a full description "this is a full description"
    Then Je clique sur le bouton Save
