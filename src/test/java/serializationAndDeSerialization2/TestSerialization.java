package serializationAndDeSerialization2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSerialization {

    @Test
    public void testSerialization() {

        Response response;

        Student student = new Student("Isha Durani", "A", 101);

        response = RestAssured.given()
                .contentType("application/json")
                .body(student)
                .when()
                .post("http://localhost:9091/students");

        assertTrue(response.toString().contains("Student added successfully."));

    }

}
