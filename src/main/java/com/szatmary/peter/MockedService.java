package com.szatmary.peter;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MockedService implements DummyService {

  private String name;

  @Override
  public String toString() {
    return "My name is " + this.name;
  }

  @Override
  public void setSurname(String surname) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getSurname() {
    return null;
  }
}