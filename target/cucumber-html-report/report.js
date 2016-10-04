$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/suite/Login/features/com.suite.Deposit.feature");
formatter.feature({
  "line": 1,
  "name": "Deposit",
  "description": "  User should be able to deposit after login \r\n  by clicking the Deposit button/",
  "id": "deposit",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I have logged in supercasino on Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonUti.i_have_logged_in_supercasino_on_Mozilla()"
});
formatter.result({
  "duration": 19232122987,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Deposit",
  "description": "",
  "id": "deposit;deposit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Deposit"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click \"Depositbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I input \"AmtDeposit\" as \"10\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"Cvv\" as \"123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click \"Deposit\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "deposit text should be displyed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Depositbutton",
      "offset": 9
    }
  ],
  "location": "LoginTest.i_click(String)"
});
formatter.result({
  "duration": 4386803790,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AmtDeposit",
      "offset": 9
    },
    {
      "val": "10",
      "offset": 25
    }
  ],
  "location": "DepositTest.i_input_as(String,String)"
});
formatter.result({
  "duration": 6937078814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cvv",
      "offset": 9
    },
    {
      "val": "123",
      "offset": 18
    }
  ],
  "location": "CommonUti.i_enter_as(String,String)"
});
formatter.result({
  "duration": 141218249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 9
    }
  ],
  "location": "LoginTest.i_click(String)"
});
formatter.result({
  "duration": 216356232,
  "status": "passed"
});
formatter.match({
  "location": "DepositTest.deposit_text_should_be_displyed(String)"
});
formatter.result({
  "duration": 1330859,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.suite.Login.DepositTest.deposit_text_should_be_displyed(String) in file:/C:/Maven/focusSmart/target/classes/\u0027 with pattern [^deposit text should be displyed$] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: Then deposit text should be displyed\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\r\n\tat cucumber.api.cli.Main.run(Main.java:36)\r\n\tat cucumber.api.cli.Main.main(Main.java:18)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.mojo.exec.ExecJavaMojo$1.run(ExecJavaMojo.java:293)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n",
  "status": "failed"
});
formatter.uri("main/resources/com/suite/Login/features/com.suite.Login.feature");
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
  "duration": 2092259972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logusername",
      "offset": 9
    },
    {
      "val": "solomon2014",
      "offset": 26
    }
  ],
  "location": "CommonUti.i_enter_as(String,String)"
});
formatter.result({
  "duration": 5067695517,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nCommand duration or timeout: 5.03 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027solomon\u0027, ip: \u0027192.168.0.9\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d45.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b6af31d3-ecc2-44e9-819c-f7cf2b346f26\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:122)\r\n\tat com.WebConnector.WebConnector.type(WebConnector.java:99)\r\n\tat com.suite.Register.CommonUti.i_enter_as(CommonUti.java:26)\r\n\tat ✽.And I enter \"Logusername\" as \"solomon2014\"(main/resources/com/suite/Login/features/com.suite.Login.feature:8)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027solomon\u0027, ip: \u0027192.168.0.9\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10092)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:625)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logpassword",
      "offset": 9
    },
    {
      "val": "London01",
      "offset": 26
    }
  ],
  "location": "CommonUti.i_enter_as(String,String)"
});
formatter.result({
  "status": "skipped"
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
formatter.uri("main/resources/com/suite/Register/features/PromotionPage.feature");
formatter.feature({
  "line": 1,
  "name": "PromotionPage",
  "description": "User should be able to navigate to promotion page \r\nand click or the promotion banners to look att the promotions availabe on the site.",
  "id": "promotionpage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#Background:"
    }
  ],
  "line": 9,
  "name": "PromotionPage",
  "description": "",
  "id": "promotionpage;promotionpage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@PromotionBanners"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I navigate to \"siteName\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on \"PromotionTab\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on each \"InfoButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "TitlePage should equal each promotionTitle",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "promotionpage;promotionpage;",
  "rows": [
    {
      "cells": [
        "browser"
      ],
      "line": 16,
      "id": "promotionpage;promotionpage;;1"
    },
    {
      "cells": [
        "Mozilla"
      ],
      "line": 17,
      "id": "promotionpage;promotionpage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "PromotionPage",
  "description": "",
  "id": "promotionpage;promotionpage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@PromotionBanners"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on \"PromotionTab\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click on each \"InfoButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "TitlePage should equal each promotionTitle",
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
  "duration": 1995080267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PromotionTab",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 185274327,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InfoButton",
      "offset": 17
    }
  ],
  "location": "PromotionPageTest.i_click_on_each(String)"
});
formatter.result({
  "duration": 73358789021,
  "status": "passed"
});
formatter.match({
  "location": "PromotionPageTest.titlepage_should_equal_each_promotionTitle()"
});
formatter.result({
  "duration": 58589,
  "status": "passed"
});
formatter.uri("main/resources/com/suite/Register/features/com.suite.ChatBox.feature");
formatter.feature({
  "line": 1,
  "name": "ChatBox",
  "description": "      user should be able to chat with customer support\r\n      when having an issue by clicking the chat box \r\n      and sending the message to the customer support.",
  "id": "chatbox",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#Background:"
    },
    {
      "line": 7,
      "value": "# Given  I navigate to \"siteName\" on \"\u003cbrowser\u003e\""
    }
  ],
  "line": 11,
  "name": "ChatBox",
  "description": "",
  "id": "chatbox;chatbox",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@ChatBox"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I navigate to \"siteName\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Home\"Chatlink\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"chatTextBox\" as \"\u003cMsg\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"chatSextButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Message should be \"\u003cExpectedResult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "chatbox;chatbox;",
  "rows": [
    {
      "cells": [
        "browser",
        "Msg",
        "ExpectedResult"
      ],
      "line": 20,
      "id": "chatbox;chatbox;;1"
    },
    {
      "cells": [
        "Mozilla",
        "Hello",
        "Sucessfully"
      ],
      "line": 21,
      "id": "chatbox;chatbox;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "ChatBox",
  "description": "",
  "id": "chatbox;chatbox;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@ChatBox"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Home\"Chatlink\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"chatTextBox\" as \"Hello\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"chatSextButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Message should be \"Sucessfully\"",
  "matchedColumns": [
    2
  ],
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
  "duration": 4070584321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chatlink",
      "offset": 16
    }
  ],
  "location": "ChatBoxTest.i_click_on_Home(String)"
});
formatter.result({
  "duration": 5130072300,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027chat_button tmp_chat_fixes js-playtech-chat column3-6\u0027]\"}\nCommand duration or timeout: 5.13 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027solomon\u0027, ip: \u0027192.168.0.9\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d45.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b6af31d3-ecc2-44e9-819c-f7cf2b346f26\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027chat_button tmp_chat_fixes js-playtech-chat column3-6\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.WebConnector.WebConnector.click(WebConnector.java:94)\r\n\tat com.suite.Register.ChatBoxTest.i_click_on_Home(ChatBoxTest.java:29)\r\n\tat ✽.When I click on Home\"Chatlink\"(main/resources/com/suite/Register/features/com.suite.ChatBox.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027chat_button tmp_chat_fixes js-playtech-chat column3-6\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027solomon\u0027, ip: \u0027192.168.0.9\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Solomon/AppData/Local/Temp/anonymous5189454030620480483webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:625)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "chatTextBox",
      "offset": 9
    },
    {
      "val": "Hello",
      "offset": 26
    }
  ],
  "location": "CommonUti.i_enter_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "chatSextButton",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sucessfully",
      "offset": 19
    }
  ],
  "location": "ChatBoxTest.message_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("main/resources/com/suite/Register/features/com.suite.FooterLinks.feature");
