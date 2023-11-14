@addanewcategory
Feature: Je veux ajouter une nouvelle categorie
  ETQ vendeur Je veux ajouter une nouvelle categorie

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In

  @addanewcategory-valid
  Scenario: Je veux ajouter une nouvelle categorie
    When Je clique sur le menu Catalog
    And Je clique sur le menu Categories
    And Je clique sur le bouton Add new
    And Je saisis un nom "Machine"
    And Je saisis une description "This is a description"
    And Je selectionne une parent category Books
    And Je charge un fichier "C:\Users\moham\OneDrive\Bureau\docs\Formations\selenium_cheat_sheet.jpg"
    And Je vérifie que le fichier a bien ete charge
    And Je clique sur le bouton Save
    Then Je vérifie que la nouvelle categorie a ete ajoutee "The new category has been added successfully."
