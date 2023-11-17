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
    When Je clique sur le menu Catalog
    And Je clique sur le menu Products
    And Je clique sur le bouton Add new
    And Je saisis un nom "test-produit2"
    And Je saisis a short description "this is a short description"
    And Je saisis a full description "This is a full description"
    And je saisis un SKU "This is the SKU"
    And Je selectionne une categories Books "14"
    And Je selectionne un manufacturers HP
    And Je clique sur le bouton Save
    Then Je verifie que la nouvelle categorie a ete ajoutee "The new product has been added successfully."
