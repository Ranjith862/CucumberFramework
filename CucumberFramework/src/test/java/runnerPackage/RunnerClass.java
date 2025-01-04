package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles", 
		glue = { "stepDefinitionPackage", "hooksPackage" }, 
		dryRun = false, 
		tags = "@BackgroundExamples", 
		monochrome = true, 
		plugin = { "html:report/webReport", "json:report/jsonreport.json" }
)
public class RunnerClass {
	// It should combine the feature file and step definition.
	// If we need to run all which inside the Featurefile.
	// @CucumberOptions(feature = "Featurefiles/", glue = "stepDefinitions")
	// Dont mention the file name, just give folder name to run all files.
}
