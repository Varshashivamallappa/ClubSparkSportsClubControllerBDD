package StepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequestSD {
	
	RequestSpecification request;
	Response response;
	ValidatableResponse validate;
	
	@Given("User want to insert the sports club details")
	public void user_want_to_insert_the_sports_club_details() {
		
		JSONObject object = new JSONObject();
		object.put("address", "Bogadi");
		object.put("description", "All sports activities");
		object.put("name", "8848760023");
		object.put("leader", "Harshitha");
		object.put("ranking","1");
		
		request = RestAssured.given();
		request.body(object);
		request.contentType(ContentType.JSON);
	}

	@When("User want to post the request using API {string}")
	public void user_want_to_post_the_request_using_api(String postURL) {
		
		response = request.post(postURL);
	}

	@Then("Validate that the status line is {string}")
	public void validate_that_the_status_line_is(String statusLine) {
		
		  validate = response.then();
		  validate.assertThat().statusLine(statusLine);
		  validate.log().all();
	}
	
	
}
