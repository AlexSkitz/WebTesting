import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class RestAsured {
    public void rest() {
        RequestSpecification requestSpecification = given()
                .baseUri("http://cookiemonster.com")
                .header("Language", "en");

        requestSpecification
                .when()
                .get("/cookiesformonster")
                .then()
                .statusCode(200);

        requestSpecification
                .when()
                .get("/soup")
                .then()
                .statusCode(400);

        ResponseSpecification responseSpec = expect().statusCode(200);

        given()
                .expect()
                .spec(responseSpec)
                .when()
                .get("/hello");

        given()
                .expect()
                .spec(responseSpec)
                .when()
                .get("/goodbye");
    }
}
