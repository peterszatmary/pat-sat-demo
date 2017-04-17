# pat-sat-demo
Project about how can product acceptance testing (PAT) and system acceptance testing (SAT) look like.


## Product acceptance testing

For this testing all sources like ( database, sap, services ... ) are mocked. Thats the only difference here in constrast to System acceptance testing.

## System acceptance testing

For this testing all sources like ( database, sap, services ... ) are real to test real interactions beetwen application and them.

## Design

- Spring Boot like main Java technology for application
- Cucumber like test tool
- Maven surefire plugin like plugin that runs selectively our acceptacne tests and any other tests.
- Tests can be run separately. Mainly SAT can take a while thats why is not part of application build process.
