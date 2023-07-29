Feature: Login feature
  As a User want to check job search functionality

  @smoke
  Scenario: User should successfully on Homepage
    When user on Homepage
    When user enter job title "Paan, bidi and shisha” in search field"
    And user click on search button
    When user click on Paan, bidi and shisha
    Then Verify text "Smoking increases your risk of cancer, heart disease and respiratory problems."


