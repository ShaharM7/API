package restAssuredWithSerializion3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import restAssured1.utilities;

public class restAssuredWithJsonObj {

    @Test
    public void RegistrationSuccessful() {
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given();

        Person_JSON person = new Person_JSON(utilities.getRandomString(), utilities.getRandomString(), utilities.getRandomString()
                , utilities.getRandomString(), utilities.getRandomString() );
        request.header("Content-Type", "application/json");
        request.body(person);
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, Integer.parseInt("201"));
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");

        System.out.println("The status code recieved: " + statusCode);
        System.out.println("Response body: " + response.body().asString());

    }
}
