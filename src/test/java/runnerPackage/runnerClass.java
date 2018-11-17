package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\Ashish Sharma\\"
				+ "eclipse-workspace\\TestFramework\\"
				+ "src\\test\\java\\featureFiles"},
//		format= {"preety","html:html_test_output"},
		glue= {"stepDefinations"},	
		tags= {"@sanity"}
		)


public class runnerClass {

}
