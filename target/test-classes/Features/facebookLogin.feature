
@smoke
Feature: Validation of Facebook Login

Background:
 Given Launch the Browser
    And Open the Facebook
    
  @tag1
  
    Scenario Outline: validate the facebook Login with valid Credentials
     When enter the "<username>" and "<password>"
    And Click the Login button
    Then  validate the message
    
    Examples:  
    |username|password|
    |sharique|anwar@345|
    |sharique|jackl@4445|
    |sharique|money@4445|
    
    @sanity
      Scenario Outline: validate the facebook Login with valid Credentials
     When enter the "<username>" and "<password>"
    And Click the Login button
    Then  validate the message
    
    Examples:  
    |username|password|
    |sharique|anwar@345|
    
    
    