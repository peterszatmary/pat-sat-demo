package com.szatmary.peter.config;

import com.szatmary.peter.DummyService;
import com.szatmary.peter.FakeRealService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SatConfig {

  // you can imagine here real datasource for database, or web service
  @Bean("fake-real-service")
  public DummyService fakeRealService() {
    FakeRealService service = new FakeRealService();
    service.setSurname("Gof");
    return service;
  }
}