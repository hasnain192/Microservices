FROM openjdk:8-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} eurekha-server.jar
ENTRYPOINT ["java","-jar","/eurekha-server.jar"]
EXPOSE 8761