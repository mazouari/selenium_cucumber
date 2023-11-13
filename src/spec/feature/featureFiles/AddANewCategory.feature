@addanewcategory
Feature: Je veux ajouter un nouveau produit
  ETQ vendeur Je veux ajouter un nouveau produit

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @addanewcategory-valid
  Scenario: Je veux ajouter un nouveau produit
    When Je clique sur menu Catalog
    And Je clique sur menu Categories
    And Je clique sur bouton Add new
    And Je saisis nom du produit "Beta"
    And Je saisis une description "this is a description"
    And Je clique sur le champ parent category
    And Je charge un fichier
    Then Je clique sur le bouton Save
