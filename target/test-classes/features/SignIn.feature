Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @test4
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'iqbala4@gmail.com' and password 'Asyajan@112233'
    And User click on login button
    Then User should be logged in into Account

  @test1
  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email              | password     |
      | 1aaiqbal@gmail.com | Asyajan@2022 |
      | marhaba@gmail.com  | jani@2022    |

  @test2
  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password     | confirmPassword |
      | fullName | email | Asyajan@2022 | Asyajan@2022    |
    And User click on SignUp button
    Then User should be logged into account page
