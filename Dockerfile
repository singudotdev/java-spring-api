FROM openjdk:17-jdk-alpine
MAINTAINER singu.dev
COPY target/api-1.0.jar api-1.0.jar
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]