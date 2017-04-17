package com.szatmary.peter.pat;

import com.szatmary.peter.DummyService;
import com.szatmary.peter.config.PatConfig;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = {PatConfig.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class CucumberPatSteps {

  @Autowired
  @Qualifier("mocked-service")
  private DummyService service;

  @When("^the client calls mocked service$")
  public void the_client_calls_just_name_service() throws Throwable {
    Assert.assertNotNull(service);
  }

  @Then("^the client receives name (.+)$")
  public void the_client_receives_name(String tom) throws Throwable {
    Assert.assertNull(service.getSurname());
    Assert.assertEquals(tom, service.getName());
  }
}