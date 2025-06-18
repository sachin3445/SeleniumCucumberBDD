@SearchProduct
Feature: Search the product and validate

  Scenario Outline: Search product on page home page and offer page
    Given User landing on the product search page
    When  User search the product using <Name> short name
    Then User search <Name> product short name in offer page
    Then Validate landing page product with offer page product

   Examples:
   | Name |
   | Tom 	|
   | Stra |
   | Beet |