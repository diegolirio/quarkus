package com.diegolirio.institution;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class InstitutionRestTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/institutions")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}