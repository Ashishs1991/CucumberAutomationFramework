package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStepDefs {
	
	@Given("^this is the test given statement$")
	public void given_test() {
		System.out.println("This is the test GIVEN statement");
	}
	
	@When("^this is the test when statement$")
	public void when_test() {
		System.out.println("This is the test GIVEN statement");
	}
	
	@Then("^this is the test then statement$")
	public void then_test() {
		System.out.println("This is the test GIVEN statement");
	}

}
