$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com.suite.Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "        I want to login in other in other to see my balance",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Given I am logged in salesforce in Mozilla"
    }
  ],
  "line": 6,
  "name": "Login",
  "description": "",
  "id": "login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
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
  "name": "I enter \"Logusername\" as \"solomon2014\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Logpassword\" as \"London01\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click \"LoginButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\u003cVerificationObject\u003eshould be present",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 12,
      "value": "#Then  \"\u003cVerificationObject\u003e\"should be present"
    }
  ],
  "line": 14,
  "name": "",
  "description": "",
  "id": "login;login;",
  "rows": [
    {
      "cells": [
        "browser",
        "VerificationObject"
      ],
      "line": 15,
      "id": "login;login;;1"
    },
    {
      "cells": [
        "Mozilla",
        "\"Depositbutton\", \"usernameInfo\", \"BalInfo\", \"Account\""
      ],
      "line": 16,
      "id": "login;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 16,
  "name": "Login",
  "description": "",
  "id": "login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
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
  "name": "I enter \"Logusername\" as \"solomon2014\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Logpassword\" as \"London01\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click \"LoginButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"Depositbutton\", \"usernameInfo\", \"BalInfo\", \"Account\"should be present",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginButton",
      "offset": 9
    }
  ],
  "location": "LoginTest.i_click(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Depositbutton",
      "offset": 1
    },
    {
      "val": "usernameInfo",
      "offset": 18
    },
    {
      "val": "BalInfo",
      "offset": 34
    },
    {
      "val": "Account",
      "offset": 45
    }
  ],
  "location": "LoginTest.should_be_present(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
});