Feature: To test the swas demo login

Scenario Outline: validate the user login successfully
Given Browser is open
And User is on login page
When User enters <username> and <password>
Then user is navigated to the product page
  Examples:
    | username     | password     |
    | standard_user| secret_sauce |

  Scenario Outline: User select the product successfully
    Given The user is product page
    When User click on the Add to cart
    And click on the cart
    And click on the checkout
    And User Enters "<firstname>" and "<lastname>" and "<zipcode>"
    And User click on continue
    And user click on the finish button
    Then User navigate to the success page
Examples:
  |  firstname|  lastname  |  zipcode  |
  |     John  |  tailor    |   03452   |
  |     Johns |  snow      |   03452   |
