package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureFiles\\fb.feature",
glue="org.stepDef",dryRun=false)
public class TestRunner {
	

}
