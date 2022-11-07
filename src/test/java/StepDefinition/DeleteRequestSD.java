package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestSD {
	
	RequestSpecification request;
	Response response;
	ValidatableResponse validate;
	
	@When("Delete Api url {string}")
	public void delete_api_url(String deleteURL) {
		
	    request = RestAssured.given().contentType("application/json");
		response = request.delete(deleteURL);
	}

	@Then("To validate that the status code is {int}")
	public void to_validate_that_the_status_code_is(Integer statusCode) {
		
		validate = response.then();
		validate.assertThat().statusCode(statusCode).log().all();
	    
	}

}
