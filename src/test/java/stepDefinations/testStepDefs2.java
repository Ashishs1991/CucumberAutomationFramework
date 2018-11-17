package stepDefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStepDefs2 {
	
	@Given("^We have the data tables$")
	public void given_test(DataTable tab) {
		List<List<String>> lis=tab.raw();
		
		System.out.println("This is the test GIVEN statement with beow data");
		for(int i=0;i<lis.size();i++) {
			System.out.println(lis.get(i).get(0));
			System.out.println(lis.get(i).get(1));
		}
	}
	
	@When("^we have a test when for the data tables scenario$")
	public void when_test() {
		System.out.println("This is the test when statement");
	}
	
	@Then("^we have the test data table then$")
	public void then_test() {
		System.out.println("This is the test then statement");
	}

}
