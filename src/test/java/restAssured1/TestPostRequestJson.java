package restAssured1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class TestPostRequestJson {

    @Test
    public void RegistrationSuccessful() {
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", utilities.getRandomString());
        requestParams.put("LastName", utilities.getRandomString());
        requestParams.put("UserName", utilities.getRandomString());
        requestParams.put("Password", utilities.getRandomString());
        requestParams.put("Email",  utilities.getRandomString());


        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, Integer.parseInt("201"));
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");

        System.out.println("The status code recieved: " + statusCode);
        System.out.println("Response body: " + response.body().asString());

    }

}