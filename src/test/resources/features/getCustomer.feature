Feature: Test get Customer API to check the values returned

  @exc
  Scenario: get response for the basic get customer API.
    Given : no input param passed
    When : the get customer API is called
    Then : I should get 200 as response code.