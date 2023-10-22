Feature: Login
    @Positive
    Scenario Outline: Success Login
      #precondition
      Given halaman login saucedemo

      #steps
      When input username
      And input password
      And click button login