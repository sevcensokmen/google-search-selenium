$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googlesearchresultaccuracy.feature");
formatter.feature({
  "line": 1,
  "name": "Search google and seacrh result content is compared accurancy value",
  "description": "",
  "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search google and result content is compared accurancy",
  "description": "",
  "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value;search-google-and-result-content-is-compared-accurancy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the  website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003csearch\u003e\" search",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters searchbutton",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Searchresult is compared \"\u003caccurancy\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value;search-google-and-result-content-is-compared-accurancy;",
  "rows": [
    {
      "cells": [
        "search",
        "accurancy"
      ],
      "line": 10,
      "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value;search-google-and-result-content-is-compared-accurancy;;1"
    },
    {
      "cells": [
        "java",
        "language"
      ],
      "line": 11,
      "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value;search-google-and-result-content-is-compared-accurancy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3082376165,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search google and result content is compared accurancy",
  "description": "",
  "id": "search-google-and-seacrh-result-content-is-compared-accurancy-value;search-google-and-result-content-is-compared-accurancy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the  website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"java\" search",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters searchbutton",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Searchresult is compared \"language\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleResultAccuracySteps.user_navigates_to_the_website()"
});
formatter.result({
  "duration": 1875555620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 13
    }
  ],
  "location": "GoogleResultAccuracySteps.user_enters_search(String)"
});
formatter.result({
  "duration": 524157028,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultAccuracySteps.user_enters_searchbutton()"
});
formatter.result({
  "duration": 1515412294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "language",
      "offset": 26
    }
  ],
  "location": "GoogleResultAccuracySteps.searchresult_is_compared(String)"
});
formatter.result({
  "duration": 730644114,
  "status": "passed"
});
formatter.after({
  "duration": 551469837,
  "status": "passed"
});
formatter.uri("googlesearchresultcategory.feature");
formatter.feature({
  "line": 1,
  "name": "Search goole and link search result",
  "description": "",
  "id": "search-goole-and-link-search-result",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search google and get link result",
  "description": "",
  "id": "search-goole-and-link-search-result;search-google-and-get-link-result",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003csearchvalue\u003e\" searchvalue",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Searchresult list is represented on the screen and visit result search category.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search-goole-and-link-search-result;search-google-and-get-link-result;",
  "rows": [
    {
      "cells": [
        "url",
        "searchvalue"
      ],
      "line": 10,
      "id": "search-goole-and-link-search-result;search-google-and-get-link-result;;1"
    },
    {
      "cells": [
        "http://www.google.com/",
        "java"
      ],
      "line": 11,
      "id": "search-goole-and-link-search-result;search-google-and-get-link-result;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1489139088,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search google and get link result",
  "description": "",
  "id": "search-goole-and-link-search-result;search-google-and-get-link-result;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates \"http://www.google.com/\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"java\" searchvalue",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Searchresult list is represented on the screen and visit result search category.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com/",
      "offset": 16
    }
  ],
  "location": "GoogleResultCategorySteps.user_navigates_website(String)"
});
formatter.result({
  "duration": 2424823874,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 13
    }
  ],
  "location": "GoogleResultCategorySteps.user_enters_searchvalue(String)"
});
formatter.result({
  "duration": 514700364,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultCategorySteps.user_enters_search_button()"
});
formatter.result({
  "duration": 1375380037,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultCategorySteps.searchresult_list_is_represented_on_the_screen_and_visit_result_search_category()"
});
formatter.result({
  "duration": 11358745004,
  "status": "passed"
});
formatter.after({
  "duration": 139171313,
  "status": "passed"
});
});