@account @Order @signIn  @Home 
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aaiqbal@tek.us' and password 'Deena@2018'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option


  Scenario: Verify User can update Profile Information
    And User update Name 'AbduuAhadI' and PhoneNumber '1012035866'
    And User click on Update button
    Then User profile information should be updated

  Scenario: Verify User can update password
    And User enter below information
      | password | newPassword    | confirmPassword |
      | Asyajan@876500  | Asyajan@002244 | Asyajan@002244  |
    And User click on Change password button
    Then a massage should be displayed 'Password Updated Successfully'

  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
   #   | 0432742546901345 | AbdulAhad  |               3 |           2024 |          123 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  Scenario: Verify User can edit Debit or Credit card
    And User click on card option
    And User click on Edit Option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
   #   | 0123742569524345 | AbdulAhmad |               5 |           2025 |          321 |
    And User click on Update Your Card button
    Then massage should be displayed 'Payment Method updated Successfully'

  Scenario: Verify User can remove Debit or Credit card
    And User click on card option
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Verify User can add an address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | firstName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click add Your Address button
    Then message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country | firstName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click update Your Address button
    Then a message be displayed 'address Updated Successfully'

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
