@multiusers
Feature: Je souhaite verifier la connexion avec plusieurs utilisateurs
  ETQ utilisateur je souhaite verifier la connexion avec plusieurs utilisateurs

  Background: 
    Given Je me connecte sur l application nopCommerce

  @authentificationmultiusers
  Scenario Outline: Je souhaite verifier la connexion avec plusieurs utilisateurs
    When Je saisis l email "<name>"
    And Je saisis le password "<value>"
    And Je clique sur le bouton Log In

    Examples: 
      | name                | value |
      | admin@yourstore.com | admin |
      | Ramla@yourstore.com | Ramla |
      | Hajer@yourstore.com | Hajer |
      | Amir@yourstore.com  | Amir  |
