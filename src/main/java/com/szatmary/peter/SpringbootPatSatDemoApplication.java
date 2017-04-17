package com.szatmary.peter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPatSatDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
    SpringApplication.run(SpringbootPatSatDemoApplication.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    System.out.println("Hello acceptance testing world !");
  }
}