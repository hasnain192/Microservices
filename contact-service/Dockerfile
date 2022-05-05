FROM openjdk:8-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} contact-service.jar
ENTRYPOINT ["java","-jar","/contact-service.jar"]
EXPOSE 9002