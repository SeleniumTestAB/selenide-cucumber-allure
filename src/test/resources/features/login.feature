Feature: Login Page
  User should be able to login on various accounts

  Scenario: Login as Admin
    Given User is on Login Page
    When User gives proper credentials to Admin account
    Then User should be logged as Admin