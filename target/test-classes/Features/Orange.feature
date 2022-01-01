
@tag
Feature: Orange HRM Login Validation
 

 @orange
  Scenario: Orange HRM with Valid Credentials
    Given Launch the Browser
    And open the Orange HRM
    When enter the username and password
    And clicl the login Button
    Then I validate the outcomes
    And close the browser

 