formatter.feature({
  "line": 1,
  "name": "FooterLinks",
  "description": "      User should be able to navigate to each of the link within the footer\r\n      on the Home page or any other page on the site",
  "id": "footerlinks",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"\u003cfooterlinks\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"\u003cVerificationObject\u003e\" element should be present",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "footerlinks;footerlinks;",
  "rows": [
    {
      "cells": [
        "browser",
        "footerlinks",
        "VerificationObject"
      ],
      "line": 13,
      "id": "footerlinks;footerlinks;;1"
    },
    {
      "cells": [
        "Mozilla",
        "TV_Presenter",
        "Presenter"
      ],
      "line": 14,
      "id": "footerlinks;footerlinks;;2"
    },
    {
      "cells": [
        "Mozilla",
        "Video",
        "AllVideoTab"
      ],
      "line": 15,
      "id": "footerlinks;footerlinks;;3"
    },
    {
      "cells": [
        "Mozilla",
        "vip",
        "VIPLogo"
      ],
      "line": 16,
      "id": "footerlinks;footerlinks;;4"
    },
    {
      "cells": [
        "Mozilla",
        "Winners",
        "winners"
      ],
      "line": 17,
      "id": "footerlinks;footerlinks;;5"
    },
    {
      "cells": [
        "Mozilla",
        "GettingStarted",
        "gettingstarted"
      ],
      "line": 18,
      "id": "footerlinks;footerlinks;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"TV_Presenter\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"Presenter\" element should be present",
  "matchedColumns": [
    2
  ],
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
  "duration": 2048191065,
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
  "duration": 134532732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Presenter",
      "offset": 1
    }
  ],
  "location": "FooterLinksTest.element_should_be_present(String)"
});
formatter.result({
  "duration": 3535192090,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Video\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"AllVideoTab\" element should be present",
  "matchedColumns": [
    2
  ],
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
  "duration": 2225242459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Video",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 187716233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AllVideoTab",
      "offset": 1
    }
  ],
  "location": "FooterLinksTest.element_should_be_present(String)"
});
formatter.result({
  "duration": 3379111147,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"vip\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"VIPLogo\" element should be present",
  "matchedColumns": [
    2
  ],
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
  "duration": 1942361626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vip",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 182595074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VIPLogo",
      "offset": 1
    }
  ],
  "location": "FooterLinksTest.element_should_be_present(String)"
});
formatter.result({
  "duration": 1787065429,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Winners\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"winners\" element should be present",
  "matchedColumns": [
    2
  ],
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
  "duration": 1951811928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Winners",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 197819562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "winners",
      "offset": 1
    }
  ],
  "location": "FooterLinksTest.element_should_be_present(String)"
});
formatter.result({
  "duration": 9959264657,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "FooterLinks",
  "description": "",
  "id": "footerlinks;footerlinks;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@FooterLinks"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to \"siteName\" on \"Mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on \"GettingStarted\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"gettingstarted\" element should be present",
  "matchedColumns": [
    2
  ],
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
  "duration": 1877838875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GettingStarted",
      "offset": 12
    }
  ],
  "location": "CommonUti.i_click_on(String)"
});
formatter.result({
  "duration": 178393372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gettingstarted",
      "offset": 1
    }
  ],
  "location": "FooterLinksTest.element_should_be_present(String)"
});
formatter.result({
  "duration": 2957453542,
  "status": "passed"
});
});