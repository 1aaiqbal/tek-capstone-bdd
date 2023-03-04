@signIn @account @order @CreateAccount @smokeTest @smokeTested
Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'aaiqbal@tek.us' and password 'Deena@2018'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email        | password  |
      | abdul@tek.us | Tek@12345 |
      | marha@tek.us | Tek@12345 |

  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | firstName  | email         | newPassword  | confirmPassword |
   #   | Makho | mahkho@tek.us | Deen@2018 | Deen@2018       |
    And User click on SignUp button
    Then User should be logged into account page
