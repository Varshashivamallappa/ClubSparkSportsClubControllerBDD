package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteRequestSD {
	
	Response response;
	ValidatableResponse validate;
	
	@When("Delete Api url {string}")
	public void delete_api_url(String deleteURL) {
	    
		response = RestAssured.delete(deleteURL);
	}

	@Then("To validate that the status code is {int}")
	public void to_validate_that_the_status_code_is(Integer statusCode) {
		
		validate = response.then();
		validate.assertThat().statusCode(statusCode).log().all();
	    
	}

}
