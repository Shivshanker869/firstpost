Feature: Home and Kitchen Section

  Scenario: Navigate to Home and Kitchen
    Given User launches the browser
    When User navigates to the Naaptol website
    And User clicks on Home and Kitchen category
    Then User should see Home and Kitchen items

  Scenario Outline: Search product in Home and Kitchen
    Given User is on Home and Kitchen page
    When User searches for "<product>"
    Then Relevant products should be displayed

    Examples:
      | product    |
      | blender    |
      | bedsheet   |
      | pressure cooker |
