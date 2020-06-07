$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ProTips.feature");
formatter.feature({
  "name": "Pro Tip scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Pro Tip screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I\u0027m on Pro tip screen",
  "keyword": "Given "
});
formatter.step({
  "name": "I tap on the Pro Tips",
  "keyword": "And "
});
formatter.step({
  "name": "I should see Pro Tip page with title \"\u003cProtext\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see Pro Tip page with litghting \"\u003clighting_text_view\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see Pro Tip page with professional \"\u003cprofessional_text_view\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see Pro Tip page with rotaotetext \"\u003crotate_pro_tip_text_view\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Protext",
        "lighting_text_view",
        "professional_text_view",
        "rotate_pro_tip_text_view"
      ]
    },
    {
      "cells": [
        "PRO TIP",
        "Lighting",
        "Professional looking Office",
        "PRO TIP"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Pro Tip screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I\u0027m on Pro tip screen",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iMOnProTipScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the Pro Tips",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iTapOnTheProTips()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Pro Tip page with title \"PRO TIP\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iShouldSeeProTipPageWithTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Pro Tip page with litghting \"Lighting\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iShouldSeeProTipPageWithLitghting(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Pro Tip page with professional \"Professional looking Office\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iShouldSeeProTipPageWithProfessional(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Pro Tip page with rotaotetext \"PRO TIP\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.ProTipPageStepDef.iShouldSeeProTipPageWithRotaotetext(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});