$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AuthenticationTestScenario.feature");
formatter.feature({
  "name": "Test authentication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified credentials \u003capp_id\u003e and \u003capp_code\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that my access to HERE Api is \u003cstatus2\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "app_id",
        "app_code",
        "status2"
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb3334PrWXpDC3w\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334PrWXpDC3\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb_334PrWXpDC3w\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334 PrWXpDC3w\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"QZ9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"QZvw9AhazmUb1tY3uX40DQ-\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"/nQZvw9AhazmUb1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    },
    {
      "cells": [
        "\"QZvw9AhazmUb\"",
        "\"QZvw9AhazmUb 1tY3uX40DQ\"",
        "\"Unauthorized\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334PrWXpDC3w\" and \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb3334PrWXpDC3w\" and \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334PrWXpDC3\" and \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb_334PrWXpDC3w\" and \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334 PrWXpDC3w\" and \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"QZvw9AhazmUb1tY3uX40DQ\" and \"JIlgIjxb334PrWXpDC3w\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334PrWXpDC3w\" and \"QZ9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334PrWXpDC3w\" and \"QZvw9AhazmUb1tY3uX40DQ-\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"JIlgIjxb334PrWXpDC3w\" and \"/nQZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing authentication for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base query parameters with missing authentication credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_query_parameters_with_missing_authentication_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified credentials \"QZvw9AhazmUb\" and \"QZvw9AhazmUb 1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_credentials_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DateFormatTestScenario.feature");
formatter.feature({
  "name": "Test date format",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified date from current day \u003cday\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that actual data for that day is \u003cexpectedData\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "day",
        "expectedData"
      ]
    },
    {
      "cells": [
        "-1",
        "\"not available\""
      ]
    },
    {
      "cells": [
        "0",
        "\"available\""
      ]
    },
    {
      "cells": [
        "1",
        "\"available\""
      ]
    },
    {
      "cells": [
        "2",
        "\"available\""
      ]
    },
    {
      "cells": [
        "3",
        "\"available\""
      ]
    },
    {
      "cells": [
        "4",
        "\"available\""
      ]
    },
    {
      "cells": [
        "5",
        "\"available\""
      ]
    },
    {
      "cells": [
        "6",
        "\"available\""
      ]
    },
    {
      "cells": [
        "7",
        "\"available\""
      ]
    },
    {
      "cells": [
        "8",
        "\"not available\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day -1",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 0",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 1",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 2",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 3",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 4",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 5",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 6",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 7",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing date format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified date from current day 8",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_date_from_current_day(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data for that day is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_for_that_day_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DuplicateTestScenario.feature");
formatter.feature({
  "name": "Test duplicated parameters",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with duplicated parameter \u003cparameterName\u003e \u003d \u003cparameterValue\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that duplicate is \u003cstatus3\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "parameterName",
        "parameterValue",
        "status3"
      ]
    },
    {
      "cells": [
        "\"app_id\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"app_id\"",
        "\"JIlgIjxb334PrkXpDC3w\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"app_code\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"app_code\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"name\"",
        "\"Berlin\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"name\"",
        "\"Paris\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"product\"",
        "\"observation\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"app_id\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"available\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"app_id\" \u003d \"JIlgIjxb334PrWXpDC3w\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"app_id\" \u003d \"JIlgIjxb334PrkXpDC3w\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"app_code\" \u003d \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"app_code\" \u003d \"QZvw9AhazmUb1tY3uX40DQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"name\" \u003d \"Berlin\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"name\" \u003d \"Paris\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"product\" \u003d \"observation\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing duplicated parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with duplicated parameter \"app_id\" \u003d \"JIlgIjxb334PrWXpDC3w\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_duplicated_parameter(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that duplicate is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_duplicate_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/HttpMethodsTestScenario.feature");
formatter.feature({
  "name": "Test HTTP methods",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with method name \"\u003cmethodName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I expect actual response code is equal to \u003cexpectedStatusCode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "methodName",
        "expectedStatusCode"
      ]
    },
    {
      "cells": [
        "GET",
        "200"
      ]
    },
    {
      "cells": [
        "POST",
        "405"
      ]
    },
    {
      "cells": [
        "DELETE",
        "405"
      ]
    },
    {
      "cells": [
        "OPTIONS",
        "405"
      ]
    },
    {
      "cells": [
        "PUT",
        "405"
      ]
    },
    {
      "cells": [
        "HEAD",
        "200"
      ]
    },
    {
      "cells": [
        "TRACE",
        "403"
      ]
    },
    {
      "cells": [
        "PATCH",
        "405"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"GET\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 200",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"POST\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"DELETE\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"OPTIONS\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"PUT\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"HEAD\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 200",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"TRACE\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 403",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing HTTP methods for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_have_a_base_query_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"PATCH\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_send_request_with_method_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.I_expect_actual_response_code_is_equal_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SensitivenessOfQueryParameterValue.feature");
formatter.feature({
  "name": "Test Sensitiveness of query parameter name",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified value parameters \u003coriginal\u003e changed to \u003cactual\u003e with name \u003cvalue\u003e in test \u003ctest1\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that my access to HERE Api is \u003cstatus5\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "test1",
        "status5",
        "original",
        "actual",
        "value"
      ]
    },
    {
      "cells": [
        "0",
        "\"Unauthorized\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"JIlgIjxb334PrWXpDc3w\"",
        "\"app_id\""
      ]
    },
    {
      "cells": [
        "1",
        "\"Unauthorized\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"JILGIJXB334PRWXPDC3W\"",
        "\"app_id\""
      ]
    },
    {
      "cells": [
        "2",
        "\"Unauthorized\"",
        "\"JIlgIjxb334PrWXpDC3w\"",
        "\"jilgijxb334prwxpdc3w\"",
        "\"app_id\""
      ]
    },
    {
      "cells": [
        "3",
        "\"Unauthorized\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"QZvw9AhazmUb1tY3uX40dq\"",
        "\"app_code\""
      ]
    },
    {
      "cells": [
        "4",
        "\"Unauthorized\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"QZVW9AHAZMUB1TY3UX40DQ\"",
        "\"app_code\""
      ]
    },
    {
      "cells": [
        "5",
        "\"Unauthorized\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\"",
        "\"qzvw9ahazmub1ty3ux40dq\"",
        "\"app_code\""
      ]
    },
    {
      "cells": [
        "6",
        "\"available\"",
        "\"Berlin\"",
        "\"berlin\"",
        "\"name\""
      ]
    },
    {
      "cells": [
        "7",
        "\"available\"",
        "\"Berlin\"",
        "\"berliN\"",
        "\"name\""
      ]
    },
    {
      "cells": [
        "8",
        "\"available\"",
        "\"Berlin\"",
        "\"BERLIN\"",
        "\"name\""
      ]
    },
    {
      "cells": [
        "9",
        "\"not available\"",
        "\"observation\"",
        "\"Observation\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "10",
        "\"not available\"",
        "\"observation\"",
        "\"OBSERVATION\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "11",
        "\"not available\"",
        "\"forecast_7days\"",
        "\"forecast_7dayS\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "12",
        "\"not available\"",
        "\"forecast_7days\"",
        "\"FORECAST_7DAYS\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "13",
        "\"not available\"",
        "\"forecast_7Days_simple\"",
        "\"forecast_7Days_simple\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "14",
        "\"not available\"",
        "\"forecast_7days_simple\"",
        "\"FORECAST_7DAYS_SIMPLE\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "15",
        "\"not available\"",
        "\"forecast_hourly\"",
        "\"forecast_Hourly\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "16",
        "\"not available\"",
        "\"forecast_hourly\"",
        "\"FORECAST_HOURLY\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "17",
        "\"not available\"",
        "\"forecast_astronomy\"",
        "\"foreCast_astronomy\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "18",
        "\"not available\"",
        "\"forecast_astronomy\"",
        "\"FORECAST_ASTRONOMY\"",
        "\"product\""
      ]
    },
    {
      "cells": [
        "19",
        "\"available\"",
        "\"polish\"",
        "\"pOLISH\"",
        "\"language\""
      ]
    },
    {
      "cells": [
        "20",
        "\"available\"",
        "\"polish\"",
        "\"POLISH\"",
        "\"language\""
      ]
    },
    {
      "cells": [
        "21",
        "\"available\"",
        "\"true\"",
        "\"True\"",
        "\"metric\""
      ]
    },
    {
      "cells": [
        "22",
        "\"available\"",
        "\"true\"",
        "\"TRUE\"",
        "\"metric\""
      ]
    },
    {
      "cells": [
        "23",
        "\"available\"",
        "\"false\"",
        "\"False\"",
        "\"metric\""
      ]
    },
    {
      "cells": [
        "24",
        "\"available\"",
        "\"false\"",
        "\"FALSE\"",
        "\"metric\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"JIlgIjxb334PrWXpDC3w\" changed to \"JIlgIjxb334PrWXpDc3w\" with name \"app_id\" in test 0",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"JIlgIjxb334PrWXpDC3w\" changed to \"JILGIJXB334PRWXPDC3W\" with name \"app_id\" in test 1",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"JIlgIjxb334PrWXpDC3w\" changed to \"jilgijxb334prwxpdc3w\" with name \"app_id\" in test 2",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"QZvw9AhazmUb1tY3uX40DQ\" changed to \"QZvw9AhazmUb1tY3uX40dq\" with name \"app_code\" in test 3",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"QZvw9AhazmUb1tY3uX40DQ\" changed to \"QZVW9AHAZMUB1TY3UX40DQ\" with name \"app_code\" in test 4",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"QZvw9AhazmUb1tY3uX40DQ\" changed to \"qzvw9ahazmub1ty3ux40dq\" with name \"app_code\" in test 5",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"Unauthorized\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"Berlin\" changed to \"berlin\" with name \"name\" in test 6",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"Berlin\" changed to \"berliN\" with name \"name\" in test 7",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"Berlin\" changed to \"BERLIN\" with name \"name\" in test 8",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"observation\" changed to \"Observation\" with name \"product\" in test 9",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"observation\" changed to \"OBSERVATION\" with name \"product\" in test 10",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_7days\" changed to \"forecast_7dayS\" with name \"product\" in test 11",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_7days\" changed to \"FORECAST_7DAYS\" with name \"product\" in test 12",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_7Days_simple\" changed to \"forecast_7Days_simple\" with name \"product\" in test 13",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_7days_simple\" changed to \"FORECAST_7DAYS_SIMPLE\" with name \"product\" in test 14",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_hourly\" changed to \"forecast_Hourly\" with name \"product\" in test 15",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_hourly\" changed to \"FORECAST_HOURLY\" with name \"product\" in test 16",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_astronomy\" changed to \"foreCast_astronomy\" with name \"product\" in test 17",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"forecast_astronomy\" changed to \"FORECAST_ASTRONOMY\" with name \"product\" in test 18",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"polish\" changed to \"pOLISH\" with name \"language\" in test 19",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"polish\" changed to \"POLISH\" with name \"language\" in test 20",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"true\" changed to \"True\" with name \"metric\" in test 21",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"true\" changed to \"TRUE\" with name \"metric\" in test 22",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"false\" changed to \"False\" with name \"metric\" in test 23",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter value",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gites"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters value with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_value_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified value parameters \"false\" changed to \"FALSE\" with name \"metric\" in test 24",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SensitivenessOfQueryParametersNameTest.feature");
formatter.feature({
  "name": "Test Sensitiveness of query parameter name",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified name parameters \u003coriginal2\u003e changed to \u003cactual2\u003e with value \u003cvalue2\u003e in test \u003ctest3\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that my access to HERE Api is \u003cstatus7\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "test3",
        "status7",
        "original2",
        "actual2",
        "value2"
      ]
    },
    {
      "cells": [
        "0",
        "\"not available\"",
        "\"app_id\"",
        "\"App_id\"",
        "\"JIlgIjxb334PrWXpDC3w\""
      ]
    },
    {
      "cells": [
        "1",
        "\"not available\"",
        "\"app_id\"",
        "\"APP_ID\"",
        "\"JIlgIjxb334PrWXpDC3w\""
      ]
    },
    {
      "cells": [
        "2",
        "\"not available\"",
        "\"app_code\"",
        "\"App_code\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\""
      ]
    },
    {
      "cells": [
        "3",
        "\"not available\"",
        "\"app_code\"",
        "\"APP_CODE\"",
        "\"QZvw9AhazmUb1tY3uX40DQ\""
      ]
    },
    {
      "cells": [
        "4",
        "\"not available\"",
        "\"name\"",
        "\"Name\"",
        "\"Berlin\""
      ]
    },
    {
      "cells": [
        "5",
        "\"not available\"",
        "\"name\"",
        "\"NAME\"",
        "\"Berlin\""
      ]
    },
    {
      "cells": [
        "6",
        "\"not available\"",
        "\"product\"",
        "\"prodUct\"",
        "\"observation\""
      ]
    },
    {
      "cells": [
        "7",
        "\"not available\"",
        "\"product\"",
        "\"PRODUCT\"",
        "\"observation\""
      ]
    },
    {
      "cells": [
        "8",
        "\"not available\"",
        "\"latitude\"",
        "\"Latitude\"",
        "\"11\""
      ]
    },
    {
      "cells": [
        "9",
        "\"not available\"",
        "\"latitude\"",
        "\"LATITUDE\"",
        "\"11\""
      ]
    },
    {
      "cells": [
        "10",
        "\"not available\"",
        "\"longitude\"",
        "\"loNgitude\"",
        "\"12\""
      ]
    },
    {
      "cells": [
        "11",
        "\"not available\"",
        "\"longitude\"",
        "\"LONGITUDE\"",
        "\"12\""
      ]
    },
    {
      "cells": [
        "12",
        "\"not available\"",
        "\"zipcode\"",
        "\"Zipcode\"",
        "\"98343\""
      ]
    },
    {
      "cells": [
        "13",
        "\"not available\"",
        "\"zipcode\"",
        "\"ZIPCODE\"",
        "\"98343\""
      ]
    },
    {
      "cells": [
        "14",
        "\"available\"",
        "\"oneobservation\"",
        "\"Oneobservation\"",
        "\"true\""
      ]
    },
    {
      "cells": [
        "15",
        "\"available\"",
        "\"oneobservation\"",
        "\"ONEOBSERVATION\"",
        "\"true\""
      ]
    },
    {
      "cells": [
        "16",
        "\"available\"",
        "\"metric\"",
        "\"metRic\"",
        "\"true\""
      ]
    },
    {
      "cells": [
        "17",
        "\"available\"",
        "\"metric\"",
        "\"METRIC\"",
        "\"true\""
      ]
    },
    {
      "cells": [
        "18",
        "\"available\"",
        "\"language\"",
        "\"Language\"",
        "\"polish\""
      ]
    },
    {
      "cells": [
        "19",
        "\"available\"",
        "\"language\"",
        "\"LANGUAGE\"",
        "\"polish\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"app_id\" changed to \"App_id\" with value \"JIlgIjxb334PrWXpDC3w\" in test 0",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"app_id\" changed to \"APP_ID\" with value \"JIlgIjxb334PrWXpDC3w\" in test 1",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"app_code\" changed to \"App_code\" with value \"QZvw9AhazmUb1tY3uX40DQ\" in test 2",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"app_code\" changed to \"APP_CODE\" with value \"QZvw9AhazmUb1tY3uX40DQ\" in test 3",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"name\" changed to \"Name\" with value \"Berlin\" in test 4",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"name\" changed to \"NAME\" with value \"Berlin\" in test 5",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"product\" changed to \"prodUct\" with value \"observation\" in test 6",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"product\" changed to \"PRODUCT\" with value \"observation\" in test 7",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"latitude\" changed to \"Latitude\" with value \"11\" in test 8",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"latitude\" changed to \"LATITUDE\" with value \"11\" in test 9",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"longitude\" changed to \"loNgitude\" with value \"12\" in test 10",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"longitude\" changed to \"LONGITUDE\" with value \"12\" in test 11",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"zipcode\" changed to \"Zipcode\" with value \"98343\" in test 12",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"zipcode\" changed to \"ZIPCODE\" with value \"98343\" in test 13",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"oneobservation\" changed to \"Oneobservation\" with value \"true\" in test 14",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"oneobservation\" changed to \"ONEOBSERVATION\" with value \"true\" in test 15",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"metric\" changed to \"metRic\" with value \"true\" in test 16",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"metric\" changed to \"METRIC\" with value \"true\" in test 17",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"language\" changed to \"Language\" with value \"polish\" in test 18",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing sensitiveness of query parameter name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have query parameters name with changed lower or upper case letters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_query_parameters_name_with_changed_lower_or_upper_case_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified name parameters \"language\" changed to \"LANGUAGE\" with value \"polish\" in test 19",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access to HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_to_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/WeatherApiMandatoryParametersTestScenario.feature");
formatter.feature({
  "name": "Test mandatory parameters",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing mandatory parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have base mandatory parameters",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified mandatory parameters for test \u003ctest\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that my access for test HERE Api is \u003cstatus4\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "test",
        "status4"
      ]
    },
    {
      "cells": [
        "0",
        "\"available\""
      ]
    },
    {
      "cells": [
        "1",
        "\"available\""
      ]
    },
    {
      "cells": [
        "2",
        "\"available\""
      ]
    },
    {
      "cells": [
        "3",
        "\"available\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing mandatory parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base mandatory parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_mandatory_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified mandatory parameters for test 0",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_mandatory_parameters_for_test(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access for test HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_for_test_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing mandatory parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base mandatory parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_mandatory_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified mandatory parameters for test 1",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_mandatory_parameters_for_test(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access for test HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_for_test_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing mandatory parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base mandatory parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_mandatory_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified mandatory parameters for test 2",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_mandatory_parameters_for_test(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access for test HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_for_test_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing mandatory parameters for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have base mandatory parameters",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_base_mandatory_parameters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified mandatory parameters for test 3",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_mandatory_parameters_for_test(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that my access for test HERE Api is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_my_access_for_test_HERE_Api_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Wgs84CompliantFormatTestScenario.feature");
formatter.feature({
  "name": "Test WGS84 format",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.step({
  "name": "I send request with specified longitude \u003clongitude\u003e and latitude \u003clatitude\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "longitude",
        "latitude",
        "status"
      ]
    },
    {
      "cells": [
        "\"0\"",
        "\"0\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"196\"",
        "\"0\"",
        "\"not available\""
      ]
    },
    {
      "cells": [
        "\"-200\"",
        "\"0\"",
        "\"not available\""
      ]
    },
    {
      "cells": [
        "\"160.9\"",
        "\"0\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"-160.9\"",
        "\"0\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"0\"",
        "\"111\"",
        "\"not available\""
      ]
    },
    {
      "cells": [
        "\"0\"",
        "\"-100\"",
        "\"not available\""
      ]
    },
    {
      "cells": [
        "\"0\"",
        "\"60.9\"",
        "\"available\""
      ]
    },
    {
      "cells": [
        "\"0\"",
        "\"-60.9\"",
        "\"available\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"0\" and latitude \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"196\" and latitude \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"-200\" and latitude \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"160.9\" and latitude \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"-160.9\" and latitude \"0\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"0\" and latitude \"111\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"0\" and latitude \"-100\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"not available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"0\" and latitude \"60.9\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing WGS84 compliant format for HERE Api",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a base query parameters without given geographic longitude or latitude",
  "keyword": "Given "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with specified longitude \"0\" and latitude \"-60.9\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_send_request_with_specified_longitude_and_latitude(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect that actual data status for given parameters is \"available\"",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberTestBase.i_expect_that_actual_data_status_for_given_parameters_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});