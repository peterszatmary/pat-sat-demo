# pat-sat-demo
[![Build Status](https://travis-ci.org/peterszatmary/pat-sat-demo.svg?branch=master)](https://travis-ci.org/peterszatmary/pat-sat-demo)


Project about how can product acceptance testing (PAT) and system acceptance testing (SAT) look like.


## Product acceptance testing

For this testing all sources like ( database, sap, services ... ) are mocked. Thats the only difference here in constrast to System acceptance testing.

## System acceptance testing

For this testing all sources like ( database, sap, services ... ) are real to test real interactions beetwen application and them.

## Design

- Spring Boot like main Java technology for application
- Cucumber like test tool
- Maven surefire plugin like plugin that runs selectively our acceptance tests and any other tests.
- Tests can be run separately. Mainly SAT can take a while thats why is not part of application build process.


### Main goals

- With maven surefire and maven profiles is achieved separation of test runs ( PAT , SAT, whole app ).
- SAT and PAT doesnt share code base. Thats why there are many similarities. Maybe duplicities. TODO.

## Cucumber

- There is one entry point for SAT one entry point for PAT.
- There can be 1 or more CucumberSteps for SAT and PAT.
- There are one PAT and one SAT config but can be more if you like (Spring).
- There is one feature file for PAT and one for SAT but can be of cource more.



### How to run it

All SAT test separately.
```
mvn test -P SAT
```

All PAT test separately.
```
mvn test -P PAT
```

All other test with application except PAT nd SAT.
```
mvn install
```