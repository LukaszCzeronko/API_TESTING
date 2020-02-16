Feature: Test HTTP methods

  Scenario Outline: Testing HTTP methods for HERE Api
    Given I have base "app_id"
    And I have base "app_code"
    And I have base "product"
    And I have base "name"
    When I send request with method name "<methodName>"
    Then I expect actual response code is equal to <expectedStatusCode>
    Examples:
      | methodName | expectedStatusCode |
      | GET        | 200                |
      | POST       | 405                |
      | DELETE     | 405                |
      | OPTIONS    | 405                |
      | PUT        | 405                |
      | HEAD       | 200                |
      | TRACE      | 403                |
      | PATCH      | 405                |