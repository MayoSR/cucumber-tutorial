Feature: login feature

  Scenario: check if user is valid login
    Given the application is working
    When the credentials are "valid"
    Then take user to home page

  Scenario: check if user is invalid login
    Given the application is working
    When the credentials are "invalid"
    Then take user to login page
