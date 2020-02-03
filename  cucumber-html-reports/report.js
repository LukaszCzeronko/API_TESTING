$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HttpMethodsTestScenario.feature");
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"GET\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 200",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"POST\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"DELETE\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"OPTIONS\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"PUT\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"HEAD\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 200",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"TRACE\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 403",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
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
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:29)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send request with method name \"PATCH\"",
  "keyword": "When "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:36)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect actual response code is equal to 405",
  "keyword": "Then "
});
formatter.match({
  "location": "validation.cucumber.CucumberHttpMethodsTest.\u003cinit\u003e(CucumberHttpMethodsTest.java:41)"
});
formatter.result({
  "status": "passed"
});
});