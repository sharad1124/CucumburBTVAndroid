Feature: Marketing scenarios


  Scenario Outline: Verify marketing screen
    When I tap on the Recording Screen button
    And I tap on the start recording button
    And I tap on the Stop recording button
    Then I should see Login page with title "<logintext>"
    Examples:
      | logintext |
      | Please login to save your recordings. |