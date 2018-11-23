# pat-sat-demo #

[![Build Status](https://travis-ci.org/peterszatmary/pat-sat-demo.svg?branch=master)](https://travis-ci.org/peterszatmary/pat-sat-demo)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/9bfb3a15aaf04dc7a11d735425954f01)](https://www.codacy.com/app/peterszatmary/pat-sat-demo?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=peterszatmary/pat-sat-demo&amp;utm_campaign=Badge_Grade)

Project about how can product acceptance testing (PAT) and system acceptance testing (SAT) look like.

## Product acceptance testing ##

For this testing all sources like ( database, sap, services ... ) are mocked. That is the only difference here in constrast to System acceptance testing.

## System acceptance testing ##

For this testing all sources like ( database, sap, services ... ) are real (not mocked) to test real interactions between application and them.

## Design ##

-   Spring Boot as main Java application technology 
-   Cucumber as testing tool
-   Maven surefire plugin as plugin that runs separately all Product acceptance tests, separately all System acceptance tests and separately all any other tests.
-   Tests are running  separately (PAT, SAT, other tests). Is good to have them not in application build lyfecycle because PAT and SAT can take a while and for application build are more imporant other test more close to development like unit tests ...

### Main goals ###

-   With maven surefire and maven profiles is achieved separation of test runs ( PAT , SAT, otjer tests ).
-   SAT and PAT doesnt share code base. That is the reason why there are many similarities. But design is therefore very flexible.

## Cucumber ##

-   There is one entry point for PAT (see [CucumberPatTestEntryPoint.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/pat/CucumberPatTestEntryPoint.java)) one entry point for SAT (see [CucumberSatTestEntryPoint.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/sat/CucumberSatTestEntryPoint.java)).
-   There can be 1 or more CucumberSteps for PAT (see [CucumberPatSteps.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/pat/CucumberPatSteps.java)) and SAT (see [CucumberSatSteps.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/sat/CucumberSatSteps.java)).
-   There are one PAT (see [PatConfig.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/config/PatConfig.java)) and one SAT (see [SatConfig.java](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/java/com/szatmary/peter/config/SatConfig.java)) config but can be more if you like (Spring).
-   There is one feature file for PAT (see [pat.feature](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/resources/features/pat/pat.feature)) and one for SAT (see [sat.feature](https://github.com/peterszatmary/pat-sat-demo/blob/master/src/test/resources/features/sat/sat.feature)) but can be of cource more.

### How to run it ###

All SAT test separately.

```bash
mvn test -P SAT
```

All PAT test separately.

```bash
mvn test -P PAT
```

All other test with application except PAT nd SAT.

```bash
mvn package
```