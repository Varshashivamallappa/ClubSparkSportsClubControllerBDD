package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequest1SD {
	
	Response response;
	ValidatableResponse validate;

	@Given("User want to perform get action using API")
	public void user_want_to_perform_get_action_using_api() {
		RestAssured.given().header("Content-Type", "application/json");
	}

	@When("Api url {string}")
	public void api_url(String getURL) {
		response=RestAssured.post(getURL);
	    
	}

	@Then("user want to validate that the status line is {string}")
	public void user_want_to_validate_that_the_status_line_is(String statusLine) {
		
		validate = response.then();
		validate.assertThat().statusLine(statusLine);
	}

	@And("Validate that Content-Type is {string}")
	public void validate_that_content_type_is(String contentType) {
		
		validate.assertThat().contentType(contentType);
		validate.log().all();
	}


}
