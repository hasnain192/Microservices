FROM openjdk:8-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-congif-server.jar
ENTRYPOINT ["java","-jar","/cloud-congif-server.jar"]
EXPOSE 9296
