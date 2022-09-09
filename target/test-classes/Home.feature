Feature: As a user I should be able to see all the available items in the home page

Background: User is logged into sauce demo web page
  Given I set the user name text box with "standard_user"
  And I set the password text box with "secret_sauce"
  And I click on the login button

  Scenario Outline: Products are available in the home page
    When I am in the home page
    Then I verify that "<product>" is displayed
  Examples:
    | product               |
    | Sauce Labs Backpack   |
    | Sauce Labs Bike Light |

    # Test 2 Verifica el contador del carrito
  Scenario Outline: The cart counter is updated
    When I am in the home page
    And I check the quantity of products in de cart
    And I click "<product>" product
    And I click on add to cart
    Then I verify that product is added
    Examples:
      | product               |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |

   # Test 3 Verificar producto agregado
  Scenario Outline: Add products to cart
    When I am in the home page
    And I check the quantity of products in de cart
    And I click "<product>" product
    And I click on add to cart
    Then I verify that product "<product>" is added
    Examples:
      | product               |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |

     # Test 3 Verificar producto eliminado
  Scenario Outline: Add products to cart
    When I am in the home page
    And I check the quantity of products in de cart
    And I click "<product>" product
    And I click on add to cart
    And I click on the cart icon
    And I click on the remove button
    Then I verify that product "<product>" removed
    Examples:
      | product               |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
