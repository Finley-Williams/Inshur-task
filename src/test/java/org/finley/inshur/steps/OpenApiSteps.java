package org.finley.inshur.steps;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.cucumber.java.en.And;
import org.finley.inshur.OpenAPIResults;
import org.finley.inshur.ScenarioContext;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class OpenApiSteps {
    @And("a mock OpenWeatherMap is running")
    public void mockOpenWeatherIsRunning() throws InterruptedException {
        String address = "localhost";
        int port = 666;
        WireMock.configureFor(address, port);
        WireMockServer wireMockServer = new WireMockServer(wireMockConfig().bindAddress(address).port(port));
        wireMockServer.start();
        Thread.sleep(1000);
        ScenarioContext.getCurrent().put(wireMockServer, WireMockServer.class);
    }

    @And("OpenWeatherMap {string} returns the correct data for a {int} group set")
    public void mockWeatherReturnsTheFollowing(String address, int dataSet) {
        String data = "";
        if (dataSet == 1){
            data = OpenAPIResults.ONEPERIOD;
        } else if (dataSet == 8){
            data = OpenAPIResults.EIGHTPERIOD;
        }
        givenThat(get(urlEqualTo(address))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody(data)));
    }

    @And("OpenWeatherMap {string} returns the correct data for gibberish location")
    public void mockWeatherReturnsTheFollowingWithBadLocation(String address, String data) {
        givenThat(get(urlEqualTo(address))
                .willReturn(aResponse()
                        .withStatus(400)
                        .withBody(data)));
    }

    @And("OpenWeatherMap {string} returns the correct data for gibberish count")
    public void mockWeatherReturnsTheFollowingWithBadCount(String address, String data) {
        givenThat(get(urlEqualTo(address))
                .willReturn(aResponse()
                        .withStatus(400)
                        .withBody(data)));
    }

}
