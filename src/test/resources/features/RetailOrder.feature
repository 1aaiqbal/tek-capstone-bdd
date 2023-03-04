@order @signIn  @CreateAccount @account @smokeTest @smokeTested
Feature: This feature is use for testing UI of Retail page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aaiqbal@tek.us' and password 'Deena@2018'
    And User click on login button
    And User click on Orders section
    And User click on first order in list

  Scenario: Verify User can cancel the order
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  Scenario: Verify User can Return the order
    And User click on Return items button
    And User select the ReturnReason 'item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then cancelation message should be displayed 'Return wass successfull'

  Scenario: Verify User can write a review on order placed
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
