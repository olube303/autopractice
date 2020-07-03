Feature: Application
  As a user I should be able to login as a customer


  Scenario: To verify that I can login successfully into the website
    Given I launch the automation practice on chrome browser
    And I click on sign in
    When I enter my email address "olube303@yahoo.com"
    And my password successfully "Advent"
    Then i am successfully logged into the website
    And Account message is displayed in the home page
