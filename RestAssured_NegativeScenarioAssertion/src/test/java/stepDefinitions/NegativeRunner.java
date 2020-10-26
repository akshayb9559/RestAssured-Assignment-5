package stepDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "stepDefinitions" })
public class NegativeRunner extends NegativeScenarioAssertionStep{
	
}
