package step_definition;


import e2e.E2EConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

public class getCustomer_SD extends E2EConfiguration {

    @Autowired
    TestRestTemplate restTemplate;

    private String statusCode;

    private ResponseEntity<String> response;

    @Given(": no input param passed")
    public void no_input_param_passed() {
        System.out.println("step 1 no");
//        when()

    }

    @When(": the get customer API is called")
    public void customer_api_called() {
        System.out.println("step 2");
        response = restTemplate.getForEntity("/customer", String.class);
    }


    @Then(": I should get {int} as response code.")
    public void get_response(Integer status) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("step 3 "+ status);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("test", response.getBody());
    }


}
