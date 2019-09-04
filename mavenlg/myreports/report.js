$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:packy/Check.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" in the field",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" in the field",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sam",
        "12345"
      ]
    },
    {
      "cells": [
        "vishal",
        "224455"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "user enters \"sam\" in the field",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_enters_in_the_field1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"12345\" in the field",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_in_the_field1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "user enters \"vishal\" in the field",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_enters_in_the_field1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"224455\" in the field",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_in_the_field1(String)"
});
formatter.result({
  "status": "passed"
});
});