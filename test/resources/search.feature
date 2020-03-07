Feature: Search
  As an end user
  I want to search for product
  So that i can view product i wish

  @smoke
  Scenario: Search for single product
    Given I am on homepage
    When I search for product "adidas"
    Then I should be able to see adidas product