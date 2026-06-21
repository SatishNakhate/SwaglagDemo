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
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    Given The user is product page
    When User click on the Add to cart
    And click on the cart
    And click on the checkout
    When User enter checkout details "John" and "tailor" and "03452"
    And User click on continue
    And user click on the finish button
    Then User navigate to the success page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
    #When user click on the back to home

  Scenario Outline: user is on about page

    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And user click on toggle
    And user click on the about page
    Then user redirect back product inventory page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |