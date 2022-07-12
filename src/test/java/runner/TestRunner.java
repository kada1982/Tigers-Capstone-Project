
package runner;


	import org.junit.AfterClass;


	import org.junit.runner.RunWith;



	import io.cucumber.junit.Cucumber;

	import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			//make sure when you type classpath:features, all letters are lower case
			features = "classpath:feature",
			glue = "step.definition",
			tags = "@Test1",
			dryRun = false,
			
			monochrome = true,
			plugin = {
					"pretty",
					"html:target/site/cucumber-pretty",
				"json:target/Cucumber.json"
			},
			publish = true
	     )
	
public class TestRunner {
		
		
		
		@AfterClass
		public static void generateReport() {
		 CucumberReportingConfig.reportConfig();
		}
		
}
//"pretty", "html:target/site/cucumber-pretty", "json:target/CucumberTestReport.json" }, publish = true)
