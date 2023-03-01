package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:/Users/dudekula.anwar/eclipse-workspace/cucumberframework/src/test/resources/Features",
glue = {"StepDefination"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/HtmlReports.html",
		"json:target/JsonReports/report.json"})



public class TestRunner {

}