# Spring-Eureka-Example

The Repository contains 3 projects -

Eureka Server - Setting up service registry

Hello Server - A microservice (Eureka client) which registers itself with the Eureka server.

Hello Client - End user facing microservice, also an eureka client. Once a user calls the REST end point of this service then this service internally delegates the call using RestTemplate to the end-point of HelloServer service. And it happens using the application name of the HelloServer instead of port/hostname as the mapping is fetched from the eureka server which maintains the service registry mapping.