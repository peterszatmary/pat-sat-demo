package com.szatmary.peter.config;

import com.szatmary.peter.DummyService;
import com.szatmary.peter.MockedService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatConfig {

  // you can imagine here mocked datasource if you like, or mocked web service
  @Bean("mocked-service")
  public DummyService mockedService() {
    MockedService service = new MockedService();
    service.setName("Tom");
    return service;
  }
}