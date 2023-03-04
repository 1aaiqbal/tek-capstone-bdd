 @CreateAccount @account @order @signIn @smokeTest @smokeTested
Feature: This feature is use for testing UI of Retail page

  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed
    Then The sign in button should be present
    Then The cart button should be present

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |
@smokeTest
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aaiqbal@tek.us' and password 'Deena@2018'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '4'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill a new address form with below information
      | country | firstName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill a Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card option
    And User click on Place Your Order
    Then message displayed 'Order Placed, Thanks'
@smokeTested
  Scenario Outline: Verify User can place on order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aaiqbal@tek.us' and password 'Deena@2018'
    And User click on login button
    Then User should be logged in into Account
    And User Change the category to 'Electronics'
    And User Search for an item 'Apex Legends'
    And User Click on Search icon
    And User Click on item
    And User Select quantity '5'
    And User Click add to Cart button
    Then The Cart icon quantity should change to '5'
    And User Click on Cart option
    And User Click on Proceed to Checkout buttons
    And User Click on Place Your Orders
    Then a Message should be displayed 'Order Placed, Thanks'
