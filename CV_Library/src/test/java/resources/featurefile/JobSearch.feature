Feature: Login feature
  As a User want to check job search functionality

  @smoke
  Scenario: User should login successfully with valid credentials
    When user on Homepage
    When user enter job title 'jobTitle'
    When user enter Location 'location'
    When user select distance 'distance'
    When user click on moreSearchOptionsLink
    When user enter salaryMin 'salaryMin'
    When user enter salaryMax 'salaryMax'
    When user select salaryType 'salaryType'
    When user select jobType 'jobType'
    When user click on 'Find Jobs' button
    Then user can see result "Permanent Software Developer jobs in London"



