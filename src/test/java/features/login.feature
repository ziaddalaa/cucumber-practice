

Feature: Test the login functionality

  @Sanity
  Scenario: To login with valid email and valid password
    Given User open the website and go to the login page
    When User fill a valid email as "qacart" and valid password as "test123!" and click on login button
    Then User should be directed to the home page

  Scenario Outline: Login with invalid credentials
    Given User open the website and go to the login page
    When User fill a valid email as "<username>" and valid password as "<password>" and click on login button
    Then Error message should appear

    Examples:
    | username | password |
    | qacart   | wrong    |
    | ziad     | test123! |
    | ziad     | wrong    |
