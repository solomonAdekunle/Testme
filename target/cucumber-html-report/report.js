$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/suite/Register/features/com.suite.Presenter.feature");
formatter.feature({
  "line": 1,
  "name": "PrsenterPage",
  "description": "User should be able to navigate to Presnters page by clicking\r\n on each presenter image .",
  "id": "prsenterpage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "PresenterPage",
  "description": "",
  "id": "prsenterpage;presenterpage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PresenterPage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"siteName\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on \"TV_Presenter\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on each of morelink",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "TitlePage should equal each PresenterTitle",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "prsenterpage;presenterpage;",
  "rows": [
    {
      "cells": [
        "browser"
      ],
      "line": 13,
      "id": "prsenterpage;presenterpage;;1"
    },
    {
      "cells": [
        "Mozilla"
      ],
      "line": 14,
      "id": "prsenterpage;presenterpage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "PresenterPage",
  "description": "",
  "id": "prsenterpage;presenterpage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PresenterPage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on \"TV_Presenter\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on each of morelink",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "TitlePage should equal each PresenterTitle",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "siteName",
      "offset": 15
    },
    {
      "val": "Mozilla",
      "offset": 29
    }
  ],
  "location": "CommonUti.i_navigate_to_on_Mozilla(String,String)"
});
formatter.result({
  "duration": 11361747923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TV_Presenter",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 608214542,
  "status": "passed"
});
formatter.match({
  "location": "PresenterPageTest.i_click_on_each_of_morelink()"
});
formatter.result({
  "duration": 48898490853,
  "status": "passed"
});
formatter.match({
  "location": "PresenterPageTest.titlepage_should_equal_each_PresenterTitle()"
});
formatter.result({
  "duration": 35068,
  "status": "passed"
});
});