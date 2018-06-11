$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/muniraahmed/Documents/MyDevelopment/FacebookBddCucumberProject/src/main/resources/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to facebook",
  "description": "Keywords Summary : This test will verify login related scenarios to FACAEBOOK.COM",
  "id": "login-to-facebook",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-to-facebook;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigated to FACEBOOK.COM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter Username as \"USER\" and Password \"PASSWORD\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "login should be successfulPage",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
});