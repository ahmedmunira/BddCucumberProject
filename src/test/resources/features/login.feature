Feature: Login to facebook
  Keywords Summary : This test will verify login related scenarios to FACAEBOOK.COM

  Background:
    Given User navigated to FACEBOOK.COM


  #@debug
  Scenario: Login with valid credentials
    When  user enter Username as "USER" and Password "PASSWORD"
    And   user click on login button
    Then  login should be successfulPage

    # hello

  @debug
  Scenario Outline:  Login with multiple credentials
    When user Enter "<USERNAME>" in the username field and "<PASSWORD>"in the password field
    And   user click on login button
    Then  login should be successfulPage


    Examples:
      |  USERNAME      | PASSWORD|
      |user1@yahoo.com | 123456  |
      |user2@yahoo.com | 654321  |
      |user3@yahoo.com | 098766  |