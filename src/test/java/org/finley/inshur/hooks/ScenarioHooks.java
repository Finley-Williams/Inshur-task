package org.finley.inshur.hooks;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import com.github.tomakehurst.wiremock.WireMockServer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.finley.inshur.ScenarioContext;
import org.finley.inshur.WeatherApplication;

public class ScenarioHooks {
    @Before
    public void beforeScenario() {
        ScenarioContext.reset();
    }

    @After
    public void afterScenario() throws Exception {
        ScenarioContext sc = ScenarioContext.getCurrent();
        var application = ScenarioContext.getCurrent().get(WeatherApplication.class);
        if (application != null) {
            SystemLambda.catchSystemExit(application::stop);
        }
        if (sc.contains(WireMockServer.class)) {
            try {
                WireMockServer server = sc.get(WireMockServer.class);
                server.resetAll();
                server.stop();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
