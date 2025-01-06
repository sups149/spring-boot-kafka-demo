# spring-boot-kafka-demo
Kafka messaging with spring boot

# Actuator details
## Enable all actuator endpoints

### Property

```properties
management.endpoints.web.exposure.include=*
```
### Endpoint
http://localhost:8080/actuator
## Exclude endpoints
### Property
```properties
management.endpoints.web.exposure.exclude=info,beans
```

## Disable endpoint exposure by default
### Property
```properties
management.endpoints.enabled-by-default=false
```

## Enabling specific endpoint when the default exposure is disabled
### Property
Format\
`management.endpoint.{EndpointName}.enabled=true/false`

Example
```properties
management.endpoint.health.enabled=true
```


### Endpoint
http://localhost:8080/actuator/health

## Enable extensive details of an endpoint
### Property
```properties
management.endpoint.health.show-details=ALWAYS
```

## Grouping endpoint output
### Properties
Format\
`management.endpoint.health.group.{group-name}.include=ping,diskSpace`

Example\
```properties
management.endpoint.health.group.health-group.include=ping,diskSpace
```
### Endpoint
Format\
`http://localhost:8080/actuator/health/{group-name}`

Example:\
http://localhost:8080/actuator/health/health-group

## Overriding the actuator base path
### Properties
```properties
management.endpoints.web.base-path=/manage
```

Example:\
http://localhost:8080/actuator/health/health-group

## Map endpoint to different path
### Property
Format:\
```
management.endpoints.web.base-path=/
management.endpoints.web.path-mapping.{endpoint}={mapped-path}
```
Example:\
```properties
management.endpoints.web.base-path=/
management.endpoints.web.path-mapping.health=healthcheck
```

