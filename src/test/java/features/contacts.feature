Feature: Contact page features
  @Sanity
  Scenario: Make sure that the email text field is visible
    Given User open the website and go to the login page
    When User fill a valid email as "qacart" and valid password as "test123!" and click on login button
    And User clicks on contacts button
    Then Email text field should be visible

  @Test
  Scenario: Add new contact
    Given User open the website and go to the login page
    When User fill a valid email as "qacart" and valid password as "test123!" and click on login button
    And User clicks on contacts button
    And User clicks on new contact button
    And Fill the firstname and lastname
    And Click on save button
    Then New contact should be added
