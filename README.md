Eureka-server:
its used as service registry for register all others microservices, like what are applications are working

api-gateway:
User should heat api-gateway to get details from other services 

Cloud-Config-server:
It's used for get global configuration from externalize server
like git, then we can use in other microservices
to avoid boilerplate code.

historic-dashboard:
It's used for circuit breaker , to visualize which apis are failing and which apis are getting successful
ex: suppose we are calling some rest api inside user-service
if contact-services apis are down then we will send time out error


