package junitcucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.App;

public class AppSteps {

	App app = new App();

	@Given("^two values (\\d+) and (\\d+)$")
	public void certificationName(int val1, int val2) throws Throwable {
		app.setValue1(val1);
		app.setValue2(val2);
	}

	@When("^(.*) operator is given$")
	public void addition(String op) throws Throwable 
	{
		switch(op)
		{
		case "+": app.setResult(app.getValue1() + app.getValue2());
			break;
		case "-": app.setResult(app.getValue1() - app.getValue2());
			break;
		case "*": app.setResult(app.getValue1() * app.getValue2());
			break;
		case "/": app.setResult(app.getValue1() / app.getValue2());
			break;
		}
		
	}
	
	@Then("result must be (\\d+)$")
	public void certifiedYes(int result) throws Throwable 
	{
		assertEquals(result,app.getResult());
	}

	private void assertEquals(int result, int result2) {
		// TODO Auto-generated method stub
		
	}
}
