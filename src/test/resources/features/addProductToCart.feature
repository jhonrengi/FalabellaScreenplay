Feature: Add product to cart

  Scenario: Add product to cart success
    Given that user open page Falabella and search any product
    When user click  on  product tittle and user click on add to cart
    Then user can read the product added to cart and watch amount that product.