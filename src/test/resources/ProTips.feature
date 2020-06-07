Feature: Pro Tip scenarios
@test
  Scenario Outline: Verify Pro Tip screen
    Given I'm on Pro tip screen
    And I tap on the Pro Tips
    Then I should see Pro Tip page with title "<Protext>"
    Then I should see Pro Tip page with litghting "<lighting_text_view>"
    Then I should see Pro Tip page with professional "<professional_text_view>"
    Then I should see Pro Tip page with rotaotetext "<rotate_pro_tip_text_view>"

  Examples:
      | Protext | lighting_text_view | professional_text_view | rotate_pro_tip_text_view |
      | PRO TIP | Lighting | Professional looking Office | PRO TIP |