Feature: Login Failure

  Scenario Outline: User enters invalid username and password
    Given halaman login saucedemo
    When user enters invalid username and password
    And user clicks the login button