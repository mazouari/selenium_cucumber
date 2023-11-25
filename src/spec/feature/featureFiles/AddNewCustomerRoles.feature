@addnewcustomerroles
Feature: Je veux ajouter un nouveau role
  ETQ Je veux ajouter un nouveau role

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @addnewcustomerroles-valid
  Scenario: Je veux ajouter un nouveau role
    Given Je clique sur le menu Customers
    And Je clique sur le menu Customer roles
    And Je clique sur le bouton Add new
    And Je saisis un nom "CustomerRoleTest"
    And Je clique sur Free shipping
    And Je clique sur Override default tax display type
    And Je selectionne Excluding tax "10"
    And Je clique sur Choose a product
    And Je saisis le produit "Nokia" dans la nouvelle fenetre
    And Je clique sur le bouton Search
    And Je selectionne Nokia Lumia
    And Je verifie que le produit a ete ajoute "Nokia Lumia"
    And Je saisis un system name "SystemNameTest"
    And Je clique sur le bouton Save
    Then Je verifie que la nouvelle categorie a ete ajoutee "The new customer role has been added successfully."
