Feature: Test the login functionality

Scenario Outline: Verify user is able to Login with Valid credentials
Given User open the browser
And User should be on LoginPage
When User should enters "<username>" and "<password>"
And Click on Login
Then user should be on Homepage 

Examples: 
      | username | password |
      | Rakesh   | 12345    |
      | Spector  | 12345    |
      | @#$%^    | !!@##    |
      | 2345^&*  | #$%^&*   |