@AddToCart

Feature: Search the product and add to cart complete flow for check out

  Scenario Outline: Complete flow of product purchae 
    Given User landing on the product search page
    When User search the product using <Name> short name
    Then User add 3 number of quantity and add product in cart
    Then User procced to check out page and validate the <Name> checkout page
    Then User ability to enter promocode and place order

    Examples: 
      | Name |
      | Tom |
      
