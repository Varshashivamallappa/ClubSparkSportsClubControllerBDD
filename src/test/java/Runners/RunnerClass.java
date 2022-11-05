package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\src\\test\\java",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)

public class RunnerClass extends AbstractTestNGCucumberTests{

}
