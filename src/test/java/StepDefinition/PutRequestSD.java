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

public class PutRequestSD {	
	
	RequestSpecification request;
	Response response;
	ValidatableResponse validate;
	
	@Given("User want to update\\/modify the sports club details")
	public void user_want_to_update_modify_the_sports_club_details() {
		
		JSONObject object = new JSONObject();
		object.put("id", "7");
		object.put("address", "Vijayanagar1");
		object.put("description", "All sports activities");
		object.put("name", "8848765423");
		object.put("leader", "ABC");
		object.put("ranking","2");
		
		request = RestAssured.given();
		request.body(object);
		request.contentType(ContentType.JSON);
	    
	}

	@When("User want to perform put action using API {string}")
	public void user_want_to_perform_put_action_using_api(String putURL) {
		
		response = request.put(putURL);
	    
	}

	@Then("Validate that the status code is {int}")
	public void validate_that_the_status_code_is(Integer statusCode) {
		
		validate = response.then();
		validate.assertThat().statusCode(statusCode);
		validate.log().all();
	    
	}
}
