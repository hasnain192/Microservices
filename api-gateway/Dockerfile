FROM openjdk:8-alpine
ARG JAR_FILE=target/*.jar
COPY $JAR_FILE api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]
EXPOSE 8999