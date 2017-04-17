package com.szatmary.peter.sat;

import com.szatmary.peter.DummyService;
import com.szatmary.peter.config.SatConfig;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = {SatConfig.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class CucumberSatSteps {

  @Autowired
  @Qualifier("fake-real-service")
  private DummyService service;

  @When("^the client calls fake real service$")
  public void the_client_calls_just_name_service() throws Throwable {
    Assert.assertNotNull(service);
  }

  @Then("^the client receives surname (.+)$")
  public void the_client_receives_name(String gof) throws Throwable {
    Assert.assertNull(service.getName());
    Assert.assertEquals(gof, service.getSurname());
  }
}