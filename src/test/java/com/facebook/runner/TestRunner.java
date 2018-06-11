package com.facebook.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,
        strict = true,
        //monochrome = true,
        tags = { "@debug" },
        features = "src/test/resources/features",
        glue = {"com.facebook.qa.stepdefination"},
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)
public class TestRunner {

}
