package org.testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./May_24/feature/Dashboard.feature",
		glue="./May_24/src/test/java/org/stepdefination1",
		monochrome=true,
		dryRun=true,
				plugin = {"pretty",
						"html:target/html_report/cucumber_html.html",
						"json:target/json_report/cucumber_json.json",
						"junit:target/junit_report/cucumber_junit.xml ",

						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/faildReRun.txt"
				}
		
		)
public class RestRunner {

}
