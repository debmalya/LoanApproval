## Environment:
- Java version: 1.8
- Maven version: 3.*
- Spring Boot version: 2.4.2

## Request:
Example of a weather data JSON object:
```json
{
   "ssnNumber": "198-50-001",
   "loanAmount": 99999.99,
   "currentAnnualIncome": 180000.00
}
```

## Response:
```json
{
    "loanApprovalStatus": "APPROVED",
    "approvalAmount": 90000.0,
    "errorMessage": ""
}
````

## Handling Sensitive information
* Sensitive information like social security number is stored in database in encoded format.
* Social security number is not printed in log.

### Build
Use ```mvn compile``` for building

### Tests
```mvn test``` to run unit tests

### Run
```mvn spring-boot:run```

To run with local profile
```mvn spring-boot:run -Dspring.profiles.active=local```

[API documentation](http://localhost:8080/swagger-ui.html)