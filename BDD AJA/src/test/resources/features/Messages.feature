Feature: Messages


  Scenario: Send a message to another user
    Given I am on the main LinkedIn page
    When I click the Messaging button
    And I entered the destination username
    And I typed the message, example Hello, how are you?
    And  I clicked the Send button
    Then I will see my message in the conversation with the destination user