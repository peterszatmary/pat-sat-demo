package com.szatmary.peter;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FakeRealService implements DummyService {
  private String surname;
  @Override
  public String toString() {
    return "My surname is " + this.surname;
  }

  @Override
  public void setName(String name) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return null;
  }
}
