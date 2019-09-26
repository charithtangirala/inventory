package com.learn.pact.inventory;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.VerificationReports;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@Provider("inventory")
@PactBroker(host = "localhost", port = "80")
@VerificationReports({"console", "markdown"})
public class ProviderPactVerificationTest {
    @TestTarget
    public final Target target = new HttpTarget("http","localhost", 8080);

    @State("Inventory service is running") // Must match the state description in the pact file
    public void getValidFlightSchedule() {
        Assert.assertTrue(true);
    }
}