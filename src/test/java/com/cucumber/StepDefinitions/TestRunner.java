package com.cucumber.StepDefinitions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
		glue={"com.cucumber.StepDefinitions"},
		plugin= {"pretty","html:target/reports/CucumberReports.html","json:target/reports/CucumberReports.json","junit:target/reports/CucumberReports.xml"}
		,monochrome = true  // Color scheming better if many steps involved
)
public class TestRunner {
}
