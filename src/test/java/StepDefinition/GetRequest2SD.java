package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetRequest2SD {
	

	Response response;
	ValidatableResponse validate;
	
	@Given("User want to perform get action to fetch a particular club by name using API")
	public void user_want_to_perform_get_action_to_fetch_a_particular_club_by_name_using_api() {
		
		RestAssured.given().header("Content-Type", "application/json");
	    
	}

	@When("API url {string}")
	public void api_url(String get2URL) {
	    response = RestAssured.get(get2URL);
	}

	@Then("To validate that the status line is {string}")
	public void to_validate_that_the_status_line_is(String statusLine) {
		
		validate = response.then();
		validate.assertThat().statusLine(statusLine);
	    
	}
	
	@And("To validate that Content-Type is {string}")
	public void to_validate_that_content_type_is(String contentType) {	
		validate.assertThat().contentType(contentType);
		validate.log().all();
	}


}
