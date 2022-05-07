 
 Author: Md Hasnain
 Dirctor of : Codefider private Limited.
 www.codefider.com
 
Eureka-server:
its used as service registry for register all others microservices, like what are applications are running.

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

Zipkin :
Added Zipkin and sleuth all microservices for log tracing .
Imp:- We have to pull zipkin docker image or download zipkin application then configure zipkin server url
in application.yml files to call zipkin server 
ex:  zipkin:
base-url: http://localhost:9411/
