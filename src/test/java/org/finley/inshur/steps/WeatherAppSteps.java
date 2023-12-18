package org.finley.inshur.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.finley.inshur.ScenarioContext;
import org.finley.inshur.WeatherApplication;
import org.json.JSONObject;

import static org.assertj.core.api.Assertions.assertThat;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.assertj.JsonAssertions.json;

public class WeatherAppSteps {

    @Given("WeatherApplication is running")
    public void weatherApplicationIsRunning() {
        var weatherApplication = new WeatherApplication();
        weatherApplication.start();
        ScenarioContext.getCurrent().put(weatherApplication, WeatherApplication.class);
    }

    @When("I send a get request to {string} with the params")
    public void whenIsendAGetRequestTo(String endpoint, String params) {
        var url = "http://localhost:5000" + endpoint;
        JSONObject queryParams = new JSONObject(params);
        HttpResponse<String> response = Unirest.get(url)
                .queryString("hours", queryParams.get("hours"))
                .queryString("location", queryParams.get("location"))
                .asString();
        ScenarioContext.getCurrent().put("HttpResponse", response);
    }

    @Then("the response is status {int}")
    public void theResponseIsInt(int status){
        HttpResponse<String> response = ScenarioContext.getCurrent().get("HttpResponse");
        var statusCode = response.getStatus();
        assertThat(statusCode).isEqualTo(status);
    }

    @And("the response body is")
    public void theResponseBodyIs(String expected) {
        HttpResponse<String> response = ScenarioContext.getCurrent().get("HttpResponse");
        var actualJson = new JSONObject(response.getBody());
        var expectedJson = new JSONObject(expected);
        assertThatJson(actualJson).withTolerance(0.001).isEqualTo(expectedJson);
    }
}
